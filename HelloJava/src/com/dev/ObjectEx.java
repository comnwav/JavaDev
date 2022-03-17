package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class ObjectEx {

	public static void main(String[] args) {
		
		Student s1 = new Student(100);
		System.out.println(s1.getStudNo());
		
		Student s2 = new Student(101, "안뇽");
		System.out.println(s2.getStudNo()+"-"+s2.getStudName());
		
		Student s3 = new Student(101, "서현일", 89, 29, 99);
		System.out.println(s3.getStudName()+"의 국어점수는 "+s3.getKorScore()+" 그리고 수학점수는 "+s3.getMathScore());
		
		Scanner scn = new Scanner(System.in);
		scn.close();
		
	}

}
