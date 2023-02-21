package com.kh.chap01_poly.part02_cafeteria.controller;

import com.kh.chap01_poly.part02_cafeteria.model.vo.BeefBurger;
import com.kh.chap01_poly.part02_cafeteria.model.vo.CheeseBurger;
import com.kh.chap01_poly.part02_cafeteria.model.vo.ShrimpBurger;
	
// 종각 버거집 : 다형성 적용 전
public class HamburgerController {
	// 필드부
	private ShrimpBurger shrimpburger;
	private BeefBurger beefburger;
	private CheeseBurger cheeseburger;
	
	// 생성자부
	public HamburgerController() {}
	
	// 메소드부
	// 만든 햄버거를 추가해주는 기능
	// 같은 메소드명 => 오버로딩
	// 매개변수의 자료형이나 개수나 순서가 달라야한다.
	public void insertMenu(BeefBurger beefburger) {
		this.beefburger = beefburger;
	}
	public void insertMenu(ShrimpBurger shrimpburger) {
		this.shrimpburger = shrimpburger;
	}
	public void insertMenu(CheeseBurger cheeseburger) {
		this.cheeseburger = cheeseburger;
	}
	
	// 햄버거가 만들어진게 뭐가 있나 ~~~??
	// 오버로딩 ?? 불가능 !!
	public BeefBurger selectBeef() {
		return beefburger;
	}
	public ShrimpBurger selectShrimp() {
		return shrimpburger;
	}
	public CheeseBurger selectCheese() {
		return cheeseburger;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	