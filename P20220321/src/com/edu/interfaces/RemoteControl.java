package com.edu.interfaces;

public interface RemoteControl {
	
	// 인터페이스는 필드는 없고 기능만 있다
	// 인터페이스의 규칙에 따라서 클래스의 메소드를 구현한다.
	// 생성자 생성 불가, 필드 입력 불가
	// 인터페이스로 종속된 클래스를 구현객체라고 한다.
	
	// final 상수는 필드 입력가능
	// 'static' means that 인스턴스를 사용해서 값을 바꾸지 않겠습니다.
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public void powerOn(); // 추상메소드
	public void powerOff();
	
}
