package com.edu;

public class Vehicle {
	
	private int maxSpeed;
	
	public Vehicle() {
		this.maxSpeed = 100;
	}
	
	public void run() {
		System.out.println("Vehicle is getting faster");
	}
	
	public void stop() {
		System.out.println("Vehicle is getting slower");
	}
	
	// method
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return this. + "'speed is " + this.maxSpeed;
	}
	
	
	
}
