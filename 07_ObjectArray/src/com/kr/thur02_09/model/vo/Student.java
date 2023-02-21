package com.kr.thur02_09.model.vo;

public class Student {
	
	// 필드
	private String name;
	private String subject;
	private int score;
	
	
	
	// 생성자부
	public Student() {}
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// 메소드부
	
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
		return "이름 : " + name + "  / 과목 : " + subject + "  / 점수 : " + score; 
	}
	
	
	
	
	
	
	
	
	
	
}
