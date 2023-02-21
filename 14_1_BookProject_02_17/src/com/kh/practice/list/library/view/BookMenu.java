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
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : >> ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); break;
			}
		}
	}
	
	// 1. 새 도서 추가용 view 메소드
	public void insertBook() {
		
		System.out.println("1. 도서명 입력 : ");
		String title = sc.nextLine();
		System.out.println("2. 저자명 입력 : ");
		String author = sc.nextLine();
		System.out.println("3. 장르 입력(번호 입력)  (1.인문 / 2.자연과학 / 3.의료 / 4.기타)");
		int category = sc.nextInt();
		sc.nextLine();
		
		String category1 = null;
		switch(category) {
		case 1 : category1 = "인문"; break;
		case 2 : category1 = "자연과학"; break;
		case 3 : category1 = "의료"; break;
		case 4 : category1 = "기타"; break;
		default : System.out.println("잘못 입력하셨습니다."); return; // 이거 return 써야하는지 확인
		}
		
		
		System.out.println("4. 가격 입력 : ");
		int price= sc.nextInt();
		sc.nextLine();
		
		// 5.
		Book book = new Book(title, author, category1, price);
		
		// 6.
		bc.insertBook(book);
		System.out.println("추가 완료");
		System.out.println();
	}
	
	
	public void selectList() {	// 이거 공부
		ArrayList<Book> bookList  = bc.selectList();
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(Object obs : bookList) {
				System.out.println(obs);
			}
		}
		System.out.println();
	}
	public void searchBook() {
		
		System.out.println("검색할 도서명의 키워드를 입력해주세요");
		String keyword = sc.nextLine();
		ArrayList searchList = bc.searchBook(keyword);
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Object obs : searchList) {
				System.out.println(obs);
			}
		}
	}
	public void deleteBook() {
		
		System.out.println("삭제할 도서명 입력 하세요");
		String title = sc.nextLine();
		System.out.println("삭제할 저자명 입력 하세요");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) {		// remove != null 표기 많이 헤맴
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
	}
	public void ascBook() {	// 1반환 어쩌라는건지
		int result = bc.ascBook();
		if(result == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		
		
		
	}
	
	
	
	
	
	
}
