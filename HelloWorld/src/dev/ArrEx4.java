package dev;

public class ArrEx4 {

	public static void main(String[] args) {

		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		int sum = 0;
		int cnt = 0;

		// numbers.length로 배열의 크기를 손쉽게 늘리거나 줄일 수 있다
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
				cnt++;
			}
		}
		System.out.println("짝수의 합:" + sum);
		System.out.println("짝수값의 평균:" + (sum / (double) cnt));

	}

}
