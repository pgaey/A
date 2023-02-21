package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * if - else 
	 * 
	 * [ ǥ����  ]
	 * 
	 * if(���ǽ�) {
	 * 		���ǽ��� true�� �� ������ �ڵ� - 1
	 * } else {
	 * 		���ǽ��� false�� �� ������ �ڵ� - 2
	 * }
	 * 
	 * => ���ǽ��� ����� true�� ��� 1�� ����
	 * => ���ǽ��� ����� false�� ��� 2�� ����
	 * 
	 */
	
	public void method1() {
		
		// ������ ����
		// ���� �Է¹޾Ƽ� 	��� / 0 / ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� > ");
		int num = sc.nextInt();

		// ���࿡ ����ڰ� �Է��� �������� ���(0���� ũ�ٸ�)
		// if 			num			> 0
		
		if(num > 0) {	// ����� ��� �� �ڵ�� ���θ� �����ϰڴ�.

			System.out.println("����� ~ ");
	
			// ���ǽ��� ����� true => else���� �ǳʶ�
			// ���ʿ��� ������ �پ�� => ó���ӵ� ���
			
		} else {		// ����� �ƴ� ��� ����
		
			if(num == 0) { // 0�� ���
				System.out.println("0�̴�~");
			} else {
				System.out.println("������~");
			}
		}
	}
	
	public void method2() {
		// �ֹι�ȣ �Է� �� ���� �Ǻ�
		// 1. ����ڷκ��� �ֹι�ȣ �Է¹ޱ� (String personId => XXXXXX-XXXXXXX)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է����ּ��� (-����) : ");
		String personId = sc.nextLine();
		
		// 2. �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� ���ڸ� ���� charAt(index) => 7�� index
		char gender = personId.charAt(7);
		
		
		// gender == '1' || gender == '2' || gender == '3' || gender == '4'
		// ����!!!!)    ??('1'�� �ƽ�Ű�ڵ�ǥ�� int 49) == 49 || ?? == 50 || ?? == 51 || ?? == 52 ||
		
		if('1' <= gender && gender <= '4' ) {
			
			// ��ȿ�� �ֹι�ȣ�� �Է����� ���
			if(gender == '1' || gender == '3') {
				System.out.println("���ڴ�~");
			} else {
				System.out.println("���ڴ�~");
			}
			
		} else {
			// ��ȿ�� �ֹι�ȣ�� �Է����� �ʾ��� ���
			System.out.println("��ȿ���� ���� �ֹι�ȣ�Դϴ�~~");
		}
	}
	
	/*
	 * if - else if��
	 * 
	 * [ ǥ����  ]
	 * 
	 * if(���ǽ�1) {
	 * 		���ǽ�1�� true�� ��� ������ �ڵ�1
	 * } else if(���ǽ�2){
	 * 		���ǽ�2�� true�� ��� ������ �ڵ�2
	 * } else if(���ǽ�3){
	 * 		���ǽ�3�� true�� ��� ������ �ڵ�3
	 * } else if(���ǽ�4){
	 * 		���ǽ�4�� true�� ��� ������ �ڵ�4
	 * } else {
	 * 		�տ��� ����ߴ� ��� ���ǵ��� false�� ��� ������ �ڵ�
	 * }
	 */
	
	public void method3() {
		
		// ���� �Է¹޾Ƽ� ��� / 0 / ����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("0���� ū�� ~ ");
		} else if (num < 0) {
			System.out.println("0���� ���� �� ~");
		} else {
			System.out.println("0 ~");
		}
		
	}
	
	public void method4() {
		// ���̸� �Է¹ް� ��� / û�ҳ� / ���� �Ǵ�
		// 0 ~ 13 : ���
		// 14 ~ 19 : û�ҳ�
		// 20~ : ����
		// ~ : ???
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է����ּ���  >  ��");
		int age = sc.nextInt();
		
		// ū ������ �� �������  !!!
		
		if(age < 0) {									// ��̺��� �����ϴ°ź��� �������� ������ ���� ����
			System.out.println("???");
		} else if(age >= 20) {
			System.out.println("�����Դϴ�~");
		} else if(age >= 14 ) {
			System.out.println("û�ҳ�~");
		} else {
			System.out.println("���");
		}
		
	}
	
	
	
	
}
