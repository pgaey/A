package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * �ܵ� if�� : 
	 * [ ǥ����   ]
	 * 
	 * if(���ǽ�) {
	 * 		���ǽ��� true�� ��� ����� �ڵ�
	 * }
	 *
	 * => ���ǽ��� ����� true�� ��� : {}(�߰�ȣ) ���� �ڵ���� �����
	 * => ���ǽ��� ����� false�� ��� : {}(�߰�ȣ) ���� �ڵ���� �ǳʶ�
	 * 
	 */
	
	public void lunchMenu() {
		
		// �����
		// �����
		
		// ����  / ���
		
		Scanner sn = new Scanner(System.in);
		System.out.println("������ ������ ?? (����, ���) > ");
		String weather = sn.nextLine();
		
		
		String lunch = (weather.equals("����"))? "�����" : "�����";				// equals �� ���� ()�ȿ� �ִ� �Ͱ� ������ ��. ������ true, �ٸ��� false
						// ���ڿ� �� �񱳴�  .equals() �޼ҵ� ���
		System.out.println("������ ������ " + lunch + "�Դϴ�.");
		
	}
	
	// ���׿����� �� �غô���
	public void method1() {
		// ������ �Է¹ް� ��� / 0 / ���� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� > ");
		int num = sc.nextInt();
		
		// ���࿡ ����ڰ� �Է��� ���� 0���� ũ�ٸ�
		if(num > 0) {
			System.out.println(num + "��(��) �����!!");
		}
		
		// ���࿡ ����ڰ� �Է��� ���� 0�̶��
		if(num == 0) {System.out.println("0�̴�!!");}
		
		// ���࿡ ����ڰ� �Է��� ���� 0���� �۴ٸ�
		if(num < 0) System.out.println(num + "��(��) ������!!");   // �������� �ƴҰ�� ������ �����ϱ� ��
		
		
		// ������ if�� ��� ���׿����ڷ� ��ü ����
		
		
	}

	public void method2() {
		
		// if���� �̿��ؼ� Ȧ�� / ¦�� �Ǻ�
		// ����� ��쿡�� ���ǹ��� ����!!!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �Է����ּ���");
		int num = sc.nextInt();
		
		
		// Ȧ�� + ���
		// ¦�� + ���
		
		// ���࿡ ����ڰ� �Է��� ���� ��� �̰� ����ڰ� �Է��� ���� ¦����
		// if         num    >0           num    % 2 == 0 
//		 if((num > 0) && (num % 2 == 0)) System.out.println("����̸鼭 ¦��!"); 
		
		// ���࿡ ����ڰ� �Է��� ���� ��� �̰� ����ڰ� �Է��� ���� Ȧ����
		// if         num    >0           num   % 2 == 1
		// if((num > 0) && (num % 2 != 0)) System.out.println("����̸鼭 Ȧ��!"); 
		
		// ��ø if��
		// ����� ����
		if(num > 0) {
			if(num % 2 == 0) System.out.println(num + "�� ¦����");
			if(num % 2 != 0) System.out.println(num + "�� Ȧ����");
		}
		System.out.println("asdfasdf");
	}
	
	public void method3() {
		
		// �ֹι�ȣ üũ
		// �ֹι�ȣ�� �Է� �޾Ƽ� ���� üũ
		//					000000-?000000
		//						   1, 3    2, 4
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ��� (- ����)");
		String personId = sc.nextLine();				// buffer�� �ִ� ���� RAM���� �������� ���� next(); ���
				// next(), nextLine()

		// System.out.println(personId);
		
		// ���ڿ� = "������ �ִ� (����)���ڵ��� ����"
		// "a b c d e f g"
		//  0 1 2 3 4 5 6
		// ������ index��� �θ� ** index�� 0������ ����
		
		
		// 111111-2222222
		
		// �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� '����'�� ����
		// chatAt(7) => �ֹι�ȣ ���ڿ� �� 8��°�� �ִ� 7�� index�� �����ϰڴ�.
		
		char gender = personId.charAt(7);
		
		// 1 / 3�̸� �����Դϴ� ���
		// 2 / 4�̸� �����Դϴ� ���
		// �ݴ� �ƴϸ� ????? ���
		
		// ���࿡ ����ڰ� �Է��� �ֹε�Ϲ�ȣ���� 8��° ���ڰ� 1�̰ų� 3�̸�
		if('1' == gender || gender == '3') {
			System.out.println("����� �����Դϴ�.");
		}	
		
		// ���࿡ ����ڰ� �Է��� �ֹε�Ϲ�ȣ���� 8��° ���ڰ� 2�̰ų� 4�̸�		
		if('2' == gender || gender == '4')	{
			System.out.println("����� �����Դϴ�.");
		}
															// 1�� �ƴϰ� 2�� �ƴϰ� 3�� �ƴϰ�
		// ���࿡ ����ڰ� �Է��� �ֹε�Ϲ�ȣ���� 8��° ���ڰ� �� �� �ƴϸ�		   != '1' && != '2' && != '3' &&
		//  if			 gender					
		if(gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.println("?????");
		}
		
		
	}
	
	
	
	
	
}
