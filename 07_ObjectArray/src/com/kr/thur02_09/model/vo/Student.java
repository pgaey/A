package com.kr.thur02_09.model.vo;

public class Student {
	
	// �ʵ�
	private String name;
	private String subject;
	private int score;
	
	
	
	// �����ں�
	public Student() {}
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// �޼ҵ��
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	
	
	public String inform() {
		return "�̸� : " + name + "  / ���� : " + subject + "  / ���� : " + score; 
	}
	
	
	
	
	
	
	
	
	
	
}
