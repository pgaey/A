package com.kh.chap03.run;

import com.kh.chap03.model.vo.Person;
import com.kh.chap03.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		// ���� ���� ������ �ڷ���(1. �����ڷ���, 2. �ּҰ��� ����, 3. �������� �ڷ����� �������� ���� ���� + ���)
		// == ����� ���� �ڷ���
		// Person�̶�� Ŭ������ ���� ��ü ����
		
		Person person = new Person(); // �ν��Ͻ�ȭ		instance �� object�� �Ȱ��� ��
		// person�� ���ǻ� ��ü��� �θ����� �����δ� heap �޸𸮿� �ö� �ִ�
		
		System.out.println(person.information());
		// �⺻���� ������� -> �⺻�� 0, 0.0, ''  // �������� null
		
		
		person.setName("�̿���");
		person.setAge(30);
		person.setGender('M');
		person.setPersonId("940607");
		person.setPhoneNumber("01088677338");
		person.setMail("pgaey");
		
//		String name = person.getName();
//		int age = person.getAge();
//		char gender = person.getGender();
//		String personId = person.getPersonId();
//		String phoneNumber = person.getPhoneNumber();
//		String mail = person.getMail();
		
		System.out.println(person.information());
		
//		-----------------------------------------------------------------
		
		System.out.println("------------------------------------------");
		
		Product pd = new Product();
		
		System.out.println(pd.information());
		
		pd.setPrice(10000);
		pd.setColor("����");
		pd.setProductName("?");	
		
		System.out.println(pd.information());
		
		

	}

	
	
	
	
	
	
	
	
	
}
