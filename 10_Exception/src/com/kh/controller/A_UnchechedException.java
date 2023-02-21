package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnchechedException {
	
	/*
	 * RuntimeException
	 * ���α׷� ���� �� �߻��Ǵ� ���ܵ� 
	 * 
	 * RuntimeException�� �ڽ�Ŭ������
	 * - NullPointerException : �ּҰ� ��ü�� ���� �ߴ��� null�� ������� ��� �߻��ϴ� ����
	 * - ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
	 * - NegativeArraySizeException : �迭 ũ�⸦ ������ ������ ��� �߻��ϴ� ����
	 * - ClassCastException : ����� �� ���� ����ȯ�� ������ ��� �߻��ϴ� ����
	 * - ArithmeticException : ������ ������ 0���� ������ �߻��ϴ� ����
	 * .....
	 * 
	 * RuntimeException�� ���õ� ���ܵ��� �������� �ִ�!!!!!!!!!!!!!!!!!!!!!!!
	 * �����ڰ� ������ ������!
	 * 
	 * 
	 * 
	 * 
	 */
	
	// ArithmeticException
	public void method1() {
		// ����ڿ��� �� ���� �������� �Է¹޾Ƽ� ������ ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���� > ");
		int num1 = sc.nextInt();		
		sc.nextLine();
		
		System.out.println("�� ��° ���� > ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// ��� 1. ���ǹ����� ó��(���ܹ߻��� ����)
		/*
		if(num2 != 0) {
			System.out.println("������ ��� : " + (num1 / num2));
		} else {
			System.out.println("0�� �ȵ�");
		}
		*/
		
		// ��� 2. ����ó�� ������ �̿�
		// ���ܰ� �߻����� �� ������ ������ �����صδ� ��!!
		
		/*
		 * try ~ catch ��
		 * 
		 * [ ǥ����  ]
		 * 
		 * try {
		 * 
		 * 
		 * 
		 * 
		 * 		(num1 / num2) // ���ܰ� �߻��ҹ��� ����
		 * 
		 * 
		 * 
		 * 
		 * 		
		 * } catch(ArithmeticException e (�߻��ҿ���Ŭ�����̸� + ������) 	=> 	������ �Ű�����){
		 * 
		 * 		// �ش� ���ܰ� �߻����� �� ������ ����
		 * 
		 * }
		 */
		
		try {
			
			System.out.println("������ ��� : " + (num1/num2));
			
			System.out.println("���� �߻� ���߾� ~ ~ ");
			
		} catch(ArithmeticException e) {
			
			System.out.println("num2�� 0 ������ ~ ~ ~");
			e.printStackTrace(); // ������ �������ִ� �޼ҵ�
			// ���� ������ �߻��� ������ �� �� �ְ�, ��� �߻��ߴ��� �������ش�.
			// ���ߴܰ��ϰ� �׽�Ʈ�ܰ迡���� ����ؾ���!! ��!!
			
		}
		
		System.out.println("���α׷� ������ ~ ");
	}
	
	// ���� catch��
	public void method2() {
		
		// catch�� ���ܰ� �������� ��� �ַ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�(0�� ����) > ");
		
		try {
			int num = sc.nextInt(); // ������ �Է��϶�ϱ� �̻��� ���� �Է�   InputMismatchException
			System.out.println("������ ��� > " + (100/num)); // 0�� �Է����� ����ϱ� 0�� �Է�   ArithmeticException
				
		}catch(InputMismatchException e) { // 1. �켱������ �Է¹����� �������� �Ǵ�
			System.out.println("���� �־��ּ���!!");
		}catch(ArithmeticException e) { // 2. ������� 0���� �ƴ��� �Ǵ�
			System.out.println("0�� �Է����� �����ּ���!!");
		}
		
		System.out.println("���α׷� ����");
		
	}
	
	public void method3() {
		
		// �迭 Ȱ��
		
		// ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
		// NegativeArraySizeException : �迭�� ũ�⸦ ������ ������ �� �߻��ϴ� ����
		
		// ����ڷκ��� �迭�� ũ�⸦ �Է¹޾Ƽ� �迭�� �����
		// 100��° �ε��� ���� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ũ�� > ");
		
		try {
			int size = sc.nextInt();	// 1. InputMismatchException  �̻��� ���� �Է�
			int[] arr = new int[size];	  // 2. NegativeArraySizeException �迭�� ũ�⸦ ������ ������ �� �߻��ϴ� ����
			System.out.println(arr[100]);	// 3. ArrayIndexOutOfBoundsException �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
			
			// ���� catch�� �ۼ��� ������ ���� �ڽ�Ÿ���� ����Ŭ�������� ���� ����ؾ��� (ū ���� �ȿ� ������ ���� ������ ������ �ؿ� �ִ� �ڽ�ĳġ���� �ǹ̰� ����)
		} catch(RuntimeException e) {
			System.out.println("�迭�� �̻���");
			// ���ױ׷��� ���������� ǥ���ؾ��� ==> ����
			
			// System.out.println(".................");
		}
		
		
		
		/*catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���");
		}catch(NegativeArraySizeException e) {
			System.out.println("����� �Է����ּ���");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�۴�!");
		}*/
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
