package com.test;

import java.util.Scanner;

//����2) ������ ���� n1, n2�� �����ϰ� Scanner Ŭ������ ���Ͽ� 
//�������� �Է¹��� �� ū������ ���� ���� ���� ������� �Ҽ��� ù��°���� ���ϴ� ��� �ۼ�. 
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