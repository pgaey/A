package com.kh.chap02_abstractAndInterface.part02_sushi.mode.vo;

public class Roll extends JapaneseFood implements JapaneseFoodI{
	
	
	public Roll () {}
	public Roll (String name, int price, int count) {
		super(name, price, count);
	}
	
	
	@Override
	public void haveLunch() {
		super.setPrice(super.getPrice() - 2000);
	}
	
	@Override
	public void haveDinner() {
		super.setPrice(super.getPrice() + 2000);
	}
	
	
	
}
