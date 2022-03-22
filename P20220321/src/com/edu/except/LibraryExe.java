package com.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryExe {
	
	private static LibraryExe singleton = new LibraryExe();
	
	//
	
	private LibraryExe() {
		
	}
	
	//
	
	public static LibraryExe getInstance() {
		return singleton;
	}
	
	// 클래스 A, 클래스 B, 클래스 C ... 클래스 Z
	// 클래스 main > main 메소드 포함.

	public void run() {
		// 책제목, 저자, 가격 > 저장
		// 리스트 보여주기
		Scanner scn = new Scanner(System.in);
		Book[] library = new Book[5];

		while (true) {
			int menu = 0;

			while (true) {
				try {
					showMessage("메뉴선택: 1. 책정보입력, 2. 리스트보기, 3. 종료");
					menu = scn.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력하라고!");
					scn.next();
				}
			}

			if (menu == 1) {
				scn.nextLine();
				showMessage("책제목을 입력하지? >>");
				String title = scn.nextLine();

				showMessage("저자를 입력하게나 >>");
				String author = scn.nextLine();
				System.out.println(author);

				int price = 0;
				while (true) {
					try {
						showMessage("가격을 입력하라고 >>");
						price = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자만 입력 하지 좀");
						scn.next();
					}

					Book book = new Book(title, author, price);

					for (int i = 0; i < library.length; i++) {
						if (library[i] == null) {
							library[i] = book;
							break;
						}
					}

					showMessage("저장완료");

				}
			} else if (menu == 2) {
				for (int i = 0; i < library.length; i++) {
					if (library[i] != null) {
						library[i].showInfo(); // 책제목,저자,가격...
					}
				}
			} else if (menu == 3) {
				showMessage("프로그램을 종료합니다");
				break;
			}
		}
		showMessage("End of program");
		scn.close();
	}

	public void showMessage(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
