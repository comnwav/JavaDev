package com.dev;

import java.util.Scanner;

public class ArraySort {
	
	static Scanner scn = new Scanner(System.in);

	public static void sorting(int[] ary) {

		int temp = 0;
		int cnt = 0;

		while (cnt < (ary.length - 1)) {

			for (int j = 0; j < (ary.length - 1); j++) {
				if (ary[j] > ary[j + 1]) {
					temp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = temp;
				}
			}
			cnt++;
		}

	}

	public static void main(String[] args) {

		int[] ary = new int[5];

		for (int i = 0; i < ary.length; i++) {
			System.out.println("Please insert value" + (i + 1));
			ary[i] = scn.nextInt();
		}
		
		sorting(ary);

		System.out.println("==== Order ====");
		for (int k = 0; k < ary.length; k++) {
			System.out.println(ary[k]);
		}

		scn.close();
	}

}
