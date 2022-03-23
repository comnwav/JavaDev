package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();

	static Scanner scn = new Scanner(System.in);

	public void execute() {
		// 메뉴: 1.추가 / 2.리스트 / 3.한건조회 / 4.수정 / 9.종료

		while (true) {
			System.out.println("1.추가 2.리스트 3.한건조회 4.수정 9.종료");
			System.out.println("선택>>");

			int menu = scn.nextInt();

			if (menu == 1) {

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

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
	}

}
