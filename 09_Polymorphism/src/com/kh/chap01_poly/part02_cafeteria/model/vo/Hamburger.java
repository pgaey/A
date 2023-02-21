package com.kh.chap01_poly.part02_cafeteria.model.vo;

public class Hamburger /* extends Object */ {
	
	// 鞘靛何
	private String name;
	private int price;
	private boolean meal;
	
	// 积己磊何
	public Hamburger() {}
	public Hamburger(String name, int price, boolean meal) {
		this.name = name;
		this.price = price;
		this.meal = meal;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setMeal(boolean meal) {
		this.meal = meal;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public boolean getMeal() {
		return meal;
	}
	
	// int a = 0;
	
	@Override
	public String toString() {
		return "Hamberger [name = " + name + ", price = " + price + ", set = " + meal + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
