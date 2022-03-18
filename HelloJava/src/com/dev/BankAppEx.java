package com.dev;

import java.util.Scanner;

public class BankAppEx {
	// 메뉴 : 1. 계좌생성 (번호, 예금주, 예금액)
	// 2. 예금 (번호, 예금액) > 최고 예금 금액 10만원
	// 3. 출금 (번호, 출금액) > 잔액보다 큰 금액 출금 못하도록.
	// 4. 잔액조회 (번호)
	// 5. 송금 (송금번호, 금액, 입금번호)
	// 6. 종료.

	// static 선언해주면 인스턴트 실행 안해도된다.
	static BankApp[] banks = new BankApp[5];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			printMenu();
			int menu = scn.nextInt();
			if (menu == 1) {
				createAcc();
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				checkAcc();
			} else if (menu == 5) {
				transfer();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu == 9) {
				showList();
			}
			System.out.println("=== End ===");
		} // end of while.

	}

	// 메뉴출력 기능
	public static void printMenu() {
		String menu = "1. 계좌생성 (번호, 예금주, 예금액)\r\n" + "2. 예금 (번호, 예금액)\r\n" + "3. 출금 (번호, 출금액)\r\n" + "4. 잔액조회 (번호)\r\n"
				+ "5. 송금.\r\n" + "6. 종료\r\n" + "<선택>";
		System.out.println(menu);
	}

	// 1. 계좌생성
	public static void createAcc() {
		System.out.println("계좌생성");
		System.out.println("계좌번호입력>>");
		String accNo;

		// 계좌번호 있는지 체크
		while (true) {
			accNo = scn.next();
			if (schAccNo(accNo) != null) {
				System.out.println("이미 존재하는 계좌번호 입니다.");
				System.out.println("다시 입력하세요");
			} else {
				break;
			}

		}

		System.out.println("예금주입력>>");
		String accNme = scn.next();
		System.out.println("예금액입력>>");
		int money = scn.nextInt();

		BankApp accnt = new BankApp(accNo, accNme, money);

		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				banks[i] = accnt;
				break;
			}
		}
	}

	// 2. 예금
	public static void deposit() {
		System.out.println("예금기능");
		System.out.println("계좌번호>>");
		String ano;
		int Amt;
		int crrAmt;

		while (true) {
			ano = scn.next();
			if (schAccNo(ano) != null) {
				crrAmt = schAccNo(ano).getMoney();
				while (true) {
					System.out.println("예금액을 입금하세요");
					Amt = scn.nextInt();
					if (crrAmt + Amt > 10000) {
						System.out.println("예금한도를 초과합니다.");
						System.out.println("다시 입력해 주세요");
					} else {
						int bal = crrAmt + Amt;
						schAccNo(ano).setMoney(bal);
						System.out.println("입금 완료 되었습니다.");
						System.out.println("현재 잔액" + schAccNo(ano).getMoney() + "입니다.");
						break;
					}
				}
				break;

			} else {
				System.out.println("계좌번호를 다시 입력하세요");
			}
		}
	}

	// 3. 출금
	public static void withdraw() {
		System.out.println("출금기능");
		System.out.println("계좌번호>>");
		String ano;
		int Amt;
		int crrAmt;

		while (true) {
			ano = scn.next();
			if (schAccNo(ano) != null) {
				crrAmt = schAccNo(ano).getMoney();
				while (true) {
					System.out.println("출금액을 입금하세요");
					Amt = scn.nextInt();
					if (crrAmt - Amt < 0) {
						System.out.println("출금한도 금액을 초과합니다.");
						System.out.println("다시 입력해 주세요");
					} else {
						int bal = crrAmt - Amt;
						schAccNo(ano).setMoney(bal);
						System.out.println("출금 완료 되었습니다.");
						System.out.println("현재 잔액" + schAccNo(ano).getMoney() + "입니다.");
						break;
					}
				}
				break;

			} else {
				System.out.println("계좌번호를 다시 입력하세요");
			}
		}
	}

	// 4. 잔액조회
	public static void checkAcc() {
		System.out.println("잔액조회");
		System.out.println("계좌번호>>");
		String ano;

		while (true) {
			ano = scn.next();
			if (schAccNo(ano) != null) {
				System.out.println("현재 잔액은" + schAccNo(ano).getMoney() + "입니다.");
				break;
			} else {
				System.out.println("계좌정보가 없습니다. 다시 입력해주세요");
			}
		}

	}

	// 5. 송금 - 송금자 sender, 송신자 recipient
	public static void transfer() {
		System.out.println("송금");
		System.out.println("출금하실 계좌번호>>");
		String sendNo;
		String reciNo;
		int amt;
		
		while (true) {
			sendNo = scn.next();
			if (schAccNo(sendNo) != null) {
				System.out.println("송금가능 잔액은"+schAccNo(sendNo).getMoney()+"원 입니다.");
				System.out.println("상대방의 계좌를 입력하세요");
				reciNo = scn.next();
				System.out.println("송금할 금액을 입력하세요");
				amt = scn.nextInt();
				schAccNo(reciNo).setMoney(schAccNo(reciNo).getMoney() + amt);
				schAccNo(sendNo).setMoney(schAccNo(sendNo).getMoney() - amt);
				System.out.println("송금이 완료되었습니다.");
				break;
			} else {
				System.out.println("계좌번호를 잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
		}
		
	}

	// 전체리스트 출력
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}

	// 계좌번호를 입력하면 배열(banks)에서 그 계좌번호를 반환 없으면 null
	// 중복체크
	public static BankApp schAccNo(String accNo) {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
				return banks[i];
				// BankApp 클래스를 리턴한다.
			}

		}
		return null; // 반환 되는 값이 없다 -> null (모든 클래스에 대응되는 값, 모든 클래스의 초기값도 될 수 있다)
	}
}