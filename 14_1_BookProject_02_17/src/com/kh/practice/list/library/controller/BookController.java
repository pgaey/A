package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	private List bookList = new ArrayList();
	
	public BookController() {
		// �ʱ� �� 4�� �߰�
		bookList.add(new Book("�ڹ��� ����", "���� ��", "��Ÿ", 20000));
		bookList.add(new Book("���� ���� �˰���", "������", "��Ÿ", 15000));
		bookList.add(new Book("��ȭ�� ���", "������", "�ι�", 17500));
		bookList.add(new Book("�� ������", "�ڽſ�", "�Ƿ�", 21000));
	}
	
	
	public void insertBook(Book book) {
//		bookList.add(new Book());		
		bookList.add(book);		// �̰� Ȯ��
	}
	
	
	public ArrayList selectList() {	//�̰� ����
		for(int i = 0; i < bookList.size(); i++) {
			bookList.get(i);
		}
		return (ArrayList)bookList;
	}
	
	public ArrayList searchBook(String keyword) {
		ArrayList searchList = new ArrayList();
		
		for(int i = 0; i < bookList.size(); i++) {
			if(((Book)bookList.get(i)).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		
		for(int i = 0; i < bookList.size(); i++) {
			if(((Book)bookList.get(i)).getTitle().equals(title) && ((Book)bookList.get(i)).getAuthor().equals(author)) {
				removeBook = (Book)bookList.remove(i);
				break;
			}
		} 
		return removeBook;
	}
	
	public int ascBook() {
		int result = 0;
		for(int i = 0; i < bookList.size(); i++) {
			for(int j = i; j < bookList.size(); j++) {
				int q = ((Book)bookList.get(i)).getTitle().compareTo(((Book)bookList.get(j)).getTitle());
				if(q > 0) {
					bookList.add(i, bookList.get(j));
					bookList.remove(j + 1);
					result++;
				} 
			}
		}
		for(int i = 0; i < bookList.size(); i++) {
			for(int j = i; j < bookList.size(); j++) {
				int q = ((Book)bookList.get(i)).getTitle().compareTo(((Book)bookList.get(j)).getTitle());
				if(q < 0) {
					return result = 1;
				}
			}
		}
		return result;
	}
	
}
