package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {

	/*
	 * Ű���带 �̿��ؼ� ����ڿ��� �Է°��� �޾ƺ���
	 * System.in
	 * �ڹٿ��� �̹� �����ϰ� �ִ� Scanner��� Ŭ������ ����Ұ�!
	 * Scanner Ŭ������ �����ϰ� �ִ� �޼ҵ���� ȣ���ؼ� ���
	 */
	
	public void inputTest() {
		
		Scanner sc = new Scanner(System.in);
		// System.in : �Է¹��� ������ �޾Ƶ��̰ڴ�.(����Ʈ������)
		
		// ������� ���������� �Է¹޾� ����غ���!
		
		// �Է¹ް��� �ϴ� ������ ���� �����ؼ� �Է��� ����
		
		System.out.println("�̸��� ��� �Ǽ���? : ");
		
		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ�
		// nextLine(), next()
		// nextLine() : ����ڰ� �Է��� �� �� ����� �����ϰ� �� ������ �� �о�� ���๮�ڸ� ������ ������ (\n�� ������ ����)
		String name = sc.next();   // 1.String name  2.sc.next(); 3.= ������ �۵�
		System.out.println(name + "�� �ȳ��ϼ���!");
		
		// nextInt()		������
		// nextDouble()		�Ǽ���
		System.out.println("���̰� ��� �Ǽ���? :");
		int age = sc.nextInt();					// �Է��� �ϰ� ���͸� ������ int���� \n(����)�� �Բ� �ԷµǴ� �� . buffer���� Ram���� �Ѿ�鼭 int���� �Ű����� \n�� ����
		System.out.println(age + "�� �̽ó׿�!");		
		
		System.out.println("Ű�� ��� �Ǽ���? : ");
		double height = sc.nextDouble();
		System.out.println(height + "cm �ñ���!");
		
		// nextchar ������ ����
		
		
		// nextLine() : ���ۿ��� ���๮��(\n) ���������� ��� ���� ������ �� "���๮��"�� �ٲ��ִ� ����      ,    ���๮�� (\n)�� �����ϰ� ������ ����
		sc.nextLine();		// �����ִ� \n�� �����ֱ� ����
		System.out.println("�ּҴ� ��� �Ǽ���? : ");
		String address = sc.nextLine();		
		// next() : ����ڰ� �Է��� �� �� ������ ���� ��� ���� ���������� �Է��� ����
		System.out.println("�ּ� : " + address);		
		
		
		
	}
	
	
}
