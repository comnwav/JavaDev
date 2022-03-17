package com.edu;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {

		// Scanner, 배열선언 5개, 입력, 리스트 출력.

		Scanner scn = new Scanner(System.in);
		Student[] st = new Student[5];

		while (true) {
			System.out.println("1.입력 2.리스트 3.종료");
			System.out.println("선택>>");
			int menu = scn.nextInt();
			if (menu == 1) {
				// 입력기능구현.. 학번, 이름, 영어, 수학, 국어 
				// > student instance 만들어서 > 배열에 담기
				
				System.out.println("학번을 입력하세요>");
				int sNo = scn.nextInt();
				
				System.out.println("이름을 입력하세요>");
				String sName = scn.next();
				
				System.out.println("국어을 입력하세요>");
				int sKor = scn.nextInt();
				
				System.out.println("영어를 입력하세요>");
				int sEng = scn.nextInt();
				
				System.out.println("수학을 입력하세요>");
				int sMat = scn.nextInt();
				
				Student s1 = new Student(sNo, sName, sKor, sEng, sMat);
				
				for (int i = 0; i < st.length; i++) {
					if (st[i] == null) {
						st[i] = s1;
						break;
					}
				}
				
				System.out.println("저장완료");
				
			} else if (menu == 2) {
				//리스트
				for (int i = 0; i < st.length; i++) {
					if(st[i] != null) {
						System.out.println(st[i].getStudInfo());
					}
				}
				
				System.out.println("조회완료");
				
			} else if (menu == 3) {
				// 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("메뉴를 잘못 선택했습니다.");
			}
		}
		scn.close();
		System.out.println("end of program");

	}

}