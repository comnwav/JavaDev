package com.dev;

import java.util.Scanner;

// BankApp(main method), Account(怨꾩쥖踰덊샇,�삁湲덉＜,�옍�븸) 
public class BankAppByPro {

	static BankApp[] banks = new BankApp[100];
	static Scanner scn = new Scanner(System.in);

	// 硫붾돱: 1.怨꾩쥖�깮�꽦(踰덊샇,�삁湲덉＜,�삁湲덉븸)
	// 2.�삁湲�(踰덊샇,�삁湲덉븸) -> 理쒓퀬�삁湲덉븸 100,000�썝.
	// 3.異쒓툑(踰덊샇,異쒓툑�븸) -> �옍�븸蹂대떎 �겙 湲덉븸 異쒓툑 紐삵븯�룄濡�.
	// 4.�옍�븸議고쉶(踰덊샇)
	// 5.醫낅즺.
	// �삤�뒛�씠 �옄諛� 5�씪吏몄씤�뜲 ... �쟻�젅�븳 �봽濡쒓렇�옩�엯�땲�떎...

	public static void main(String[] args) {

		while (true) {
			printMenu();
			int menu = scn.nextInt();

			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				findAccountMoney();
			} else if (menu == 5) {
				System.out.println("�봽濡쒓렇�옩�쓣 醫낅즺�빀�땲�떎.");
				break;
			} else if (menu == 9) {
				showList();
			}
		}
		System.out.println("=== End of Prog ===");
	} // end of main()

	// 硫붾돱異쒕젰 湲곕뒫.
	public static void printMenu() {
		String menu = "=====================================================\r\n" //
				+ "     1.怨꾩쥖�깮�꽦(踰덊샇,�삁湲덉＜,�삁湲덉븸)\r\n" //
				+ "     2.�삁湲�(踰덊샇,�삁湲덉븸) -> 理쒓퀬�삁湲덉븸 100,000�썝.\r\n" //
				+ "     3.異쒓툑(踰덊샇,異쒓툑�븸) -> �옍�븸蹂대떎 �겙 湲덉븸 異쒓툑 紐삵븯�룄濡�.\r\n" //
				+ "     4.�옍�븸議고쉶(踰덊샇)\r\n" //
				+ "     5.醫낅즺.\r\n" //
				+ "=====================================================\r\n"//
				+ "�꽑�깮> ";
		System.out.print(menu);
	}

	// 怨꾩쥖�깮�꽦 硫붿냼�뱶.
	public static void createAccount() {
		System.out.println("怨꾩쥖�깮�꽦湲곕뒫.");

		String accNo;
		while (true) {
			System.out.print("怨꾩쥖踰덊샇�엯�젰>> ");
			accNo = scn.next();
			// 怨꾩쥖踰덊샇 �엳�뒗吏� 泥댄겕.
			if (searchAccountNo(accNo) != null) {
				System.out.println("�씠誘� �엳�뒗 怨꾩쥖踰덊샇�엯�땲�떎.");
				continue;
			}
			// �궗�슜媛��뒫�븳 怨꾩쥖踰덊샇媛� 留욎쑝硫� while 諛섎났臾몄쓣 踰쀬뼱�궃�떎.
			break;
		}

		System.out.print("�삁湲덉＜�엯�젰>> ");
		String accName = scn.next();
		System.out.print("�삁湲덉븸�엯�젰>> ");
		int accMoney = scn.nextInt();

		BankApp accnt = new BankApp(accNo, accName, accMoney);

		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				banks[i] = accnt;
				break;
			}
		}
		System.out.println("怨꾩쥖媛� �젙�긽�쟻�쑝濡� �깮�꽦�릺�뿀�뒿�땲�떎.");

	}

	// �삁湲� 硫붿냼�뱶.
	public static void deposit() {
		System.out.println("�삁湲덇린�뒫.");

		System.out.print("怨꾩쥖踰덊샇>> ");
		String ano = scn.next();
		System.out.print("�삁湲덉븸 �엯�젰>> ");
		int amt = scn.nextInt();
		int checkCnt = 0; // 議고쉶媛� �릱�뒗吏� 泥댄겕 �뿬遺� 蹂��닔.

		BankApp findAccount = searchAccountNo(ano);
		if (findAccount != null) {
			checkCnt = 1; // 李얜뒗 議곌굔�뿉 留욌뒗 怨꾩쥖議댁옱.
			int currAmt = findAccount.getMoney();

			// �삁湲덉븸�씠 10留뚯썝�쓣 珥덇낵�븯吏� 紐삵븯�룄濡�..
			if (currAmt + amt > 100000) {
				checkCnt = 2;
			} else {
				findAccount.setMoney(currAmt + amt); // �옍�븸 + �엯湲덉븸.
			}
		}

		if (checkCnt == 1) {
			System.out.println("�젙�궘�쟻�쑝濡� 泥섎━�릺�뿀�뒿�땲�떎.");
		} else if (checkCnt == 2) {
			System.out.println("�븳�룄�븸�쓣 珥덇낵�뻽�뒿�땲�떎.");
		} else {
			System.out.println("怨꾩쥖踰덊샇媛� �뾾�뒿�땲�떎.");
		}

	}

	// 異쒓툑 硫붿냼�뱶.
	public static void withdraw() {
		System.out.println("異쒓툑湲곕뒫.");
		System.out.print("怨꾩쥖踰덊샇>> ");
		String ano = scn.next();
		System.out.print("�삁湲덉븸 �엯�젰>> ");
		int amt = scn.nextInt();
		int checkCnt = 0; // 議고쉶媛� �릱�뒗吏� 泥댄겕 �뿬遺� 蹂��닔.

		Account findAccount = searchAccountNo(ano);
		if (findAccount != null) {
			checkCnt = 1;
			int currAmt = findAccount.getMoney();

			// �옍�븸�쓣 珥덇낵�빐�꽌 異쒓툑�쓣 紐삵븯�룄濡�..
			if (currAmt < amt) {
				checkCnt = 2;
			} else {
				findAccount.setMoney(currAmt - amt); // �옍�븸 - �엯湲덉븸.
			}
		}

		if (checkCnt == 1) {
			System.out.println("�젙�궘�쟻�쑝濡� 泥섎━�릺�뿀�뒿�땲�떎.");
		} else if (checkCnt == 2) {
			System.out.println("�옍�븸�쓣 珥덇낵�뻽�뒿�땲�떎.");
		} else {
			System.out.println("怨꾩쥖踰덊샇媛� �뾾�뒿�땲�떎.");
		}
	}

	// �옍�븸議고쉶 硫붿냼�뱶.
	public static void findAccountMoney() {
		System.out.println("議고쉶湲곕뒫.");
		System.out.print("怨꾩쥖踰덊샇>> ");
		String ano = scn.next();
		Account findAccount = searchAccountNo(ano);
		if (findAccount == null) {
			System.out.println("怨꾩쥖媛� 議댁옱�븯吏� �븡�뒿�땲�떎.");
			return;
		}
		System.out.println("�옍�븸: " + findAccount.getMoney());
	}

	// �쟾泥대━�뒪�듃 異쒕젰.
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}

	// 怨꾩쥖踰덊샇瑜� �엯�젰�븯硫� 諛곗뿴(banks)�뿉�꽌 洹� 怨꾩쥖踰덊샇瑜� 諛섑솚 �뾾�쑝硫� null
	// 100媛� 35媛� ���옣
	public static Account searchAccountNo(String accNo) {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
				return banks[i];
			}
		}
		return null; // �겢�옒�뒪 -> null(Student, Car,
	}

}
