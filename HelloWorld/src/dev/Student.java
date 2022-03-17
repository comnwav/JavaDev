package dev;

public class Student {
	
	String stuNo;
	String stuName;
	int koSco;
	int enSco;
	
	// method 기능..함수
	
	void study(String subject) {
		System.out.println("공부를 해봅시더");
	}
	
	void eat(String food) {
		System.out.println(food + "급식충");
	}
	
	int getKoSco(int go) {
		System.out.println(go);
		return koSco; 
	}
	
	int getEnSco() {
		return enSco; 
	}
}

