package com.kh.chap03.model.vo;

public class Person {

	// ����� ��������
	// �̸�, ����, ����, �ֹι�ȣ, �ڵ�����ȣ, �̸����ּ�
	
	
	// [ �ʵ��  ]
	
	private String name;
	private int age;
	private char gender;
	private String personId;
	private String phoneNumber;
	private String mail;
	
	// -----[�����ں�]
	
	// [ �޼ҵ��  ]
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPersonId() {
		return personId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getMail() {
		return mail;
	}
	
	// information
	public String information() {
		return name + age + gender + personId + phoneNumber +mail;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
