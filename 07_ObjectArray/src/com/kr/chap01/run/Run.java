package com.kr.chap01.run;

import java.util.Scanner;

import com.kr.chap01.model.vo.Coffee;

public class Run {

	public static void main(String[] args) {
		
		Coffee c1 = new Coffee();
//		System.out.println(c1.information());
		
		Coffee c2 = new Coffee();
		c2.setCoffeeName("�Ƹ޸�ī��");
		c2.setPrice(3000);
//		System.out.println(c2.information());
		
		Coffee c3 = new Coffee("��", 5000, "�ڹٻ�", "Venti");
//		System.out.println(c3.information());
		
		// Ŀ���� ������ �Է¹޾Ƽ� �Է¹��� Ŀ�ǵ��� ������ ������ִ� ���α׷�
		// 3�� Ŀ���� ������ �Է¹ްڴٰ� ����!
		// �Է��� ��ĳ�ʸ� ���!
		
		c1 = null;
		c2 = null;
		c3 = null;
		
//		System.out.println("Ŀ�� ������ : ");
//		String size = sc.nextLine();
//		
//		System.out.println("Ŀ�� ���� : ");
//		int price = sc.nextInt();
//		
//		System.out.println("Ŀ�� �̸� : ");
//		String name = sc.nextLine();
//		
//		System.out.println("���� : ");
//		String bean = sc.nextLine();
		
		
//		c3 = new Coffee(name, price, bean, size);
//		System.out.println(c3.information());
		
		
			Scanner sc = new Scanner(System.in);
			
			for(int i = 0; i < 3; i++) {
			
				System.out.println("Ŀ�� �̸� : ");
				String name = sc.nextLine();
				
				System.out.println("Ŀ�� ���� : ");
				int price = sc.nextInt();
				sc.nextLine(); // sc.nextInt�� �ϸ� ���๮�ڰ� ���⶧���� ��������� 
				
				System.out.println("���� : ");
				String bean = sc.nextLine();
				
				System.out.println("Ŀ�� ������ : ");
				String size = sc.nextLine();
			
				if(i == 0) {
					c1 = new Coffee(name, price, bean, size);
				} else if(i == 1) {
					c2 = new Coffee(name, price, bean, size);
				} else {
					c3 = new Coffee(name, price, bean, size);
				}
			}
			
			
			
			
				
				System.out.println(c1.information());
				System.out.println(c2.information());
				System.out.println(c3.information());
				
				
			// ����ڷκ��� ��� ���� Ŀ�Ǹ� �Է� �޾Ƽ�
			// ��ü Ŀ�ǵ��� �̸��� �ϳ��ϳ� ���ؼ� ��ġ�ϴ� Ŀ���� ������ �˷�����.
				
		
		System.out.println("��� ���� Ŀ�� �̸� �Է� : ");
		String buy = sc.nextLine();
		
		if(buy.equals(c1.getCoffeeName())) {
			System.out.println(c1.getCoffeeName() + "�� ���� : " + c1.getPrice());
		}
		if(buy.equals(c2.getCoffeeName())) {
			System.out.println(c2.getCoffeeName() + "�� ���� : " + c2.getPrice());
		}
		if(buy.equals(c3.getCoffeeName())) {
			System.out.println(c3.getCoffeeName() + "�� ���� : " + c3.getPrice());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
