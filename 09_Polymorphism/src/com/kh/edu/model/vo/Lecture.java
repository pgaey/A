package com.kh.model.vo;

public class Lecture {
	
	private String name;
	private String major;
	
	public Lecture() {}
	public Lecture(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void takeLecture() {
		System.out.println("���� �����մϴ� ~");
	}
	public void breakTime() {
		System.out.println("10�� ���ϴ� ~");
	}
	
	

}
