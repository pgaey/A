package com.kh.operator;

public class C_Compound {

	/*
	 * ���� ���Կ����� :  "=" ���Կ�����
	 * 
	 * �ٸ� ��������ڶ� ���Կ����ڰ� ������ ��
	 * => �ڱ��ڽŰ� �ش� ������� �� �� ����� �ڱ��ڽſ��� ������ ��
	 */
	
	// +=
	// -=
	// *=
	// /=
	// %=
	
	/*
	 * ex)  int a = 1;
	 * 		a = a + 3;
	 *  ������ �����ϴ� a��� �������� ���� 3�� ���ϰ� �� ������� �ٽ� a�� �����ϰڴ�.
	 * 		a += 3;      20��(a = a + 3)�� ����� ��
	 */

	// int veryBigNumber = 1000000;
	// veryBigNumber = veryBigNumber + 100;
	// veryBigNumber += 100;
	
	public void method1() {
		
		int num = 12;
		System.out.println("���� num :" + num); // 1. 12
		
		// num�� 3���� ��Ű��
		num = num + 3;
		System.out.println("3�� ������Ų num : " + num); // 2. 15
		
		// num�� 3������Ű��
		num += 3;
		System.out.println("3�� �� ������Ų num : " + num); // 3. 18
		
		// num�� 3�� ���ҽ�Ű��
		num -= 3;
		System.out.println("3�� ���ҽ�Ų num : " + num); // 4. 15
		
		// num�� 3�� ������Ű�� 
		num *= 3;
		System.out.println("3�� ������Ų num : " + num); // 5. 45
		
		// num�� 2�� ���ҽ�Ű��
		num /= 2;
		System.out.println("2�� ���ҽ�Ų num : " + num); // 6. 22
		
		// num�� 2�� ���� �������� num�� ����
		num %= 2;
		System.out.println("num�� 2�� ���� �������� ������ �� : " + num); // 7. 0
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
