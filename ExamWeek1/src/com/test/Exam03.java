package com.test;

import java.util.Scanner;

//����3) �������迭 �����ϰ� ����ڷ� ������ �������� �Է¹޾Ƽ� �迭�� ����. 
//���� ū���� ���ϴ� �ڵ带 �ۼ�.
public class Exam03 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[] ary = new int[3];
		
		System.out.println("Please insert first value");
		ary[0] = scn.nextInt();

		System.out.println("Please insert second value");
		ary[1] = scn.nextInt();

		System.out.println("Please insert third value");
		ary[2] = scn.nextInt();

		int max = ary[0];

		for (int i = 1; i < ary.length; i++) {
			if (ary[i] > max) {
				max = ary[i];
			}
			
		}
		
		System.out.println("Max value is " + max);

		scn.close();

	}
}