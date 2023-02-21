package com.kr.chap02_beforeVSafter.after.model.vo;
/*
 * 상속
 * 
 * 기존의 클래스를 이용해서 새로운 클래스를 만든다. == 상속
 * 
 * 매 클래스마다, 중복된, 필드, 메소드들을 단 한번 하나의 클래스(부모클래스)로 정의해둔 후 해당 클래스의 멤버를 가져다 쓰는 개념
 * 
 */










public class Product {
	// 공통되는 필드
	// 필드부 : brand, pCode, pName, price
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	// 생성자부
	public Product() {
		System.out.println("안녕 나는 부모객체 스마트폰이야~");
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
		return "브랜드명 : " + brand + " / 상품코드 : " + pCode + " / 상품명 : " + pName + 
			" / 상품가격 : " + price;
	}
	
	
	
	
	
	
	
	
	
	
}