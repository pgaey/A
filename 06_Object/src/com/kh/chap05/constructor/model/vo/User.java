package com.kh.chap05.constructor.model.vo;

public class User {
	
	// [ �ʵ��  ]
	// ȸ�����̵�, ��й�ȣ, �̸�, ����
	
	private String id;
	private String password;
	private String name;
	private int age;
	
	
	// [ �����ں�  ]
	/*
	 * ������(Constructor) : �ĺ��ڰ� Ŭ�����ĺ��ڿ� �����ϰ� ��ȯ���� ���� �޼ҵ�
	 * 
	 * ���� ) �޼ҵ�
	 * ���������� ��ȯ�� �޼ҵ��̸�(�Ű�����(��������)){
	 * 
	 * }
	 * 
	 * [ ǥ����  ]
	 * public Ŭ�����̸�(�Ű�����(��������)){
	 * 		�ش� �����ڸ� ���ؼ� ��ü ���� �� �����ϰ��� �ϴ� �ڵ�;
	 * }
	 * 
	 * �����ڸ� �ۼ��ϴ� ����
	 * 1. ��ü�� �������ֱ� ���ؼ�		
	 * 2. ��ü�� ���� �Ӹ� �ƴ϶� ��ȿ�� �ִ� ��ü�� ����� ���ؼ�
	 * 
	 * �������� ����
	 * 1. �Ű������� ���� ������ => �⺻������
	 * 2. �Ű������� �ִ� ������
	 * -> ������ : �ʵ忡 ���� �ʱ�ȭ �� �� �ִ��� ������ ����
	 * 
	 * ������ �ۼ� �� ���ǻ���!!
	 * 1. �ݵ��!!!!!!!!!!!!! �������� �̸��� Ŭ������ �̸��� �����ؾ��Ѵ�!!(��/�ҹ���)
	 * 2. ��ȯ���� �������� �ʴ´�.
	 * 3. �����ڸ� ������ ������ ���������� �Ű������� �ߺ��Ǿ �ȵ�!! => �����ε�
	 * 4. �Ű����� �����ڸ� ��������� �ۼ��ϰԵǸ� �⺻�����ڸ� JVM�� �ȸ���� ��!!!
	 * 
	 * => �⺻�����ڸ� ����� ������ �� ���̴°� ����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 */
	
//	public User() {
//		// �⺻������(�Ű������� ����)
//		/*
//		 * ���� ��ü�� ������ �������� ��� => heap������ �Ҵ��� �� ������ Ȯ���� ��!
//		 * �⺻�����ڴ� �����ص� ������ ���� ����!
//		 * �����ڸ� �ϳ��� �ȸ���� JVM�� �⺻�����ڸ� �ڵ����� �������!
//		 * -> �⺻�����ڴ� "�׻�" �ۼ��ؾ��Ѵ�.
//		 */
//		System.out.println("ȸ������ ����!");
//	}
	
	public User() {} // �̰� ������ �� ����� !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	// �Ű����� �ִ� ������
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public User(String id, String name, String password, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	
	// [ �޼ҵ��  ]	method : Ư�� �ڷ����� ��밡���� �Լ�
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	public String information() {
		return "���̵� : " + id + "\n��й�ȣ : " + password + "\n�̸� : " + name + "\n���� : " + age;
	}
	
	
	
	
	
	
	
	
	
	

}
