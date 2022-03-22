package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberEx {
	
	public static void main(String[] args) {
		Member m1 = new Member("user1","홍길동");
		Member m2 = new Member("user2","홍길순");
		
		if(m1.equals(m2)) {
			System.out.println("논리적으로 같습니다.");
		} else {
			System.out.println("논리적으로 다릅니다.");
		}
		
		// 집합 > 컬렉션 (ArrayList, HashSet, HashMap) : 여러개의 값을 저장
		// Member의 인스턴스 최대 5개 저장, 크기 초과하면 새로운 배열 선언, 복사...
		
		// 동일한 값을 처리하는 컬렉션 > 인덱스(주소값)을 다르게 처리
		Member[] memberAry = new Member[5];
		ArrayList<Member> memList = new ArrayList<Member>();
		memList.add(new Member("user1", "홍길동"));
		memList.add(new Member("user1", "홍길동"));
		
		for (int i = 0; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}
		
		// 중복 값을 인정하지 않는 컬렉션
		HashSet<Member> memSet = new HashSet<Member>();
		memSet.add(new Member("user1", "홍길동"));  // hashCode(), equals() 가 판단
		memSet.add(new Member("user1", "홍길동"));
		
		System.out.println(memSet.size());
		
	}

}
