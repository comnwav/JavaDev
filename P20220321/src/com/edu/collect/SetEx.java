package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {

		// set 중복값은 허용 하지 않습니다.
		// 중복을 받지 않습니다.
		// 바구니에 넣듯이 때려박습니다.
		// 각각의 값이 참조변수입니다.
		
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		set.add("Good");
		set.remove("World");
		set.add("Nailed");
		
		
		System.out.println("set 크기" + set.size());
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}
		
	}

}
