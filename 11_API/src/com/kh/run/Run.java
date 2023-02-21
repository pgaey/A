package com.kh.run;

// import java.lang.*;
// ������ �����ϴ�
// ������ ������ �׻� import
// �ڹ����α׷����ϸ鼭 �ʼ����� Ŭ�������� ��Ƴ��� ��Ű��

public class Run {
	
	public static void main(String[] agrs) {
		
		// MathŬ����(���а� ����)
		
		/*
		 * Math Ŭ������ Ư¡
		 * - ��� �ʵ�� �޼ҵ尡 ���� �� static�̴�.
		 * - ��ü�� ������ �ʿ䰡 �����Ƿ�(static Ư¡) �������� ���������� private�̴�.
		 * - java.lang
		 */
		
		// �ʵ�
		// ���� => MathŬ���� ���� ����ʵ�� ���ǵǾ�����		
		System.out.println(Math.PI);	/*  java.lang*;�� ���� ���� �ʾƵ� ������ import�Ǿ�����   */
		
		
		
		
		// �޼ҵ�
		// �޼ҵ��(�Ű�����Ÿ��) : ��ȯ��
		// 1. �ø� => Math.ceil(double) : double
		double num1 = 4.1234567;
		System.out.println("�ø� : " + Math.ceil(num1));
		
		// 2. �ݿø� => Math.round(double) : long
		System.out.println("�ݿø�  : " + Math.round(num1));
		
		// BigDecimal
		// 3. ���� => Math.floor(double) : double
		System.out.println("���� : " + Math.floor(num1));
		
		// 4. ���밪 => Math.abs(int/double/long/float) : int/double/long/float	abs = absolute '��������'�� ����
		int num2 = -18;
		System.out.println(Math.abs(num2));
		
		// 5. �ּҰ� => Math.min(int, int) : int
		System.out.println("�ּҰ� : " + Math.min(23456451, 12355484));
		
		// 6. �ִ밪 => Math.max(int, int) : int
		System.out.println("�ִ밪 : " + Math.max(23485, 71542));
		
		// 7. ������(��Ʈ) => Math.sqrt(double) : double
		System.out.println("4�� ������ : " + Math.sqrt(4));
		
		// 8 . ���� => Math.pow(double, double) : double
		System.out.println("2�� 10���� : " + Math.pow(2, 10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}