package dev;

public class ArrEx3 {

	public static void main(String[] args) {

		String[] names = new String[5];
		names[0] = "�߰���";
		names[1] = "����";
		names[2] = "�Ƶ�����";
		names[3] = "�������";
		names[4] = "����";

		String searchName = "����";

		for (int i = 0; i < 5; i++) {
			if (names[i] != null && names[i].equals(searchName)) {
				System.out.println(i + 1 + "��° ��ġ�� �ֽ��ϴ�.");
			}
		}
	}
}
