package com.dev;

// BankApp(main method), Account(��������, ������, �ܾ�)
public class BankApp {
	// ��������, ������, ���ݾ�
	// field.
	private String accNo;
	private String accNme;
	private int money;
	
	// ������ - �ʵ��� �ʱⰪ�� ����
	public BankApp(String accNo, String accNme, int money) {
		this.accNo = accNo;
		this.accNme = accNme;
		this.money = money;
	}
	
	// �޼ҵ�
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
