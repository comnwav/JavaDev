package com.edu.abstracts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {

		// ���� : Error or Exception
		// Compile error, runtime error, logical error.

		try {
			double result = 13 / 0;
			System.out.println("result is " + result);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0���� ���� �� �����ϴ�.");
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���...");
		try {
			int menu = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� ġ��� ��������");
		}
		System.out.println("EOP");

		scn.close();

	}
	
}