package com.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
	
	String instSwim;
	String grade;
	
	public SwimMember(int memberId, String memberName, String phone, String instSwim, String grade) {
		super(memberId, memberName, phone);
		this.instSwim = instSwim;
		this.grade = grade;
	}

	public String getInstSwim() {
		return instSwim;
	}

	public void setInstSwim(String instSwim) {
		this.instSwim = instSwim;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "[수영팀] " + super.toString() + ", 강사" + instSwim + ", 등급" + grade;
	}

	
	
	
}
