package com.edu.api;

public class IDCheck {

	public String getGender(String pn) {

		String result1 = "남자입니다";
		String result2 = "여자입니다";
		String result3 = "꺼져";
		
		switch (pn.charAt(7)) {
		case '1':
		case '3':
			return result1;
		case '2':
		case '4':
			return result2;
		}

		return result3;

	}

}
