package com.edu;

public class Student {

	// �л���ȣ, �л��̸�, ��������, ��������, �������� > �ʵ�����
	private int studNo;
	private String studName;
	private int korScore;
	private int mathScore;
	private int engScore;

	public Student(int studNo) {
		this.studNo = studNo;
	}

	// static method > new�� instance ���� ���ص� ����ÿ� �޸𸮿� �ε�ȴ�.
	public static void callStatic() {
		System.out.println("�����޼ҵ� ����...");
	}

	// source -> generate constructor �� ���� ������
	public Student(int studNo, String studName, int korScore, int mathScore, int engScore) {
		this.studNo = studNo;
		this.studName = studName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	// �Ű����� 2�� �޴� ������
	public Student(int studNo, String studName) {
		this.studNo = studNo;
		this.studName = studName;
	}

	// ������ - �ʵ��� ���� �ʱ�ȭ
	// Ŭ������ �̸��� �Ȱ��� ���� > Java�� �����ڶ�� �ľ�
	public Student() {
		this.studNo = 1;
		this.studName = "nobody";
		this.korScore = 0;
		this.engScore = 0;
	}

	// ����, ����, ���� > �հ� > ���
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

	// ��� method > ��Ģ ��ȯ�� �޼ҵ�� �Ű����� {}
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
		str += "\n �л��̸�: " + this.studName + "�̰�";
		str += "\n �й�: " + this.studNo + "�̸�";
		str += "\n ���: " + String.format("%.2f", this.getAvgScore()) + "�Դϴ�.";
		str += "\n======================";
		return str;
	}

}
