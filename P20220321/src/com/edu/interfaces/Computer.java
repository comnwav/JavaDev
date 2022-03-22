package com.edu.interfaces;

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
