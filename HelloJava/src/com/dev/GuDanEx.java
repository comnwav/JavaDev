package com.dev;

public class GuDanEx {

	public static void main(String[] args) {

		String danSum = "";
		int cnt = 1;

		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 8; i++) {
				danSum += (i + 2) + " * " + cnt + " = " + ((i + 2) * cnt) + "	"; 
				// "   "에 space 대신 tab 을 써주면 자동으로 맞춰짐 왜 그런지는 모름
			}
			System.out.println(danSum);
			danSum = "";
			cnt++;
		}

	}

}
