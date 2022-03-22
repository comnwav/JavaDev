package com.edu.interfaces;

public class MainExe {
	
	public static void main(String[] args) {
		
		// 리모콘 > TV, radio, 냉장고
		// on, off 기능을 통합하자!
		RemoteControl rm = new TV();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Radio();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Frige();
		rm.powerOn();
		rm.powerOff();
		
	}

}
