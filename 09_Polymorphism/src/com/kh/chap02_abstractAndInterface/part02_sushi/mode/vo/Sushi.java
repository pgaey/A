package com.kh.chap02_abstractAndInterface.part02_sushi.mode.vo;

public class Sushi extends JapaneseFood implements JapaneseFoodI {
	
	public String topping;
	
	public Sushi() {}
	public Sushi(String name, int price, int count, String topping) {
		super(name, price, count);
		this.topping = topping;
	}
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", topping = " + topping + "]";
	}
	
	@Override
	public void haveLunch() {
		// ��� ���� ����
		// ������ ���� == ������ ���� + 50
		// count == �θ��� �ʵ�
		// superŰ���� �̿� getter / setter �ʵ忡 ����
		super.setCount(super.getCount() + 50);
	}
	
	@Override
		//
	public void haveDinner() {
		super.setCount(super.getCount() - 40);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
