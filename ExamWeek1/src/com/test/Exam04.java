package com.test;

//����4) 1 ~ 6���� ������ ������ �����ϴ� Math.random()�� ����Ͽ� �ۼ��ϼ���.
//������ ���� �����迭(ũ�� 5)�� ���� �� ���� ���� �� ���� ū ���� ���ϴ� �ڵ带 �ۼ�.
public class Exam04 {
	public static void main(String[] args) {

		int[] ary = new int[5];
		

		for (int i = 0; i < ary.length; i++) {
			ary[i] = ((int) (Math.random() * 6)) + 1;
		}
		
		for (int k = 0; k < ary.length; k++) {
			System.out.println("No." + (k+1) + " Random number" + " is " + ary[k]);
		}
		
		int max = ary[0];
		
		for (int j = 1; j < ary.length; j++) {
			if (ary[j] > max) {
				max = ary[j];
			}
		}
		
		System.out.println("Max value is " + max);

	}
}