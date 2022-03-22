package com.edu.except;

import com.edu.interfaces.RemoteControl;

public class Computer implements RemoteControl {
	
//	private String cpu;
//	private String memory;

	@Override
	public void powerOn() {
		System.out.println("Turning on");
	}

	@Override
	public void powerOff() {
		System.out.println("Turning off");
	}

}
