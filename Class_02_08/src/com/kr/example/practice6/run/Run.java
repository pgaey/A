package com.kr.example.practice6.run;

import com.kr.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("��", "kh", " �̿���");
		Book b3 = new Book("��", "kh", "�̿���", 8000, 10);
		
		b1.inform();
		b2.inform();
		b3.inform();
		
	}

}
