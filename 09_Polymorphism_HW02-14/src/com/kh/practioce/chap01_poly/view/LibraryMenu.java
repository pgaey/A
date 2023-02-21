package com.kh.practioce.chap01_poly.view;

import java.util.Scanner;

import com.kh.practioce.chap01_poly.controller.LibraryController;
import com.kh.practioce.chap01_poly.model.vo.Book;
import com.kh.practioce.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("�̸� : ");
		String sname = sc.nextLine();
		System.out.println("���� : ");
		int sage = sc.nextInt();
		sc.nextLine();
		System.out.println("���� : ");
		char sgender = sc.next().charAt(0);
		
		Member member = new Member();
		
		member.setName(sname);
		member.setAge(sage);
		member.setGender(sgender);
		
		
//		Member member = new Member(sname, sage, sgender);
		lc.insertMember(member);
		
		while(true) {
			System.out.println("==== �޴�  ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			int choice = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(choice) {
			case 1 : System.out.println(lc.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�"); return;
			default : System.out.println("�̻��Ѱ� ��������");
			}
		}
	}
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "������ : " + bList[i].toString());
		}
	}
	public void searchBook() {
		System.out.println("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i = 0; i < searchList.length; i++) {
			if(searchList[i] != null) {
				System.out.println(searchList[i]);
			}
		}
	}
	
	public void rentBook() {
		
		selectAll();
		System.out.println("�뿩�� ���� ��ȣ ���� : ");
		int bookNo = sc.nextInt();
		sc.nextLine();
		int result = lc.rentBook(bookNo);
		switch(result) {
		case 1 : System.out.println("���� �������� �뿩 �Ұ����Դϴ�."); break;
		case 2 : System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���");break;
		case 0 : System.out.println("���������� �뿩�Ǿ����ϴ�.");break;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
