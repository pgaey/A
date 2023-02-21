package com.kh.list.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.list.mvc.controller.MusicController;
import com.kh.list.mvc.model.vo.Music;

// View : 시각적인 요소, 입/출력
public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// 메인화면
	public void	mainMenu() {								// 대부분 출력이라 반환해줄 것이 없음 -> void
		//ArrayList
		while(true) {										// 사용자가 계속 볼 수 있는
			System.out.println(" *** 음악은 역시 소리바다 *** ");
			System.out.println("1. 새로운 곡 추가");	// add()
			System.out.println("2. 전체 곡 조회");	// toString() or 반복문
			System.out.println("3. 특정 곡 검색");	// 반복문 + get()
			System.out.println("4. 특정 곡 삭제"); 	// 반복문 + remove()
			System.out.println("5. 특정 곡 수정");	// 반복문 + set()
			System.out.println("6. 플레이리스트 파일로 출력");	// I/O
			System.out.println("0. 프로그램 종료");	
			System.out.println();
			
			System.out.print("원하는 메뉴를 선택하세요 > ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu){
			case 1 : insertMusic(); break;
			case 2 : selectAllMusic(); break;
			case 3 : searchMusic(); break;
			case 4 : deleteMusic(); break;
			case 5 : updateMusic(); break;
			case 6 : mc.outputFile(); System.out.println("파일 내보내기 했어요 ~ "); break;
			case 0 : System.out.println("프로그램을 종료합니다"); return;
			default : System.out.println("없는 메뉴입니다. 다시 선택해주세요!");	// default 후에 어차피 나가니까 break; 안씀
			}
		}
	}
	
	// 1. 새로운 곡을 추가할 수 있는 화면
	private void insertMusic() {					// 이 메뉴가 밖에서도 접근되지 않도록 접근자 private
		System.out.println("----- 곡 추가 -----");
		System.out.println("곡명을 입력해주세요 > ");
		String title = sc.nextLine();
		System.out.println("가수명을 입력해주세요 > ");
		String artist = sc.nextLine();
		
		// 요청 => 플레이리스트에 title이라는 제목을 가지고 artist라는 가수명을 가진 Music을 추가해줘
		
		mc.insertMusic(title, artist);
		System.out.println("추가 완료");
		System.out.println();
	}
	
	// 2. 전체 곡 조회를 할 수 있는 화면
	private void selectAllMusic() {
		System.out.println("----- 전체 곡 조회  -----");
		
		// 요청
		ArrayList<Music> list = mc.selectAllMusic();
		
		if(list.isEmpty()) { // 플레이리스트에 곡이 하나도 없을 경우
			System.out.println("리스트에 곡이 존재하지 않습니다.");
		} else { // 곡이 하나라도 있을 경우 
			for(Music m : list) {		// ★★★★★★★이거 공부해야할 듯★★★★★★★★
				System.out.println(m);
			}
		}
		System.out.println();
	} 
	
	// 3. 특정 곡을 검색할 수 있는 화면
	private void searchMusic() {					// 이 부분 공부해야할 듯
		System.out.println("----- 곡 검색  -----");
		System.out.println("검색어를 입력해 주세요");
		String keyword = sc.nextLine();
		
		// 요청
		ArrayList<Music> searched = mc.searchMusic(keyword);
		System.out.println("검색 결과");
		
		if(searched.isEmpty()) { // 없을 경우(리스트가 비어있을 경우)
			System.out.println("조회된 결과가 존재하지 않습니다.");
		} else {	// 있을경우
			System.out.println("조회 결과는 " + searched.size() + "건 입니다.");
			for(Music m : searched) {
				System.out.println("곡 명 : " + m.getTitle() + ", 가수명 : " + m.getArtist() + "입니다.");
			}
		}
	}
	
	
	// 4. 특정 곡을 삭제할 수 있는 화면 = 곡명과 일치하는.
	private void deleteMusic() {
		System.out.println("----- 곡 삭제  -----");
		System.out.println("삭제하고 싶은 곡의 제목을 입력해주세요");
		String title = sc.nextLine();
		
		// 요청
		int result = mc.deleteMusic(title);
		
		// 결과 값이 0이면 삭제된 게 없다고 호출해야함
		if(result > 0) {
			System.out.println("성공적으로 삭제 !");
		} else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
		System.out.println();
	}

	// 기존 곡명을 입력 받아서 수정할 곡명, 수정할 가수명으로 수정하기
	// 5. 특정 곡을 수정할 수 있는 화면
	private void updateMusic() {
		
		System.out.println("곡 정보 수정 !");
		
		// 기존곡명(검색용도), 수정할 곡명, 수정할 가수명(수정할 용도)
		System.out.println("기존의 곡명을 입력하세요");
		String title = sc.nextLine();
		
		System.out.println("수정할 곡명 > ");
		String updateTitle = sc.nextLine();
		
		System.out.println("수정할 가수명 >");
		String updateArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, updateTitle, updateArtist);
		
		// 결과 값이 0이면 삭제된 게 없다고 호출해야함
		if(result > 0) {
			System.out.println("성공적으로 수정 !");
		} else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
}
