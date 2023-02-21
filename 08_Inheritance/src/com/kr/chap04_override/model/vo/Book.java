package com.kr.chap04_override.model.vo;

public class Book /*extends Object */{
	
	// 모든 클래스의 최상위 부모클래스는 Object -> 생략가능 (내가 안쓰면 자바가 알아서 붙여줌)
	
	// 필드
	// 제목, 가격
	
	private String title;
	private int price;
	
	public Book() {
		/*super();*/
	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	
	public void setTitle(String title) {
		/*return*/this.title = title;
	}
	public void setPrice(int price) {
		/*return*/this.price = price;
	}
	
	 			// @이라고 시작하는 걸 "어노테이션"이라고 부름, 일종의 기능을 가진 주석	// 사용이유 1. 오버라이딩 한 거 알아보려고 
	@Override														// 		 2.													
	public String toString() {		//toString 오버라이딩
		return "책이름 : " + title + " / 가격 : " + price;
	}
	/*
	 * 오버라이딩(Overriding)
	 * 
	 * - 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의(재작성) 하는 것
	 * - 부모클래스가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 * - 자식클래스의 오버라이딩 된 메소드가 우선권을 가져서 호출된다.
	 * 
	 * 오버라이딩의 성립조건
	 * 1. 부모메소드의 메소드명과 동일할 것
	 * 2. 매개변수의 자료형, 개수, 순서가 동일(매개변수명과는 무관)
	 * 3. 반환형이 동일
	 * 모든 조건을 갖춰야만 가능
	 * 
	 * => 규약의개념
	 * 1. 오버라이딩한 메소드에는 @Override 애노테이션(어노테이션)을 붙여주자
	 * 2. 부모메소드의 접근제한자보다 공유범위가 같거나 넓어야 함
	 * 
	 * @Override
	 * 애노테이션(annotation)
	 * 일종의 주석
	 * - 생략 가능
	 * 		=> 명시하지 않아도 부모메소드와 형태가 같다면 오버라이딩 된 것으로 판단
	 * 		=> 실수를 줄이자!
	 * 		=> 누가봐도 오버라이딩
	 * 
	 * 개발자들끼리의 약속
	 * 생략이 가능하지만 약속을 안지키면 혼나기 때문에 꼭 작성하는 습관을 들이자!
	 */
	
	
	
}
