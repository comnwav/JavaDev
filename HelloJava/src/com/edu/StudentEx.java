package com.edu;

public class StudentEx {

	public static void main(String[] args) {
		
		Student s1 = new Student(); // �ʱ�ȭ ������ ���� ����
		s1.setStudNo(1203);
		s1.setStudName("������");
		s1.setKorScore(98);
		s1.setEngScore(12);
		s1.setMathScore(-12);
		
//		System.out.println("�������� �ʱⰪ:" + s1.getEngScore());
//		System.out.println("�̸��� �ʱⰪ:" + s1.getStudName());
		System.out.println(s1.getStudName()+"'s sum="+s1.getSumScore());
		System.out.println(s1.getStudName()+"'s avg="+s1.getAvgScore());
	}

}
