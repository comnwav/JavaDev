package com.week1;

import java.util.Scanner;

//문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
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