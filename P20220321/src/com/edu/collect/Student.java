package com.edu.collect;

public class Student {
	
	// 데이터 타입 정의 클래스
	
	// 학생번호(1, 2, 3), 이름(홍길동), 영어(80), 국어(70)
	// 생성자: 기본생성자, 매개값이 4개 생성자
	// Getter, Setter 생성
	
	int sno;
	String name;
	int engScore;
	int korScore;
	
	public Student() {
		
	}
	
	
	
	public Student(int num) {
		super();
		this.sno = num;
	}

	public Student(int num, String name, int engScore, int korScore) {
		super();
		this.sno = num;
		this.name = name;
		this.engScore = engScore;
		this.korScore = korScore;
	}

	public int getNum() {
		return sno;
	}

	public void setNum(int num) {
		this.sno = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	// toString() > 재정의
	@Override
	public String toString() {
		return "Student [num=" + sno + ", name=" + name + ", engScore=" + engScore + ", korScore=" + korScore + "]";
	}
	
	
	

}
