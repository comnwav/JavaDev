package com.edu.collect;

//public class Student implements Serializable {
public class Student {
	// 학생번호(1, 2, 3), 이름(홍길동), 영어(80), 국어(70)
	private int number;
	private String name;
	private int engScore;
	private int korScore;
	private boolean result;
	
	

	public Student(boolean result) {
		super();
		this.result = result;
	}
	
	

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public Student() {
	}

	public Student(int number, String name, int engScore, int korScore) {
		super();
		this.number = number;
		this.name = name;
		this.engScore = engScore;
		this.korScore = korScore;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", engScore=" + engScore + ", korScore=" + korScore
				+ "]";
	}

}