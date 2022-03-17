package dev;

public class ArrEx3 {

	public static void main(String[] args) {

		String[] names = new String[5];
		names[0] = "´ß°¥ºñ";
		names[1] = "±¾±â";
		names[2] = "¸Æµµ³¯µå";
		names[3] = "ºñºö¸¸µÎ";
		names[4] = "»ï°ã»ì";

		String searchName = "»ï°ã»ì";

		for (int i = 0; i < 5; i++) {
			if (names[i] != null && names[i].equals(searchName)) {
				System.out.println(i + 1 + "¹øÂ° À§Ä¡¿¡ ÀÖ½À´Ï´Ù.");
			}
		}
	}
}
