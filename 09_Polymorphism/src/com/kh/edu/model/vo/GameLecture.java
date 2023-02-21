package com.kh.model.vo;

public class GameLecture extends Lecture {
	
	public GameLecture() {}
	public GameLecture(String name, String major) {
		super(name, major);
	}

	
	@Override
	public void takeLecture() {
		System.out.println("게임 강의 시작합니다.");
	}
	
	
	
	
	
	
}



