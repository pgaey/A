package com.kr.chap03_inherit.run;

import com.kr.chap03_inherit.model.vo.Ship;
import com.kr.chap03_inherit.model.vo.Stroller;
import com.kr.chap03_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		
		// �̸�, ����, ����, ������� ����
		Ship ship = new Ship("Ÿ��Ÿ��", 2.0, "ũ����", 800);
		Stroller stroller = new Stroller("����Ű", 0.0, "������", 2290000);
		Vehicle v = new Vehicle("Ż ��", 1, "����");
		
		v.howToMove();
		ship.howToMove();
		stroller.howToMove();
		
		System.out.println(v);	
		System.out.println(v.toString()); // v ��� ������ .toString �� �ڵ����� ����(���������̶�� ��)
		// toString() : �ش� ��ü�� Ǯ Ŭ������ + @ + �ش� ��ü�� �ּҰ�(16��������)���·� ��ȯ : ���ڿ�
		
		System.out.println(ship);
		System.out.println(stroller);
	}

}
