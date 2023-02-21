package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {
	/*
	 * ĸ��ȭ ������ ���� �Ϻ��� Ŭ���� ���¸� ���߰� ����!!
	 * 
	 * ���������� 3��� : ��м�, ���Ἲ, ���뼺
	 * 
	 * ĸ��ȭ�� �������� ������ : �ܺηκ��� ���� ������ �����ϱ� ������ �Ժη� ���� �����ǰų� ��ȸ�� �� ����
	 * 
	 * => ĸ��ȭ : ���� ���� ��� �� �ϳ�!
	 * 
	 * �������� "��������"�� ��Ģ���� �ܺηκ��� ���������� ���� ���!
	 * 
	 * => ĸ��ȭ �۾��� 2�ܰ�
	 * 1. ���� ����� : public���� private���� ���������ڸ� �ٲ��ش�.
	 * 
	 * 2. ���������� ���� ó���� �� �ִ� �޼ҵ带 �����.
	 * 
	 */

	// ���������� (�����) ��ȯ�� �޼ҵ�ĺ���(�Ű�����)
	public static void main(String[] args) {

		Student sim = new Student();
		/*
		sim.name = "������";
		sim.gender = 'F';
		sim.age = 20;

		System.out.println(sim.name);
		System.out.println(sim.gender);					
		System.out.println(sim.age);
		*/
		
		// �ʵ尡 ������ �ʾƼ� ���� �߻�!! => private���� �����߱� ������ ���������� �Ұ� !!
		// ���������� �������� ���������� ������ �� �ְԲ� => getter / setter �޼ҵ� ����� !
		
		sim.setName("������");
		sim.setAge(20);
		sim.setGender('F');
		
//		System.out.println(sim.name);	// ���� ����
		
		sim.getName();		// name ���� ���ƿ�
		String sn = sim.getName();	// ���� ���� ������ ��������
		System.out.println(sn);
		
		sim.getAge();
		int simAge = sim.getAge();
		System.out.println(simAge);
		
		sim.getGender();
		char simGender = sim.getGender();
		System.out.println(simGender);
		
		System.out.println(sim.information());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
