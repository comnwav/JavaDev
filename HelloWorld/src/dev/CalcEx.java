package dev;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		
		// class�� ����ϱ� ���� �ʱ�ȭ ���ش�
		Calc cal = new Calc();
		
//		System.out.println(cal.PI);
		
		// �Ű������� �� ��
		Scanner scn = new Scanner(System.in);
		
		//�簢�� ���� - ���� ���� �Է�
//		System.out.println("Please insert length");
//		double n1 = scn.nextDouble();
//		System.out.println("Please insert width");
//		double n2 = scn.nextDouble();
		
//		// ���ϱ�
//		int result = cal.add(n1, n2);
//		System.out.println(result);
//		
		// ����
//		int result2 = cal.diff(n1, n2);
//		System.out.println(result2);
		
		// �簢�� ���� ���ϱ�
//		double area = cal.getRectArea(n1, n2);
//		System.out.println(area);
		
		double CirArea = cal.getCirArea(5);
		System.out.println(CirArea);
		
		scn.close();

	}

}
