package com.kh.chap01_poly.part01_basic.vo;

public class Child1 extends Parent{
	// 필드부
	// int x, int y
	private int z;
	
	// 생성자부
	public Child1() {}
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// 메소드부
	public void setZ() {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	
	public void printChild1() {
		System.out.println("나 첫 번째 자식이야 ~");
	}
	
	@Override
	public void print() {
		System.out.println("나 첫 번재 자식이야 ~~");
	}
	
	
	
}
