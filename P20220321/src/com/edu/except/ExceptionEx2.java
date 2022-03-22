package com.edu.except;

import java.util.Calendar;
import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		

		// object
		Object obj = new String();
		obj = new Scanner(System.in);
		obj = Calendar.getInstance();
		
		obj = new Object();
		System.out.println("obj의 해시코드 : " + obj.hashCode());

		// Exception
		try {
			Class.forName("java.lang.String1");
		} catch (ClassNotFoundException e1) {
//			e1.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}

		// Runtime Exception
		String str = null;
		str.charAt(0); // CharSequence interface의 추상메소드.
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("널포인트 예외발생.");
			e.printStackTrace();
		}

		String nums1 = "100"; // 숫자문자열
		String nums2 = "200"; // 숫자문자열
		int num1, num2;
		try {
			num1 = Integer.parseInt(nums1); // int 변환
			num2 = Integer.parseInt(nums2); // int 변환
			str.charAt(0);
		} catch (Exception e) {
			num1 = 0;
			num2 = 0;
			System.out.println("상위의 예외발생..");
		}
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

		System.out.println("end of program");

	}	public static void showError() throws ClassNotFoundException {
		Class.forName("java.lang.Strings");
	}
}
