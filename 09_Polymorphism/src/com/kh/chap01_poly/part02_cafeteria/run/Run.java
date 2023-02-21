package com.kh.chap01_poly.part02_cafeteria.run;

import com.kh.chap01_poly.part02_cafeteria.controller.CaffetteriaController;
import com.kh.chap01_poly.part02_cafeteria.model.vo.BeefBurger;
import com.kh.chap01_poly.part02_cafeteria.model.vo.CheeseBurger;
import com.kh.chap01_poly.part02_cafeteria.model.vo.Hamburger;
import com.kh.chap01_poly.part02_cafeteria.model.vo.ShrimpBurger;

public class Run {

	public static void main(String[] args) {
		
		// �ܹ���
		// 1. �������� �������� ����
		// ��ü�� ���� : ���� �ܹ��Ÿ� ���� �ʵ���� �޸𸮿����� �ö�
		
		
//		HamburgerController hc = new HamburgerController();
//		
//		hc.insertMenu(new BeefBurger("�Ұ�����", 9000, false, 180));
//		hc.insertMenu(new CheeseBurger("ġ�����", 8000, false, 3));
//		hc.insertMenu(new ShrimpBurger("�������", 7000, false, "����"));
//		
//		
//		// ����� �ִ� �ܹ��ŵ��� ��ȸ�ϰ� �ʹ�.
//		BeefBurger beefburger = hc.selectBeef();
//		CheeseBurger cheeseburger = hc.selectCheese();
//		ShrimpBurger shrimpburger = hc.selectShrimp();
//		
//		System.out.println(beefburger/*.toString*/);
//		System.out.println(cheeseburger);
//		System.out.println(shrimpburger);
		
		
		// 2. �������� ����!
		CaffetteriaController cc= new CaffetteriaController();
		cc.insertMenu(new BeefBurger("�Ұ��", 2000, false, 200));
		cc.insertMenu(new CheeseBurger("ġ��", 3000, false, 3));
		cc.insertMenu(new ShrimpBurger("����", 3000, false, "�븣����"));
		
		BeefBurger beef = (BeefBurger)cc.selectMenu("�Ұ��");
		CheeseBurger cheese = (CheeseBurger)cc.selectMenu("ġ��");
		ShrimpBurger shrimp = (ShrimpBurger)cc.selectMenu("����");
		
		// �ܹ��� ���
		System.out.println(beef);
		System.out.println(cheese);
		System.out.println(shrimp);
		
		// �ܹ��� ��ü ���
		Hamburger[] hamburgers = cc.selectAll();
		System.out.println(hamburgers);
		
		System.out.println("------------------------------------");
		
		for(int i = 0; i < hamburgers.length; i++) {
			System.out.println(hamburgers[i]/*toString*/);
		}

		
		// CheeseBurger cs = (CheeseBurger)new BeefBurger("�Ұ��", 2000, false, 200)); XXXXXXXXXXX ��ӱ����� �ƴ�
		
		
		
		/*
		 * ������
		 * 
		 * �θ�Ÿ���� �ڷ������� �پ��� �ڽİ�ü���� ��� �ٷ� �� ���� 
		 * 
		 * �޼ҵ��� ������ �پ�� => �ڵ尡 ��
		 * �θ�Ÿ���� ��ü�迭�� �ڽİ�ü�� ��밡�� (�ݺ��� ��밡��)
		 * �ҽ��ڵ尡 �پ��ϱ� �������� ��������
		 * 
		 */
		
		
		
		
	}

	
	
	
	
	
	
}