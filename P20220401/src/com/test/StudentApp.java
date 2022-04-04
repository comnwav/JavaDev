package com.test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	Scanner scn = new Scanner(System.in);
	List<Student> allStudents = new ArrayList<Student>(); // 컬렉션을 이용해서 정보를 저장.

	class StudentServiceImpl implements StudentService {

		@Override
		public void addStudent(Student student) {
			allStudents.add(student);
		}

		@Override
		public void modStudent(Student student) {
			for (Student s : allStudents) {
				if (s.getStudNo().equals(student.getStudNo())) {
					s.setStudName(student.getStudName());
				}
			}
		}

		@Override
		public List<Student> studentList() {
			return allStudents;
		}

	}

	public void execute() {

		StudentService service = new StudentServiceImpl();

		// 1.입력, 2.수정, 3.리스트 보기 기능을 구성하세요.
		while (true) {
			int menu;
			while (true) {
				System.out.println("1.입력, 2.수정, 3.리스트 보기, 4.종료");
				System.out.printf("선택>> ");
				try {
					menu = scn.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("오류>> 숫자만 입력하세요");
					scn.next();
				}
			}
			if (menu == 1) {
				// 입력일 경우 고등학생정보와 대학생정보를 구분해서 처리.
				System.out.println("1.고등학생 2.대학생");
				System.out.printf("선택>> ");
				int temp = scn.nextInt();

				System.out.printf("학생번호를 입력하세요>> ");
				String sNo = scn.next();
				System.out.printf("학생이름을 입력하세요>> ");
				String sName = scn.next();

				if (temp == 1) {
					System.out.printf("담임선생님 이름을 입력하세요>> ");
					String tName = scn.next();
					System.out.printf("반이름을 입력하세요>> ");
					String gName = scn.next();

					Student stud = new HighStudent(sNo, sName, tName, gName);
					service.addStudent(stud);
					System.out.println("입력이 완료되었습니다.");

				} else if (temp == 2) {
					System.out.printf("담당교수 이름을 입력하세요>> ");
					String pName = scn.next();
					System.out.printf("전공정보를 입력하세요>> ");
					String maj = scn.next();

					Student stud = new CollegeStudent(sNo, sName, pName, maj);
					service.addStudent(stud);
					System.out.println("입력이 완료되었습니다.");
				}

			} else if (menu == 2) {
				System.out.printf("수정할 학생의 학생번호를 입력하세요>> ");
				String sNo = scn.next();
				System.out.printf("새로운 이름을 입력하세요>> ");
				String sName = scn.next();

				Student temp = new Student(sNo, sName);
				service.modStudent(temp);

				System.out.println("수정이 완료되었습니다.");

			} else if (menu == 3) {
				List<Student> stu = service.studentList();
				for (Student s : stu) {
					System.out.println(s.toString());
				}

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("end of program.");
	}
}
