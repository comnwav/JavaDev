package dev;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		
//		약수의 모든 숫자를 구하는 프로그램.
		Scanner scn = new Scanner (System.in);
		
		System.out.println("약수를 구할 숫자를 입력하세요");
		int val = scn.nextInt();
		
		for (int i = 1; i<=val; i++) {
			if (val % i == 0) {
				System.out.println(i);
			}
		}
		
		scn.close();
		
	}

}
