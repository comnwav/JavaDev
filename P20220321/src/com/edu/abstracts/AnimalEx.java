package com.edu.abstracts;

public class AnimalEx {

	public static void main(String[] args) {
		
//		Animal animal = new Animal(); // �߻�Ŭ������ �ν��Ͻ� �����Ұ�
		Animal animal = null;
		animal = new Dog();
		animal.setName("�鱸");
		animal.eat();
		animal.speak();
		
		animal = new Cat();
		animal.setName("�κ�");
		animal.eat();
		animal.speak();

	}

}
