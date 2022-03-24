package com.edu.lambda;

interface Runnable {
	public void run();
}

class RunImpl implements Runnable {

	@Override
	public void run() {

		System.out.println("run...");

	}

}

public class RunEx {

	public static void main(String[] args) {
		
		Runnable runnable = new RunImpl();
		runnable.run();
		
		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("호랑이가 달립니다.");
			}
			
		}; // 익명구현객체
		runnable.run();
		
		runnable = () -> {
			System.out.println("사자가 달립니다.");
		};
		runnable.run();
		
	}

}
