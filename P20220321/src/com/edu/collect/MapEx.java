package com.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {

		// Map: {key:value}, {key1:value1}
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("전민욱", 80);
		map.put("김형민", 82);
		map.put("최규완", 15);
		map.put("최규완", 99);

		// 컬렉션: 여러값을 저장 > 여러요소 접근
		// key 값은 순서가 없다
		// key 값에 해당하는 요소를 가져온다

		Integer val = map.get("최규완");
		System.out.println(val);

		// map 컬렉션에 저장된 요소들의 키에 해당 값을 set 컬렉션에 담아주는 역할
		Set<String> keySet = map.keySet();
		
		// 1)
		Iterator<String> iter = keySet.iterator();

		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.printf("Key: %5s, Value: %5d", key, value);

		}
		
		// 2) for ( : ) 확장 for
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.printf("key: %5s, value: %5d \n", key, value);
		}
		System.out.println("end of prog");

	}

}
