package com.kh.controller;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	// ���ڿ��� �и���Ű�� ���
	
	String str = "��������ʹ�, �ָ�������, ���½ð��̿�, ������";
	
	// 1. �����ڸ� �����ؼ� �ش� ���ڿ��� �и���Ű�� ��� => �迭�̿�
	// 2. �и��� ������ ���ڿ��� ��ū���� ����ϴ� ��� => ��ū�̿�
	
	
	// ��� 1.
	public void method1() {
		// ���ڿ�.split(String ������) : String[]
		String[] arr = str.split(", ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		// ���� for�� : �ʱ��, ���ǽ� , ������ �Ⱦ� !!!
		// [ ǥ����  ]
		// for(���� �޾��� ���� ���� : ���������� ��ҿ� ������ �迭(�÷���)) {   }
		for(String s : arr) {
			System.out.println(s);
		}
		// ��¸� ����
		// �迭�� ���� ������ ���� ����
	}
	
	// ��� 2.
	public void method2() {
		
		// ������ ���ڿ��� ��ū���� ó��
		// java.util.StringTokenizer Ŭ������ �̿��ϴ� ���
		// ��ü ����
		// StringTokenizer stn = new StringTokenizer(���ڿ�, ",");
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("�и��� ���ڿ��� ���� : " + stn.countTokens());
		// 										   countTokens() �и��� ���ڿ��� ������ ��ȯ���ִ� �޼ҵ�
		
		// ���� �и��� ���빰�� ����ʹٸ�...??
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		// �����ִ� ��ū�� ���� ���¿��� nextToken()�� ȣ���ϸ�..?
		
		System.out.println(stn.nextToken());
		*/
		
		while(stn.hasMoreTokens()) {
			   // hasMoreTokens -> ���� �ִ� ��ū�� ������ True, ������ false
			   // stn�� ���� �ִ� ��ū�� �ִٸ� true, ���ٸ� false
			System.out.println(stn.nextToken());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
