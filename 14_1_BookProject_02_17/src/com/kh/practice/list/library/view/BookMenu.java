package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
																		// view
	public void mainMenu() {
		System.out.println(" == Welcome KH Library == ");
		
		while(true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : >> ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); break;
			}
		}
	}
	
	// 1. �� ���� �߰��� view �޼ҵ�
	public void insertBook() {
		
		System.out.println("1. ������ �Է� : ");
		String title = sc.nextLine();
		System.out.println("2. ���ڸ� �Է� : ");
		String author = sc.nextLine();
		System.out.println("3. �帣 �Է�(��ȣ �Է�)  (1.�ι� / 2.�ڿ����� / 3.�Ƿ� / 4.��Ÿ)");
		int category = sc.nextInt();
		sc.nextLine();
		
		String category1 = null;
		switch(category) {
		case 1 : category1 = "�ι�"; break;
		case 2 : category1 = "�ڿ�����"; break;
		case 3 : category1 = "�Ƿ�"; break;
		case 4 : category1 = "��Ÿ"; break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); return; // �̰� return ����ϴ��� Ȯ��
		}
		
		
		System.out.println("4. ���� �Է� : ");
		int price= sc.nextInt();
		sc.nextLine();
		
		// 5.
		Book book = new Book(title, author, category1, price);
		
		// 6.
		bc.insertBook(book);
		System.out.println("�߰� �Ϸ�");
		System.out.println();
	}
	
	
	public void selectList() {	// �̰� ����
		ArrayList<Book> bookList  = bc.selectList();
		if(bookList.isEmpty()) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			for(Object obs : bookList) {
				System.out.println(obs);
			}
		}
		System.out.println();
	}
	public void searchBook() {
		
		System.out.println("�˻��� �������� Ű���带 �Է����ּ���");
		String keyword = sc.nextLine();
		ArrayList searchList = bc.searchBook(keyword);
		if(searchList.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(Object obs : searchList) {
				System.out.println(obs);
			}
		}
	}
	public void deleteBook() {
		
		System.out.println("������ ������ �Է� �ϼ���");
		String title = sc.nextLine();
		System.out.println("������ ���ڸ� �Է� �ϼ���");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) {		// remove != null ǥ�� ���� ���
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
		
	}
	public void ascBook() {	// 1��ȯ ��¼��°���
		int result = bc.ascBook();
		if(result == 1) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		
		
	}
	
	
	
	
	
	
}
