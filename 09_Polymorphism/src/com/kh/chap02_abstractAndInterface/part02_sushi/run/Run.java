package com.kh.chap02_abstractAndInterface.part02_sushi.run;

import com.kh.chap02_abstractAndInterface.part02_sushi.mode.vo.JapaneseFoodI;
import com.kh.chap02_abstractAndInterface.part02_sushi.mode.vo.Roll;
import com.kh.chap02_abstractAndInterface.part02_sushi.mode.vo.Sushi;

public class Run {

	public static void main(String[] args) {
		
		// JapaneseFood jf = new JapaneseFood();
		// �Ͻ�Ŭ���� �߻�Ŭ�����̹Ƿ� ��ü ���� �Ұ�
		/*
		JapaneseFood sushi = new Sushi("�����ʹ�", 2500, 200, "����");
		JapaneseFood roll = new Roll("����", 3000, 200);
		
		System.out.println(sushi);
		System.out.println(roll);
		
		// ���ɸ޴�����
		sushi.haveLunch();	// ��� �þ
		roll.haveLunch();	// ������ �پ��
		
		System.out.println(sushi);
		System.out.println(roll);
		
		// ����޴�����
		sushi.haveDinner();
		roll.haveDinner();
		
		System.out.println(sushi);
		System.out.println(roll);
		*/
		
		// JapaneseFoodI j = new JapaneseFoodI();
		
		JapaneseFoodI sushi = new Sushi("����", 4000, 200, "����");
		JapaneseFoodI roll = new Roll("����", 4000, 200);
		sushi.haveLunch();
		sushi.haveDinner();
		roll.haveLunch();
		roll.haveDinner();
		
		
		
		
		
	}

}
