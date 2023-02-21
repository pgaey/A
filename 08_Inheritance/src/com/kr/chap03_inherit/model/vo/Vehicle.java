package com.kr.chap03_inherit.model.vo;

public class Vehicle {
	
	private String name;
	private double mileage;
	private String kind;
	
	
	
	public Vehicle() {}
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	

	public String getName(){
		return name;
	}
	public double getMileage() {
		return mileage;
	}
	public String getKind() {
		return kind;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public void setMileage(String kind) {
		this.kind = kind;
	}
	
	public void howToMove() {
		System.out.println("헤이 모두들 안녕");
	}
	
	// 객체가 가진 field값을 문자열로 반환하기 위해서 information()을 선언했음
	// Object클래스에 있는 메소드를 오버라이딩해서 사용할 것
	// information() -> toString()
	public String toString() {
		return "name : " + name + " / mileage : " + mileage + " / kind : " + kind;
	}
	
	
	
	
	
	
	
	
}
