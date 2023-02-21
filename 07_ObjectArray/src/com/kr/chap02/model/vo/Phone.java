package com.kr.chap02.model.vo;

public class Phone {
	
	// �ʵ��
	// ����, �귣��, �ø���, ����
	
	private String color;
	private String brand;
	private String series;
	private int price;
	
	// �����ں�
	public Phone () {}
	public Phone (String color, String brand, String series, int price) {
		this.color = color;
		this.brand = brand;
		this.series = series;
		this.price = price;
	}
	
	// �޼ҵ��
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
		return "���� : " + color + " �귣�� : " + brand +
				" �ø��� : " + series + " ���� : " + price;
	}
	
	
	

}
