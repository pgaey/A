package com.kr.example.practice2.run;

import com.kr.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Product pd = new Product();
		
		pd.setPName("������");
		pd.setPrice(100);
		pd.setBrand("����");
		
		pd.information();
	}

}
