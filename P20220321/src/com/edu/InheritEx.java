package com.edu;

public class InheritEx {
	
	public static void main(String[] args) {
		
		// �л�, ������> ������ ��Ƴ��� �ڷ�
		// �б�, �г�
		// �����, ����
		
		Students student = new Students();
		student.setName("ȫ�浿");
		student.setAge(15);
		student.setSchool("�߾Ӱ�");
		student.setGrade(2);
		
		Worker worker = new Worker();
		worker.setName("������");
		worker.setAge(35);
		worker.setCompany("īī��");
		worker.setJob("��������");
		
		// �ڽ� Ŭ������ ���� ������ �θ� Ŭ������ ���������� ���԰��� (promotion)
		Person p1 = new Person();
		p1 = student; 
		p1 = worker;
		
	}

}
