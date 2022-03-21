package com.edu;

public class Students extends Person {
	
	// 학교, 학년 + ( 이름, 나이, 키 몸무게 )
	private String School;
	private int grade;
	
	// method
	public String getSchool() {
		return School;
	}
	
	public void setSchool(String school) {
		School = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

}
