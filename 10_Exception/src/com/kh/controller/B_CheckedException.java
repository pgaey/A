package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/*
	 * CheckedException
	 * 
	 * ���������� �ݵ�� ����ó���� �ؾ��ϴ� ���ܵ�!
	 * => �ַ� �ܺ� ��ü � ��/��� �� �߻�!!
	 * 
	 */
	
	public void method1() throws IOException {
		System.out.println("�ƹ� ���ڿ��̳� �Է����ּ��� > ");
		/*
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// Scanner�� ������ ����
		
		
		// ��� 1. try ~ catch������ ó�� : ���� �ذ��ϰڴ�.
		/*
//		String str = "";		// (2). �ʱ�ȭ�� ������ ������ sysout�������� str.length �� ���� �� ����
		
		// Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü(��, ���ڿ��θ� ����)
		try {
			
			str = br.readLine(); // �� �޼ҵ� ȣ�� �� IOException �߻��� �� ����	// (1). str�� ���������� try������ ������ ����.

		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���ڿ��� ���� : " + str.length());
		*/
		
		
		
		
		// ��� 2. throws : ���� ���⼭(method1())���� ���� �� �޼ҵ带 ȣ���� ������ ���ܸ� �����ؼ� ó���ϰԲ� �ϰڴ�.
		String str = br.readLine();
		System.out.println("���ڿ��� ���� : " + str.length());
		
		
	}
	
	public void method2() {
		try {
			method1();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
