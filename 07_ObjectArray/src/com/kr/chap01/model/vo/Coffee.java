package com.kr.chap01.model.vo;

public class Coffee {
	
	// [ 필드부  ] : 사이즈, 가격, 이름, 원두
	private String coffeeName;
	private int price;
	private String bean;
	private String size;
	
	
	// [ 생성자부  ] : 
	// 기본 생성자
	// 이름, 가격, 원두
	// 모든 필드를 매개변수로 갖고 있는 생성자
	
	public Coffee () {}
	
	public Coffee(String coffeeName, int price, String bean) {
		this.coffeeName = coffeeName;
		this.price = price;
		this.bean = bean;
	}
	
	public Coffee(String coffeeName, int price, String bean, String size) {
		this(coffeeName, price, bean);		// 	흐름 제일 위에 적어주어야함		19행 생성자 this. 입력받음 -> 20, 21, 22행과 같은 문장을 생략
		this.size = size;
	}
	
	
	
	// [ 메소드부  ] : 
	// getter()/setter()/information() : String
	public String getCoffeeName() {
		return coffeeName;
	}
	public int getPrice() {
		return price;
	}
	public String getBean() {
		return bean;
	}
	public String getSize() {
		return size;
	}
	
	
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBean(String bean) {
		this.bean = bean;
	}
	public void setSize(String size) {
		this.size = size;
	}

	
	public String information() {
		return "이름 : " + coffeeName + " 가격 : " + price + " 원두 : " + bean + " 사이즈 : " + size;
	}
	
}
