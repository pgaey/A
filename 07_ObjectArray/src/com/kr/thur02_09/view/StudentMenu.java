package com.kr.thur02_09.view;

import com.kr.thur02_09.controller.StudentController;
import com.kr.thur02_09.model.vo.Student;

public class StudentMenu {
	
	//필드부
	private StudentController ssm = new StudentController();

	
	
	// 생성자부
	public StudentMenu() {
		
		System.out.println("========== 학생 정보 출력  ==========");
//		for(int i = 0; i < ssm.printStudent().length; i++) {
//			System.out.println(ssm.printStudent()[i].inform());
//		}
		Student[] sArr = ssm.printStudent();	// import 필요
												// 변수로 빼두면 한번의 수정으로 모든 걸 수정할 필요가 없음
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		
		System.out.println("========== 학생 성적 출력  ==========");
		
		double[] dArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int)dArr[0]);
		System.out.println("학생 점수 평균 : " + dArr[1]);
		
		System.out.println("========== 성적 결과 출력  ==========");
		
		for(int i = 0; i < sArr.length; i++) {
			if(ssm.CUT_LINE > sArr[i].getScore()) {		// 비교대상(sArr[i].getScore())을 앞에 두는 것이 좋음
				System.out.println(sArr[i].getName() + "학생은 재시험 대상입니다.");		// 우선조건을 if문에 먼저 넣는 것이 유리
			}else {
				System.out.println(sArr[i].getName() + "학생은 통과입니다.");
			}
		}
	}
}
