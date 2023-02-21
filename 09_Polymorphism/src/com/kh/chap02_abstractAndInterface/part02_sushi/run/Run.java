package com.kh.chap02_abstractAndInterface.part02_sushi.run;

import com.kh.chap02_abstractAndInterface.part02_sushi.mode.vo.JapaneseFoodI;
import com.kh.chap02_abstractAndInterface.part02_sushi.mode.vo.Roll;
import com.kh.chap02_abstractAndInterface.part02_sushi.mode.vo.Sushi;

public class Run {

	public static void main(String[] args) {
		
		// JapaneseFood jf = new JapaneseFood();
		// 일식클래스 추상클래스이므로 객체 생성 불가
		/*
		JapaneseFood sushi = new Sushi("연어초밥", 2500, 200, "연어");
		JapaneseFood roll = new Roll("연어", 3000, 200);
		
		System.out.println(sushi);
		System.out.println(roll);
		
		// 점심메뉴제조
		sushi.haveLunch();	// 밥알 늘어남
		roll.haveLunch();	// 가격이 줄어듬
		
		System.out.println(sushi);
		System.out.println(roll);
		
		// 저녁메뉴제조
		sushi.haveDinner();
		roll.haveDinner();
		
		System.out.println(sushi);
		System.out.println(roll);
		*/
		
		// JapaneseFoodI j = new JapaneseFoodI();
		
		JapaneseFoodI sushi = new Sushi("연어", 4000, 200, "연어");
		JapaneseFoodI roll = new Roll("연어", 4000, 200);
		sushi.haveLunch();
		sushi.haveDinner();
		roll.haveLunch();
		roll.haveDinner();
		
		
		
		
		
	}

}
