package com.test;

import java.util.Scanner;

//문제2) 정수형 변수 n1, n2를 선언하고 Scanner 클래스를 통하여 
//두정수를 입력받은 후 큰수에서 작은 수를 나눈 결과값을 소수점 첫번째까지 구하는 기능 작성. 
public class Exam02 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Please insert first value");
		int num1 = scn.nextInt();
		System.out.println("Please insert second value");
		int num2 = scn.nextInt();

		double result;

		if (num1 < num2) {
			if (num1 != 0) {
				result = num2 / num1;
				System.out.printf("Result is %.1f", result);
			} else {
				System.out.println("It isn't available to divide by 0");
			}
		} else if (num1 > num2) {
			if (num2 != 0) {
				result = num1 / num2;
				System.out.printf("Result is %.1f", result);
			} else {
				System.out.println("It isn't available to divide by 0");
			}
		}

		scn.close();

	}
}