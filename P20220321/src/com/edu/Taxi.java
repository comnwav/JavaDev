package com.edu;

public class Taxi extends Vehicle {
	
	public Taxi() {
		super.setMaxSpeed(120);
	}

	@Override
	public void run() {
		System.out.println("Taxi is getting faster");
	}

	@Override
	public void stop() {
		System.out.println("Taxi is getting slower");
	}
	
	

}
