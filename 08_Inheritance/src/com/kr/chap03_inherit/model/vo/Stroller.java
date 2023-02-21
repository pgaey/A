package com.kr.chap03_inherit.model.vo;

public class Stroller extends Vehicle {
	
	private int price;
	
	public Stroller() {}
	public Stroller(String name, double mileage, String kind, int price) {
		super(name, mileage, kind);
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void howToMove() {
		System.out.println("À¯¸ðÂ÷");
	}
	
	public String toString() {
		return super.toString() + " / price : " + price;
	}
	
	
}
