package dev;

public class ArrEx4 {

	public static void main(String[] args) {

		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		int sum = 0;
		int cnt = 0;

		// numbers.length�� �迭�� ũ�⸦ �ս��� �ø��ų� ���� �� �ִ�
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
				cnt++;
			}
		}
		System.out.println("¦���� ��:" + sum);
		System.out.println("¦������ ���:" + (sum / (double) cnt));

	}

}
