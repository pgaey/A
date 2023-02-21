package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	public void method1() {
		// ������ ����� ^^....

		/*
		System.out.println("������ ����� ^^....");
		System.out.println("������ ����� ^^....");
		System.out.println("������ ����� ^^....");
		System.out.println("������ ����� ^^....");
		System.out.println("������ ����� ^^....");
		*/
		// ���� Ƚ���� �󸶵��� ������ ���� !!
		// 1200��, 12����, 120����...
		
		for(int i = 0; i < 12; i++) {
			System.out.println("������ ����� ^^....");
		}
	}
	/*
	 * for��
	 * 
	 * for() {
	 * 
	 * }
	 * 
	 * �Ұ�ȣ �ȿ� �ݺ��� �����ϴ� �κ��� �ְ�,
	 * �ʱ��; ���ǽ�; ������ �������� �̷������.
	 * ;; ���� �����ݷ����� �����Ѵ�.
	 * 
	 * [ ǥ����  ]
	 * 		//�ݺ� Ƚ���� �����ϴ� ��ҵ�
	 * for(�ʱ��; ���ǽ�; ������){
	 * 	�ݺ������� �����Ű���� �ϴ� �ڵ�
	 * }
	 * 
	 * - �ʱ�� : �ݺ����� ���۵� ��  "�ʱ⿡ �� �ѹ��� ����"�� ����
	 * 		        �ݺ������� ����� ������ �����ϰ� �ʱ�ȭ�ϴ� ����	=> int i = 0;		// �����
	 * 
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 * 			���ǽ��� true�� ��� �ݺ��� ����
	 * 			���ǽ��� false�� ��� �ݺ����� ���߰� ��������	=> i < 10;
	 * 
	 * - ������ : "�ݺ����� �����ϴ� ���� ��"�� ������Ű�� ����
	 * 			���� �ʱ�Ŀ��� ����� ������ ������ ������ �ۼ�
	 * 			�̶�, ���� ���������ڰ� �ַ� ���� 	=> i++
	 * 
	 */
	
	public void method2() {
		
		 // ������ ���ڿ��� �ƴ� �� �� �޶����� ��°���� Ȯ���غ���!
		/*
		for(int i = 1; i <= 3; i++) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i + 1);
		}
		*/
		
		// i���� 1�������� 5�� ������������ 1�� ����
		for(/*1*/int i = 1; /*2*/i <=5; /*4*/i++) { // �ʱ���� �ѹ���.
			/*3*/System.out.println(i + "�� �ݺ�");	// ���� : 1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 ... 
		}											// 2�� �������� true ��� �ݺ�. false ���  for���� ����
		
		// �����ϴ� ��
		// i���� 10�������� 6���� ũ�ų� ���ٸ� 1�� �����ϸ鼭 �ݺ� ����
		// 10 9 8 7 6
		for(int i = 10; i >=6; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("-----------------------------------------");
		
		for(int i = 1; i <= 21; i += 2 ) {
			System.out.println("i : " + i);
		}
	}
	
	public void method3() {
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		/*
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		*/
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		
		// for�� �ȿ� if�� ����!
		
		for(int i = 0; i < 30; i++) {
			// ������� : X��° �ݺ��Դϴ�!! (���� 1����!!)
			
			System.out.println((i+1) + "��° �ݺ��Դϴ�");
			
			// 10��° �ݺ����� �� 10 20 30
			// (i + 1) == 10 || (i + 1) == 20 || (i + 1) == 30
			// (i + 1) % 10 == 0
			if((i + 1) % 10 == 0) {
				System.out.println("��");
			
			}
		}
	}
	
	// ������
	// ��������� ���� �Է¹޾Ƽ�
	// �������� ����غ���!!
	// �޼ҵ� �̸� : gugudan()
	
	public void gugudan() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �ñ��ϴ�?");
		int num = sc.nextInt();

		System.out.println(num + "��");
		
		if(0 < num && num < 10) {
			for(int i = 0 ; i < 10; i++) {
//				System.out.println(num + " X " + i + "=" + (num * i));
				System.out.printf("%d X %d = %d\n", num, i, (num*i));
			}
		} else {
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
