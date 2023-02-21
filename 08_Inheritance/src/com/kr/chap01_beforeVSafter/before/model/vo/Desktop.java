package com.kr.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	//�ʵ��
	private String brand;
	private String pCode;		// �����̸� pCode <- �̷������� �������� Ǯ����  productCode��
	private String pName;
	private int price;
	private boolean allInOne;
	
	//������
	public Desktop() {}
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	//set
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	//get
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public boolean isAllInOne() {		// ���� boolean Ÿ���� ��� �տ�  get ��� is�� ���������� ���� ��
		return allInOne;
	}
	
	//info
	public String information() {
		return "�귣��� : " + brand + " / ��ǰ�ڵ� : " + pCode + " / ��ǰ�� : " + pName + 
			" / ��ǰ���� : " + price + "/ ��ü���� : " + allInOne; 
	}
	
	
	
	
	
	
	
}
