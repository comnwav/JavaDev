package dev;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		
//		����� ��� ���ڸ� ���ϴ� ���α׷�.
		Scanner scn = new Scanner (System.in);
		
		System.out.println("����� ���� ���ڸ� �Է��ϼ���");
		int val = scn.nextInt();
		
		for (int i = 1; i<=val; i++) {
			if (val % i == 0) {
				System.out.println(i);
			}
		}
		
		scn.close();
		
	}

}
