package dev;

public class BookEx {
	public static void main(String[] args) {
		
		// å����, ����, ���ǻ�, ����
		// book1 ȥ���� �ſ�� �Ѻ��̵�� 24000
		// book2 PowerJava õ�α� ���Ǵ�Ƽ 35000
		// book3 ��մ� java ��ȣ�� ���Ǵ�Ƽ 20000 
		
		// ���ǻ� ���Ǵ�Ƽ -> ���� ���� ���� ���
		
		Book bk1 = new Book();
		bk1.name = "ȥ����";
		bk1.auth = "�ſ��";
		bk1.press = "�Ѻ��̵��";
		bk1.pri = 24000;
		
		Book bk2 = new Book();
		bk2.name = "PowerJava";
		bk2.auth = "õ�α�";
		bk2.press = "���Ǵ�Ƽ";
		bk2.pri = 35000;
		
		Book bk3 = new Book();
		bk3.name = "��մ� Java";
		bk3.auth = "��ȣ��";
		bk3.press = "���Ǵ�Ƽ";
		bk3.pri = 20000;
		
		Book[] bks = { bk1, bk2, bk3 };
		
//		for ( int i = 0; i < bks.length; i++ ) {
//			if (bks[i].press == "���Ǵ�Ƽ" ) {
//				System.out.println(bks[i].name);
//				System.out.println(bks[i].auth);
//				System.out.println(bks[i].pri);
//			}
//		}

		for ( int i = 0; i < bks.length; i++ ) {
			if (bks[i].auth == "�ſ��" ) {
				System.out.println(bks[i].name);
				System.out.println(bks[i].press);
				System.out.println(bks[i].pri);
			}
		}
		
	}

}
