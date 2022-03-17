package dev;

public class ArrEx2 {

	public static void main(String[] args) {
		
		// age 20 23 27
		
		int[] age = {30, 32, 35};
		int sumAge = 0;
		
		for (int i=0; i<3; i++) {
			System.out.println(age[i] + "살 입니다.");
			sumAge = sumAge + age[i];
		}
		
		double avgAge = sumAge / (double) 3;
		
		System.out.printf("%.2f", avgAge);
		System.out.println("살입니다.");

	}

}
