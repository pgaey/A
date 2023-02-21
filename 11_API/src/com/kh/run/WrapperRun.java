package com.kh.run;

public class WrapperRun {
	
	public static void main(String[] args) {
		
		/*
		 * Wrapper Class
		 * 
		 * => �⺻�ڷ����� ��ü�� �������ִ� Ŭ�������� ���� Ŭ������� ��
		 * 
		 * �⺻�ڷ���			<�ѤѤѤѤѤѤѤѤѤ�>				Wrapper Ŭ����
		 * 
		 * boolean										Boolean
		 * char											Character
		 * byte											Byte
		 * short										Short
		 * int											Integer
		 * long											Long
		 * float										Float
		 * double										Double
		 * 
		 * 
		 */
		
		// �⺻�ڷ����� ��ü�� ����ؾ��ϴ°��
		// �޼ҵ��� �Ű����� Ÿ������ �⺻�ڷ����� �ƴ� ��ü Ÿ�Ը� �䱸�� ��
		// �������� �����Ű�� ���� ��
		
		int num1 = 10;
		int num2 = 15;
		
		Integer i5 = 50;
		// num1�� num2�� ����� �ϰ� �ʹ�.
		System.out.println(num1 == num2);
//		System.out.println(num1.equals(num2));
		// equals() => Object
		// equals() => �ּҰ��� ���ؼ� ������ true / �ٸ��� false return
		
//		Integer i1 = new Integer(num1);
		// �⺻ �ڷ��� => WrapperŬ���� �ڷ��� 
		Integer i1 = num1;   //  �����ϴ� ���
		Integer i2 = num2;
		
		System.out.println();
		System.out.println("compareTo, equals");
		System.out.println(i1.compareTo(i2));
		System.out.println(i1.equals(i2));
		// a.compareTo(b);
		// a�� b���� ũ�� 1 return
		// a�� b���� ������ -1 return
		// ������ 0 return
		
		System.out.println("�ѤѤѤѤѱ����ڤѤѤѤѤ�");
		
		String str = "123";
		String str2 = "123";
		// str�� str2 ���ڿ��� 246���� ����� �ʹٸ�?
		
		
		// ���ڿ��� IntegerŸ������
		// Integer i3 = "123";		�Ұ���
		Integer i4 = new Integer("123");		// Integer Ÿ�Ծȿ� �ִ´�
		int num5 = i4.intValue();				// .intValue()�� int�� �ٲ۴�	"12����34" �̷������� �Ǿ������� �ȵǰ� ���� "(����)"��.   �Ƹ�  ""�� ���ִ� ������� ������
		System.out.println(num5);				// !������! .intValue()�� [Integer => int]��
		
		int num4 = Integer.parseInt("123");		// �� ���� ���		�տ� ���� �ٴ� parseInt() �� �ִ� () �ȿ� ��
		System.out.println(num4);
		
		
		System.out.println("�⺻�ڷ��� ---> String  ���� ");
		// �⺻�ڷ��� --> String		�� ��쿡 WrapperŬ������ ���� ���� �����
		String str3 = "10";		// int
		String str4 = "15.0";	// double
		
		System.out.println(str3 + str4);
		// 1. String���� �⺻�ڷ������� parsing
		// [ ǥ����  ]
		// �ش� WrapperŬ�����̸�.parseXXX(��ȯ�ҹ��ڿ�);					����ȯ�� �ƴ�!!!			parsing(�밭 �ؼ�)�̶�� ������
		int i =	Integer.parseInt(str3);			// "10" -> 10
		double d = Double.parseDouble(str4);	// "15.0" -> 15.0
		System.out.println(i + str3);	// ���� 10  +  "10"
		
		
		
		System.out.println("2. �⺻�ڷ����� String������ ");
		// 2. �⺻�ڷ����� String������ 
		// => String.valueOf(��ȯ�� �ڷ��� ��) : String
		String strI = String.valueOf(i);		//    int i = 10;
		String strD = String.valueOf(d);		// double d = 15.0;
		
		System.out.println(strI + strD);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
