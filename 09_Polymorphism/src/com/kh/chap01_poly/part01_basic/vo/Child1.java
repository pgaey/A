package com.kh.chap01_poly.part01_basic.vo;

public class Child1 extends Parent{
	// �ʵ��
	// int x, int y
	private int z;
	
	// �����ں�
	public Child1() {}
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// �޼ҵ��
	public void setZ() {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	
	public void printChild1() {
		System.out.println("�� ù ��° �ڽ��̾� ~");
	}
	
	@Override
	public void print() {
		System.out.println("�� ù ���� �ڽ��̾� ~~");
	}
	
	
	
}
