package com.kr.example.practice4.model.vo;

public class Student {
	
	private int grade = 5;
	private int classroom = 1;
	private String name = "�̿���";
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
		System.out.println("�г� : " + grade +
				"�� : " + classroom +
				"�̸� : " + name +
				"Ű : " + height +
				"���� : " + gender);
	}
	
	
}
