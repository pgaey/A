package com.kh.model.vo;

public class GameLecture extends Lecture {
	
	public GameLecture() {}
	public GameLecture(String name, String major) {
		super(name, major);
	}

	
	@Override
	public void takeLecture() {
		System.out.println("���� ���� �����մϴ�.");
	}
	
	
	
	
	
	
}



