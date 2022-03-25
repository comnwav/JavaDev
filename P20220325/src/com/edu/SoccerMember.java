package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
	
	String instSoccer;
	String rock;
	
	public SoccerMember(int memberId, String memberName, String phone, String instSoccer, String rock) {
		super(memberId, memberName, phone);
		this.instSoccer = instSoccer;
		this.rock = rock;
	}

	public String getInstSoccer() {
		return instSoccer;
	}

	public void setInstSoccer(String instSoccer) {
		this.instSoccer = instSoccer;
	}

	public String getRock() {
		return rock;
	}

	public void setRock(String rock) {
		this.rock = rock;
	}

	@Override
	public String toString() {
		return "[축구반] " + super.toString() + ", 코치:" + instSoccer + ", 락커룸:" + rock;
	}


	
	
}
