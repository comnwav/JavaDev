package com.test;

import java.util.Scanner;

//문제1) 정수형 변수 num1, num2 를 선언하고 두 수 중에서 큰 수에서 작은 수를 뺀 결과를 저장하는 변수 result.
public class Exam01 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please insert first value");
		int num1 = scn.nextInt();
		System.out.println("Please insert second value");
		int num2 = scn.nextInt();
		
		int result;
		
		if (num1 >= num2) {
			result = num1 - num2;
			System.out.println("Difference is " + result);
		} else {
			result = num2 - num1;
			System.out.println("Difference is " + result);
		}
		
		scn.close();
		
	}
}