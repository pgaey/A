package com.kh.edu.run;

import com.kh.edu.model.vo.GameLecture;
import com.kh.edu.model.vo.JavaLecture;
import com.kh.edu.model.vo.Lecture;
import com.kh.edu.model.vo.SecurityLecture;

public class Run {

	public static void main(String[] args) {
		
		JavaLecture lee = new JavaLecture("�̽�ö", "����");
		JavaLecture baek = new JavaLecture("�鵿��", "����");
		JavaLecture park = new JavaLecture("��ż�", "����");
		SecurityLecture min = new SecurityLecture("�κ���", "����");
		SecurityLecture kim = new SecurityLecture("�迵��", "����");
		SecurityLecture jo = new SecurityLecture("������", "����");
		SecurityLecture lim = new SecurityLecture("������", "����");
		GameLecture uh = new GameLecture("���", "����");
		GameLecture you = new GameLecture("������", "����");
		
		
		// ���������� �۾�
		/*
		lee.takeLecture();
		baek.takeLecture();
		park.takeLecture();
		min.takeLecture();
		kim.takeLecture();
		jo.takeLecture();
		lim.takeLecture();
		
		lee.breakTime();
		baek.breakTime();
		park.breakTime();
		min.breakTime();
		kim.breakTime();
		jo.breakTime();
		lim.breakTime();
		*/
		
		/*
		JavaLecture[] jArr = new JavaLecture[3];
		jArr[0] = lee;
		jArr[1] = baek;
		jArr[2] = park;
		
		for(int i= 0; i < jArr.length; i++) {
			jArr[i].takeLecture();
		}
		
		SecurityLecture[] sArr = new SecurityLecture[4];
		sArr[0] = min;
		sArr[1] = kim;
		sArr[2] = jo;
		sArr[3] = lim;
		
		for(int i = 0; i < sArr.length; i++) {
			sArr[i].takeLecture();
		}
		
		GameLecture[] gArr = new GameLecture[2];
		gArr[0] = uh;
		gArr[1] = you;
		
		for(int i = 0; i < gArr.length; i++) {
			gArr[i].takeLecture();
		}
		
		
		
		for(int i = 0; i < jArr.length ; i++) {
			jArr[i].breakTime();
		}
		for(int i = 0; i < sArr.length ; i++) {
			sArr[i].breakTime();
		}
		for(int i = 0; i < gArr.length; i++) {
			gArr[i].breakTime();
		}
		*/
		
		Lecture[] lArr = new Lecture[9];
		
		lArr[0] = lee;
		lArr[1] = baek;
		lArr[2] = park;
		lArr[3] = min;
		lArr[4] = kim;
		lArr[5] = jo;
		lArr[6] = lim;
		lArr[7] = uh;
		lArr[8] = you;
		
		for(int i = 0; i < lArr.length; i++) {
			lArr[i].takeLecture();
		}
		
		for(int i = 0; i < lArr.length; i++) {
			lArr[i].breakTime();
		}
		// ������ ����
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
