package com.kh.chap01_poly.part02_cafeteria.controller;

import com.kh.chap01_poly.part02_cafeteria.model.vo.Hamburger;

// 종각에 새로차린 좋은 햄버거집(다형성 적용)
public class CaffetteriaController {
	
	// 필드부
	private Hamburger[] hamburgers = new Hamburger[3];
	
	// 생성자부
	public CaffetteriaController() {}

	
	
	// 메소드부
	// 재고추가 메소드
	// 1. 메뉴를 추가할 때 인덱스 번호도 같이 받는다.
	// 2. 그냥 메뉴만 받고 비어있는 인덱스에 추가한다. << 요 방법으로
	public void insertMenu(Hamburger any) {
		for(int i = 0; i < hamburgers.length; i++) {
			if(hamburgers[i] == null) {
				hamburgers[i] = any;
				break;
			}
		}
	}
	// 2-1번 방법
//	// 햄버거 이름을 받아서 햄버거 하나를 조회해주는 메소드
//	public Hamburger selectMenu(String name) {
//		Hamburger hamburger = null;
//		for(int i = 0; i < hamburgers.length; i++) {
//			if(name.equals(hamburgers[i].getName())) {
//				hamburger = hamburgers[i];
//			}
//		}
//		return hamburger;
//	}
	
	// 2-2번 방법
	// 햄버거 이름을 받아서 햄버거 하나를 조회해주는 메소드
		public Hamburger selectMenu(String name) {
			
			Hamburger hamburger = null;
			for(int i = 0; i < hamburgers.length; i++) {
				if(name.equals(hamburgers[i].getName())) {
					return hamburgers[i];
				}
			}
			return null;
		}
	
	
	// 햄버거 전체를 조회해주는 메소드
		public Hamburger[] selectAll() {
			return hamburgers;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
