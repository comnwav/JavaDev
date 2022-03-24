package com.edu.lambda;

interface Runnable4 {
	public int run();
}

public class RunEx4 {
	public static void main(String[] args) {
		Runnable4 runnable = () -> {
			return (int) (Math.random() * 10);
		};
		int result = runnable.run();
		System.out.println(result);
		
		// 함수적 프로그램 작성 : 간단하게 표현(람다식표현)
		runnable = () -> {
			return (int) (Math.random() * 100);
		};
		
		result = runnable.run();
		System.out.println(result);
	}

}