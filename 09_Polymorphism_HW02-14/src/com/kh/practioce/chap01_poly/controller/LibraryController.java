package com.kh.practioce.chap01_poly.controller;

import com.kh.practioce.chap01_poly.model.vo.AniBook;
import com.kh.practioce.chap01_poly.model.vo.Book;
import com.kh.practioce.chap01_poly.model.vo.CookBook;
import com.kh.practioce.chap01_poly.model.vo.Member;

public class LibraryController {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	public Member myInfo() {
		return mem;
	}
	public Book[] selectAll() {
		return bList;
	}
	public Book[] searchBook(String keyword) {
		Book[] books = new Book[bList.length];
		int count = 0;
		for(int i = 0; i < books.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				books[count++] = bList[i];
			};
		}
		return books;
	}
	public int rentBook(int index) {
		int result = 0;
			
		if(bList[index] instanceof AniBook && mem.getAge() <= ((AniBook)bList[index]).getAccessAge()) {
			result = 1;
		}
		
		if(bList[index] instanceof CookBook && ((CookBook)bList[index]).getCoupon()) {
			mem.setCouponCount(mem.getCouponCount() + 1);
			result = 2;
		}
		
		// result = 0 => ��ȭå�� �� ���Ȱų� �丮������ ���� å�� �� ������ ���
		// result = 1 => ��ȭå�� ���������� �ɷ��� �� ������ ���
		// result = 2 => �丮������ �߱޹ް� �丮å�� �� ������ ���
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
