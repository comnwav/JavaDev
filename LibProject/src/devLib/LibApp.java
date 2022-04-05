package devLib;

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
				System.out.printf("ID를 입력하세요>>");
				user.setUsrId(scn.next());
				System.out.printf("비밀번호를 입력하세요>>");
				user.setUsrPass(scn.next());
				user.setUsrCode(laf.getUsrCode(user.getUsrId()));
				
				while (true) {
					int log = laf.loginLib(user.getUsrId(), user.getUsrPass());
					if (log == 1) { // 관리자 로그인
						Admin ad = new Admin();
						System.out.println("1.도서등록 2.도서수정 3.도서삭제 4.반납도서입력 5.대여현황");
						int temp = scn.nextInt();
						scn.nextLine();
						if (temp == 1) {
							ad.addBook();
						} else if (temp == 2) {
							ad.modiBook();
						} else if (temp == 3) {
							ad.rmBook();
						} else if (temp == 4) {
							ad.backBook();
						} else if (temp == 5) {

						} else if (temp == 9) {
							System.out.println("관리자 계정에서 로그아웃 합니다");
							break;
						}

					} else if (log == 2) { // 사용자 로그인
						LibGenFunc lgf = new LibGenFunc();
						System.out.println("대여중목록");
						List<Book> test3 = lgf.ocfList();
						for (Book s : test3) {
							System.out.println(s.toString2());
						}
						
						System.out.println("리스트");
						List<Book> test2 = lgf.availList();
						for (Book s : test2) {
							System.out.println(s.toString());
						}
						
						System.out.println("제목으로검색");
						List<Book> test = lgf.searchListByTitle(scn.nextLine());
						scn.next();
						System.out.println(test.toString());
//						User usr = new User();
//						usr.getBook(user);

					} else if (log == -1) {
						System.out.println("잘못된 로그인 정보입니다. 다시입력하세요.");
					} else if (log == 9) {
						break;
					}
				}
			} else if (start == 2) {
				LibAdminFunc laf = new LibAdminFunc();
				System.out.printf("사용하실 ID를 입력하세요>> ");
				String id = scn.next();
				System.out.printf("사용하실 비밀번호를 입력하세요>> ");
				String pass1 = scn.next();
				System.out.printf("입력하신 비밀번호를 다시한번 입력하세요>> ");
				String pass2 = scn.next();
				int code = 1234; // temp

				while (true) {
					if (pass1.equals(pass2)) {

						laf.memberRegi(id, pass1, code);
						System.out.println("회원등록이 완료되었습니다.");
						break;
					} else {
						System.out.println("비밀번호가 일치하지않습니다.");
					}
				}

			}
		}
	}

	public class Admin {

		public void addBook() {

			Book bk = new Book();
			LibAdminFunc laf = new LibAdminFunc();

			System.out.println("고유코드는" + "입니다.");
			bk.setCodeBook(scn.next()); // test
			System.out.printf("제목을 입력하세요>>");
			bk.setTitleBook(scn.next());
			System.out.printf("저자를 입력하세요>>");
			bk.setAuthBook(scn.next());
			System.out.printf("출판사를 입력하세요>>");
			bk.setPubBook(scn.next());
			laf.addBook(bk);
		}

		public void modiBook() {
//			LibGenFunc lgf = new LibGenFunc();
			
			LibAdminFunc laf = new LibAdminFunc();
			Book bk = new Book();

			System.out.printf("수정하실 도서의 고유코드를 입력하세요>> ");
			String code = scn.next();
			bk.setCodeBook(code);
			
//			System.out.println("선택하신 도서는 " + lgf.getTitle(code).titleBook + " - " + lgf.getTitle(code).authBook + " - "
//					+ lgf.getTitle(code).pubBook + "입니다.");
			
			System.out.printf("수정하실 제목을 입력하세요>> ");
			bk.setTitleBook(scn.next());
			System.out.printf("수정하실 저자를 입력하세요>> ");
			bk.setAuthBook(scn.next());
			System.out.printf("수정하실 출판사를 입력하세요>> ");
			bk.setPubBook(scn.next());

			laf.modiBook(bk);
		}

		public void rmBook() {
//			LibGenFunc lgf = new LibGenFunc();
			
			LibAdminFunc laf = new LibAdminFunc();
			System.out.printf("삭제하실 도서의 고유코드를 입력하세요>> ");
			String code = scn.next();
			
//			System.out.println("선택하신 도서는 " + lgf.getTitle(code).titleBook + " - " + lgf.getTitle(code).authBook + " - "
//					+ lgf.getTitle(code).pubBook + "입니다.");
			
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

		}
	}

	public class User {

		public void getBook(LibUser user) {
			System.out.println("대여하실 책코드");
			String code = scn.next();
			
			LibFunc lf = new LibFunc();
			lf.getBook(user.getUsrCode(), code);
			
			System.out.println("대여가 완료되었습니다.");
		}

	}

}