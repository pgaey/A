package com.kh.chap02_abstractAndInterface.part02_sushi.mode.vo;

public abstract class JapaneseFood {

	private String name;
	private int price;
	private int count;
	
	public JapaneseFood() {}
	public JapaneseFood(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public abstract void haveLunch();
	public abstract void haveDinner();
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "JapaneseFood [name = " + name + ", price = " + price + ", count = " + count;
	}
	
	
	
	
	
	
}
