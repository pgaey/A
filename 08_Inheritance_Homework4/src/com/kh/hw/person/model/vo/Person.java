package com.kh.hw.person.model.vo;

public class Person extends Object {

	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {}
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String name() {
		return name;
	}
	public int age() {
		return age;
	}
	public double height() {
		return height;
	}
	public double weight() {
		return weight;
	}
	
	
	
	@Override
	public String toString() {
		return "이름 : " + name + " / 나이 : " + age + " / 키 : " + height + " / 체중 : " + height;
	}
	
	
	
	
	
	
	
	
	
}




