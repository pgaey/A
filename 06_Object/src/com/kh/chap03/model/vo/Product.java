package com.kh.chap03.model.vo;

public class Product {
	// ��ǰ����, �귣��, ����, ��ǰ��
	
	// [ �ʵ��  ]
	private int price; 
	private String brand = "����Ű";   // ex) ����Ű �귣�忡�� �ڵ带 ���� �̷��� �ʱ�ȭ ���Ѽ� ���������ش�.
	private String color;
	private String productName;
	
	{ // �ʱ�ȭ ���
		
		brand = "����Ű";				// 7��ó��, Ȥ�� 14��ó�� ����
	}
	
	
	
	// [ �����ں�  ]
	// [ �޼ҵ��  ]
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public String getProductName() {
		return productName;
	}
	
	// information()
	public String information() {
		return "��ǰ�� : " + productName + ", ���� : " + price + ", �귣�� : "
				+ brand + ", ���� : " + color;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
