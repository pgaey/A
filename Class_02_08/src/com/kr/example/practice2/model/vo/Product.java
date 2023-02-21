package com.kr.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	
	
	public Product() {
		
	}
	
	
	
	public void setPName(String name) {
		this.pName = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String getPName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	
	
	public void information() {
		System.out.println("이 제품은 " + brand + "회사의 " + price + "만원 가격의 " + pName + "입니다.");
	}
	
	
	
	

}
