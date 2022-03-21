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
		
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		
		for (int i=0; i < friends.length; i++) {
			if(friends[i] != null)
			System.out.println(friends[i].toString());
		}
		

	}

}
