package devLib;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Admin {

	static Scanner scn = new Scanner(System.in);
	
	public void allList() {
		LibGenFunc lgf = new LibGenFunc();
		
		List<Book> lb = lgf.allList();
		for (Book s : lb) {
			System.out.println(s.toString());
		}
		
	}

	public void addUser() {
		LibUser usr = new LibUser();
		LibAdminFunc laf = new LibAdminFunc();
		while (true) {
			System.out.printf("사용하실 ID를 입력하세요>> ");
			String id = scn.next();
			System.out.println("중복체크중입니다...");
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
				System.out.println();
				System.out.println(
						"[" + usr.getUsrId() + "님의 회원등록이 완료되었습니다. 회원 코드는 " + laf.getUsrCode(usr.getUsrId()) + " 입니다.]");
				System.out.println("");
				break;
			} else {
				System.out.println("비밀번호가 일치하지않습니다.");
			}
		}

	}

	public void addBook() {

		Book bk = new Book();
		LibAdminFunc laf = new LibAdminFunc();
		scn.nextLine();
		System.out.printf("제목을 입력하세요>> ");
		bk.setTitleBook(scn.nextLine());
		System.out.printf("저자를 입력하세요>> ");
		bk.setAuthBook(scn.nextLine());
		System.out.printf("출판사를 입력하세요>> ");
		bk.setPubBook(scn.nextLine());
		laf.addBook(bk);
	}

	public void modiBook() {

		Book bk = new Book();
		LibAdminFunc laf = new LibAdminFunc();
		scn.nextLine();
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
			System.out.println(">> 삭제가 완료되었습니다.");
		} else if (yn.equals("n")) {
			System.out.println(">> 삭제가 취소되었습니다.");
		}

	}

	public void backBook() {

		Book book = new Book();
		LibUser user = new LibUser();
		LibAdminFunc laf = new LibAdminFunc();

		System.out.printf("반납할 도서코드를 입력하세요>> ");
		book = laf.getInfoBook(scn.next());
		scn.nextLine();

		long calDay = 0;
		Date now = new Date();
		long calDate = now.getTime() - book.getDateAway().getTime();
		calDay = (calDate / (24 * 60 * 60 * 1000)) - 15;
		user.setCalDay(calDay);

		if (user.getCalDay() > 0) {
			laf.backBook2(book, user);
			System.out.println(user.getCalDay());
			System.out.println(book.getUsrCode());
			System.out.println("----------------------");
			System.out.println(">> 정상적으로 반납되었습니다.");
			System.out.println(">> 연체일수는 " + calDay + "일 입니다.");
			System.out.println("----------------------");
		} else {
			laf.backBook(book, user);
			System.out.println("----------------------");
			System.out.println(">> 정상적으로 반납되었습니다.");
			System.out.println("----------------------");
		}

	}

	public void rentBook() {

		Book book = new Book();
		LibUser user = new LibUser();
		LibAdminFunc laf = new LibAdminFunc();
		LibGenFunc lgf = new LibGenFunc();

		System.out.printf("대여할 도서코드를 입력하세요>> ");
		book = laf.getInfoBook(scn.next());
		scn.nextLine();

		while (true) {
			if (book.getDateAway() == null) {
				System.out.printf("사용자 코드를 입력하세요>> ");
				user = laf.getInforUser(scn.next());
				scn.nextLine();
				List<Book> lb = lgf.ocfList(user.getUsrCode());
				long calDay = 0;
				for (Book s : lb) {
					Date now = new Date();
					long calDate = now.getTime() - s.getDateAway().getTime();
					calDay = (calDate / (24 * 60 * 60 * 1000)) - 15;
				}
				
				System.out.println(user.getCalDay());
				System.out.println(calDay);
				
				if (calDay > 0 || user.getCalDay() > 0) {
					System.out.println("------------------------------------------");
					System.out.println(">> 해당 사용자는 대여중지 중이거나 연체 중인 도서가 있습니다.");
					System.out.println("------------------------------------------");
					break;
				} else {
					laf.rentBook(user.getUsrCode(), book.getCodeBook());
					System.out.println("----------------------------");
					System.out.println(">> 대여기간은 대여일로 부터 15일 입니다.");
					System.out.println(">> 연체일 수 만큼 대여가 중지됩니다.");
					System.out.println("----------------------------");
					break;
				}
				
			} else {
				System.out.println(">> 해당 도서가 대여 중입니다.");
				break;
			}
		}
	}

}
