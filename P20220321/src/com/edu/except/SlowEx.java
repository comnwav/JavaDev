package com.edu.except;

public class SlowEx {

	public static void main(String[] args) {
		
		showInterval("Hello World");
		
	}
		
	public static void showInterval(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}

	}
