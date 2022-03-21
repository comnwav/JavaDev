package com.edu;

public class UniFriend extends Friend {
	
	// �б� : �б��̸�, ����
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
		String str = "ģ���� �̸��� " + super.getName() + "�̰� \n";
		str += "���̴� " + super.getAge() + "�̰� \n";
		str += "����ó�� " + this.getPhone() + "�Դϴ�. \n";
		str += "====<�߰�����>====\n";
		str += "�б��̸��� " + this.getUniversity() + "�Դϴ�. \n";
		str += "������ " + this.getMajor() + "�Դϴ�. \n";
		return str;
	}
	
	
	

}
