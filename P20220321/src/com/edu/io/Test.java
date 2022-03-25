package com.edu.io;

public class Test {

	public static void main(String[] args) {
		
		try {
			Class test = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
