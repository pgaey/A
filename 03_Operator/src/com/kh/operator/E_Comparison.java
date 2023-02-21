package com.kh.operator;

public class E_Comparison {

	/*
	 * �� ������(���迬����)        �ǹ������� �����ϴ� ���� ����
	 * 
	 * �� ���� ���� ������ ��, ���� ������
	 * �񱳿����� �� ��� -> ���� ��� true, ������ ��� false
	 * Ư�� ������ ������ �� �ִ� ���ǹ����� ����� ����!!
	 */
	
	/*
	 * ����
	 * 
	 * 1. ��Һ�  : �ڱ� ������ ��
	 * 
	 * a < b : a�� b���� �۽��ϱ�?
	 * a > b : a�� b���� Ů�ϱ�?
	 * a <= b : a�� b���� �۰ų� �����ϱ�?
	 * a >= b : a�� b���� ũ�ų� �����ϱ�?
	 * 
	 * 2. �����  : ��ġ���� ��
	 * 
	 * a == b : a�� b�� ��ġ�մϱ�?
	 * a != b : a�� b�� ��ġ���� �ʽ��ϱ�?
	 * 
	 * => �ǿ����ڴ� ����, ������� ����
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a < b : " + (a < b)); // 1. true
		
		System.out.println("25 <= b : " + (25 <= b)); // 2. true
		
		System.out.println("a == b : " + (a == b)); // 3. false
		
		boolean result = a != b;
		System.out.println(result); // 4. true
		
		System.out.println("a - b < 0 : " + (a - b < 0)); // 5. true
		
		boolean result1 = (a % 2 == 0);
		boolean result2 = (b % 2 != 0);
		System.out.println("a�� ¦���Դϱ�? : " + result1);		// 6. true
		System.out.println("b�� ¦���� �ƴմϱ�? : " + (b % 2 != 0));		// 7. true
		System.out.printf("b�� ¦���� �ƴմϱ�? : \n%b", !result2); // 8. false
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
