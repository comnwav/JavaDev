package dev;

public class WhileEx2 {

	public static void main(String[] args) {
		
		// 1 ~ 10 ������ �� �߿��� ¦���� 
		// while������ �ۼ�.
		
		//�ʱ�ȭ...
		
		int val = 1;
		
		while (val <= 10) {
			
			if (val % 2 == 0) {
				System.out.println(val);
			}
			val++;
		}
	}
}
