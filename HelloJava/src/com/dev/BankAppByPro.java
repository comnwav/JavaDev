//package com.dev;
//
//import java.util.Scanner;
//
//// BankApp(main method), Account(���¹�ȣ,������,�ܾ�) 
//public class BankApp {
//
//	static Account[] banks = new Account[100];
//	static Scanner scn = new Scanner(System.in);
//
//	// �޴�: 1.���»���(��ȣ,������,���ݾ�)
//	// 2.����(��ȣ,���ݾ�) -> �ְ��ݾ� 100,000��.
//	// 3.���(��ȣ,��ݾ�) -> �ܾ׺��� ū �ݾ� ��� ���ϵ���.
//	// 4.�ܾ���ȸ(��ȣ)
//	// 5.����.
//	// ������ �ڹ� 5��°�ε� ... ������ ���α׷��Դϴ�...
//
//	public static void main(String[] args) {
//
//		while (true) {
//			printMenu();
//			int menu = scn.nextInt();
//
//			if (menu == 1) {
//				createAccount();
//			} else if (menu == 2) {
//				deposit();
//			} else if (menu == 3) {
//				withdraw();
//			} else if (menu == 4) {
//				findAccountMoney();
//			} else if (menu == 5) {
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			} else if (menu == 9) {
//				showList();
//			}
//		}
//		System.out.println("=== End of Prog ===");
//	} // end of main()
//
//	// �޴���� ���.
//	public static void printMenu() {
//		String menu = "=====================================================\r\n" //
//				+ "     1.���»���(��ȣ,������,���ݾ�)\r\n" //
//				+ "     2.����(��ȣ,���ݾ�) -> �ְ��ݾ� 100,000��.\r\n" //
//				+ "     3.���(��ȣ,��ݾ�) -> �ܾ׺��� ū �ݾ� ��� ���ϵ���.\r\n" //
//				+ "     4.�ܾ���ȸ(��ȣ)\r\n" //
//				+ "     5.����.\r\n" //
//				+ "=====================================================\r\n"//
//				+ "����> ";
//		System.out.print(menu);
//	}
//
//	// ���»��� �޼ҵ�.
//	public static void createAccount() {
//		System.out.println("���»������.");
//
//		String accNo;
//		while (true) {
//			System.out.print("���¹�ȣ�Է�>> ");
//			accNo = scn.next();
//			// ���¹�ȣ �ִ��� üũ.
//			if (searchAccountNo(accNo) != null) {
//				System.out.println("�̹� �ִ� ���¹�ȣ�Դϴ�.");
//				continue;
//			}
//			// ��밡���� ���¹�ȣ�� ������ while �ݺ����� �����.
//			break;
//		}
//
//		System.out.print("�������Է�>> ");
//		String accName = scn.next();
//		System.out.print("���ݾ��Է�>> ");
//		int accMoney = scn.nextInt();
//
//		Account accnt = new Account(accNo, accName, accMoney);
//
//		for (int i = 0; i < banks.length; i++) {
//			if (banks[i] == null) {
//				banks[i] = accnt;
//				break;
//			}
//		}
//		System.out.println("���°� ���������� �����Ǿ����ϴ�.");
//
//	}
//
//	// ���� �޼ҵ�.
//	public static void deposit() {
//		System.out.println("���ݱ��.");
//
//		System.out.print("���¹�ȣ>> ");
//		String ano = scn.next();
//		System.out.print("���ݾ� �Է�>> ");
//		int amt = scn.nextInt();
//		int checkCnt = 0; // ��ȸ�� �ƴ��� üũ ���� ����.
//
//		Account findAccount = searchAccountNo(ano);
//		if (findAccount != null) {
//			checkCnt = 1; // ã�� ���ǿ� �´� ��������.
//			int currAmt = findAccount.getMoney();
//
//			// ���ݾ��� 10������ �ʰ����� ���ϵ���..
//			if (currAmt + amt > 100000) {
//				checkCnt = 2;
//			} else {
//				findAccount.setMoney(currAmt + amt); // �ܾ� + �Աݾ�.
//			}
//		}
//
//		if (checkCnt == 1) {
//			System.out.println("���������� ó���Ǿ����ϴ�.");
//		} else if (checkCnt == 2) {
//			System.out.println("�ѵ����� �ʰ��߽��ϴ�.");
//		} else {
//			System.out.println("���¹�ȣ�� �����ϴ�.");
//		}
//
//	}
//
//	// ��� �޼ҵ�.
//	public static void withdraw() {
//		System.out.println("��ݱ��.");
//		System.out.print("���¹�ȣ>> ");
//		String ano = scn.next();
//		System.out.print("���ݾ� �Է�>> ");
//		int amt = scn.nextInt();
//		int checkCnt = 0; // ��ȸ�� �ƴ��� üũ ���� ����.
//
//		Account findAccount = searchAccountNo(ano);
//		if (findAccount != null) {
//			checkCnt = 1;
//			int currAmt = findAccount.getMoney();
//
//			// �ܾ��� �ʰ��ؼ� ����� ���ϵ���..
//			if (currAmt < amt) {
//				checkCnt = 2;
//			} else {
//				findAccount.setMoney(currAmt - amt); // �ܾ� - �Աݾ�.
//			}
//		}
//
//		if (checkCnt == 1) {
//			System.out.println("���������� ó���Ǿ����ϴ�.");
//		} else if (checkCnt == 2) {
//			System.out.println("�ܾ��� �ʰ��߽��ϴ�.");
//		} else {
//			System.out.println("���¹�ȣ�� �����ϴ�.");
//		}
//	}
//
//	// �ܾ���ȸ �޼ҵ�.
//	public static void findAccountMoney() {
//		System.out.println("��ȸ���.");
//		System.out.print("���¹�ȣ>> ");
//		String ano = scn.next();
//		Account findAccount = searchAccountNo(ano);
//		if (findAccount == null) {
//			System.out.println("���°� �������� �ʽ��ϴ�.");
//			return;
//		}
//		System.out.println("�ܾ�: " + findAccount.getMoney());
//	}
//
//	// ��ü����Ʈ ���.
//	public static void showList() {
//		for (int i = 0; i < banks.length; i++) {
//			if (banks[i] != null) {
//				System.out.println(banks[i].toString());
//			}
//		}
//	}
//
//	// ���¹�ȣ�� �Է��ϸ� �迭(banks)���� �� ���¹�ȣ�� ��ȯ ������ null
//	// 100�� 35�� ����
//	public static Account searchAccountNo(String accNo) {
//		for (int i = 0; i < banks.length; i++) {
//			if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
//				return banks[i];
//			}
//		}
//		return null; // Ŭ���� -> null(Student, Car,
//	}
//
//}