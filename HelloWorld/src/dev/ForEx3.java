package dev;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {


		// �� ���� �Է� num1, num2
		// ex) 10 ���� 20 ������ �� + 1000
		
		int num1, num2;
		int sum = 0;
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("ù��° ������ �Է����ּ���");
		num1 = scn.nextInt();
		
		System.out.println("�ι�° ������ �Է����ּ���");
		num2 = scn.nextInt();
		
		for (int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		scn.close();
		

	}

}
