package com.week1;

import java.util.Scanner;

//����5) BookŬ������ ����(�ʵ�:å����, ����, ���ǻ�, �ݾ�) 
//������(å����, ����, ���ǻ�, �ݾ�)�� ���� �� ScannerŬ������ ����Ͽ� ������� �Է��� ���Ͽ� �ν��Ͻ��� �����ϰ� 
//�Է��� ������ å����, ����, ���ǻ�, �ݾ� ������ ȭ�鿡 ����ϴ� ��� ����.
public class Exam05 {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Please insert a name of book");
		String nameB = scn.next();
		
		System.out.println("Please insert author of book");
		String authB = scn.next();
		
		System.out.println("Please insert a publisher of book");
		String pressB = scn.next();
		
		System.out.println("Please insert price of book");
		int priceB = scn.nextInt();
		
		Book listB = new Book (nameB, authB, pressB, priceB);
		
		System.out.println("========================");
		System.out.println("Name : " + listB.getName());
		System.out.println("Author : " + listB.getAuth());
		System.out.println("Publisher : " + listB.getPress());
		System.out.println("Price : " + listB.getPrice());
		System.out.println("========================");
	}
}