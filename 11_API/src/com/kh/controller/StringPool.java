package com.kh.controller;

public class StringPool {
	
	// String Ŭ���� -> String Ŭ������ � Ŭ������??   A : �Һ�Ŭ����(������ �ʴ� Ŭ����)
	
	/*
	 * String Ŭ���� ������ ��ü ���� ���
	 * 
	 * 1. new Ű���带 �̿��� String() ������ ȣ�� �ڡڡڡڡڡڡڡڡڡڡ����� ���� �ȵǴ� ����ڡڡڡڡڡڡڡڡڡڡ�
	 * 2. ���Կ����ڸ� ���ؼ� ���� ���� �����ؼ� ����
	 * 
	 */
	
	
	
	// 1. �����ڸ� ���ؼ� ���ڿ� ���	  �ڡڡڡڡڡڡڡڡڡڡ����� ���� �ȵǴ� ����ڡڡڡڡڡڡڡڡڡڡ�
	public void method1() { //�ڡڡڡڡڡڡڡڡڡڡ����� ���� �ȵǴ� ����ڡڡڡڡڡڡڡڡڡڡ�
		
		String str1 = new String("hello");		// �����ڷ��� ��
		String str2 = new String("hello");
		
		// toString()
		System.out.println(str1.toString());
		System.out.println(str2);
		// 1. StringŬ������ toString()�� ���
		// ���� ����ִ� [���ڿ���]�� ��ȯ�ϰԲ� �������̵��� �Ǿ�����
		
		
		// equals() 	[���ڿ� ��] O , [�ּҰ� ��] X
		System.out.println(str1.equals(str2));
		// true => ���ڿ��� ���ߴµ� �Ȱ���.
		// �ּҰ� �񱳰� �ƴ� [���ڿ� ��]�� �ϵ��� �������̵�	
		
		
		// hashCode()	[���ڿ� ������ ����]
		// 16���� => 10������ �ּҰ�
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());		// ������ �ִ� �ּҰ��� �ƴ϶� [���ڿ� ��]�� ������ hashCode�� ����
		// 3. StringŬ������ hashCode()
		// �ּҰ��� ��ȯ���ִ� ���� �ƴ� ���� ��� [���ڿ��� �������] �ؽ��ڵ� ���� ���� ��ȯ
		
		// ��¥ �ּҰ��� �˰� �ʹ�!!		[����� �ٸ���]
		// System.identityHashCode(������������);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// ���� ��ü���� �ĺ��� �� �ִ� �ؽ��ڵ带 ���!
		// str1�� str2 ����� �ٸ���!!
		
		System.out.println("�ѤѤѤѤѺ񱳤ѤѤѤѤ�");
		System.out.println(str1 == str2);		// [�ּҰ� ��]
		System.out.println(str1.equals(str2));	// [���ڿ� ��]
		System.out.println("�ѤѤѤ� method1 �� �ѤѤѤ�");
	}
	
	// String Ŭ���� -> String Ŭ������ � Ŭ������??   A : �Һ�Ŭ����(������ �ʴ� Ŭ����)
	
	// 2. ���ڿ� ���ͷ��� ����
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		// toString
		System.out.println(str1);
		System.out.println(str2);
		
		// equals()		[���ڿ� ��]
		System.out.println(str1.equals(str2));	
		
		// hashCode()	[���ڿ� -> �ڵ�]
		System.out.println(str1.hashCode());	
		System.out.println(str2.hashCode());
		
		// System.identityHashCode
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// �� �Ȱ���???
		
		System.out.println(str1 == str2);
		
	}
	
	// String Ŭ���� -> String Ŭ������ � Ŭ������??   A : �Һ�Ŭ����(������ �ʴ� Ŭ����)
	
	// StringPool
	public void method3() {
		
		String str1 = "hello";		// stack : str1    heap -> StringPool ����  ->  "hello" ����
		String str2 = "hello";		// stack : str2    heap -> StringPool -> "hello" �̹� �����ϴ� ���� ����Ŵ
		// ���ͷ��� ���� �� String Pool ������ �ö�
		// StringPool�� Ư¡ : ������ ������ ���ڿ��� ������ �� ����
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));		// ���� ���� ����Ű�� �ּҰ� ����
		
		
		String str = "hello";		// StringPool -> "hello" 		
		System.out.println("hello  " + System.identityHashCode(str));		// str1, str2 ���� ����
		
		str = "goodbye";			// StringPool -> "goodbye" ���� ���� 		  "hello"�� ���������׷��� �Һ��̶�� ��
		System.out.println("goodbye" + System.identityHashCode(str));		 // heap������ �ִ� "hello"�� GC�� �˾Ƽ� ����
		// ������ ���� ���ڿ����� GC�� �˾Ƽ� ��������
		// ��ü�� ������ �Һ� �������� ���ο� �ּҰ��� �����ϰ� ����
		
		str += "abc";
		System.out.println(System.identityHashCode(str));
		System.out.println(str);
		
	}
	
	public void method4() {
		// ���ڿ��� �ȿ� ���빰�� ����� ������ ���ο� ������ �Ҵ��ϰ� ���Ӱ� ����ִ´�.
		
		// StringBuffer ( Thread Safe ���������� O )		StringBuilder�� �Ȱ��� But, StringBuilder�� �� ����
		// �̸� ���� ���ؼ� �ӽð���(Buffer)�� �ϳ� �غ��Ͽ�
		// �ӽð����� �������� ��Ƶξ��ٰ� �ѹ��� ó�����ִ� Ŭ����
		
		StringBuffer sb = new StringBuffer();
		
		
		sb.append("Hello");				// Scanneró�� sc.next()   append�� StringBuffer�� ����ϱ� ���� ���� 
		System.out.println(sb.hashCode());
		System.out.println("Hello".hashCode());
		
		sb.append(" World!");
		System.out.println(sb.hashCode());				// sb�� ���� �ٲ��� ���� 
		System.out.println("Hello World!".hashCode());
		
		System.out.println(sb);
		
		// StringBuffer�� ����������(Thread Safe)����� ����
		// ������ ���α׷� �����̳�, ������� �ٸ� ���α׷��� �����ϴ� ���
		// ���� StringBuffer���� ������������ ������ �ʿ䰡 ����
		// �� ��ɸ� �� �� Ŭ������ �ʿ��ߴµ� �װ� StringBuilder��.
	
	}
	
	public void method5() {
		// StringBuilder (����������x Thread Safe)	== StringBuffer �Ȱ��� But, StringBuilder�� �� ����
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello");
		System.out.println(sb.hashCode());
		System.out.println("Hello".hashCode());
		
		sb.append(" World!");
		System.out.println(sb.hashCode());
		System.out.println("Hello World".hashCode());
		
		System.out.println(sb);
	}
	
	
}
