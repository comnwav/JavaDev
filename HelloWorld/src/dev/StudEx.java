package dev;

public class StudEx {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.stuName = "ȫ�浿";
		s1.koSco = 80;
		s1.enSco = 76;
		
		s1.eat("�޽�");
		s1.eat("����");
		s1.study("����");
		s1.study("����");
		
		int v1 = s1.getKoSco(123);
		int v2 = s1.getEnSco();
		
		System.out.println(v1);
		System.out.println(v2);

	}

}
