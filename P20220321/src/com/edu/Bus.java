package com.edu;

public class Bus extends Vehicle {
	
	public Bus() {
		super.setMaxSpeed(110);
	}

	@Override
	public void run() {
		System.out.println("Bus is getting faster");
	}

	@Override
	public void stop() {
		System.out.println("Bus is getting slower");
	}
	
	
	
}
