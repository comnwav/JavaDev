package dev;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Please insert first num");
		int num1 = scn.nextInt();
		
		System.out.println("Please insert second num");
		int num2 = scn.nextInt();
		
		if ( num1 >= num2 ) {
			int val1 = num1 - num2;
			System.out.println("Difference is " + val1);
		} else {
			int val2 = num2 - num1;
			System.out.println("Difference is " + val2);
		}
		scn.close();
	}

}
