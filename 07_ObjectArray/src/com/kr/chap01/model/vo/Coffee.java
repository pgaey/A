package com.kr.chap01.model.vo;

public class Coffee {
	
	// [ �ʵ��  ] : ������, ����, �̸�, ����
	private String coffeeName;
	private int price;
	private String bean;
	private String size;
	
	
	// [ �����ں�  ] : 
	// �⺻ ������
	// �̸�, ����, ����
	// ��� �ʵ带 �Ű������� ���� �ִ� ������
	
	public Coffee () {}
	
	public Coffee(String coffeeName, int price, String bean) {
		this.coffeeName = coffeeName;
		this.price = price;
		this.bean = bean;
	}
	
	public Coffee(String coffeeName, int price, String bean, String size) {
		this(coffeeName, price, bean);		// 	�帧 ���� ���� �����־����		19�� ������ this. �Է¹��� -> 20, 21, 22��� ���� ������ ����
		this.size = size;
	}
	
	
	
	// [ �޼ҵ��  ] : 
	// getter()/setter()/information() : String
	public String getCoffeeName() {
		return coffeeName;
	}
	public int getPrice() {
		return price;
	}
	public String getBean() {
		return bean;
	}
	public String getSize() {
		return size;
	}
	
	
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBean(String bean) {
		this.bean = bean;
	}
	public void setSize(String size) {
		this.size = size;
	}

	
	public String information() {
		return "�̸� : " + coffeeName + " ���� : " + price + " ���� : " + bean + " ������ : " + size;
	}
	
}
