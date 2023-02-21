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
		System.out.println("���� ��ε� �ȳ�");
	}
	
	// ��ü�� ���� field���� ���ڿ��� ��ȯ�ϱ� ���ؼ� information()�� ��������
	// ObjectŬ������ �ִ� �޼ҵ带 �������̵��ؼ� ����� ��
	// information() -> toString()
	public String toString() {
		return "name : " + name + " / mileage : " + mileage + " / kind : " + kind;
	}
	
	
	
	
	
	
	
	
}
