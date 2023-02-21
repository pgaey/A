package com.kr.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
	
	private int[] lotto = new int[6];
	
	{
		int i = 0;
		while(i < 6) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			i++;
		}
	}

	public Lotto() {}
	
	
	
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	public int[] getLotto() {
		return lotto;
	}
		
	
	public void information() {
		System.out.println(Arrays.toString(lotto));
	}
	
	
	
	
}
