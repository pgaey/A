package com.kr.chap01_beforeVSafter.before.run;

import com.kr.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kr.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kr.chap01_beforeVSafter.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		// Desktop 객체를 생성
		// brand, pCode, pName, price, allInOne
		Desktop desktop = new Desktop("조립", "1234", "마이컴", 120000, false);
		
		// SmartPhone 객체를 생성
		// brand, pCode, pName, price, mobileAgency
		SmartPhone smartPhone = new SmartPhone("LG", "v-01", "베가", 120000, "LG");
		
		// Tv 객체를 생성
		// brand, pCode, pName, price, inch
		Tv tv = new Tv("LG", "n-tv", "나노셀TV", 8000000, 80);
		
		System.out.println(desktop.information());
		System.out.println(smartPhone.information());
		System.out.println(tv.information());
		
		/*
		 * 매 클래스마다 중복된코드들을 하나하나 기술하게 되면
		 * 코드의 수정과 같은 유지보수를 할 경우 전부 한땀한땀 찾아서 수정해야하는 번거로움이 생김!!
		 * 
		 * 상속이라는 개념을 적용시켜서
		 * 매 클래스마다 중복된 필드, 메소드들을
		 * 단 하나의 클래스(부모클래스)로 만들어놓고, 정의를 해두고
		 * 해당 부모클래스의 속성, 행위를 가져다 쓰는 형태로 진행
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
	}

}