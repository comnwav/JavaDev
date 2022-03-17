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
			System.out.println("�ְ�ӵ��� �ʰ��� �� �����ϴ�.");
			return;
			//�޼ҵ忡�� return�� ������ �޼ҵ� ����
		}
		System.out.println("10km �����մϴ�.");
		this.speed += 10;
	}
	
	public void breakSpeed() {
		if (this.speed - 10 < 0) {
			System.out.println("���� ���ϴ�.");
			return;
		}
		System.out.println("10km �����մϴ�.");
		this.speed -= 10;
	}
	
	public int getSpeed() {
		return this.speed;
	}

}
