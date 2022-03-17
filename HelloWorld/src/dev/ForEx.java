package dev;

public class ForEx {

	public static void main(String[] args) {
		
		// 짝수의 합
		
		int sum = 0;
		
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println("짝수의 합은 " + sum + "입니다.");
	}

}
