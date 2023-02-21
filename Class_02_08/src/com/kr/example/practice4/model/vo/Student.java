package com.kr.example.practice4.model.vo;

public class Student {
	
	private int grade = 5;
	private int classroom = 1;
	private String name = "이예찬";
	private double height = 100;
	private char gender = 'M';
	
	
	public Student() {
		
	}
	
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public void inform() {
		System.out.println("학년 : " + grade +
				"반 : " + classroom +
				"이름 : " + name +
				"키 : " + height +
				"성별 : " + gender);
	}
	
	
}
