package dev;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		
		// class를 사용하기 전에 초기화 해준다
		Calc cal = new Calc();
		
//		System.out.println(cal.PI);
		
		// 매개변수에 들어갈 값
		Scanner scn = new Scanner(System.in);
		
		//사각형 넓이 - 가로 세로 입력
//		System.out.println("Please insert length");
//		double n1 = scn.nextDouble();
//		System.out.println("Please insert width");
//		double n2 = scn.nextDouble();
		
//		// 더하기
//		int result = cal.add(n1, n2);
//		System.out.println(result);
//		
		// 빼기
//		int result2 = cal.diff(n1, n2);
//		System.out.println(result2);
		
		// 사각형 넓이 구하기
//		double area = cal.getRectArea(n1, n2);
//		System.out.println(area);
		
		double CirArea = cal.getCirArea(5);
		System.out.println(CirArea);
		
		scn.close();

	}

}
