package com.kh.chap01_poly.part02_cafeteria.controller;

import com.kh.chap01_poly.part02_cafeteria.model.vo.BeefBurger;
import com.kh.chap01_poly.part02_cafeteria.model.vo.CheeseBurger;
import com.kh.chap01_poly.part02_cafeteria.model.vo.ShrimpBurger;
	
// ���� ������ : ������ ���� ��
public class HamburgerController {
	// �ʵ��
	private ShrimpBurger shrimpburger;
	private BeefBurger beefburger;
	private CheeseBurger cheeseburger;
	
	// �����ں�
	public HamburgerController() {}
	
	// �޼ҵ��
	// ���� �ܹ��Ÿ� �߰����ִ� ���
	// ���� �޼ҵ�� => �����ε�
	// �Ű������� �ڷ����̳� ������ ������ �޶���Ѵ�.
	public void insertMenu(BeefBurger beefburger) {
		this.beefburger = beefburger;
	}
	public void insertMenu(ShrimpBurger shrimpburger) {
		this.shrimpburger = shrimpburger;
	}
	public void insertMenu(CheeseBurger cheeseburger) {
		this.cheeseburger = cheeseburger;
	}
	
	// �ܹ��Ű� ��������� ���� �ֳ� ~~~??
	// �����ε� ?? �Ұ��� !!
	public BeefBurger selectBeef() {
		return beefburger;
	}
	public ShrimpBurger selectShrimp() {
		return shrimpburger;
	}
	public CheeseBurger selectCheese() {
		return cheeseburger;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	