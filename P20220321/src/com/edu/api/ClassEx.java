package com.edu.api;

import java.lang.reflect.Method;

public class ClassEx {
	public static void main(String[] args) {
		
		// String, System, Member > 관리하는 class(Class);
		
		Class cls = String.class;
		try {
			cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace() ;
		}
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getMethods());
		Method[] methods = cls.getMethods();
		
		for(Method met : methods) {
			System.out.println("메소드의 이름: " + met.getName());
		}
		
		cls = Member.class;
		
		String path = cls.getResource("module-info.java").getPath();
		System.out.println(path);
		
		
	}
}
