package com.edu.abstracts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {

		// 오류 : Error or Exception
		// Compile error, runtime error, logical error.

		try {
			double result = 13 / 0;
			System.out.println("result is " + result);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요...");
		try {
			int menu = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자를 치라고 고객색햐");
		}
		System.out.println("EOP");

		scn.close();

	}
	
}
