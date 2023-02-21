package com.kh.chap02.encapsulation.model.vo;

// �ʵ��, �����ں�, �޼ҵ��

public class Student {
	
	// �ʵ�� 
	/*
	 * ������ ��� �κ�
	 * 
	 * �ʵ� == ������� 				== Ŭ��������  == �ν��Ͻ�����
 	 * 
 	 * ���������� �ڷ��� �ʵ���;
	 */
	private String name;		// private�� ��� Student Ŭ���� �ȿ����� ����
	private char gender;
	private int age;
	
	// �����ں�
	
	// �޼ҵ��
	/*
	 * ����� �����ϴ� �κ�
	 * 
	 * ���������� ��ȯ�� �޼ҵ�ĺ���(�Ű�����) {	
	 * 			�޼ҵ� ȣ�� �� ������ �ڵ�;
	 * }
	 * 
	 * ���������� : ȣ���� �� �ִ� ������ �������ش�.
	 * ��ȯ�� : �޼ҵ��� ������� �ڷ����� �������ش�. || void -> ������ ���� ����.
	 * �Ű����� : �޼ҵ� ȣ�� �� �Է°��� �޾��ִ� ����. �ش� �޼ҵ� ���������� ����� �����ϴ�. ���� ����
	 * 
	 */
	
	// �����͸� ��� �� �����ϴ� ����� �޼ҵ� : setter()
	
	/*
	 * ��Ģ
	 * 
	 * 1. setter�޼ҵ�� ���� �����ϵ��� ������ �ϱ� ������ public ���������ڸ� �̿�
	 * 2. set�ʵ������ �̸� ���� ��Ÿ��ǥ���(camelCase)�� ��Ű���� �Ѵ�!!!!!!!!
	 * 		ex) setName(), setAge(), setGender()
	 * 3. ��� �ʵ忡 ���ؼ� ���� �� �ۼ��� ������Ѵ�. �ݵ��!!!!!!!!!!!!!!!!!!!!(������ ����)
	 */
	
	// �̸��� ��� �� ������ �� �ִ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
		// Ư�� ���� �ȿ����� �ش� �����ȿ� �ִ� �������� �켱���� ����!
		// this. �� ������ ������ �Ű����� name = �Ű����� name �̷��� �ν��� !
	}
	
	// ���̸� ��� �� ������ �� �ִ� �޼ҵ�
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("���̸�??");
		} else {
			this.age = age;
		}
	}
	
	// ������ ��� �� ������ �� �ִ� �޼ҵ�
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// �����͸� ��ȯ���ִ� ����� �޼ҵ� : getter()
	
	/*
	 * 1. getter()�� ����������public�� ����Ѵ�.
	 * 2. get�ʵ������ ����, ��Ÿ��ǥ���(camelCase)�� ����Ѵ�.
	 * 		ex) getName(), getAge(), getGender()
	 * 3. ��� �ʵ忡 ���ؼ� �� �ۼ�������Ѵ�!!!!!!!!!!!!!!!!!!!(�� ���� ����)
	 */
	
	// �̸��� ��ȯ���ִ� �޼ҵ�
	public String/*��ȯ�� : � ������ ���� �����ٰų� : return name; ���� name�� String*/ getName() {
		// ���� �θ� ������ name�ʵ尪�� �Ѱ��ְ� �;�.
		return name;
		// return �����; => �������, ���� �θ� ������ �����ְڴ�!!!
		// �޼ҵ��� ��ȯ���� ��ȯ���� �ڷ����� �������� Ȯ���ؾ���!.
		// void���� return�� �����Ǿ�����.
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	// ���ڰ� �޼ҵ�!
	public String information() {
		
		// ������� return�� �Ѱ� 
//		String info = name + "���� ���̴� " + age + "���̰� ������ " + gender + "�Դϴ�.";
//		return info;
		
		return name + "���� ���̴� " + age + "���̰� ������ " + gender + "�Դϴ�.";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
