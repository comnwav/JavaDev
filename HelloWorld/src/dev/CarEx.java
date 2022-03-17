package dev;

public class CarEx {

	public static void main(String[] args) {
		
		Car sonata = new Car();
		sonata.setModel("Sonata DN8");
		sonata.setSpeed(10);
		sonata.setMaxSpeed(180);
		
//		sonata.addSpeed();
//		sonata.addSpeed();
//		sonata.addSpeed();
//		System.out.println("현재속도: " + sonata.getSpeed() + "km입니다.");
//		sonata.addSpeed();
//		sonata.addSpeed();
//		sonata.addSpeed();
//		System.out.println("현재속도: " + sonata.getSpeed() + "km입니다.");

		sonata.breakSpeed();
		sonata.breakSpeed();
		System.out.println("현재속도: " + sonata.getSpeed() + "km입니다.");
	}

}
