package com.kr.chap03_inherit.model.vo;

public class Ship extends Vehicle {
	
	private int propeller;
	
	public Ship() {}
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	public int getPropeller() {
		return propeller;
	}
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	
	public void howToMove() {
		System.out.println("ÇÁ·ÎÆç·¯");
	}
	
	public String toString() {
		return super.toString() + " / ÇÁ·ÎÆç·¯ : " + propeller;
	}
	
	
	
	
	
	
	
	
	
	
}
