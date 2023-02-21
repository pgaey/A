package com.kh.chap01_poly.part02_cafeteria.model.vo;

public class ShrimpBurger extends Hamburger {
	
	// ÇÊµåºÎ
	private String location;
	
	
	
	public ShrimpBurger() {}
	public ShrimpBurger(String name, int price, boolean meal, String location) {
		super(name, price, meal);
		this.location = location;
	}
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + ", location : " + location + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
