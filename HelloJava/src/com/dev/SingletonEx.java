package com.dev;

public class SingletonEx {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = new Singleton();
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
