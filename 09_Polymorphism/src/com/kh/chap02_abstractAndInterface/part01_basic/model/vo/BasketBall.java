package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class BasketBall extends Sports{
	
	@Override
	public void rule() {
		System.out.println("공 잡고 세 번 이상 걸으면 안됌");
	}
	
	
	
}
