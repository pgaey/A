package com.kh.chap03.model.vo;

public class Product {
	// 상품가격, 브랜드, 색깔, 상품명
	
	// [ 필드부  ]
	private int price; 
	private String brand = "나이키";   // ex) 나이키 브랜드에서 코드를 쓰면 이렇게 초기화 시켜서 고정시켜준다.
	private String color;
	private String productName;
	
	{ // 초기화 블록
		
		brand = "나이키";				// 7행처럼, 혹은 14행처럼 가능
	}
	
	
	
	// [ 생성자부  ]
	// [ 메소드부  ]
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
		return "상품명 : " + productName + ", 가격 : " + price + ", 브랜드 : "
				+ brand + ", 색상 : " + color;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
