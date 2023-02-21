package com.kh.chap04_assist.part02_object.run;

import java.util.Scanner;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;

public class Run {

	public static void main(String[] args) {
		
		ObjectDao od = new ObjectDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 이름 입력 > ");
		String fileName = sc.nextLine();
		
//		od.fileSave(fileName);
		od.fileRead(fileName);
				
		
		
		
		
		
	}

}
