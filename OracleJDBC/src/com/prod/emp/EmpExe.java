package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		EmpDAO dao = new EmpDAO();
		
		// 메뉴 : 1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 9.종료

		while (true) {
			System.out.println("1.사원리스트 2.입력 3.수정 4.삭제 5.한건조회 9.종료");
			System.out.printf("메뉴선택>>");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("사원리스트");
				List<Employee> list = dao.empList(); // 전체조회기능
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}

			} else if (menu == 2) {
//				Employee emp = new Employee();
//				System.out.println("사원번호를 입력하세요");
//				emp.setEmployeeId(scn.nextInt());
//				System.out.println("Last Name을 입력하세요");
//				emp.setLastName(scn.next());
//				System.out.println("email을 입력하세요");
//				emp.setEmail(scn.next());
//				System.out.println("입사일자를 입력하세요");
//				emp.setHireDate(scn.next());
//				System.out.println("부서번호를 입력");
//				emp.setJobId(scn.next());

				System.out.println("사원번호를 입력하세요");
				int empId = scn.nextInt();
				System.out.println("Last Name을 입력하세요");
				String empLast = scn.next();
				System.out.println("email을 입력하세요");
				String empEmail = scn.next();
				System.out.println("입사일자를 입력하세요");
				String empHireDate = scn.next();
				System.out.println("부서번호를 입력");
				String empJobId = scn.next();

				Employee emp = new Employee(empId, empLast, empEmail, empHireDate, empJobId);

				dao.insertemp(emp); // boolean 타입으로 결과값 받아오기
				
				if (emp.isResult() == false ) {
					System.out.println("트랜젝션에 실패하였습니다.");
				} else {
					System.out.println("입력완료");
				}

			} else if (menu == 3) {
				// 수정
				// 사원번호, 전화번호, firstName, Salary
				Employee emp = new Employee();
				List<Employee> list = dao.empList();
				System.out.println("변경할 사원의 사원번호를 입력하세요");
				int temp = scn.nextInt();
				emp.setEmployeeId(temp);

				for (Employee s : list) {
					if (s.getEmployeeId() == temp) {
						System.out.println("변경하실 " + s.getLastName() + "사원의 전화번호를 입력하세요");
						emp.setPhoneNumber(scn.next());
						System.out.println("변경하실 " + s.getLastName() + "사원의 First Name을 입력하세요");
						emp.setFirstName(scn.next());
						System.out.println("변경하실 " + s.getLastName() + "사원의 Salary를 입력하세요");
						emp.setSalary(scn.nextInt());

						dao.updateEmp(emp);

						System.out.println("변경이 완료되었습니다.");
						break;

					}

				}

			} else if (menu == 4) {
				System.out.println("삭제할 사원의 사원번호를 입력하세요");
				int temp = scn.nextInt();
				System.out.println("사원을 정말로 삭제하시겠습니까? y/n");
				String yn = scn.next();
				if (yn.equals("y")) {
					dao.deleteEmp(temp);
					System.out.println("삭제가 완료되었습니다.");
				} else {
					continue;
				}

			} else if (menu == 5) { // 한건조회
				System.out.println("조회할 사원의 사원번호를 입력하세요");
				int temp = scn.nextInt();
				System.out.println(dao.searchList(temp).toString());

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		} // end of while
		System.out.println("end of program");
		scn.close();

	} // end of main

}
