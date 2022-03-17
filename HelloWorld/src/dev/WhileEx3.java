package dev;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		
		// 입력 하는 수 누적
		// sum 에 입력
		// escape -1
		// while 조건 true
		// 숫자를 입력하세요
		
		Scanner scn = new Scanner (System.in);
		int sum = 0;
		
		while (true) {
			System.out.println("Please insert value");
			int inputVal = scn.nextInt();
			
			if ( inputVal == -1 ) {
				System.out.println("Total sum is " + sum);
				break;
			} else {
				sum = sum + inputVal;
			}
			
		}
		 
		scn.close();

	}

}
