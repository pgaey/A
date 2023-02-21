package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Soccer extends Sports {
	
	@Override
	public void rule() {
		System.out.println("공을 손으로 잡으면 혼남");
	}
	
}
