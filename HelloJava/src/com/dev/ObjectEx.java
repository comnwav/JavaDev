package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class ObjectEx {

	public static void main(String[] args) {
		
		Student s1 = new Student(100);
		System.out.println(s1.getStudNo());
		
		Student s2 = new Student(101, "�ȴ�");
		System.out.println(s2.getStudNo()+"-"+s2.getStudName());
		
		Student s3 = new Student(101, "������", 89, 29, 99);
		System.out.println(s3.getStudName()+"�� ���������� "+s3.getKorScore()+" �׸��� ���������� "+s3.getMathScore());
		
		Scanner scn = new Scanner(System.in);
		scn.close();
		
	}

}
