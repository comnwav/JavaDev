package dev;

public class Student {
	
	String stuNo;
	String stuName;
	int koSco;
	int enSco;
	
	// method ���..�Լ�
	
	void study(String subject) {
		System.out.println("���θ� �غ��ô�");
	}
	
	void eat(String food) {
		System.out.println(food + "�޽���");
	}
	
	int getKoSco(int go) {
		System.out.println(go);
		return koSco; 
	}
	
	int getEnSco() {
		return enSco; 
	}
}

