package com.kr.practice.chap01_poly.controller;

import com.kr.practice.chap01_poly.model.vo.AniBook;
import com.kr.practice.chap01_poly.model.vo.Book;
import com.kr.practice.chap01_poly.model.vo.CookBook;
import com.kr.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	
	private Member mem;
	private Book[] bList;
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
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
	public Book[] searchBook(String keyword) {			// 여기를 못푸네
		Book[] arr = new Book[5];						// 5 대신 넣을 수 있는 것 
		int count = 0;									// count 해야하는 이유 생각
		for(int i = 0; i < arr.length; i++) {
			if(bList[i].getTitle().contains(keyword)) { // 여기
				arr[count++] = bList[i];				// 여기
			}
		}
		return arr;
	}
	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index] instanceof AniBook && ((AniBook)bList[index]).getAccessAge() > mem.getAge()) {	// 이거 잘 못함
			result = 1;
		}
		
		if(bList[index] instanceof CookBook && ((CookBook)bList[index]).getCounpon()) {
			mem.setCouponCount(mem.getCouponCount() + 1);	// 이거 잘 못함
			result = 2;
		}
		
		return result;
	}
	
	
	
}
