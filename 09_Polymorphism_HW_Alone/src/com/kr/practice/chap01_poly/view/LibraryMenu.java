package com.kr.practice.chap01_poly.view;

import java.util.Scanner;

import com.kr.practice.chap01_poly.controller.LibraryController;
import com.kr.practice.chap01_poly.model.vo.Book;
import com.kr.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	private LibraryController lc;
	private Scanner sc;
	
	public void mainMenu() {
		System.out.println("이름 입력 : ");
		String sname = sc.nextLine();
		System.out.println("나이 입력 : ");
		int sage = sc.nextInt();
		sc.nextLine();
		System.out.println("성별 입력 : ");
		char sgender = sc.nextLine().charAt(0);
		
		Member mem = new Member(sname, sage, sgender);
		lc.insertMember(mem);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴번호 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : System.out.println(lc.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : return;								// return 해야하는 이유, 하면 어디로 가는지
															// default
			}
		}
	}
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "번도서 : " + bList[i]);
		}
	}
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i = 0; i < searchList.length; i++) {
//			if문 넣어야함, 왜 넣어야하는지
			System.out.println(searchList[i]);
		}
	}
	
	public void rentBook() {
		
		selectAll();
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		sc.nextLine();
		int result = lc.rentBook(index);
		switch(result) {
		case 0 : System.out.println("성공적으로 대여되었습니다."); break;
		case 1 : System.out.println("나이 제한으로 대여 불가능입니다."); break;
		case 2 : System.out.println("성공적으로 대여, 쿠폰 발급 확인하세요"); break;
		}
		
		
	}
	
	
	
	
}
