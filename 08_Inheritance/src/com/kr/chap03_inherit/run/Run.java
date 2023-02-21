package com.kr.chap03_inherit.run;

import com.kr.chap03_inherit.model.vo.Ship;
import com.kr.chap03_inherit.model.vo.Stroller;
import com.kr.chap03_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		
		// 이름, 연비, 종류, 프로펠라 길이
		Ship ship = new Ship("타이타닉", 2.0, "크루즈", 800);
		Stroller stroller = new Stroller("스토키", 0.0, "유모차", 2290000);
		Vehicle v = new Vehicle("탈 것", 1, "뭘까");
		
		v.howToMove();
		ship.howToMove();
		stroller.howToMove();
		
		System.out.println(v);	
		System.out.println(v.toString()); // v 라고만 적으면 .toString 이 자동으로 붙음(생략가능이라는 뜻)
		// toString() : 해당 객체의 풀 클래스명 + @ + 해당 객체의 주소값(16진수형태)형태로 반환 : 문자열
		
		System.out.println(ship);
		System.out.println(stroller);
	}

}
