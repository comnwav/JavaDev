package dev;

public class ArrEx {

	public static void main(String[] args) {
		
		int[] ary = {80, 82, 90, 67, 92};
		
		int sum = 0;
		double avg;
		
		for (int i = 0; i < 5; i++) {
			sum = sum + ary[i];
		}
		
		avg = sum / (double) 5;
		
		System.out.println(avg);
		
	}

}
