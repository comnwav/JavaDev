package com.edu;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {

		// Scanner, �迭���� 5��, �Է�, ����Ʈ ���.

		Scanner scn = new Scanner(System.in);
		Student[] st = new Student[5];

		while (true) {
			System.out.println("1.�Է� 2.����Ʈ 3.����");
			System.out.println("����>>");
			int menu = scn.nextInt();
			if (menu == 1) {
				// �Է±�ɱ���.. �й�, �̸�, ����, ����, ���� 
				// > student instance ���� > �迭�� ���
				
				System.out.println("�й��� �Է��ϼ���>");
				int sNo = scn.nextInt();
				
				System.out.println("�̸��� �Է��ϼ���>");
				String sName = scn.next();
				
				System.out.println("������ �Է��ϼ���>");
				int sKor = scn.nextInt();
				
				System.out.println("��� �Է��ϼ���>");
				int sEng = scn.nextInt();
				
				System.out.println("������ �Է��ϼ���>");
				int sMat = scn.nextInt();
				
				Student s1 = new Student(sNo, sName, sKor, sEng, sMat);
				
				for (int i = 0; i < st.length; i++) {
					if (st[i] == null) {
						st[i] = s1;
						break;
					}
				}
				
				System.out.println("����Ϸ�");
				
			} else if (menu == 2) {
				//����Ʈ
				for (int i = 0; i < st.length; i++) {
					if(st[i] != null) {
						System.out.println(st[i].getStudInfo());
					}
				}
				
				System.out.println("��ȸ�Ϸ�");
				
			} else if (menu == 3) {
				// ����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�޴��� �߸� �����߽��ϴ�.");
			}
		}
		scn.close();
		System.out.println("end of program");

	}

}