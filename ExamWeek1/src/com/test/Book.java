package com.test;

public class Book {
	
	String name;
	String auth;
	String press;
	int price;
	
	public Book(String name, String auth, String press, int price) {
		this.name = name;
		this.auth = auth;
		this.press = press;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
