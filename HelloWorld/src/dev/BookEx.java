package dev;

public class BookEx {
	public static void main(String[] args) {
		
		// 책제목, 저자, 출판사, 가격
		// book1 혼공자 신용권 한빛미디어 24000
		// book2 PowerJava 천인국 인피니티 35000
		// book3 재밌는 java 이호준 인피니티 20000 
		
		// 출판사 인피니티 -> 제목 저자 가격 출력
		
		Book bk1 = new Book();
		bk1.name = "혼공자";
		bk1.auth = "신용권";
		bk1.press = "한빛미디어";
		bk1.pri = 24000;
		
		Book bk2 = new Book();
		bk2.name = "PowerJava";
		bk2.auth = "천인국";
		bk2.press = "인피니티";
		bk2.pri = 35000;
		
		Book bk3 = new Book();
		bk3.name = "재밌는 Java";
		bk3.auth = "이호준";
		bk3.press = "인피니티";
		bk3.pri = 20000;
		
		Book[] bks = { bk1, bk2, bk3 };
		
//		for ( int i = 0; i < bks.length; i++ ) {
//			if (bks[i].press == "인피니티" ) {
//				System.out.println(bks[i].name);
//				System.out.println(bks[i].auth);
//				System.out.println(bks[i].pri);
//			}
//		}

		for ( int i = 0; i < bks.length; i++ ) {
			if (bks[i].auth == "신용권" ) {
				System.out.println(bks[i].name);
				System.out.println(bks[i].press);
				System.out.println(bks[i].pri);
			}
		}
		
	}

}
