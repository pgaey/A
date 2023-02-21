package com.kr.chap02_beforeVSafter.after.run;

import com.kr.chap02_beforeVSafter.after.model.vo.Desktop;
import com.kr.chap02_beforeVSafter.after.model.vo.SmartPhone;
import com.kr.chap02_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		
		// Product p = new Product();
		// SmartPhone sp = new SmartPhone();
//		SmartPhone sp = new SmartPhone("LG", "랜덤코드", "베가", 5000, "kt");
//		sp.setBrand("LG");
//		System.out.println(sp.information());
		// 내가 호출하고자하는 메소드가 해당 클래스에 존재하지 않으면
		// 자동으로 해당 클래스의 부모클래스에 있는 메소드로 호출함!
		
		Tv tv = new Tv("LG", "몰라", "엘지티비", 500, 80);
		System.out.println(tv.information());
		
		Desktop dt = new Desktop("데스커", "몰라", "모션데스크1", 400000, false);
		System.out.println(dt.information());
		
		// 자식클래스에 오버라이딩(부모클래스의 메소드를 재정의) 했을 경우
		// 자식클래스에 오버라이딩 된 메소드가 우선권을 가져서 호출이된다!!!!!!
		
		/*
		 * 상속의 장점
		 * 
		 * - 중복된 코드를 공통으로 관리
		 * => 새로운 코드를 작성하거나 수정할 때 용이하다.
		 * => 보다 적은 양의 코드로 새로운 클래스를 만들 수 있다.
		 * 
		 * - 프로그램의 생산성과 가독성과 유지보수에 크게 기여!
		 * 
		 * 상속의 특징!
		 * 
		 * - 클래스간의 다중상속이 불가능하다!!(단일 상속만 가능!!)
		 * 
		 * - 명시되어있지는 않지만 모든 클래스는 Object클래스의 후손이다.
		 * 					(내가 만든 클래스, 자바에서 제공하는 클래스)
		 * 
		 * 
		 * => Object클래스에 있는 메소드를 호출해서 쓸 수 있음
		 * => Object클래스에 있는 메소드가 마음에 안들면? 오버라이딩을 통해 재정의 가능
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}