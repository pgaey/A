package com.kh.chap03.escape;

import java.util.Arrays;
import java.util.Scanner;

public class B_Continue {
	
	/*
	 * continue : �ݺ��� �ȿ��� ���̴� ����!
	 * 
	 * continue�� ������ �� �ڿ� � ������ �ֵ簣�� �������� �ʰ� pass
	 * ���� ����� �ݺ������� �ö󰡶�� ���� �ǹ�
	 * 
	 */

	public void method1() {
		
		// �ݺ����� 1�� ������Ű�鼭 �ݺ��ϴµ�, Ȧ���� ��쿡�� ����ϵ���
		// if(i % 2 == 1) System.out.println(i);
		
		// for(int i = 0; i <= 10; i += 2)
		
		for(int i = 1; i <= 10; i++) {
			// 1���� 10���� Ȧ���� ���
			
			if(i % 2 == 0) {
				continue;
			}
			
			System.out.println(i + " ");
		}
	}
	
	public void method2() {
		// 1���� 100������ �� �հ踦 ���ؼ� ���!!!
		// ��, 7�� ������� ���� ���غ��ô�.
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void method3() {
		
		// 3ĭ¥�� ������ �迭�� ����� ���� �Է¹ޱ�
		// int[] arr = new int[3];
		// 1 ~ 100������ ���ڸ� �Է¹ޱ�
		// ���࿡ ������ �Ѿ ���ڸ� �Է��Ѵٸ� " �ٽ� �Է��ϼ��� !"��� ����� �� �ٽ� �Է¹ޱ�
		
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println("���ڸ� �Է��� �ּ��� > ");
			int temp = sc.nextInt();

			// ����ڰ� �Է��� ���� 1���� 100������ ���� �ƴ϶��
			// 		!(1 <= temp && temp <= 100)
			//		 (0 >= temp || temp > 100)
			if(0 >= temp || temp > 100) {
				System.out.println("�ٽ� �Է����ּ��� !");
				i--;
				continue;
			}
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
