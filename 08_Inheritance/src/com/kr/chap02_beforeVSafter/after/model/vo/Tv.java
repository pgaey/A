package com.kr.chap02_beforeVSafter.after.model.vo;

public class Tv extends Product {
	
	// 필드부
	private int inch;
	
	
	// 생성자부
	public Tv() {}
	
	
	// 모든 필드에 대한 매개변수가 있는 생성자
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		// 부모가 가지고 있는 필드나 메소드에 접근하려고 할 때는 ?? super.
		// super.brand = brand; private이니 접근불가
		// 해결방법 1. 부모의 private -> protect로 바꿔준다.
		// 해결방법 2. 부모의 setter메소드를 호출해서 초기화한다. super.set필드이름();
		// 해결방법 3. 부모의 모든 매개변수가 있는 생성자를 super키워드를 호출해서 초기화한다.
		super(brand, pCode, pName, price);
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
