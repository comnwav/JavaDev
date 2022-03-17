package com.edu;

public class StudentEx {

	public static void main(String[] args) {
		
		Student s1 = new Student(); // 초기화 시점에 값을 지정
		s1.setStudNo(1203);
		s1.setStudName("김형민");
		s1.setKorScore(98);
		s1.setEngScore(12);
		s1.setMathScore(-12);
		
//		System.out.println("영어점수 초기값:" + s1.getEngScore());
//		System.out.println("이름의 초기값:" + s1.getStudName());
		System.out.println(s1.getStudName()+"'s sum="+s1.getSumScore());
		System.out.println(s1.getStudName()+"'s avg="+s1.getAvgScore());
	}

}
