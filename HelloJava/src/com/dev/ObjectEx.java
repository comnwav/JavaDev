package com.dev;
// 객체지향프로그램언어
// 절차프로그램(데이터, 함수) > 객체(데이터, 기능(함수))
// object(객체) > class(도면, 틀) > 인스턴스생성(초기화)
// 학생(객체 object) > class student > instance(new student())

import java.util.Scanner;

import com.edu.Student;

public class ObjectEx {

	public static void main(String[] args) {

		Student s1 = new Student(101, "이유빈", 90, 80, 78);
		Student s2 = new Student(102, "조수연", 78, 49, 75);
		Student s3 = new Student(103, "권태현", 89, 29, 99);
		Student s4 = new Student(104, "서현일", 70, 80, 90);
		Student s5 = new Student(105, "최규완", 77, 82, 83);

		Student[] st = { s1, s2, s3, s4, s5 };

		Scanner scn = new Scanner(System.in);
		// (System.in) > 입력 스트림, 입력이나 파일을 받을 수 있음
		System.out.println("Plase insert name");
		String schName = scn.next();

//		System.out.println(s1.getStudName());
		
		for (int i = 0; i < st.length; i++) {
			if ( st[i].getStudName().equals(schName)) {
				System.out.println(st[i].getStudInfo());
			}
		}
		scn.close();
	}
}