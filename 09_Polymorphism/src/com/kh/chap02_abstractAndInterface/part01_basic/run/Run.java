package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Soccer;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.VolleyBall;

public class Run {
	
	public static void main(String[] args) {
		
		Soccer soccer = new Soccer();
		soccer.rule();
		
		BasketBall basketball = new BasketBall();
		basketball.rule();
		
		VolleyBall volleyball = new VolleyBall();
		volleyball.rule();
		
		// �߻�Ŭ������ ��ü ���� �Ұ�!!!!!
		// Ŭ������ �̿ϼ� �Ǿ��� ����!
//		Sports sports = new Sports();
//		sports.rule();
		
//		Sports s = new Soccer(); // 
		
		// ��ü �迭
		Sports[] arr = new Sports[3];
		arr[0] = new Soccer();
		arr[1] = new BasketBall();
		arr[2] = new VolleyBall();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i].rule();
		}
		
		
		
		
		
		
	}
	
}
