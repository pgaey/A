package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Dog;

public class Run {

	public static void main(String[] args) {

		/*
		 * ��ü���� ���α׷��� : ���Ǽ��迡���� �������� ����(��ü)�� �Ӽ��� ������ ������ ����,
		 * 				    ��ü���� ��ȣ�ۿ��� ���α׷��־��� �����ϴ� ��.
		 * 
		 * �����ϰ��� �ϴ� ���α׷����� ��ü(����)�� ����� ���ؼ���(�����ϱ� ���ؼ���)
		 * => Ŭ������� Ʋ�� ���� ������ �Ѵ�.
		 * Ŭ������?? �� ��ü�� ����(�Ӽ�(����), ����(�޼ҵ�))���� ��Ƴ��� �׸� �Ǵ� Ʋ
		 * 
		 * 
		 * Ŭ���� : VO(Value Object),	����������ڷ���
		 */
		
		// �̸�, ��, ����, ����, ����, ������
		// �������� ������ 	�̸��� ũ����
		// 				   ���� ����ġ�ҵ�
		//				������ ����
		//				���̴� 3��
		//				������ ��������
		//			      �����Դ� 2kg
		
		Dog d1 = new Dog();	// �����ڷ���
				// new Ű���� ���!! �޸��� heap������ �Ҵ� => ��ü�� �����Ѵ�.
		Dog d2 = new Dog();
				//
		
		
		d1.name = "ũ����";
		d1.breed = "����ġ�ҵ�";
		d1.gender = "����";
		d1.age = 3;
		d1.owner = "������";				
		d1.weight = 2;					// ������ stack���� �ʵ�� heap����
		
		System.out.println(d1.name + "�� " + d1.breed + "�̰�, "
				 + d1.gender + "�̸�, ���̴� " + d1.age + "���̰�, ������ " + d1.owner
				  + "�̸�, �����Դ� " + d1.weight + "kg �Դϴ�.");		// �ʵ� �������� 
		
		d2.name = "�ϴ�";
		d2.breed = "�ڽ���Ʈ";
		d2.gender = "����";
		d2.age = 1;
		d2.owner = "�̽�ö";
		d2.weight = 1;
		
		System.out.println(d2.name + "�� " + d2.breed + "�̰� ������ " + 
						   d2.gender + "�̸�, ���̴� " + d2.age + "�� �̰�, ������ " +
						   d2.owner + "�̸�, �����Դ� " + d2.weight + "kg�Դϴ�.");
		
		d1.bow();
		d2.bow();
		
		d1.eat(1);
		
		System.out.println(d1.name + "���� �����Դ� : " + d1.weight);
		
		for(int i = 0; i< 100; i++) {
			d1.eat(1);
		}
		
		System.out.println(d1.name + "���� �����Դ� : " + d1.weight);
		
		d1.age = 99;
		
		System.out.println(d1.age + "��");
		
		
		
		
		
		
		
		
		
		
	}
	
	


	
	
	
	
	
	

}
