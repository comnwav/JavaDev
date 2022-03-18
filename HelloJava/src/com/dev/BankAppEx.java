package com.dev;

import java.util.Scanner;

public class BankAppEx {
	// �޴� : 1. ���»��� (��ȣ, ������, ���ݾ�)
	// 2. ���� (��ȣ, ���ݾ�) > �ְ� ���� �ݾ� 10����
	// 3. ��� (��ȣ, ��ݾ�) > �ܾ׺��� ū �ݾ� ��� ���ϵ���.
	// 4. �ܾ���ȸ (��ȣ)
	// 5. ����.

	// static �������ָ� �ν���Ʈ ���� ���ص��ȴ�.
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
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (menu == 9) {
				showList();
			}
			System.out.println("=== End ===");
		} // end of while.

	}

	// �޴���� ���
	public static void printMenu() {
		String menu = "1. ���»��� (��ȣ, ������, ���ݾ�)\r\n" + "2. ���� (��ȣ, ���ݾ�)\r\n" + "3. ��� (��ȣ, ��ݾ�)\r\n" + "4. �ܾ���ȸ (��ȣ)\r\n"
				+ "5. ����.\r\n" + "<����>";
		System.out.println(menu);
	}

	// ���»���
	public static void createAcc() {
		System.out.println("���»���");
		System.out.println("���¹�ȣ�Է�>>");
		String accNo;

		// ���¹�ȣ �ִ��� üũ
		while (true) {
			accNo = scn.next();
			if (schAccNo(accNo) != null) {
				System.out.println("�̹� �����ϴ� ���¹�ȣ �Դϴ�.");
				System.out.println("�ٽ� �Է��ϼ���");
			} else {
				break;
			}

		}

		System.out.println("�������Է�>>");
		String accNme = scn.next();
		System.out.println("���ݾ��Է�>>");
		int money = scn.nextInt();

		BankApp accnt = new BankApp(accNo, accNme, money);

		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				banks[i] = accnt;
				break;
			}
		}
	}

	// ����
	public static void deposit() {
		System.out.println("���ݱ��");
		System.out.println("���¹�ȣ>>");
		String ano;
		int Amt;
		int crrAmt;

		while (true) {
			ano = scn.next();
			if (schAccNo(ano) != null) {
				crrAmt = schAccNo(ano).getMoney();
				while (true) {
					System.out.println("���ݾ��� �Ա��ϼ���");
					Amt = scn.nextInt();
					if (crrAmt + Amt > 10000) {
						System.out.println("�����ѵ��� �ʰ��մϴ�.");
						System.out.println("�ٽ� �Է��� �ּ���");
					} else {
						int bal = crrAmt + Amt;
						schAccNo(ano).setMoney(bal);
						System.out.println("�Ա� �Ϸ� �Ǿ����ϴ�.");
						break;
					}
				}

			} else {
				System.out.println("���¹�ȣ�� �ٽ� �Է��ϼ���");
			}
		}
	}

	// ���
	public static void withdraw() {
		System.out.println("��ݱ��");

	}

	// �ܾ���ȸ
	public static void checkAcc() {
		System.out.println("�ܾ���ȸ");
	}

	// ��ü����Ʈ ���
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}

	// ���¹�ȣ�� �Է��ϸ� �迭(banks)���� �� ���¹�ȣ�� ��ȯ ������ null
	// �ߺ�üũ
	public static BankApp schAccNo(String accNo) {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
				return banks[i];
				// BankApp Ŭ������ �����Ѵ�.
			}

		}
		return null; // ��ȯ �Ǵ� ���� ���� -> null (��� Ŭ������ �����Ǵ� ��, ��� Ŭ������ �ʱⰪ�� �� �� �ִ�)
	}
}
