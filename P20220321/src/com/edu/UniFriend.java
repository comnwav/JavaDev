package com.edu;

public class UniFriend extends Friend {
	
	// 학교 : 학교이름, 전공
	private String university;
	private String major;
	
	 
	public UniFriend() {
		super();
	}
	
	public UniFriend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight, phone); 
	}

	public UniFriend(String name, int age, double height, double weight, String phone, String university, String major) {
		super(name, age, height, weight, phone);
		this.major = major;
		this.university = university;
	}
	
	// method
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고 \n";
		str += "나이는 " + super.getAge() + "이고 \n";
		str += "연락처는 " + this.getPhone() + "입니다. \n";
		str += "====<추가정보>====\n";
		str += "학교이름은 " + this.getUniversity() + "입니다. \n";
		str += "전공은 " + this.getMajor() + "입니다. \n";
		return str;
	}
	
	
	

}
