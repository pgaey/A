package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 *  ���׿�����  : �� �����ڰ� 3��  => �� 3���� ������ 1���� �̷����(���ǽ� �������� ����)
	 *  
	 *  ���ǽ� : ������� ���� ������ ó���ϴ� ���
	 *  		������� ���� ��� ù��° ���� ó���ϰ�,
	 *   		������� ������ ��� �ι�° ���� ó���ϴ� ���
	 *   
	 *   
	 * [ ǥ����  ]
	 * 
	 * (���ǽ�)?  ������ true�� ��� �����  : ������ false�� ��� �����
	 *  
	 */
	
	public void method1() {
		// ����ڰ� �Է��� ���� ������� �ƴ��� �Ǻ� �� �׿� �´� ��� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		int num = sc.nextInt();
		
//		String result = (num > 0)? "���" : "����";
					  // ���ǽ� ? ���ǽ��� true�� ��� ����� : ���ǽ��� false�� ��� �����   => �����߻�. 0�� �Է��� ���� ������� ��
		
		String result = (num > 0)? "���" : (num == 0)? "0��" : "����";
		
		// 10	��   ���	��!!
		// -7	��   ����	��!!
		System.out.println(num + "�� " + result + "��!!");
		
	}
	
	public void method2() {
		
		// ¦��  / Ȧ�� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0)? "¦��" : "Ȧ��";
		
		System.out.println(num + "�� " + result + "�̴�!!");
	}
	
	public void method3() {
		
		//����ڿ��� �����ڸ� �ϳ� �Է¹޾Ƽ� �빮������ �ƴ��� �Ǻ�!!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ϳ��� �Է����ּ��� > ");
		char ch = sc.next().charAt(0);
		
		// 'A' ~ ch ~ 'Z'
		// 'a' ~ ch ~ 'z'
//		String result = (65 <= ch && ch <= 90)? "�빮��" : "�ҹ���";  	 =====>>>>>    'a'�� ����ȯ�� �̷����� ������ ���ڰ� �ƴ϶� ���ڸ� �Է��ؼ� �� �� ���� ����
		String result = ('a' <= ch && ch <= 'z')? "�빮��" : "�ҹ���";
		
		
		System.out.println(ch + "�� " + result + "�̴�!!");
		
	}
	

	public void method4() {
		
		// ���� 3���� �Է¹޾Ƽ� �� �Ȱ����� �Ȱ��� !! �ϳ��� �ٸ��ٸ� �ٸ��� !!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է����ּ���");
		char a = sc.next().charAt(0);
		
		System.out.println("�� ��° ���� �Է����ּ���");
		int b = sc.next().charAt(0);
		
		System.out.println("�� ��° ���� �Է����ּ���");
		char c = sc.next().charAt(0);
		
		
		String result = (a == b && b == c)? "�Ȱ���" : "�ٸ���";
		
		System.out.println(result);
				
	}
	
	
	
	
	
	
	
	
	
	
	
}
