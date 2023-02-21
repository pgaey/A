package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

// 해결방법
// 1. 메소드를 완성시켜주든가
// 2. 얘도 추상클래스로 만들어주든가

public class VolleyBall extends Sports {
	
	@Override
	public void rule() {
		System.out.println("네트에  몸이 닿으면 큰일남");
	}
	
}
