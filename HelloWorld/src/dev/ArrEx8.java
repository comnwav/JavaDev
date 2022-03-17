package dev;

import java.util.Scanner;

public class ArrEx8 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		int[] numbers = new int[2];
		int temp = 0;
		
		System.out.println("Please insert first value");
		numbers[0] = scn.nextInt();
		
		System.out.println("Please insert first value");
		numbers[1] = scn.nextInt();
		
		if (numbers[0] > numbers[1]) {
			temp = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = temp;
		}
		
		System.out.println(numbers[0]); //두개중 작은값
		System.out.println(numbers[1]); //두개중 큰값
		
		scn.close();
		
	}

}
