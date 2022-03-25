package com.edu.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputEx {

	public static void main(String[] args) {

		try {
			// 입력스트림을 생성 (first.dat 파일을 입력스트림의 소스로 사용하고 싶소)
			InputStream is = new FileInputStream("first.dat");
			int readByte = 0;
			int abs = 1;
			while ((readByte = abs) != -1) {
				System.out.println(readByte);
			}
			is.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
