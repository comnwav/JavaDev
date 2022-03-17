package dev;

public class Car {
	
	private String model;
	private int speed;
	private int maxSpeed;
	
	
	
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getModel() {
		return model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void addSpeed() {
		if (this.speed + 10 > this.maxSpeed) {
			System.out.println("최고속도를 초과할 수 없습니다.");
			return;
			//메소드에서 return을 만나면 메소드 종료
		}
		System.out.println("10km 가속합니다.");
		this.speed += 10;
	}
	
	public void breakSpeed() {
		if (this.speed - 10 < 0) {
			System.out.println("차가 기어갑니다.");
			return;
		}
		System.out.println("10km 감속합니다.");
		this.speed -= 10;
	}
	
	public int getSpeed() {
		return this.speed;
	}

}
