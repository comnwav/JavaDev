package com.edu.collect;

import java.util.ArrayList;

public class ListEx {

	public static void main(String[] args) {
		
		String[] strings = new String[10];
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] == null ) {
				strings[i] = "hello";
				break;
			}
		}
		
		// 참조변수 하나에 딸려있는 배열같은 놈
		ArrayList<String> strAry = new ArrayList<String>(); // default 저장공간은 10개
		strAry.add("Hello");
		strAry.add("World");
		strAry.add("Good");
		strAry.remove("World");
		strAry.add("Nailed");
		
//		strAry.get(1);
//		strAry.set(1, "월드");
//		strAry.clear();
		
		System.out.println(strAry.get(1));
		System.out.println("strAry.size() =>" + strAry.size());
		
		for (int i = 0; i < strAry.size(); i++) {
			String result = strAry.get(i);
			System.out.println(result);
		}
		
//		ArrayList<Integer> numAry = new ArrayList<Integer>();
//		for (int i = 0; i < numAry.size(); i++) {
//			int result = numAry.get(i);
//			System.out.println(result);
//		}

	}

}
