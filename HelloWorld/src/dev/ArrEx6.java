package dev;

public class ArrEx6 {

	public static void main(String[] args) {

		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		// �迭�� ���� 30���� ũ�� 40���� ���� ��, ���

		int sum = 0;
		int cnt = 0;
		double avg;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 30 && numbers[i] < 40) {

				sum = sum + numbers[i];
				cnt++;
				
			}
		}
		avg = sum / (double) cnt;
		
		System.out.println(sum);
		System.out.println(avg);
	}

}
