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
		// 밥알 개수 증가
		// 수정할 개수 == 기존의 개수 + 50
		// count == 부모의 필드
		// super키워드 이용 getter / setter 필드에 접근
		super.setCount(super.getCount() + 50);
	}
	
	@Override
		//
	public void haveDinner() {
		super.setCount(super.getCount() - 40);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
