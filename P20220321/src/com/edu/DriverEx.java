package com.edu;

public class DriverEx {

	public static void main(String[] args) {

//		Vehicle v1 = new Vehicle();
//		v1 = new Taxi();
//		v1 = new Bus();
//
//		Driver driver = new Driver();
//		driver.drive(v1); // 매개변수의 다형성

		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

//		System.out.println("Vehicle의 최고속력: " + vehicle.getMaxSpeed());
//		System.out.println("Taxi의 최고속력: " + taxi.getMaxSpeed());
//		System.out.println("Bus의 최고속력: " + bus.getMaxSpeed());

		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = vehicle;
		vehicles[1] = taxi;
		vehicles[2] = bus;

		// 속도가 제일 빠른 타는것의 정렬 vehicles[0] = taxi, vehicles[1] = bus, vehicle[2]=vehicle
		int cnt = 0;
		Vehicle[] temp = new Vehicle[1];

		while (cnt < (vehicles.length - 1)) {

			for (int i = 0; i < (vehicles.length - 1); i++) {
				if (vehicles[i].getMaxSpeed() < vehicles[i + 1].getMaxSpeed()) {
					temp[0] = vehicles[i];
					vehicles[i] = vehicles[i+1];
					vehicles[i+1] = temp[0];
				}
			}
			cnt++;
		}
		
		System.out.println("Max Speed Order is");
		for (int j = 0; j < vehicles.length; j++) {
			System.out.println(vehicles[j].toString());
		}
	}
}
