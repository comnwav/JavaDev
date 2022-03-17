package dev;

import java.util.Scanner;

public class WhileEx4 {

	public static void main(String[] args) {

		// 은행 계좌를 만들어서 1:입금 2:출금 3: 종료
		// 입금일 경우 입금액을 입력 하세요 account 누적
		// 출금일 경우 출금액 만큼을 입력하세요 account 차감
		// 종료 경우 프로그램 종료
		// scanner, account
		// while -> true 사용

		Scanner scn = new Scanner(System.in);

		int bal = 0;

		while (true) {

			System.out.println("Press number below");
			System.out.println("1:Deposit / 2:Withdraw / 3:Done");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("Please insert value");
				int depo = scn.nextInt();
				bal = bal + depo;
				System.out.println("Total balance is " + bal);

			} else if (menu == 2) {
				System.out.println("Please insert value");
				int with = scn.nextInt();
				if (with > bal) {
					System.out.println("Oh, poor boy");
					continue;
				}
				bal = bal - with;
				System.out.println("Total balance is " + bal);
			} else {
				System.out.println("Thank you!");
				break;
			}
		}
		scn.close();
	}

}
