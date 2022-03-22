package com.edu.interfaces;

public class TV implements RemoteControl {
	
	// 인터페이스의 규칙에 따라서 클래스의 메소드를 구현한다.
	public void powerOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("TV를 끕니다.");
	}

}
