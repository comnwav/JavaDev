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
			System.out.println("// 도서등록, 수정, 삭제, 대출, 반납은 관리자 계정에서만 가능합니다");
			System.out.println("// 도서관리는 관리자 계정으로 로그인하세요 ");
			System.out.println("// ID : admin / 비밀번호 : admin");
			System.out.println("");
			System.out.println("==================================");
			System.out.println("=== 자바라자바 도서관에 오신것을 환영합니다. ===");
			System.out.println("==================================");
			System.out.println("1.로그인 / 2.일반 사용자 회원가입");
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
							System.out.println("");
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
								System.out.println("=======================");
								System.out.println("도서코드 | 제목 | 저자 | 출판사");
								for (Book s : lb) {
									System.out.println(s.toString());
								}
								System.out.println("=======================");
								while (true) {
									System.out.println("1.책 상세정보 2.돌아가기");
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
								System.out.println("=======================");
								System.out.println("도서코드 | 제목 | 저자 | 출판사");
								for (Book s : lb) {
									System.out.println(s.toString());
								}
								System.out.println("=======================");
								while (true) {
									System.out.println("1.책 상세정보 2.돌아가기");
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
								System.out.println("=======================");
								System.out.println("도서코드 | 제목 | 저자 | 출판사");
								for (Book s : lb) {
									System.out.println(s.toString());
								}
								System.out.println("=======================");
								while (true) {
									System.out.println("1.책 상세정보 2.돌아가기");
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


}