//package com.edu.io;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class StudentFileEx {
//
//	static Scanner scn = new Scanner(System.in);
//
//	public static void main(String[] args) {
//
//		readStudent();
//		System.out.println("end of prog");
//	}
//
//	public static void readStudent() {
//		try {
//			FileReader fr = new FileReader("student.txt");
//			BufferedReader br = new BufferedReader(fr);
//			String readStr = null;
//
//			while ((readStr = br.readLine()) != null) {
//				String[] contents = readStr.split(" ");
//				new Student();
//				contents[0];
//				contents[1];
//				contents[2];
//				contents[3];
//				
//			}
//			br.close();
//			fr.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public static void writeStudent() {
//		try {
//			FileWriter fw = new FileWriter("student.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//
//			while (true) {
//				System.out.println("이름을입력>>");
//				String name = scn.nextLine(); // 한라인 전체를 읽음.
//				if (name.equals("stop")) {
//					break;
//				}
//				bw.write(name + "\n");
//			}
//			bw.close();
//			fw.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}