package com.kh.model.vo;

public class JavaLecture extends Lecture {
	
	public JavaLecture() {}
	public JavaLecture(String name, String major) {
		super(name, major);
	}
	
	@Override
	public void takeLecture() {
		System.out.println("�ڹ� ���� �����մϴ� ~ ");
	}
	
	
	
	
	
	
	
	
	
	
}
