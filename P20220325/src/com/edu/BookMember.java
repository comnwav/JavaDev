package com.edu;

public class BookMember extends Member {
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
	
	String cap;
	String room;
	
	public BookMember(int memberId, String memberName, String phone, String cap, String room) {
		super(memberId, memberName, phone);
		this.cap = cap;
		this.room = room;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "BookMember [cap=" + cap + ", room=" + room + "]";
	}
	
}
