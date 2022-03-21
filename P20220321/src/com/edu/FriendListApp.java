package com.edu;

public class FriendListApp {

	public static void main(String[] args) {

		Friend[] friends = new Friend[10];

		Friend f1 = new Friend();
		f1.setName("서현일");
		f1.setAge(25);
		f1.setHeight(1792);
		f1.setWeight(72.5);
		f1.setPhone("01099827345");

		UniFriend f2 = new UniFriend("서현일", 29, 178.3, 69.2, "010-9982-7345");
		f2.setUniversity("영남대학교");
		f2.setMajor("컴퓨터공학과");

		ComFriend f3 = new ComFriend("최규완", 29, 179.3, 75.2, "010-1341-7349", "네이버", "지도app개발연구원");
		
		
		Friend f4 = new Friend();
		f4.setName("서현일");
		f4.setAge(25);
		f4.setHeight(1792);
		f4.setWeight(72.5);
		f4.setPhone("01099827345");

		UniFriend f5 = new UniFriend("서현일", 29, 178.3, 69.2, "010-9982-7345");
		f5.setUniversity("영남대학교");
		f5.setMajor("컴퓨터공학과");

		ComFriend f6 = new ComFriend("최규완", 29, 179.3, 75.2, "010-1341-7349", "네이버", "지도app개발연구원");

		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		friends[3] = f4;
		friends[4] = f5;
		friends[5] = f6;
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println(friends[i].toString());
		}

		// UniFriend; getUniversity, getMajor
		Friend friend = f2; 
		friend = f1;
		UniFriend uni = null;
		// instanceof 해당 클래스의 인스턴스인지 체크 그리고 casting 해야함
		if (uni instanceof UniFriend) {
			uni = (UniFriend) friend;
			// 부모클래스의 참조변수 > 자식 클래스의 참조변수 할당가능
			uni.getUniversity();
		}
		
		for (int i = 0; i < friends.length; i++ ) {
			if (friends[i] != )
			System.out.println(friends[i].toString());
		}
		
	}

}
