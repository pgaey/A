package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {

	/*
	 * ��� ������ => ���� ������, �켱������ �Ϲ� ���� ����� ����  ex) x % ���� + - ����
	 */
	
	// + : ����
	// - : ����
	// * : ����
	// / : ������
	// % : ��ⷯ(Modular) => ������������ �������� ���� 
	
	public void method1() {
		
		int num1 = 10;				// int�� 4Byte 32bit
		int num2 = 3;
		
		System.out.println("num1 : " + num1 + "\nnum2 : " + num2);
		
		System.out.println("num1 + num2 : " + num1 + num2);
				// ������� : "num1 + num2 : " + "10" + "3" => "num1 + num2 : 103"
		System.out.println("num1 + num2 : " + (num1 + num2));
		// (num1 + num2) ��ȣ�� ������� 13�̶�� ������� ����!
		// ���� �ʰ� �����ϸ� String(���ڿ�)�� �ν��ϱ� ������
		// "10" + "3" ��������� "103"�� ���� !!
		
//		System.out.println("num1 - num2 : " + num1 - num2);
						// "num1 - num2 : 10" - 3 
		System.out.println("num1 - num2 : " + (num1 - num2));
		
		// ������ ��� ��ȣ�� ����������
		// ���ڿ��� num1�� �ϳ��� ���� �� ������ ���� ������ ���� �߻�!
		
		System.out.println("num1 X num2 : " + (num1 * num2));
		System.out.println("num1 �� num2 : " + num1 / num2);
		System.out.println("num1 % num2 : " + (num1 % num2));
		
		// *, /, % �켱������ +, -���� ���� ������ ���� �ʾƵ� ���� ����
		// ��, �������� ���� ��ȣ�� ����ϴ� ���� ����
		
		// * Ư�����̽� 
		
		// System.out.println(5/0);
		// ������ 0���� ���� �� ����!
		// ArithmeticExceptin : / zero
		
	}
	
	// ��̳� ���� �����ֱ� ���α׷�
	
	// �޼ҵ�� : presentToChild()
	// �Է¹��� �� : 1. ����� �ο� ��
	// 	  	     2. ���� ���� 					-> ��ĳ��
	
	// 1�δ� ���� �� �ִ� ������ ���� : ���� ����  / ��� ��
	// ���� ������ �� : ��������  % ��� �� 			-> ��� ������
	
	// ��� ����
	// ��� 1�δ� ���� �� �ִ� ������ ���� : X��
	// ���� ������ ���� : X��						-> ��¹�

	
	public void presentToChild() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �ο� ���� �Է����ּ��� : ");		
		int childNum = sc.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���  : ");
		int presentNum = sc.nextInt();
		
		
		System.out.println("��� 1�δ� ���� �� �ִ� ������ ������  " + (presentNum / childNum) + "�� �Դϴ�.");
		System.out.println("���� ������ ������ " + (presentNum % childNum) + "�� �Դϴ�.");
//		System.out.println("��� 1�δ� ���� �� �ִ� ������ ������  " + (presentNum / childNum) + "�� �Դϴ�." +"\n���� ������ ������ " + (presentNum % childNum) + "�� �Դϴ�." );
//		System.out.printf("��� 1�δ� ���� �� �ִ� ������ ������  " + "%d�� �Դϴ�." +"\n���� ������ ������ " + "%d�� �Դϴ�.", (presentNum / childNum) , (presentNum % childNum));

	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
