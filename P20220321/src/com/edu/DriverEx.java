package com.edu;

public class DriverEx {

	public static void main(String[] args) {

//		Vehicle v1 = new Vehicle();
//		v1 = new Taxi();
//		v1 = new Bus();
//
//		Driver driver = new Driver();
//		driver.drive(v1); // �Ű������� ������

		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

//		System.out.println("Vehicle�� �ְ�ӷ�: " + vehicle.getMaxSpeed());
//		System.out.println("Taxi�� �ְ�ӷ�: " + taxi.getMaxSpeed());
//		System.out.println("Bus�� �ְ�ӷ�: " + bus.getMaxSpeed());

		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = vehicle;
		vehicles[1] = taxi;
		vehicles[2] = bus;

		// �ӵ��� ���� ���� Ÿ�°��� ���� vehicles[0] = taxi, vehicles[1] = bus, vehicle[2]=vehicle
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
