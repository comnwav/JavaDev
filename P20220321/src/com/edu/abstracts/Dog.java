package com.edu.abstracts;

public class Dog extends Animal {
	
	public Dog() {
//		super();
		System.out.println("Dog() ������ ȣ��");
	}

	@Override
	public void eat() {
		System.out.println("�۸��̰� �Խ��ϴ�.");
	}

	@Override
	public void speak() {
		System.out.println("�۸۸�");
	}
}
