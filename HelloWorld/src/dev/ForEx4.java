package dev;

public class ForEx4 {

	public static void main(String[] args) {
		
//		1 ~ 10���� ���߿��� 
//		¦���� �� -> evenSum, Ȧ���� �� -> oddSum
		
		int i;
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (i=0; i<=10; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		
		System.out.println("¦���� ���� " + evenSum);
		System.out.println("Ȧ���� ���� " + oddSum);

	}

}
