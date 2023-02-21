package com.kh.model.vo;

public class SecurityLecture extends Lecture {
	
	public SecurityLecture() {}
	public SecurityLecture(String name, String major) {
		super(name, major);
	}
	
	@Override
	public void takeLecture() {
		System.out.println("보안 강의 시작합니다 ~ ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
