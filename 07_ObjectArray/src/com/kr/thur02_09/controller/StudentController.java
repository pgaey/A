package com.kr.thur02_09.controller;

import com.kr.thur02_09.model.vo.Student;

public class StudentController {

	// �ʵ�
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	// �����ں�
	
	public StudentController() {
//		sArr[0] = new Student("��浿", "�ڹ�", 100);
//		sArr[1] = new Student("�ڱ浿", "���", 50);
//		sArr[2] = new Student("�̱浿", "ȭ��", 85);
//		sArr[3] = new Student("���浿", "����", 60);
//		sArr[4] = new Student("ȫ�浿", "�ڹ�", 20);
		
		sArr[0] = new Student();
		sArr[1] = new Student();
		sArr[2] = new Student();
		sArr[3] = new Student();
		sArr[4] = new Student();
		
		sArr[0].setName("��浿");
		sArr[1].setName("�ڱ浿");
		sArr[2].setName("�̱浿");
		sArr[3].setName("���浿");
		sArr[4].setName("ȫ�浿");
		
		sArr[0].setSubject("�ڹ�");
		sArr[1].setSubject("���");
		sArr[2].setSubject("ȭ��");
		sArr[3].setSubject("����");
		sArr[4].setSubject("�ڹ�");
		
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
		dArr[0] = sumScore();				// �ڵ�����ȯ 8byte <- 4byte
		dArr[1] = dArr[0] / sArr.length; 	/*(sumScore() = dArr[0])*/
		return dArr;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
