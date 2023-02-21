package com.kh.chap01_poly.part02_cafeteria.model.vo;

public class BeefBurger extends Hamburger {
	
	// ÇÊµåºÎ
	private double gram;

	
	public BeefBurger() {}
	public BeefBurger(String name, int price, boolean meal, double gram) {
		super(name, price, meal);
		this.gram = gram;
	}
	
	
	public void setGram(double gram) {
		this.gram = gram;
	}
	public double getGram() {
		return gram;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", gram : " + gram + "]";
 	}
	
	
	
	
	
	
	
	
	
	
}
