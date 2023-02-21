package com.kr.chap02.run;

import java.util.Scanner;

import com.kr.chap02.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		// int[] arr = new int[3];
		// ��ü�迭 ���� �� �Ҵ�!
		
		Phone[] arr = new Phone[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println(arr); 					// �ּҰ�
		System.out.println(arr.length);
		System.out.println(arr[0]); 				// null  �ʱⰪ �̴�.
		
		arr[0] = new Phone();						// ��
		System.out.println(arr[0]);					// �ּҰ� (information)
		
		arr[0].setColor("����");
		arr[0].setBrand("Apple");
		arr[0].setSeries("14");
		arr[0].setPrice(1000000);
		
		System.out.println(arr[0]); 				// �ּҰ�
		System.out.println(arr[0].information());	// �򰥸��� �ʰ�
		
		arr[1] = new Phone("Samsung", "Z4", "�ϴû�", 230000);
		arr[2] = new Phone("������",  "��������", "�ݻ�", 150000);
		
		System.out.println(arr[1].information());
		
		// ���� �� �հ�, ��հ� ���
		
		int sum = 0;			// �հ質���� �ϴ� sum ����
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].getPrice();
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (sum / arr.length));
		

	}

	
	
	
}
