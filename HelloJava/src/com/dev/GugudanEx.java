package com.dev;

//import java.util.Scanner;

public class GugudanEx {

	// static ���� �ν��Ͻ� ���� ���̵� ���α׷� ���۽ÿ� �޸𸮿� �켱������ �ε�ȴ�.
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Please insert number");
//		int x = scn.nextInt();
//		printStar(x);
//		gugu(x);
//		scn.close();
//		int result = sum(sum(10, 20), sum(20, 30));
//		double result = frac(30, 20);
//		System.out.println("�����" + result);
		
		int[] newAry = { 10, 20, 30 };
		int result = arySum(newAry);
		System.out.println("����� " + result);
		
	}

	
	public static int arySum(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
	
	public static int avg(int n1, int n2) {
		return n1 + n2;
	}
	
	public static double frac(double denom, double numer) {
		if (numer == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return 0;
		} else {
			return denom / numer;
		}
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void gugu(int dan) {
		System.out.println(dan + "�� �Դϴ�.");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d * %2d = %2d\n", dan, i, (i * dan));
		}
	}

	// �ν��Ͻ� ���������� �޸𸮿� �ε���� �ʴ´�
	public static void printGugudan() {
		// 5�� ���� ������ A * B = C
	}

	public static void printStar(int runCnt) {
		for (int i = 0; i <= runCnt; i++) {
			System.out.println("��");
		}
	}

}