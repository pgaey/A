package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {
	/*
	 * break : break���� ������ ���� "���� ����� �ݺ���"�� ����������.
	 * 			�ش� break���� �����ִ� �ݺ��� "�Ѱ�"�� ��������!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * 
	 * * ���ǻ��� : switch�� �ȿ� break;�� �ٸ�����
	 * 			 switch�� ���ο� �ִ� break �ش� switch���� ���������� �뵵�� ��!!!
	 * 
	 */
	
	public void method1() {
		
		// �� �� �ݺ��ؼ� ���Ӱ� ������ (1~100)�� �����ؼ� ��� => �����ϰ�
		
		// 1. while(true)
		// 2. for(;;)
		
		// �ݺ��� �ϴٰ� ������ ������ ������ Ȧ���� ��� �ݺ��� �ߴܽ�Ű�� ����!
		
		for(;;) {
			int num = (int)(Math.random() * 100) + 1;
			if(num % 2 == 1) {
				System.out.println(num + "�ݺ���!");
				break;
			}
			System.out.println(num);
		} // break���� ����� �ݺ��� for�� ������
	}
	
	public void method2() {
		// �� �� ����ڿ��� ���ڿ��� �Է� ���� ��
		// �ش� ���ڿ��� ���̸� ����غ��� ~
		// ��, ����ڰ�"exit"�� �Է��� ��� �ݺ����� ���������� ���� ��.
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("���ڿ��� �Է����ּ��� > ");
			String str = sc.nextLine();
			
			// ����ڰ� �Է��� ���ڿ��� "exit"�� �����ϴٸ�
			if(str.equals("exit")) {
				System.out.println("������");
				break;
			}
			System.out.println("���ڼ� : " + str.length());
		}
	}
	
	// �� �� ����ڷκ��� ���ڸ� �Է¹ް�
	// ���࿡ �ش� ���ڰ� ������� " ���α׷��� �����մϴ� " ��� ������ ����ϰ� ����!
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڸ� �Է����ּ���");
			int num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		
	}
	
	/*
	 * ����ڷκ��� �� ���� ���� �Է� �޾Ƽ� 
	 * 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����غ�����!
	 * 
	 * ��, �Է��� ���� 1���� ũ�ų� ���ƾ��մϴ�.
	 * 
	 * ���࿡ 1�̸��� ���ڰ� �Էµƴٸ�
	 * "1�̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڿ��� ���� �Է¹�������!
	 * 
	 * ex)
	 * 
	 * 1�̻��� ���ڷ� �Է��ϼ��� : 4
	 * 4 3 2 1
	 * 
	 * 1�̻��� ���ڸ� �Է��ϼ��� : -1
	 * 1�̻��� ���ڸ� �Է����ּ���!!!
	 * 1�̻��� ���ڸ� �Է��ϼ��� : 5
	 * 5 4 3 2 1
	 * 
	 * 
	 */
	public void method4() {	
	
		Scanner sc = new Scanner(System.in);
		int num;
		
		boolean flag;
		do {
			System.out.println("1�̻��� ���� > ");
			num = sc.nextInt();
			flag = num < 1;
			if(flag) System.out.println("1�̻��� ���ڸ� �Է����ּ���");
		} while(flag);
		
		for(; num > 0; num--) {
			System.out.println(num + " ");
		}
	}
	/*
	 * ����ڷκ��� [���� ����]�� [����]�� �Է¹޾Ƽ�
	 * ������ ������ ���ڰ� Ŀ���� ���α׷��� �����ô�.
	 * ��, [��µǴ� ����]�� �� 10�� �Դϴ�.
	 * * '����'�� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���մϴ�.
	 * 
	 * ex) 1, 4, 7, 10, 13, ....
	 * 		3	3  3   3 		-> ���⼭ ������ 3
	 * 
	 * ���ۼ��� : 5
	 * ���� : 2
	 * 
	 * 5 7 9 11 13 15 17 19 21 23 25
	 * 
	 * ���ۼ��� + ���� * n
	 */
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է�");
		int startNum = sc.nextInt();
		System.out.println("���� > ");
		int gongcha = sc.nextInt();
			
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d ", startNum + (gongcha * i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
