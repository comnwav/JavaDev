package dev;

public class ArrEx5 {

	public static void main(String[] args) {
		
		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		int oddSum = 0;
		int cnt = 0;
		
		for (int i=0; i <= numbers.length;) {
				oddSum = oddSum + numbers[i];
				i=i+2;
				cnt++;
				
			}
		System.out.println(oddSum);
		System.out.println(oddSum/cnt);
		

	}

}