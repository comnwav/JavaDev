package com.dev;

public class GuDanEx {

	public static void main(String[] args) {

		String danSum = "";
		int cnt = 1;

		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 8; i++) {
				danSum += (i + 2) + " * " + cnt + " = " + ((i + 2) * cnt) + "  ";
			}
			System.out.println(danSum);
			danSum = "";
			cnt++;
		}

	}

}
