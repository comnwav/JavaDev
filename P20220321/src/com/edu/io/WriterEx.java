package com.edu.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterEx {

	public static void main(String[] args) {
		
		// 출력스트림을 문자기반으로 second.txt
		try {
			FileWriter fw = new FileWriter("second.txt");
			fw.write("Hello");
			fw.write("Wilrd\n");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of prog");

	}

}
