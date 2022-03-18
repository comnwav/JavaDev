package com.test;

import java.util.Scanner;

//문제3) 정수형배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장. 
//제일 큰값을 구하는 코드를 작성.
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