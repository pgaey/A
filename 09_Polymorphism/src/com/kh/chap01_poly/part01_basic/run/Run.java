package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.vo.Child1;
import com.kh.chap01_poly.part01_basic.vo.Child2;
import com.kh.chap01_poly.part01_basic.vo.Parent;

public class Run {
	/*
	 * 
	 * �١١١١١١١١١١١١١١١١١١١١١١١١١١� Ÿ�� �١١١١١١١١١١١١١١١١١١١١١١١١١١�
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		// �θ𲨴� ����, ������ ����
		
		// =
		// �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� �纯�� �ڷ����� ���ƾ��Ѵ� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		
		// 1. �θ� Ÿ�� �ڷ������� �θ� ��ü�� �ٷ�� ���
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild1(); �ڽĲ��� ���� �ƴ�....
		// p1���δ� Parent���� ���ٰ���
		
		// 2. �ڽ� Ÿ�� �ڷ������� �ڽ� ��ü�� �ٷ�� ��� 
		Child1 c1 = new Child1();
		c1.printChild1();	// ���� ���� ~
		c1.printParent();	// �θ𲯵� ���� ~
		// c1���δ� Parent, Child1�� �� �� ���ٰ���
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤ�3. �θ�Ÿ�� �ڷ������� �ڽ� ��ü�� �ٷ�� ���ѤѤѤѤѤѤѤѤѤѤѤ�");
		// 3. �θ�Ÿ�� �ڷ������� �ڽ� ��ü�� �ٷ�� ���		=> ������ ����
		Parent p2 = (Parent)/*�� ������ ��*/new Child1();
		p2.printParent();
//		p2.printChild1();
		// p2�δ� Parent�� ������ ����
		// ������ �ڷ����� �ٸ����� �ұ��ϰ� ������ ���� ����
		
//		(Child1)p2.printChild1();		// p2.printChild1 �� ���� �Ͼ�� (Child1) �� �ִ� ���� �� ������ �Ǳ� ������ �ȉ�
		((Child1)p2).printChild1();  	// �̷��� ��ȣ�� �켱������ �ٲپ� �ָ� ������
		
//		p2 �� child1 ��ü�ε�  Parent���̶� printChild1(); ȣ���� �ȵ����� [����]�� (Child1)�� ����ȯ�� ���༭ �� �� �ְ� ���ش�.
		
		
		
		
//		Child1 c2 = (Child1)new Parent();
//		c2.printChild1();
		
		
		/*
		 * Ŭ���� �� ��ȯ
		 * 
		 * '��ӱ���'�� ��쿡�� Ŭ�������� ����ȯ�� �����ϴ�
		 * 
		 * 1. Upcasting
		 * 
		 * �ڽ�Ÿ�� => �θ�Ÿ��
		 * ������ �����ϴ�.		30���� c1.printParent(); ��� (Parent)c1.printParent(); �� �տ� (Parent)�� ����������
		 * 
		 * ex ) �ڽ�.�θ�޼ҵ�();
		 * 
		 * 
		 * 2. Down Casting
		 * 
		 * �θ�Ÿ�� => �ڽ�Ÿ��
		 * ������ �Ұ����ϴ�.
		 * 
		 * ex ) ((�ڽ�)�θ�).�ڽĸ޼ҵ�(); 
		 * 
		 */
		
		// �������� ����ϸ� ���� ������??
		// �迭�� �Ẹ��
		// �迭�� Ư¡ == �� ������ �ڷ����� ������ ��� ������ ����
		
		// ������ ���� ��
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 3);
		arr1[1] = new Child1(2, 3, 4);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(3, 4, 5);
		arr2[1] = new Child2(4, 5, 6);
		
		System.out.println("----- �������� �����ϱ� �� �迭 -----");
		arr1[0].printChild1();
		arr1[1].printChild1();
		arr2[0].printChild2();
		arr2[1].printChild2();
		
		System.out.println("----- �������� ������ �迭 -----");
		Parent[] arr = new Parent[4];
		arr[0] = /*(Parent)*/new Child1(4, 5, 6);
		arr[1] = /*(Parent)*/new Child2(2, 5, 6);
		arr[2] = /*(Parent)*/new Child2(7, 5, 3);
		arr[3] = /*(Parent)*/new Child1(3, 2, 1);
		
		// printParent() �޼ҵ�ȣ��
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
		}
		// printChild1(), printChild2() ȣ���� �ϰ� �ʹ�!!!
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n---------------- ������ ------------------");
		System.out.println("�������̵� ����");
		for(int i = 0; i < arr.length; i++) {
			/*
			if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			*/
		
			/*
			 * 
			 * instanceof ������ => true / false
			 * 
			 * 
			 * ���� ���۷����� ���������� � Ŭ���� Ÿ���� �����ϰ� �մ��� Ȯ���� �� ���
			 */
			/*
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			arr[i].print();
			// �� �迭�� �ε����� �������� ����
			// "�� �θ�� ~ " 4�� ��������
			
			/*
			 * ���� ���ε� : ���α׷� ���� �� ������ �Ǹ鼭 �������ε�(�ڷ����� �޼ҵ带 ����Ŵ)
			 * 
			 * 				��, ���������� �����ϴ� �ڽ�Ŭ������ �ش� �޼ҵ尡 �������̵� �Ǿ��ִٸ�
			 * 				���α׷� ���� �� �������� �ڽ�Ŭ������ �������̵� �� �޼ҵ带 ã�Ƽ� ����
			 * 
			 */
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}