package com.edu;

public class Student {

	// 학생번호, 학생이름, 국어점수, 수학점수, 영어점수 > 필드정의
	private int studNo;
	private String studName;
	private int korScore;
	private int mathScore;
	private int engScore;

	public Student(int studNo) {
		this.studNo = studNo;
	}

	// static method > new로 instance 선언 안해도 실행시에 메모리에 로드된다.
	public static void callStatic() {
		System.out.println("정적메소드 실행...");
	}

	// source -> generate constructor 로 만든 생성자
	public Student(int studNo, String studName, int korScore, int mathScore, int engScore) {
		this.studNo = studNo;
		this.studName = studName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	// 매개변수 2개 받는 생성자
	public Student(int studNo, String studName) {
		this.studNo = studNo;
		this.studName = studName;
	}

	// 생성자 - 필드의 값을 초기화
	// 클래스의 이름과 똑같이 설정 > Java가 생성자라고 파악
	public Student() {
		this.studNo = 1;
		this.studName = "nobody";
		this.korScore = 0;
		this.engScore = 0;
	}

	// 영어, 국어, 수학 > 합계 > 평균
	public double getAvgScore() {
		return this.getSumScore() / (double) 3;
	}

	public int getSumScore() {
		if (this.korScore >= 0 && this.engScore >= 0 && this.mathScore >= 0) {
			return this.korScore + this.engScore + this.mathScore;
		} else {
			System.out.println("code -1 = err");
			return -1;
		}
	}

	// 기능 method > 규칙 반환값 메소드명 매개변수 {}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public int getStudNo() {
		return this.studNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public String getStudInfo() {
		String str = "======================";
		str += "\n 학생이름: " + this.studName + "이고";
		str += "\n 학번: " + this.studNo + "이며";
		str += "\n 평균: " + String.format("%.2f", this.getAvgScore()) + "입니다.";
		str += "\n======================";
		return str;
	}

}
