package dev;

public class ForEx {

	public static void main(String[] args) {
		
		// ¦���� ��
		
		int sum = 0;
		
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println("¦���� ���� " + sum + "�Դϴ�.");
	}

}
