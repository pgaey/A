package com.kh.practioce.chap01_poly.view;

import java.util.Scanner;

import com.kh.practioce.chap01_poly.controller.LibraryController;
import com.kh.practioce.chap01_poly.model.vo.Book;
import com.kh.practioce.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("이름 : ");
		String sname = sc.nextLine();
		System.out.println("나이 : ");
		int sage = sc.nextInt();
		sc.nextLine();
		System.out.println("성별 : ");
		char sgender = sc.next().charAt(0);
		
		Member member = new Member();
		
		member.setName(sname);
		member.setAge(sage);
		member.setGender(sgender);
		
		
//		Member member = new Member(sname, sage, sgender);
		lc.insertMember(member);
		
		while(true) {
			System.out.println("==== 메뉴  ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(choice) {
			case 1 : System.out.println(lc.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다"); return;
			default : System.out.println("이상한거 누르지마");
			}
		}
	}
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "번도서 : " + bList[i].toString());
		}
	}
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
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
		System.out.println("대여할 도서 번호 선택 : ");
		int bookNo = sc.nextInt();
		sc.nextLine();
		int result = lc.rentBook(bookNo);
		switch(result) {
		case 1 : System.out.println("나이 제한으로 대여 불가능입니다."); break;
		case 2 : System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");break;
		case 0 : System.out.println("성공적으로 대여되었습니다.");break;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
