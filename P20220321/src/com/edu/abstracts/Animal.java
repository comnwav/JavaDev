package com.edu.abstracts;

public abstract class Animal {
	
	private String name;
	
	public Animal() {
		System.out.println("Animal() ������ ȣ��");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// �߻�Ŭ������ �߻�޼ҵ带 ������ �� �ִ�.
	// �߻� ��¼��� ��ü�� ���� / �����Ǵ� �κ�({})�̾���.
	// �߻� �޼ҵ�� �θ� Ŭ������ ��ӹ޴� ���� Ŭ�������� ������ ����/����ؾ��ϴ� �θ� Ŭ������ �޼ҵ���
	// ���� ���� �ܰ迡�� ����� ���� �����ϸ� ���� �ܰ迡�� Ȯ���� �������� ���� �� �� �ִ�.
	public abstract void eat();
	public abstract void speak();

}
