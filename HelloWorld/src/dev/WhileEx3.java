package dev;

import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		
		// �Է� �ϴ� �� ����
		// sum �� �Է�
		// escape -1
		// while ���� true
		// ���ڸ� �Է��ϼ���
		
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
