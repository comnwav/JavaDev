package com.edu.interfaces;

public class Frige implements RemoteControl {
	
	public void on() {
		System.out.println("냉장고를 켭니다.");		

	}
	
	public void off() {
		System.out.println("냉장고를 끕니다.");

	}
	
	// 인터페이스의 규칙에 따라서 클래스의 메소드를 구현한다.
	@Override
	public void powerOn() {
		System.out.println("냉장고를 켭니다.");		
	}

	@Override
	public void powerOff() {
		System.out.println("냉장고를 끕니다.");

	}

}
