package com.kh.chap06.run;

import com.kh.chap06.controller.MethodController1;
import com.kh.chap06.controller.MethodController2;

public class Run {

	public static void main(String[] args) {
		
		MethodController1 mc1 = new MethodController1();
		
//		mc1.method1();
//		System.out.println(mc1.method2());
//		String na = mc1.method2();
//		System.out.println(na);
//		
//		mc1.method3();
//		String na3 = mc1.method3();
//		System.out.println(na3);
		
//		mc1.method4(1, 10);
		
//		mc1.method5(2);
//		int a = mc1.method5(2);
//		System.out.println(a);
		
//		mc1.abc(mc1);		//	���� ����   
//							// ȣ��, �Ű������� stack �޸𸮿� ����
							// ������ �Ϸ��� stack �޸𸮿� �ö󰡾���
							// �׷��� �޼ҵ� ����� stack ������ abc ����� ��
		
		
////		-------
//		-----------------------------------------------------------
//		
//		OverloadingController oc = new OverloadingController();
//		
//		oc.test();
//		oc.test(2);
//		oc.test(2, "a");
//		oc.test("a", 2);
//		oc.test(2, 2);
//		oc.test(2, 2, "asd");
		
		
//		------------------------------------------------------------
		
		// static : ��ü�� �������� �ʾƵ� ��� ����
		// Math.random():
		// [ ǥ����  ] ǮŬ�������, �޼ҵ�ĺ���();
		
//		MethodController2.method1();
//		String str = MethodController2.method2();
//		System.out.println(MethodController2.method2());
//		MethodController2.method3("�̸�");
//		
//		
		System.out.println(MethodController2.method4("�̸�"));
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
