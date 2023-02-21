package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	private List bookList = new ArrayList();
	
	public BookController() {
		// 초기 값 4개 추가
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	
	public void insertBook(Book book) {
//		bookList.add(new Book());		
		bookList.add(book);		// 이거 확인
	}
	
	
	public ArrayList selectList() {	//이거 공부
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
