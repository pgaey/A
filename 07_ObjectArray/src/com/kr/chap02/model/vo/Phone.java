package com.kr.chap02.model.vo;

public class Phone {
	
	// 필드부
	// 색깔, 브랜드, 시리즈, 가격
	
	private String color;
	private String brand;
	private String series;
	private int price;
	
	// 생성자부
	public Phone () {}
	public Phone (String color, String brand, String series, int price) {
		this.color = color;
		this.brand = brand;
		this.series = series;
		this.price = price;
	}
	
	// 메소드부
	// set
	public void setColor(String color) {
		this.color = color;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// get
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
	public String getSeries() {
		return series;
	}
	public int getPrice() {
		return price;
	}
	// info
	public String information() {
		return "색깔 : " + color + " 브랜드 : " + brand +
				" 시리즈 : " + series + " 가격 : " + price;
	}
	
	
	

}
