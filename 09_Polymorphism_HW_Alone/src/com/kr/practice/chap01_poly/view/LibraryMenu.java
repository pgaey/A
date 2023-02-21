package com.kr.practice.chap01_poly.view;

import java.util.Scanner;

import com.kr.practice.chap01_poly.controller.LibraryController;
import com.kr.practice.chap01_poly.model.vo.Book;
import com.kr.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	private LibraryController lc;
	private Scanner sc;
	
	public void mainMenu() {
		System.out.println("�̸� �Է� : ");
		String sname = sc.nextLine();
		System.out.println("���� �Է� : ");
		int sage = sc.nextInt();
		sc.nextLine();
		System.out.println("���� �Է� : ");
		char sgender = sc.nextLine().charAt(0);
		
		Member mem = new Member(sname, sage, sgender);
		lc.insertMember(mem);
		
		while(true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.println("�޴���ȣ : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : System.out.println(lc.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : return;								// return �ؾ��ϴ� ����, �ϸ� ���� ������
															// default
			}
		}
	}
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "������ : " + bList[i]);
		}
	}
	public void searchBook() {
		System.out.println("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i = 0; i < searchList.length; i++) {
//			if�� �־����, �� �־���ϴ���
			System.out.println(searchList[i]);
		}
	}
	
	public void rentBook() {
		
		selectAll();
		System.out.println("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		sc.nextLine();
		int result = lc.rentBook(index);
		switch(result) {
		case 0 : System.out.println("���������� �뿩�Ǿ����ϴ�."); break;
		case 1 : System.out.println("���� �������� �뿩 �Ұ����Դϴ�."); break;
		case 2 : System.out.println("���������� �뿩, ���� �߱� Ȯ���ϼ���"); break;
		}
		
		
	}
	
	
	
	
}
