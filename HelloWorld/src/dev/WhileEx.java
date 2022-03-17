package dev;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		int rVal = (int) (Math.random() * 5) + 1;
		
		while (true) {
			System.out.println("Please insert your value");
			int usrVal = scn.nextInt();
			
			if (usrVal == rVal) {
				System.out.println("You got it!");
				break;
			} else {
				System.out.println("nope");
			}
			
		}
		
		scn.close();
		
	}

}
