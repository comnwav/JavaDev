package dev;

public class WhileEx2 {

	public static void main(String[] args) {
		
		// 1 ~ 10 까지의 수 중에서 짝수만 
		// while문으로 작성.
		
		//초기화...
		
		int val = 1;
		
		while (val <= 10) {
			
			if (val % 2 == 0) {
				System.out.println(val);
			}
			val++;
		}
	}
}
