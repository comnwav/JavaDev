package dev;

public class ArrEx7 {

	public static void main(String[] args) {
		
		int[] numbers = { 15, 20 };
		int temp = numbers[0];
		numbers[0] = numbers[1];
		numbers[1] = temp;
		
		System.out.println("¹Ù²ï Ã¹¹øÂ°:"+numbers[0]);
		System.out.println("¹Ù²ï µÎ¹øÂ°:"+numbers[1]);
		
	}

}
