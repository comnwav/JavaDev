package com.test;

public class CollegeStudent extends Student {
	private String profName; // 담당교수.
	private String major; // 전공정보.

	public CollegeStudent(String studNo, String studName, String profName, String major) {
		super(studNo, studName);
		this.profName = profName;
		this.major = major;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "[대학생] " + super.toString() + "담당교수: " + profName + ", 전공: " + major;

	}

}
