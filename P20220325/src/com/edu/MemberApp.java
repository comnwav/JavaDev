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

			// 등록
			if (menu == 1) {
				System.out.println("등록할 강좌를 선택하세요");
				System.out.println("1.도서반 2.축구반 3.수영반");
				System.out.print("선택>>");
				int lect = scn.nextInt();

				if (lect > 0 && lect <= 3) {
					System.out.println("ID를 입력하세요");
					int id;

					try {
						id = scn.nextInt();
					} catch (Exception e) {
						System.out.println("입력타입이 다릅니다. 다시입력하시오!\n");
						System.out.println(e.getClass().getName() + "예외가" + e.getMessage() + "때문에 발생했다");
						scn.next();
						continue;
					}

					System.out.println("이름을 입력하세요");
					String name = scn.next();
					System.out.println("휴대폰 번호를 입력하세요");
					String phone = scn.next();

					if (lect == 1) {
						System.out.println("도서반장의 이름을 입력하세요");
						String capB = scn.next();
						System.out.println("강의실의 이름을 입력하세요");
						String roomB = scn.next();

						Member bm = new BookMember(id, name, phone, capB, roomB);
						mi.addMember(bm);
					} else if (lect == 2) {
						System.out.println("코치의 이름을 입력하세요");
						String coaS = scn.next();
						System.out.println("락커룸 이름을 입력하세요");
						String rockS = scn.next();

						Member sm = new SoccerMember(id, name, phone, coaS, rockS);
						mi.addMember(sm);

					} else if (lect == 3) {
						System.out.println("강사의 이름을 입력하세요");
						String instS = scn.next();
						System.out.println("등급을 입력하세요");
						String gradeS = scn.next();

						Member swm = new BookMember(id, name, phone, instS, gradeS);
						mi.addMember(swm);

					}
				}

				// 수정
			} else if (menu == 2) {
				System.out.println("수정할 회원의 ID를 입력하세요");
				int moId = scn.nextInt();
				System.out.println("새로운 휴대폰 번호를 입력해주세요");
				String moPhone = scn.next();

				Member modi = new Member(moId, moPhone);

				mi.modifyMember(modi);

				// 전체리스트
			} else if (menu == 3) {
				for (Member s : members) {
					System.out.println(s);
				}

				// 종료
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
			for (Member s : members) {
				if (s.getMemberId() == member.getMemberId()) {
					s.setPhone(member.getPhone());
				}
			}
		}

		@Override
		public List<Member> memberList() {
			return members;
		}
	}
}
