package com.week1;

import java.util.Scanner;

//����1) ������ ���� num1, num2 �� �����ϰ� �� �� �߿��� ū ������ ���� ���� �� ����� �����ϴ� ���� result.
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