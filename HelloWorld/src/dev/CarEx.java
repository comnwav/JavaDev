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
//		System.out.println("����ӵ�: " + sonata.getSpeed() + "km�Դϴ�.");
//		sonata.addSpeed();
//		sonata.addSpeed();
//		sonata.addSpeed();
//		System.out.println("����ӵ�: " + sonata.getSpeed() + "km�Դϴ�.");

		sonata.breakSpeed();
		sonata.breakSpeed();
		System.out.println("����ӵ�: " + sonata.getSpeed() + "km�Դϴ�.");
	}

}
