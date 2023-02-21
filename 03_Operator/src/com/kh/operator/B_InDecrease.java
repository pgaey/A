package com.kh.operator;

public class B_InDecrease {

	/*
	 * ���������� : ���׿����ڷν� �ѹ��� 1�� ����(���ϰų�) ����(���ų�)�ϴ� ������ �Ѵ�.
	 * => ���� ������ �Ұ���, ���߿� ������ �Ұ����� ���� �������� ��ġ�� �޶�����.
	 * 
	 * [ ǥ����  ]
	 * ++ : ���� 1���� ������Ű�� ������
	 * -- : ���� 1���� ���ҽ�Ű�� ������
	 * 
	 * �������� ��ġ
	 * ���� ���� : ++��, --��		--> ���� ���� �����ϰ� �� ���� ó��
	 * ���� ���� : ��++, ��--		--> ���� ó���ϰ� ���� �����ϰų� �����ϰڴ�.
	 * 
	 */
	
	// ��������    �� ����  : RAM���� ���� ������ ������ �����غ� ��
	public void method1() {
		
		int num = 10;
		System.out.println("num : " + num); // "num : 10"
		
		num++; // num�̶�� �̸��� ���� ���������� �����ٰ� 1�� ������Ű�ڴ�.
		// num + 1
		
		System.out.println("num : " + num); // "num : 11"
		
		num--;
		
		System.out.println("num : " + num); // "num : 10"
		
		System.out.println("num : " + num++); // "?"  "num : 10"    ��� �� ++ ó��
		System.out.println("num : " + num++); // "?"  "num : 11"
		
		System.out.println("num : " + num); // 12
	}
	
	
	public void method2() {
		
		int a = 10;
		int b = a++;
		// �켱���� �߿�!
		// 1�� b��� int�� ���������� ����
		// 2�� a��� ���������� ���ͷ� ���� ������
		// 3�� ������ ���ͷ� ���� b��� ������ ����
		// 4�� a�� 1����
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 10
		// b��� ������ a���� ���� �����ϰ�(�� ó�� �κ�)
		// a��� ���� ������Ű�ڴ�(�� ����)
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : " + c); // 19
		System.out.println("d : " + d); // 20
	}
	
	// ��������		���� �ڹٴ� ���������� ���ɸ鿡�� ��������. ���� �������� ����
	public void method3() {
		
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a); // 11  a�� 10�̾����� ++a�� ��ġ�鼭 �̹� a = 11 �� ����.
		System.out.println("b : " + b); // 11     ��� b = 11
		
		System.out.println("a : " + --a); // 10
	}
	
	public void method4() {
		
		//���� ����		���� ��
		int num1 = 20;
		int result = num1++ * 3;
		
		System.out.println(num1);		// 21
		System.out.println(result);		// 60   ���� ���� : ++�� ���� �������� ����
		
		//���� ����		�� �Ⱦ�
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		System.out.println(num2);		// 21
		System.out.println(result2);	// 63
	}
	
	
	
	
	
	
	
	
	
	
}
