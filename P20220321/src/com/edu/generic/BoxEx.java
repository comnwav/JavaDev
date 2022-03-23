package com.edu.generic;

public class BoxEx {

	public static void main(String[] args) {
		
//		Box box = new Box();
//		box.setObj("Hello");
//		String result = (String) box.getObj(); // String > String
//		System.out.println(result);
//		
//		Integer result1 = (Integer) box.getObj(); // String > Integer
//		System.out.println(result1);
		
		Box<String> stringBox = new Box<String>();
		stringBox.setObj("Hello");
		String result = stringBox.getObj();
		
		System.out.println(result);
//		
//		Box<Integer> inBox = new Box<Integer>();
//		intBox.setObj(100);
//		Integer result1 = intBox.getObj();
		
	}

}
