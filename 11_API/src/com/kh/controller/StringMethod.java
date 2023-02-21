package com.kh.controller;

import java.util.Scanner;

public class StringMethod {

	// ���ڿ��� ���õ� �޼ҵ��
	
	public void method1() {
		
		String str1 = "��Ƿ������� ����������";
		
		// 1. ���ڿ�.charAt(int index) : char
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. ���ڿ�.concat(String str) : String			�޼ҵ�ü�̴�
		// => ���ڿ��� ���޹��� �� �ٸ� ���ڿ��� �ϳ��� ���ļ� ��ȯ
		String str2 = str1.concat(" �ʹ� ���ƿ�").concat("!!!!").concat(" ��������");
		System.out.println(str2);
		
		
		
//					.length �� �ʵ�
		// 3. ���ڿ�.length() : int
		// => ���ڿ��� ���̸� ��ȯ
		System.out.println("str1�� ���� : " + str1.length());
		
		// 4. ���ڿ�.substring(int beginindex) : String
		// => ���ڿ��� beginindex�� ��ġ���� ���ڿ� ������ ���ڿ��� �����ؼ� ��ȯ
		// ���ڿ�.substring(int beginindex, int endindex) : String
		// => ���ڿ��� beginindex�� ��ġ���� endindex������ ���ڿ��� �����ؼ� ��ȯ 
		
		System.out.println(str1.substring(6));		// index���� ~
		System.out.println(str1.substring(0, 6));	
		// index ��ȣ ������ Į�� �ڸ��ٰ� �����ϸ� �� ��
		
		
		
		// 5. ���ڿ�.replace(CharSequence old, CharSequence new) : String
		// ���ڿ����� old���ڸ� new ���ڷ� ��ȯ�� ���ڿ��� ��ȯ
		//				   CharSequence ���� ���ڿ�(String)�� ������ �� �ִ� �ϳ��� �ڷ���
		String str3 = str1.replace("��Ƿ�", "K");
		System.out.println(str3);
		
		
		// 6. ���ڿ�.trim() : String
		// => ���ڿ��� �� �� ������ ������ ���ڿ��� ��ȯ
		String str4 = "				Java				";
		System.out.println(str4.trim()); 		// ��� ������ �ȳ���
		
		
		// 7. ���ڿ�.toUppereCase() : String
		// ��� ���ڿ��� �빮�ڷ� ���� �� ���ڿ� ��ȯ
		//	     ���ڿ�.toLowerCase() : String   ¦��
		// ��� ���ڿ��� �ҹ��ڷ� ���� �� ���ڿ� ��ȯ
		
		System.out.println(str4.toUpperCase());
		System.out.println(str4.toLowerCase());

		
		// 8. ���ڿ�.toCharArray() : char[]
		// => ���ڿ��� �� ���ڵ��� char[]�� �Űܴ��� �� �ش� �迭�� ��ȯ
		char[] chArr = str1.toCharArray();
		for(int i = 0; i <chArr.length; i++) {
			System.out.print(chArr[i] + " ");
		}
		System.out.println();
		// char[] -> String 
		char[] arr = {'a', 'p', 'p', 'l', 'e'};
		char apple = 'a' + 'p' + 'p' + 'l' + 'e';
		System.out.println(apple);
		
		System.out.println("�ѤѤѤѤѤѤѤѱ����ڤѤѤѤѤѤѤѤѤѤ�");
				
		System.out.println(String.valueOf(arr)); 		// ������ -> String���� �ٲ�߰ڴ� ������� �ٷ�  valueOf
		
		
	}
	
	
	public void method2() {
		
		
		// �����Ͻðڽ��ϱ�?(Y/N) : Y�ƴϸ� N�Է¹ޱ�
		// ����� ��
		// 1. y
		// 2. n
		// 3. Y
		// 4. N
		
		
		
		
		// 5. ����
		// 6. �� ��..
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻðڽ��ϱ�? (Y/N) : ");
		
		char ch = sc.nextLine().toUpperCase().charAt(0);		// �޼ҵ�ü�̴�
		
		
		if(ch == 'Y') {
			System.out.println("���� ~ ");
			return;
		} else if(ch == 'N') {
			System.out.println("���� ���� ~ ");
		} else {
			System.out.println("??");
		}
		
		
		
		
		
		
		
	}
	
	
	
}
