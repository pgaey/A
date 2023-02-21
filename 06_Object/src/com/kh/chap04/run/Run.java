package com.kh.chap04.run;

import com.kh.chap04.model.vo.FieldTest1;
import com.kh.chap04.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		
		// ---------------------- 1. FieldTest1 -----------------------
		
		FieldTest1 f1 = new FieldTest1();
		// 1. stack������ f1�̶�� �������� ����
		// 2. ��ü ���� ��(new Ű���带 ������ ��) global ������� �Ҵ�!
		
		System.out.println(f1.global);		// ?
		f1.testVariable(8);		// �� Ȯ���غ���
		// testVariable ȣ�� �� ! num, local �������� �Ҵ�!!(stack)
		// testVariable ȣ�� ���� �� ! num, local �������� �Ҹ�!
		System.out.println(f1.global);	// ���������� �Ҹ������� field�� �״�� ����
		f1 = null;	/* f1.global ���� �����ַ��� GC�� �;��ϴµ�
					   Fieldtest1 �� ���ϴ� ���� ���� null ���� �����ϸ� 
  					   global ��� �Ұ���
					*/
//		System.out.println(f1.global);
		
		
		
		// ---------------------- 3. FieldTest3 -----------------------
		
		System.out.println(FieldTest3.str);		// ��ü�� �������� �ʰ� static ������ �Ҵ��!!
												// ��, �տ� Ŭ������(FieldTest3.)�� �ٿ�����
		System.out.println(FieldTest3.NUM);
		
		Math.random();
		System.out.println(Math.PI);
		
//		Math m = new Math();	// not visible -> ���������ڰ� private���� ���� -> ��ü������ �ȵ�
		
		
		
		
		
		
		
		
		
		
	}

}
