package com.edu.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadEx {

	public static void main(String[] args) {
		
		try {
			// 문자기반 스트림 (한문자씩) 입력스트림.
			FileReader fr = new FileReader("second.txt");
			int readChar = -1;
			while((readChar = fr.read()) != -1) {
				System.out.println((char) readChar);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
