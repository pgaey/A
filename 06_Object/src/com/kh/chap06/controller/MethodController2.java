package com.kh.chap06.controller;

public class MethodController2 {
	
	// static �޼ҵ�
	// 1.
	public static void method1() {
		System.out.println("�Ű������� ��ȯ���� �� �� ���� �޼ҵ��Դϴ�.");
	}
	
	// 2.
	public static String method2() {
		return "�Ű������� ������ ��ȯ���� �ִ� �޼ҵ��Դϴ�.";
	}
	
	// 3.
	public static void method3(String name) {
		System.out.println("�Ű������� �ְ� ��ȯ���� ���� �޼ҵ��Դϴ�.");
		System.out.println("��±��� �̸� : " + name);
	}
	
	// 4.
	public static String method4(String name) {
		System.out.println("�Ű������� ��ȯ���� �� �� �ִ� �޼ҵ��Դϴ�.");
		return name + "�� �ȳ��ϼ���";
	}
	
	
	
	
	
	
	
	
	
	
	
}
