package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	static Scanner scn = new Scanner(System.in);
	
	public StudentApp() {
		list.add(new Student(123, "서현일", 90, 32));
		list.add(new Student(243, "서현일", 42, 67));
		list.add(new Student(321, "최규완", 23, 34));
		list.add(new Student(521, "권태현", 53, 67));
		
	}

	public void execute() {

		StudentService service = new StudentServiceImpl();

		// 메뉴: 1.추가 / 2.리스트 / 3.한건조회 / 4.수정 / 9.종료
		while (true) {
			System.out.println("1.추가 2.리스트 3.한건조회 4.수정 5.삭제 6.이름조회 9.종료");
			System.out.println("선택>>");

			int menu = scn.nextInt();
			if (menu == 1) {

				System.out.println("학생번호입력>>");
				int stuNo = scn.nextInt();
				System.out.println("학생이름입력>>");
				String name = scn.next();
				System.out.println("영어입력>>");
				int engScore = scn.nextInt();
				System.out.println("국어입력>>");
				int korScore = scn.nextInt();

				Student s1 = new Student(stuNo, name, engScore, korScore);
				service.insertStudent(s1);

			} else if (menu == 2) {
				List<Student> list = service.studentList();
				for (Student s : list) {
					System.out.println(s);
				}

			} else if (menu == 3) {
				System.out.println("조회할 학생번호 입력>>");
				int studNo = scn.nextInt();
				Student student = service.getStudent(studNo);
				student.toString();

			} else if (menu == 4) {
				System.out.println("학생번호입력>>");
				int stuNo = scn.nextInt();
				System.out.println("수정-영어입력>>");
				int engScore = scn.nextInt();
				System.out.println("수정-국어입력>>");
				int korScore = scn.nextInt();

				Student s1 = new Student(stuNo, null, engScore, korScore);
				service.modifyStudent(s1);
				System.out.println("처리가 완료되었습니다.");

			} else if (menu == 5) {
				System.out.println("학생삭제");
				System.out.println("학생번호입력>>");
				int stuNo = scn.nextInt();
				service.removeStudent(stuNo);
				System.out.println("삭제가 완료되었습니다.");

			} else if (menu == 6) {
				
				System.out.println("이름으로 조회");
				System.out.println("이름입력>>");
				String name = scn.next();
//				List<Student> st = service.searchStudent(name);
//				System.out.println(st);
				System.out.println(service.searchStudent(name));
				System.out.println("조회완료");

				
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("end of program");
	}

	class StudentServiceImpl implements StudentService {

		// 추가
		@Override
		public void insertStudent(Student student) {
			list.add(student);
		}

		// 한건조회
		@Override
		public Student getStudent(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNum() == sno) {
					return list.get(i);
				}
			}
			return null;
		}

		// 전체 리스트
		@Override
		public List<Student> studentList() {
			return list;
		}

		// 한건수정
		@Override
		public void modifyStudent(Student student) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNum() == student.getNum()) {
					list.get(i).setEngScore(student.getEngScore());
					list.get(i).setKorScore(student.getKorScore());
				}

			}
		}

		@Override
		public void removeStudent(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNum() == sno) {
					list.remove(i);
				}

			}

		}

		// 이름으로 조회 - 중복가능
		@Override
		public List<Student> searchStudent(String name) {
			List<Student> searchList = new ArrayList<Student>();
			// 찾았다고 종료시키면 안됨
			for (int i = 0; i < list.size(); i++) {
				// 같은 이름이 있는지 찾아보고 있으면 서치 리스트에 add
				if (list.get(i).getName().equals(name)) {
					searchList.add(list.get(i));
				}
			}
			return searchList;
		}
	}

}
