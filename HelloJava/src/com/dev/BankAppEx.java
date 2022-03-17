package com.dev;

import java.util.Scanner;

public class BankAppEx {
	// 메뉴 : 1. 계좌생성 (번호, 예금주, 예금액)
	// 2. 예금 (번호, 예금액) > 최고 예금 금액 10만원
	// 3. 출금 (번호, 출금액) > 잔액보다 큰 금액 출금 못하도록.
	// 4. 잔액조회 (번호)
	// 5. 종료.

	// static 선언해주면 인스턴트 실행 안해도된다.
	static BankApp[] banks = new BankApp[100];
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
				+ "5. 종료.\r\n" + "<선택>";
		System.out.println(menu);
	}

	// 계좌생성
	public static void createAcc() {
		System.out.println("계좌생성");
		System.out.println("계좌번호입력>>");
		String accNo = scn.next();
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

	// 예금
	public static void deposit() {
		System.out.println("예금기능");
	}

	// 출금
	public static void withdraw() {
		System.out.println("출금기능");
	}

	// 잔액조회
	public static void checkAcc() {
		System.out.println("잔액조회");
	}

	// 전체리스트 출력
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}
}
