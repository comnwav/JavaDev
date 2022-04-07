package devLib;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LibApp {

	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (true) {
			int start = 0;
			System.out.println("===== 예담 도서관에 오신것을 환영합니다. =====");
			System.out.println("1.로그인 / 2.일반 사용자 회원가입");
			System.out.println("// <Test>");
			System.out.println("// 도서관리는 관리자 계정으로 로그인하세요 ID : admin / 비밀번호 : admin");
			System.out.println("// 도서등록, 수정, 삭제, 대출, 반납은 관리자 계정에서만 가능합니다");
			System.out.println("// 도서코드는 a1001 부터 a9999 까지 회원번호는 1001 부터 9999 까지 자동할당");
			System.out.printf("입력>> ");
			try {
				start = scn.nextInt();

			} catch (InputMismatchException e) {
				System.out.println(">>> 숫자를 입력하세요");
				scn.nextLine();
			}
			if (start == 1) {
				LibUser user = new LibUser();
				LibAdminFunc laf = new LibAdminFunc();
				while (true) {
					System.out.printf("ID를 입력하세요>> ");
					user.setUsrId(scn.next());
					System.out.printf("비밀번호를 입력하세요>> ");
					user.setUsrPass(scn.next());
					System.out.println("로그인 중 입니다...");
					user.setUsrCode(laf.getUsrCode(user.getUsrId()));
					int log = laf.loginLib(user.getUsrId(), user.getUsrPass());
					if (log == 1) { // 관리자 로그인
						while (true) {
							Admin ad = new Admin();
							System.out.println("1.도서등록 2.도서수정 3.도서삭제 4.도서대출 5.반납도서입력 9. 로그아웃");
							System.out.printf("입력>> ");
							int temp = 0;
							try {
								temp = scn.nextInt();

							} catch (InputMismatchException e) {
								System.out.println(">>> 숫자를 입력하세요");
								scn.nextLine();
							}
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
						break;

					} else if (log == 2) { // 사용자 로그인
						LibGenFunc lgf = new LibGenFunc();
						List<Book> lb = new ArrayList<Book>();
						while (true) {
							System.out.println("===========================================");
							System.out.println(">>>>> 안녕하세요!! " + user.getUsrId() + "님 환영합니다! <<<<");
							System.out.println("===========================================");
							System.out.println("============== 대여 중 도서 목록 ===============");
							System.out.println("   제목   |   저자   |   출판사   |   반납예정일   ");
							lb = lgf.ocfList(user.getUsrCode());
							for (Book s : lb) {
								System.out.println("|" + s.getTitleBook() + "|" + s.getAuthBook() + "|" + s.pubBook
										+ "|" + s.getDateBack() + "|");
							}
							System.out.println("===========================================");
							System.out.println("============== 연체 중 도서목록 ================");
							System.out.println("   제목   |   저자   |   출판사   |   연체일수   ");
							for (Book s : lb) {
								Date now = new Date();
								long calDate = now.getTime() - s.getDateAway().getTime();
								long calDay = (calDate / (24 * 60 * 60 * 1000)) - 15;
								if (calDay > 15) {
									System.out.println("|" + s.getTitleBook() + "|" + s.getAuthBook() + "|" + s.pubBook
											+ "|" + calDay + "일" + "|");
								}
							}
							System.out.println("===========================================");
							System.out.println("============= 베스트 5 도서 목록 =============");
							System.out.println("   제목   |   저자   |   출판사   |   대여횟수   ");
							lb = lgf.bestList();
							for (Book s : lb) {
								System.out.println("|" + s.getTitleBook() + "|" + s.getAuthBook() + "|" + s.pubBook
										+ "|" + s.getRentCount() + "|");
							}
							System.out.println("===========================================");
							System.out.println("================= 도서검색 ==================");
							System.out.println("1. 제목으로 검색 / 2. 저자로 검색 / 3.출판사로 검색 / 9. 로그아웃");
							System.out.printf("입력>> ");
							int bs = 0;
							try {
								bs = scn.nextInt();

							} catch (InputMismatchException e) {
								System.out.println(">>> 숫자를 입력하세요");
								scn.nextLine();
							}
							if (bs == 1) {
								System.out.printf("도서 제목을 입력하세요>> ");
								lb = lgf.searchListByTitle(scn.next());
								scn.nextLine();
								for (Book s : lb) {
									System.out.println(s.toString());
								}
								while (true) {
									System.out.println("1.책 상제정보 2.돌아가기");
									System.out.printf("입력>> ");
									int info = 0;
									try {
										info = scn.nextInt();

									} catch (InputMismatchException e) {
										System.out.println(">>> 숫자를 입력하세요");
										scn.nextLine();
									}
									if (info == 1) {
										while (true) {
											System.out.printf("책 코드를 입력하세요>> ");
											Book b = laf.getInfoBook(scn.next());
											b.toStringForInfo();
											System.out.printf("1.돌아가기>> ");
											if (scn.nextInt() == 1) {
												break;
											}
										}
									} else if (info == 2) {
										break;
									}
								}
							} else if (bs == 2) {
								System.out.printf("저자을 입력하세요>> ");
								lb = lgf.searchListByAuth(scn.next());
								scn.nextLine();
								for (Book s : lb) {
									System.out.println(s.toString());
								}
								while (true) {
									System.out.println("1.책 상제정보 2.돌아가기");
									System.out.printf("입력>> ");
									int info = 0;
									try {
										info = scn.nextInt();

									} catch (InputMismatchException e) {
										System.out.println(">>> 숫자를 입력하세요");
										scn.nextLine();
									}
									if (info == 1) {
										while (true) {
											System.out.printf("책 코드를 입력하세요>> ");
											Book b = laf.getInfoBook(scn.next());
											b.toStringForInfo();
											System.out.printf("1.돌아가기>> ");
											if (scn.nextInt() == 1) {
												break;
											}
										}
									} else if (info == 2) {
										break;
									}
								}
							} else if (bs == 3) {
								System.out.printf("출판사를 입력하세요>> ");
								lb = lgf.searchListByPub(scn.next());
								scn.nextLine();
								for (Book s : lb) {
									System.out.println(s.toString());
								}
								while (true) {
									System.out.println("1.책 상제정보 2.돌아가기");
									System.out.printf("입력>> ");
									int info = 0;
									try {
										info = scn.nextInt();

									} catch (InputMismatchException e) {
										System.out.println(">>> 숫자를 입력하세요");
										scn.nextLine();
									}
									if (info == 1) {
										while (true) {
											System.out.printf("책 코드를 입력하세요>> ");
											Book b = laf.getInfoBook(scn.next());
											b.toStringForInfo();
											System.out.printf("1.돌아가기>> ");
											if (scn.nextInt() == 1) {
												break;
											}
										}
									} else if (info == 2) {
										break;
									}
								}
							} else if (bs == 9) {
								System.out.println("로그아웃 합니다.");
								break;
							}
						}
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
					System.out.println("[" + usr.getUsrId() + "님의 회원등록이 완료되었습니다. 회원 코드는 "
							+ laf.getUsrCode(usr.getUsrId()) + " 입니다.]");
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
				System.out.println("삭제가 완료되었습니다.");
			} else if (yn.equals("n")) {
				System.out.println("삭제가 취소되었습니다.");
			}

		}

		public void backBook() {
			System.out.println("// 오늘 날짜로 반환 됩니다.");
			System.out.println("// 연체 기능확인시 DB에서 대여 날짜 수정 및 시스템 날짜를 15일 이전으로 수정 후 test 부탁드립니다.");
			System.out.printf("반납할 도서코드 입력>> ");
			LibAdminFunc laf = new LibAdminFunc();
			laf.backBook(scn.next());
			System.out.println("반환완료");
		}

		public void rentBook() {
			while (true) {
				LibAdminFunc laf = new LibAdminFunc();
				LibGenFunc lgf = new LibGenFunc();
				System.out.printf("대출할 사용자 코드입력 [뒤로가기는 9입력] >> ");
				String codeUser = scn.next();
				if (codeUser.equals("9")) {
					break;
				} else {
					List<Book> lb = lgf.ocfList(codeUser);

					for (Book s : lb) {
						if (s.getDateAway() == null) {
							System.out.printf("대출할 도서 코드 입력>> ");
							String codeBook = scn.next();
							laf.rentBook(codeUser, codeBook);
							System.out.println(">> 대여가 완료되었습니다.");
							System.out.println(">> 반납일은 " + laf.getInfoBook(codeBook).getDateBack() + " 입니다.");
							System.out.println(">> 대여기간은 대여일로 부터 15일 입니다.");
							System.out.println(">> 연체일 수 만큼 대여가 중지됩니다.");
							break;
						} else {
							Date now = new Date();
							long calDate = now.getTime() - s.getDateAway().getTime();
							long calDay = (calDate / (24 * 60 * 60 * 1000)) - 15;
							if (calDay > 15) {
								System.out.println("해당 사용자는 연체중인 도서가 있습니다. 대여할 수 없습니다.");
								break;
							} else {
								System.out.printf("대출할 도서 코드 입력>> ");
								String codeBook = scn.next();
								laf.rentBook(codeUser, codeBook);
								System.out.println(">> 대여가 완료되었습니다.");
								System.out.println(">> 반납일은 " + laf.getInfoBook(codeBook).getDateBack() + " 입니다.");
								System.out.println(">> 대여기간은 대여일로 부터 15일 입니다.");
								System.out.println(">> 연체일 수 만큼 대여가 중지됩니다.");
								break;
							}

						}

					}
				}

			}
		}
	}

}