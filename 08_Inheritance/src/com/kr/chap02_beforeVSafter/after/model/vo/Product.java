package com.kr.chap02_beforeVSafter.after.model.vo;
/*
 * ���
 * 
 * ������ Ŭ������ �̿��ؼ� ���ο� Ŭ������ �����. == ���
 * 
 * �� Ŭ��������, �ߺ���, �ʵ�, �޼ҵ���� �� �ѹ� �ϳ��� Ŭ����(�θ�Ŭ����)�� �����ص� �� �ش� Ŭ������ ����� ������ ���� ����
 * 
 */










public class Product {
	// ����Ǵ� �ʵ�
	// �ʵ�� : brand, pCode, pName, price
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	// �����ں�
	public Product() {
		System.out.println("�ȳ� ���� �θ�ü ����Ʈ���̾�~");
	}
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "�귣��� : " + brand + " / ��ǰ�ڵ� : " + pCode + " / ��ǰ�� : " + pName + 
			" / ��ǰ���� : " + price;
	}
	
	
	
	
	
	
	
	
	
	
}