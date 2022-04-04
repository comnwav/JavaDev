package devLib;

import java.util.Scanner;

public class LibApp {

	public void execute() {

		Scanner scn = new Scanner(System.in);
		while (true) {

			System.out.println("1.로그인 / 2.회원가입");
			int start = scn.nextInt();
			if (start == 1) {
				System.out.printf("ID를 입력하세요>>");
				String id = scn.next();
				System.out.printf("비밀번호를 입력하세요>>");
				String pass = scn.next();

				LibAdminFunc laf = new LibAdminFunc();
				int menu = laf.loginLib(id, pass);

				if (menu == 1) { // 관리자 로그인
					Admin ad = new Admin();
					System.out.println("1.도서등록 2.도서수정 3.도서삭제 4.반납도서입력 5.대여현황");
					int temp = scn.nextInt();

					if (temp == 1) {
						ad.addBook();
					} else if (temp == 2) {
						ad.modiBook();
					} else if (temp == 3) {
						ad.rmBook();
					} else if (temp == 4) {
						ad.backBook();
					} else if (temp == 5) {

					}

				} else if (menu == 2) { // 사용자 로그인
					
				} else if (menu == -1) {
					System.out.println("잘못된 로그인 정보입니다. 다시입력하세요.");
				} else if (menu == 9) {
					break;
				}

			} else if (start == 2) {
				LibAdminFunc laf = new LibAdminFunc();
				System.out.printf("사용하실 ID를 입력하세요");
				String id = scn.next();
				System.out.printf("사용하실 비밀번호를 입력하세요");
				String pass1 = scn.next();
				System.out.printf("비밀번호를 다시한번 입력하세요");
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
		scn.close();
	}

	public class Admin {

		public void addBook() {

			Scanner scn = new Scanner(System.in);

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
			scn.close();
		}

		public void modiBook() {

		}

		public void rmBook() {

		}

		public void backBook() {

		}
	}

	public class User {

	}
}
