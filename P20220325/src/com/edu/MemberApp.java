package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp {

	List<Member> members = new ArrayList<Member>();

	static Scanner scn = new Scanner(System.in);

	public void execute() {
		// 메유: 1.등록 2.수정 3.전체리스트 9.종료
		// 도서반 => 기본정보 + 도서반장 , 강의실 이름
		// 축구반 => 기본정보 + 코치이름, 락커룸이름
		// 수영반 => 기본정보 + 강사이름 , 수영등급

		MemImpl mi = new MemImpl();

		while (true) {
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.print("선택>>");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("등록할 강좌를 선택하세요");
				System.out.println("1.도서반 2.축구반 3.수영반");
				System.out.print("선택>>");
				int lect = scn.nextInt();

				if (lect > 0 && lect <= 3) {
					System.out.println("ID를 입력하세요");
					int id = scn.nextInt();
					System.out.println("이름을 입력하세요");
					String name = scn.nextLine();
					System.out.println("휴대폰 번호를 입력하세요");
					String phone = scn.nextLine();
					
					if (lect == 1) {
						System.out.println("도서반장의 이름을 입력하세요");
						String capB = scn.nextLine();
						System.out.println("강의실의 이름을 입력하세요");
						String roomB = scn.nextLine();
						
						Member bm = new BookMember(id, name, phone, capB, roomB);
						mi.addMember(bm);
						
					}
				} 

			} else if (menu == 2) {
				
			} else if (menu == 3) {
				
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

	public class MemImpl implements MemberService {

		@Override
		public void addMember(Member member) {
			members.add(member);
		}

		@Override
		public void modifyMember(Member member) {
			
		}

		@Override
		public List<Member> memberList() {

			return members;
		}
	}
}
