package dev;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {


		// 두 수를 입력 num1, num2
		// ex) 10 부터 20 까지의 합 + 1000
		
		int num1, num2;
		int sum = 0;
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("첫번째 정수를 입력해주세요");
		num1 = scn.nextInt();
		
		System.out.println("두번째 정수를 입력해주세요");
		num2 = scn.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		scn.close();
		

	}

}
