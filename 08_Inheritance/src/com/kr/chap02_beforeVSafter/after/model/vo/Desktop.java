package com.kr.chap02_beforeVSafter.after.model.vo;


// 자식클래스 extends 부모클래스식별자
public class Desktop extends Product {
	
	// 부모로부터 상속받은 부분을 기술하지 않는다!! => 필드 한정
	// 단, 메소드는 가능! 상속을 받아서 재정의해서 사용할 경우!!	=> 오버라이딩
	
	// [필드부]
	private boolean allInOne;
	
	// [생성자부]
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}
	
	// [메소드부]
	// brand, pCode, pName, price : setter()/getter() == 작성하지 않아도 호출이 가능 왜? 상속받았으니까
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String information() {
		return super.information() + " / 올인원여부 : " + false ;		// 오버라이딩 : 재정의(덮어쓰기)
	}
	
//	public String information() {
//		return "brand : " + super.getBrand() + ....  // super.getter 사용
//	}			
	
	
	
	
	
	
	
	
	
	
	
	
	
}
