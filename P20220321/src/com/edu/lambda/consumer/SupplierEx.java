package com.edu.lambda.consumer;

import java.util.function.IntSupplier;

// Supplier 인터페이스 : 매개값이 없습니다.

public class SupplierEx {
	
	public static void main(String[] args) {
		
		IntSupplier intSup = new IntSupplier() {

			@Override
			public int getAsInt() {
				return (int) (Math.random() * 10);
			}
			
		};
		int result = intSup.getAsInt();
		System.out.println("결과값은 " + result);
		
	}

}
