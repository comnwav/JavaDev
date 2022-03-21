package com.edu.abstracts;

public abstract class Animal {
	
	private String name;
	
	public Animal() {
		System.out.println("Animal() 생성자 호출");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 추상클래스는 추상메소드를 정의할 수 있다.
	// 추상 어쩌고는 실체가 없다 / 구현되는 부분({})이없다.
	// 추상 메소드는 부모 클래스를 상속받는 하위 클래스들이 무조건 정의/사용해야하는 부모 클래스의 메소드임
	// 상위 설계 단계에서 기능을 강제 정의하면 구현 단계에서 확실히 빠짐없이 구현 할 수 있다.
	public abstract void eat();
	public abstract void speak();

}
