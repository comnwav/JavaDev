package com.test;

//문제4) 1 ~ 6까지 임의의 정수를 생성하는 Math.random()을 사용하여 작성하세요.
//생성된 값을 정수배열(크기 5)를 선언 후 값을 저장 후 가장 큰 값을 구하는 코드를 작성.
public class Exam04 {
	public static void main(String[] args) {

		int[] ary = new int[5];
		

		for (int i = 0; i < ary.length; i++) {
			ary[i] = ((int) (Math.random() * 6)) + 1;
		}
		
		for (int k = 0; k < ary.length; k++) {
			System.out.println("No." + (k+1) + " Random number" + " is " + ary[k]);
		}
		
		int max = ary[0];
		
		for (int j = 1; j < ary.length; j++) {
			if (ary[j] > max) {
				max = ary[j];
			}
		}
		
		System.out.println("Max value is " + max);

	}
}