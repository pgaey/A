package com.kr.chap01.run;

import java.util.Scanner;

import com.kr.chap01.model.vo.Coffee;

public class ObjectArrayRun {

	public static void main(String[] args) {
		// �迭�� Ư¡
		// �ε������ ������ ����(����� ��������.)
		// ���� �ڷ��������� ���� �� �ִ�.
		// �������̴�.
		// ũ�⸦ �ٲ� �� ����.
		
		// int[] iArr = new int[5];        		//   �ּҰ�  = �� ����
		// String[] sArr = new String[5];		
		
		// Coffee[] cArr = new Coffee[0];
		// [ ǥ����  ]
		// Ŭ�����̸�[] �迭�ĺ��� = new Ŭ�����̸�[�迭ũ��]
		
		Coffee[] arr = new Coffee[3]; // 0, 1, 2
		Scanner sc= new Scanner(System.in);
		
		
		for(int i = 0; i < arr.length; i++){
			
			System.out.println("����� �Է����ּ��� > ");
			String size = sc.nextLine();
					
			System.out.println("������ �Է����ּ��� >");		
			int price = sc.nextInt();		
			sc.nextLine();		
					
			System.out.println("Ŀ���̸��� �Է����ּ��� > ");
			String coffeeName = sc.nextLine();
					
			System.out.println("���θ� �Է����ּ��� > ");
			String bean = sc.nextLine();
			
			arr[i] = new Coffee(size, price, coffeeName, bean);
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}		
		
		System.out.println("��� ���� Ŀ�� �̸� : ");
		String buy = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getCoffeeName().equals(buy)){
				System.out.println(arr[i].getPrice());
			}
		}
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
					
		}

}
