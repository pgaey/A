package com.kh.chap03.model.vo;

public class Person {

	// 사람의 인적정보
	// 이름, 나이, 성별, 주민번호, 핸드폰번호, 이메일주소
	
	
	// [ 필드부  ]
	
	private String name;
	private int age;
	private char gender;
	private String personId;
	private String phoneNumber;
	private String mail;
	
	// -----[생성자부]
	
	// [ 메소드부  ]
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
