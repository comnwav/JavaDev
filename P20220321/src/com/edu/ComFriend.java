package com.edu;

public class ComFriend extends Friend {
	
	// ȸ���̸�, ȸ�����
	
	private String company;
	private String job;
	
	public ComFriend() {
		
	} 
	
	public ComFriend(String name, int age, double height, double weight, String phone, String company, String job) {
		super(name, age, height, weight, phone);
		this.company = company;
		this.job = job;
	}



	// method
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		String str = "ģ���� �̸��� " + super.getName() + "�̰� \n";
		str += "���̴� " + super.getAge() + "�̰� \n";
		str += "����ó�� " + this.getPhone() + "�Դϴ�. \n";
		str += "====<�߰�����>====\n";
		str += "ȸ���̸��� " + this.getJob();
		return str;
	}
	
	

}
