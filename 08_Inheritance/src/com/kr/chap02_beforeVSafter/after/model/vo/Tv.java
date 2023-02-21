package com.kr.chap02_beforeVSafter.after.model.vo;

public class Tv extends Product {
	
	// �ʵ��
	private int inch;
	
	
	// �����ں�
	public Tv() {}
	
	
	// ��� �ʵ忡 ���� �Ű������� �ִ� ������
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		// �θ� ������ �ִ� �ʵ峪 �޼ҵ忡 �����Ϸ��� �� ���� ?? super.
		// super.brand = brand; private�̴� ���ٺҰ�
		// �ذ��� 1. �θ��� private -> protect�� �ٲ��ش�.
		// �ذ��� 2. �θ��� setter�޼ҵ带 ȣ���ؼ� �ʱ�ȭ�Ѵ�. super.set�ʵ��̸�();
		// �ذ��� 3. �θ��� ��� �Ű������� �ִ� �����ڸ� superŰ���带 ȣ���ؼ� �ʱ�ȭ�Ѵ�.
		super(brand, pCode, pName, price);
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
