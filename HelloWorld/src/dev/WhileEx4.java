package dev;

import java.util.Scanner;

public class WhileEx4 {

	public static void main(String[] args) {

		// ���� ���¸� ���� 1:�Ա� 2:��� 3: ����
		// �Ա��� ��� �Աݾ��� �Է� �ϼ��� account ����
		// ����� ��� ��ݾ� ��ŭ�� �Է��ϼ��� account ����
		// ���� ��� ���α׷� ����
		// scanner, account
		// while -> true ���

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
