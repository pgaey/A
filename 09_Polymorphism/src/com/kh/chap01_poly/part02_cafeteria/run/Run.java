package com.kh.chap01_poly.part02_cafeteria.run;

import com.kh.chap01_poly.part02_cafeteria.controller.CaffetteriaController;
import com.kh.chap01_poly.part02_cafeteria.model.vo.BeefBurger;
import com.kh.chap01_poly.part02_cafeteria.model.vo.CheeseBurger;
import com.kh.chap01_poly.part02_cafeteria.model.vo.Hamburger;
import com.kh.chap01_poly.part02_cafeteria.model.vo.ShrimpBurger;

public class Run {

	public static void main(String[] args) {
		
		// 햄버거
		// 1. 다형성을 적용하지 않음
		// 객체를 생성 : 만든 햄버거를 담을 필드들이 메모리영역에 올라감
		
		
//		HamburgerController hc = new HamburgerController();
//		
//		hc.insertMenu(new BeefBurger("소고기버거", 9000, false, 180));
//		hc.insertMenu(new CheeseBurger("치즈버거", 8000, false, 3));
//		hc.insertMenu(new ShrimpBurger("새우버거", 7000, false, "독도"));
//		
//		
//		// 온장고에 있는 햄버거들을 조회하고 싶다.
//		BeefBurger beefburger = hc.selectBeef();
//		CheeseBurger cheeseburger = hc.selectCheese();
//		ShrimpBurger shrimpburger = hc.selectShrimp();
//		
//		System.out.println(beefburger/*.toString*/);
//		System.out.println(cheeseburger);
//		System.out.println(shrimpburger);
		
		
		// 2. 다형성을 적용!
		CaffetteriaController cc= new CaffetteriaController();
		cc.insertMenu(new BeefBurger("소고기", 2000, false, 200));
		cc.insertMenu(new CheeseBurger("치즈", 3000, false, 3));
		cc.insertMenu(new ShrimpBurger("새우", 3000, false, "노르웨이"));
		
		BeefBurger beef = (BeefBurger)cc.selectMenu("소고기");
		CheeseBurger cheese = (CheeseBurger)cc.selectMenu("치즈");
		ShrimpBurger shrimp = (ShrimpBurger)cc.selectMenu("새우");
		
		// 햄버거 출력
		System.out.println(beef);
		System.out.println(cheese);
		System.out.println(shrimp);
		
		// 햄버거 전체 출력
		Hamburger[] hamburgers = cc.selectAll();
		System.out.println(hamburgers);
		
		System.out.println("------------------------------------");
		
		for(int i = 0; i < hamburgers.length; i++) {
			System.out.println(hamburgers[i]/*toString*/);
		}

		
		// CheeseBurger cs = (CheeseBurger)new BeefBurger("소고기", 2000, false, 200)); XXXXXXXXXXX 상속구조가 아님
		
		
		
		/*
		 * 다형성
		 * 
		 * 부모타입의 자료형으로 다양한 자식객체들을 모두 다룰 수 있음 
		 * 
		 * 메소드의 개수가 줄어듬 => 코드가 줆
		 * 부모타입의 객체배열로 자식객체를 사용가능 (반복문 사용가능)
		 * 소스코드가 줄어드니까 유지보수 용이해짐
		 * 
		 */
		
		
		
		
	}

	
	
	
	
	
	
}