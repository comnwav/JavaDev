package dev;

import java.util.Scanner;

public class ForEx6 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		int val1, val2;
		
		System.out.println("Please insert First Value");
		val1 = scn.nextInt();
		
		System.out.println("Please insert Second Value");
		val2 = scn.nextInt();
		
		for (int i = 1; i<=val2 && i<=val1; i++) {
			if (val1 % i + val2 % i == 0) {
				System.out.println(i);
			}
		}
		
		scn.close();

	}

}
