package com.kh.chap01_poly.part02_cafeteria.model.vo;

public class CheeseBurger extends Hamburger{
	
	private int cheeseCount;
	
	public CheeseBurger() {}
	public CheeseBurger(String name, int price, boolean set, int cheeseCount) {
		super(name, price, set);
		this.cheeseCount = cheeseCount;
	}
	
	public int getCheeseCount() {
		return cheeseCount;
	}
	
	public void setCheeseCount(int cheeseCount) {
		this.cheeseCount = cheeseCount;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", cheeseCount : " + cheeseCount + "]";
	}
	
	
	
	
	
	
	
	
}
