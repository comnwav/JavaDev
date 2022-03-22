package com.edu.interfaces;

public interface Dao // extends RemoteControl, Run 

{
	
	// 인터페이스도 상속 및 다중상속 이 가능하다.
	// 다중 상속 받은 인터페이스의 쿨래스들은 1차 인터페이스의 구현 객체 뿐만 아니라
	// 다중상속 받은 인터페이스의 기능까지 모두 구현객체를 만들어 줘야한다.
	// 추상메소드
	public void select();
	public void insert();
	public void update();
	public void delete();

}
