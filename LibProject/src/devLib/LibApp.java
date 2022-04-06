package devLib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibApp {

	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (true) {

			System.out.println("1.로그인 / 2.회원가입");
			int start = scn.nextInt();
			if (start == 1) {
				LibUser user = new LibUser();
				LibAdminFunc laf = new LibAdminFunc();
				while (true) {
					System.out.printf("ID를 입력하세요>> ");
					user.setUsrId(scn.next());
					System.out.printf("비밀번호를 입력하세요>> ");
					user.setUsrPass(scn.next());
					user.setUsrCode(laf.getUsrCode(user.getUsrId()));
					int log = laf.loginLib(user.getUsrId(), user.getUsrPass());
					if (log == 1) { // 관리자 로그인
						while (true) {
							Admin ad = new Admin();
							System.out.println("1.도서등록 2.도서수정 3.도서삭제 4.도서대출 5.반납도서입력");
							int temp = scn.nextInt();
							scn.nextLine();
							if (temp == 1) {
								ad.addBook();
							} else if (temp == 2) {
								ad.modiBook();
							} else if (temp == 3) {
								ad.rmBook();
							} else if (temp == 4) {
								ad.rentBook();
							} else if (temp == 5) {
								ad.backBook();
							} else if (temp == 9) {
								System.out.println("관리자 계정에서 로그아웃 합니다");
								break;
							}
						}

					} else if (log == 2) { // 사용자 로그인
						LibGenFunc lgf = new LibGenFunc();
						List<Book> lb = new ArrayList<Book>();
						System.out.println("==== 대여 중 도서 목록 =====");
						lb = lgf.ocfList(user.getUsrCode());
						for (Book s : lb) {
							System.out.println(s.toStringForOcf());
						}
						System.out.println("==== 연체 중 도서목록 =====");
						for (Book s : lb) {
							
							int dd = s.getDateAway().getYear();
							System.out.println(dd);
						}
						
//						lb = lgf.bestList();
//						for (Book s : lb) {
//							System.out.println(s.toStringForBest());
//						}
						
						
						
						break;
					} else if (log == -1) {
						System.out.println("잘못된 로그인 정보입니다. 다시입력하세요.");
					}
				}
			} else if (start == 2) {
				Admin ad = new Admin();
				ad.addUser();
			}
		}
	}

	public class Admin {

		public void addUser() {
			LibUser usr = new LibUser();
			LibAdminFunc laf = new LibAdminFunc();
			while (true) {
				System.out.printf("사용하실 ID를 입력하세요>> ");
				String id = scn.next();
				if (laf.idCheck(id) == 1) {
					System.out.println("이미 존재하는 ID입니다 다시 입력해주세요.");
				} else if (laf.idCheck(id) == 2) {
					usr.setUsrId(id);
					break;
				}
			}

			while (true) {
				System.out.printf("사용하실 비밀번호를 입력하세요>> ");
				String pass1 = scn.next();
				System.out.printf("입력하신 비밀번호를 다시한번 입력하세요>> ");
				String pass2 = scn.next();

				if (pass1.equals(pass2)) {
					usr.setUsrPass(pass1);
					laf.memberRegi(usr);
					System.out.println("회원등록이 완료되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지않습니다.");
				}
			}

		}

		public void addBook() {

			Book bk = new Book();
			LibAdminFunc laf = new LibAdminFunc();

			System.out.printf("제목을 입력하세요>> ");
			bk.setTitleBook(scn.nextLine());
			System.out.printf("저자를 입력하세요>> ");
			bk.setAuthBook(scn.nextLine());
			System.out.printf("출판사를 입력하세요>> ");
			bk.setPubBook(scn.nextLine());
			laf.addBook(bk);
		}

		public void modiBook() {

			LibAdminFunc laf = new LibAdminFunc();
			Book bk = new Book();

			System.out.printf("수정하실 도서의 고유코드를 입력하세요>> ");
			bk.setCodeBook(scn.nextLine());
			System.out.printf("수정하실 제목을 입력하세요>> ");
			bk.setTitleBook(scn.nextLine());
			System.out.printf("수정하실 저자를 입력하세요>> ");
			bk.setAuthBook(scn.nextLine());
			System.out.printf("수정하실 출판사를 입력하세요>> ");
			bk.setPubBook(scn.nextLine());

			laf.modiBook(bk);
		}

		public void rmBook() {
			LibAdminFunc laf = new LibAdminFunc();
			System.out.printf("삭제하실 도서의 고유코드를 입력하세요>> ");
			String code = scn.next();
			System.out.printf("삭제하시겠습니까? y/n >> ");
			String yn = scn.next();

			if (yn.equals("y")) {
				laf.rmBook(code);
				System.out.println("삭제가 완료되었습니다.");
			} else if (yn.equals("n")) {
				System.out.println("삭제가 취소되었습니다.");
			}

		}

		public void backBook() {
			System.out.printf("반납할 도서코드 입력>> ");
			LibAdminFunc laf = new LibAdminFunc();
			laf.backBook(scn.next());
			System.out.println("반환완료");
		}

		public void rentBook() {
			LibAdminFunc laf = new LibAdminFunc();
			System.out.printf("대출할 사용자 코드입력>> ");
			String codeUser = scn.next();
			System.out.printf("대출할 도서 코드 입력>> ");
			String codeBook = scn.next();
			laf.rentBook(codeUser, codeBook);
		}
	}

	public class User {

	}

}