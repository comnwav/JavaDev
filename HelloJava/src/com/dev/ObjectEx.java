package com.dev;
// ��ü�������α׷����
// �������α׷�(������, �Լ�) > ��ü(������, ���(�Լ�))
// object(��ü) > class(����, Ʋ) > �ν��Ͻ�����(�ʱ�ȭ)
// �л�(��ü object) > class student > instance(new student())

import java.util.Scanner;

import com.edu.Student;

public class ObjectEx {

	public static void main(String[] args) {

		Student s1 = new Student(101, "������", 90, 80, 78);
		Student s2 = new Student(102, "������", 78, 49, 75);
		Student s3 = new Student(103, "������", 89, 29, 99);
		Student s4 = new Student(104, "������", 70, 80, 90);
		Student s5 = new Student(105, "�ֱԿ�", 77, 82, 83);

		Student[] st = { s1, s2, s3, s4, s5 };

		Scanner scn = new Scanner(System.in);
		// (System.in) > �Է� ��Ʈ��, �Է��̳� ������ ���� �� ����
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