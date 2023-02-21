package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

// 추상클래스
// [ 표현법  ]
// 접근제한자 abstract class 클래스 이름 {
// abstract 예약어 -> 추상클랫, 추상메소드를 선언할 때 붙임

/*
 * 추상메소드를 선언하는 순간 추상클래스로 정의해야함
 * abstract라는 키워드를 붙여서
 * 객체 생성이 불가능하다. 부모클래스 구실은 가능(다형성 적용이 가능)
 * 
 * 추상클래스 == 일반 필드 + 일반 메소드 + 추상메소드(생략가능)
 * 
 * => 추상메소드가 존재하지 않아도 추상클래스로 정의 가능
 * 
 * => 기술적으로 개발자가 판단했을 때 '이 클래스로는 객체 생성이 불가능해야한다'라고 생각이들면 추상클래스로 선언 가능
 * => 개념적으로 개발자가 판단했을 때 '해당 클래스가 아직 구체적으로 완벽하게 구현되지 않은 상태인 것 같다' 라는 생각이들면 추상클래스로 선언 가능
 */


public abstract class Sports {
	
	private int people;
	
	
	public Sports() {}
	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	// 추상메소드. abstract를 붙이는 순간  시작
	// 표현 법
	// 접근제한자 abstract 반환형 메소드식별자();
	// 추상메소드가 하나라도 들어가면 무조건 얘는 추상클래스가 되어야함
	// 추상클래스로는 객체생성자체가 불가
	public abstract void rule();
	
	
	@Override
	public String toString() {
		return "Sports [people = " + people + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
