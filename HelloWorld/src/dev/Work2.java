package dev;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Please insert first num");
		int num1 = scn.nextInt();

		System.out.println("Please insert second num");
		int num2 = scn.nextInt();

		System.out.println("Please insert third num");
		int num3 = scn.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			if (num2 > num3) {
				System.out.println(num3 + "," + num2 + "," + num1);
			} else {
				System.out.println(num2 + "," + num3 + "," + num1);
			}
		} else if (num2 >= num1 && num2 >= num3) {
			if (num1 > num3) {
				System.out.println(num3 + "," + num1 + "," + num2);
			} else {
				System.out.println(num1 + "," + num3 + "," + num2);
			}
		} else {
			if (num1 > num2) {
				System.out.println(num2 + "," + num1 + "," + num3);
			} else {
				System.out.println(num1 + "," + num2 + "," + num3);
			}
		}
		scn.close();
	}

}