package com.edu.nested;

public class Outer {

	// 멤버변수
	private String field1;
	private int field2;

	public String getField1() {
		return field1;
	}

	// 함수적 인터페이스 : 구현해야 할 메소드가 하나인것
	interface Runnable {
		void run();
	}

	class Bus implements Runnable {

		@Override
		public void run() {
			System.out.println("Bus is running");
		}

	}

	// 멤버 클래스
	class Inner {
		String field3;
		int field4;

		void method2() {
			System.out.println("Inner.method2() 입니다.");
		}

	}

	public void method1() {
		System.out.println("Outer.method1 입니다");
		Inner inner = new Inner();
		inner.method2();
	}

	public void method3() {
		System.out.println("Outer.method3()");

		class Local {
			void method4() {
				System.out.println("Local.method4()");
			}
		}
		Local local = new Local();
		local.method4();
	}

	public void method4() {
		Runnable runnable = new Bus(); // 인터페이스의 구현객체 가능.
		runnable.run();
		
		// 익명구현객체. - 중요 > 람다표현식에 사용된다.
		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("임의의 객체를 실행합니다.");
			}
			
		};
		
		runnable.run();
	}
}
