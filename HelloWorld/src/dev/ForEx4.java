package dev;

public class ForEx4 {

	public static void main(String[] args) {
		
//		1 ~ 10까지 수중에서 
//		짝수의 값 -> evenSum, 홀수의 값 -> oddSum
		
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
		
		System.out.println("짝수의 합은 " + evenSum);
		System.out.println("홀수의 합은 " + oddSum);

	}

}
