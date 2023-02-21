package com.kh.chap01_poly.part02_cafeteria.controller;

import com.kh.chap01_poly.part02_cafeteria.model.vo.Hamburger;

// ������ �������� ���� �ܹ�����(������ ����)
public class CaffetteriaController {
	
	// �ʵ��
	private Hamburger[] hamburgers = new Hamburger[3];
	
	// �����ں�
	public CaffetteriaController() {}

	
	
	// �޼ҵ��
	// ����߰� �޼ҵ�
	// 1. �޴��� �߰��� �� �ε��� ��ȣ�� ���� �޴´�.
	// 2. �׳� �޴��� �ް� ����ִ� �ε����� �߰��Ѵ�. << �� �������
	public void insertMenu(Hamburger any) {
		for(int i = 0; i < hamburgers.length; i++) {
			if(hamburgers[i] == null) {
				hamburgers[i] = any;
				break;
			}
		}
	}
	// 2-1�� ���
//	// �ܹ��� �̸��� �޾Ƽ� �ܹ��� �ϳ��� ��ȸ���ִ� �޼ҵ�
//	public Hamburger selectMenu(String name) {
//		Hamburger hamburger = null;
//		for(int i = 0; i < hamburgers.length; i++) {
//			if(name.equals(hamburgers[i].getName())) {
//				hamburger = hamburgers[i];
//			}
//		}
//		return hamburger;
//	}
	
	// 2-2�� ���
	// �ܹ��� �̸��� �޾Ƽ� �ܹ��� �ϳ��� ��ȸ���ִ� �޼ҵ�
		public Hamburger selectMenu(String name) {
			
			Hamburger hamburger = null;
			for(int i = 0; i < hamburgers.length; i++) {
				if(name.equals(hamburgers[i].getName())) {
					return hamburgers[i];
				}
			}
			return null;
		}
	
	
	// �ܹ��� ��ü�� ��ȸ���ִ� �޼ҵ�
		public Hamburger[] selectAll() {
			return hamburgers;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
