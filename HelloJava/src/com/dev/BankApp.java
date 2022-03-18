package com.dev;

// BankApp(main method), Account(계좌정보, 예금주, 잔액)
public class BankApp {
	// 계좌정보, 예금주, 예금액
	// field.
	private String accNo;
	private String accNme;
	private int money;
	
	// 생성자 - 필드의 초기값을 지정
	public BankApp(String accNo, String accNme, int money) {
		this.accNo = accNo;
		this.accNme = accNme;
		this.money = money;
	}
	
	// 메소드
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccNme() {
		return accNme;
	}
	public void setAccNme(String accNme) {
		this.accNme = accNme;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "BankApp [accNo=" + accNo + ", accNme=" + accNme + ", money=" + money + "]";
	}
	
	
	
}
