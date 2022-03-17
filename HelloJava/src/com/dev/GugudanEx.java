package com.dev;

//import java.util.Scanner;

public class GugudanEx {

	// static 들은 인스턴스 생성 없이도 프로그램 시작시에 메모리에 우선적으로 로드된다.
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Please insert number");
//		int x = scn.nextInt();
//		printStar(x);
//		gugu(x);
//		scn.close();
//		int result = sum(sum(10, 20), sum(20, 30));
//		double result = frac(30, 20);
//		System.out.println("결과는" + result);
		
		int[] newAry = { 10, 20, 30 };
		int result = arySum(newAry);
		System.out.println("결과는 " + result);
		
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
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		} else {
			return denom / numer;
		}
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void gugu(int dan) {
		System.out.println(dan + "단 입니다.");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d * %2d = %2d\n", dan, i, (i * dan));
		}
	}

	// 인스턴스 생성전까지 메모리에 로드되지 않는다
	public static void printGugudan() {
		// 5단 까지 옆으로 A * B = C
	}

	public static void printStar(int runCnt) {
		for (int i = 0; i <= runCnt; i++) {
			System.out.println("★");
		}
	}

}