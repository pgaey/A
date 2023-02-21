package com.kr.thur02_09.view;

import com.kr.thur02_09.controller.StudentController;
import com.kr.thur02_09.model.vo.Student;

public class StudentMenu {
	
	//�ʵ��
	private StudentController ssm = new StudentController();

	
	
	// �����ں�
	public StudentMenu() {
		
		System.out.println("========== �л� ���� ���  ==========");
//		for(int i = 0; i < ssm.printStudent().length; i++) {
//			System.out.println(ssm.printStudent()[i].inform());
//		}
		Student[] sArr = ssm.printStudent();	// import �ʿ�
												// ������ ���θ� �ѹ��� �������� ��� �� ������ �ʿ䰡 ����
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		
		System.out.println("========== �л� ���� ���  ==========");
		
		double[] dArr = ssm.avgScore();
		System.out.println("�л� ���� �հ� : " + (int)dArr[0]);
		System.out.println("�л� ���� ��� : " + dArr[1]);
		
		System.out.println("========== ���� ��� ���  ==========");
		
		for(int i = 0; i < sArr.length; i++) {
			if(ssm.CUT_LINE > sArr[i].getScore()) {		// �񱳴��(sArr[i].getScore())�� �տ� �δ� ���� ����
				System.out.println(sArr[i].getName() + "�л��� ����� ����Դϴ�.");		// �켱������ if���� ���� �ִ� ���� ����
			}else {
				System.out.println(sArr[i].getName() + "�л��� ����Դϴ�.");
			}
		}
	}
}
