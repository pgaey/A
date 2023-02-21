package com.kr.thur02_09.controller;

import com.kr.thur02_09.model.vo.Student;

public class StudentController {

	// 필드
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	// 생성자부
	
	public StudentController() {
//		sArr[0] = new Student("김길동", "자바", 100);
//		sArr[1] = new Student("박길동", "디비", 50);
//		sArr[2] = new Student("이길동", "화면", 85);
//		sArr[3] = new Student("정길동", "서버", 60);
//		sArr[4] = new Student("홍길동", "자바", 20);
		
		sArr[0] = new Student();
		sArr[1] = new Student();
		sArr[2] = new Student();
		sArr[3] = new Student();
		sArr[4] = new Student();
		
		sArr[0].setName("김길동");
		sArr[1].setName("박길동");
		sArr[2].setName("이길동");
		sArr[3].setName("정길동");
		sArr[4].setName("홍길동");
		
		sArr[0].setSubject("자바");
		sArr[1].setSubject("디비");
		sArr[2].setSubject("화면");
		sArr[3].setSubject("서버");
		sArr[4].setSubject("자바");
		
		sArr[0].setScore(100);
		sArr[1].setScore(50);
		sArr[2].setScore(85);
		sArr[3].setScore(60);
		sArr[4].setScore(20);
	}
			
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] dArr = new double[2];
		dArr[0] = sumScore();				// 자동형변환 8byte <- 4byte
		dArr[1] = dArr[0] / sArr.length; 	/*(sumScore() = dArr[0])*/
		return dArr;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
