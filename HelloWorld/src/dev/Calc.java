package dev;

public class Calc {
	
	double PI = 3.14;
	
	int add(int num1, int num2) {
		int val = num1 + num2;
		return val;
	}
	
	// return type is int
	// return result is difference
	int diff(int num1, int num2) {
		int val = num1 - num2;
		return val;
	}
	
	// �簢���� ���� ���
	double getRectArea(double length, double width) {
		double area = length * width;
		return area;
	}
	
	// ���� ���� ���
	double getCirArea(double radius) {
		double area = PI * radius * radius;
		return area;
	}

}
