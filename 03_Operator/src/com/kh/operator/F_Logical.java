package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	
	/*
	 * �� ������ : �� ���� ������ �����ϴ� ������
	 * 
	 * [ ǥ����  ]
	 * 
	 * ���� 	 �������� 	  ����   =>  ������� ����
	 * 
	 * ����
	 * 
	 * 1. AND������  : ����  && ���� 
	 * ���װ� ������ ���� ��� true���߸� ���� ����� true
	 * 
	 * 2. OR������  : ���� || ����
	 * ���װ� ������ �� �� �ϳ��� true�̸� ���� ����� true
	 */
	
	// AND
	public void method1() {
		
		// ����ڰ� �Է��� ���� ���� ��� �̸鼭(�̰�) ¦������ Ȯ��
		// 				num > 0
		//								num % 2 == 0
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� !");
		int num = sc.nextInt();
		
		
		boolean result = (num > 0) && (num % 2 == 0);
		//				����ڰ� �Է��� ������ 0���� ũ�� 2�� ������ �� �������� 0�ΰ���?
		// && �ǹ� : ~~�̸鼭, ~~�̰�, �׸���
		
		System.out.println("����ڰ� �Է��� ������ ����θ鼭 ¦���ΰ���? : " + result);
	}
	
	
	public void method2(){
		// ����ڿ��� �������� �Է¹޾� 1�̻� 100�������� Ȯ���غ��� !
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� !");
		int num = sc.nextInt();
		
		boolean result = (1 <= num ) && (num <= 100);		// (1 <= num <=100)�� ����� �� ����.        num >= 1, num <= 100 ���� ������ ���� ����
//						  1 <=       num     <= 100		  
		//		   num�� 1���� ũ�ų� ���� "�׸���" num�� 100���� �۰ų� ����?
		
		System.out.println("����ڰ� �Է��� ������ 1�̻� 100�����ΰ���? : " + result);
	}
	
	// OR
	public void method3() {
		
		// ����ڰ� �Է��� ���� 'A' �Ǵ� 'a'���� Ȯ��!
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���ڸ� �Է����ּ��� > ");
		char ch = sc.next().charAt(0);      // char ch = sc.next() ������ �ϸ� next()�� ���ڿ��̶� �� ���ڸ� ���� ���� ���� ������ charAT()�߰�.  ()�ȿ� 0�� 1��° ����
		
		// index : ����   **0���� ����
		
		// System.out.println(ch);
		
		// == �񱳿����ڴ� �ǿ����� == ����
		// ���� ������ ��� �񱳿����� �����Ѱ�? �����ϴ�
		// ��? int������ �ڵ�����ȯ�� �Ǳ� ������(int)
		
		boolean result = ('a' == ch) || ('A' == ch); 
		// || : ~~�̰ų�, �Ǵ�
		
		System.out.println("����ڰ� �Է��� ���� ���ĺ� A�Ǵ� a�Դϱ�?? " + result);
		
//		boolean result1 = (65 <= ch) && (ch <= 90);
//		System.out.println("�빮�� �Դϱ�? : " + result1);
	}
	
	
		/*
		 *  && : �� ���� ������ ��� true�� �� true
		 *  
		 *  true && true : true
		 *  true && false : false
		 *  false && true : false
		 *  false && false : true
		 *  
		 *  || : �� ���� ���� �� �ϳ��� true�̸� true
		 *  
		 *  true || true : true
		 *  true || false : true
		 *  false || true : true
		 *  false || false : true
		 */
	
	public void method4() {
		
		int num = 10;
		
		boolean result = false && (num > 0);
		
		// Deadcode : ���� �񱳿��� ������ ������� ����
		// ������ ���°� �ƴ����� ���� ������� false���ٵ� �� �ڵ�� �� ����????
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
