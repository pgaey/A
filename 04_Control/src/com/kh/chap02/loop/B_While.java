package com.kh.chap02.loop;

import java.util.Arrays;
import java.util.Scanner;

public class B_While {

	/*
	 * while��
	 * 
	 * [ ǥ����  ]
	 * 
	 * �ʱ��; // �ʼ��� �ƴ�
	 * 
	 * while(���ǽ�) {
	 * 		�ݺ������� ������ �ڵ�;  // a
	 * 		������; // �ʼ��� �ƴ�
	 * }
	 * 
	 * ��ȣ�ȿ� ���ǽ� true�� ��� �ش�(a)������ �ݺ������� ����
	 * 
	 * => �ݺ��� Ƚ���� �����ڰ� ��Ȯ�ϰ� �˰� �ִ� => for��
	 * => �ݺ��� Ƚ���� �����ڰ� ������ �� ���� => while��
	 * 
	 * ���ѹݺ� => while
	 * while(true) �ݺ��� ������ ��ų�ž�!!
	 * 
	 */
	
//	public void method0() {
//		for(;;) {
//			System.out.println("��ӵ��ƶ� ~");
//		}
//	}
	
	public void method1() {
		/*
		int i = 0;
		
		while(i < 3) {
			i++;		// 1,2,3				���  ���������ڸ� ������ ����غ�����
			System.out.println(i + "�� ° �ݺ�");
//			i++;		// 0,1,2				���  ���������ڸ� ������ ����غ�����
		}
		*/
		
		/*
		int i = 10;
		
		while(i >= 6) {
			System.out.println(i);
			i--;
		}
		*/
		
		int i = 1;
		
		while(i < 10) {
			System.out.println(i);
			i += 2;
		}
	}
	
	public void method2() {
		// 1 ~ 100������ ¦���� ���ϱ�
		// 2550??
		
		int i = 1;
		int sum = 0;
		
		while(i < 101) {
			// ¦���϶��� ��������
			
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println(sum);
	}
	
	public void method3() {
		// 1���� ������ �� (1 ~ 10)���� ��� ���� �հ� ���
		// random : ������ => ���ǳ���
		// Math��� Ŭ������ random()�� Ȱ��
		// random() ��� �� : 0.0 ~ 0.9999999
		
		// [ ǥ����  ]
		// Math m = new Math();
		// m.random();
		// Math.random();  // MathŬ������ ���� ��Ī�� ������ �ʿ䰡 ����
		
		// 1�ܰ�. random() �� ���ư���???
		double num = Math.random();
		System.out.println("������ �� : " + num);
		
		// 2_1�ܰ�. ������� 10�� ���ϸ�??
		//			0.0 ~ 9.999999
		// 2_2�ܰ�. int������ ���� ����ȯ
		//			0 ~ 9
		// 2_3�ܰ�. +1
		//			1 ~ 10
		// (int)(Math.random() * ��� ������) + ���� ��;
		
		int random = (int)(Math.random() * 10) + 1;
		System.out.println("������ �� 2 : " + random);
		
		
		// 3�ܰ�. ���� �� ���ϱ�
		// 1���� ������ ��(1 ~ 10)���� ��� ���� �հ�
		
		int i = 1;
		int sum = 0;
		
		while(i <= random/*1���� 10���� �� ����������*/) {
			sum += i;
			i++;
		}
		
		System.out.println("1���� ������ �� ���� ���� ��� : " + sum);
	}
	
	public void lotto() {
		
		// �ζ� ver_0.1
		// ��ȣ ���� : 1 ~ 45
		// 6�� ����
		
		int[] lotto = new int[6];
		/*
		lotto[0] = (int)(Math.random() * 45) + 1;
		lotto[1] = (int)(Math.random() * 45) + 1;
		lotto[2] = (int)(Math.random() * 45) + 1;
		lotto[3] = (int)(Math.random() * 45) + 1;
		lotto[4] = (int)(Math.random() * 45) + 1;
		lotto[5] = (int)(Math.random() * 45) + 1;
		*/
		
		int i = 0;
		while(i < 6) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			i++;
		}
		
		// Arrays.toString(�迭�̸�);
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
}
