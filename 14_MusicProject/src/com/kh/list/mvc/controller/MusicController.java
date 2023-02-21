package com.kh.list.mvc.controller;

import java.util.ArrayList;

import com.kh.list.mvc.model.dao.MusicDao;
import com.kh.list.mvc.model.vo.Music;


// Controller : 사용자의 요청을 받아서 처리해주는 클래스 처리결과를 View로 반환한다.
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList();
	
	{ // 초기화 블록 : 객체 생성 시 무조건 수행되는 블록					<<< 하는 이유가 이해가 잘 안됨
		list.add(new Music("OMG", "뉴진스"));
		list.add(new Music("ditto", "뉴진스"));
	}
	
		
	// 사용자가 새로운 곡 추가 요청을 할 때마다 실행되는 메소드
	public void insertMusic(String title, String artist) {
		// list에 사용자가 입력한 title과 artist를 가진 Music객체를 추가
		list.add(new Music(title, artist));
	}
	
	
	// 전체 곡 조회 요청 시 실행되는 메소드
	public ArrayList<Music> selectAllMusic() {
		
		for(int i = 0; i < list.size(); i++) {
			
		}
		return list;
	}
	
	// 특정 곡 검색 요청이 있을 때마다 실행되는 메소드
	public ArrayList<Music> searchMusic(String keyword) {
		
		// 검색된 결과가 담길 ArrayList<Music> 객체 생성
		ArrayList<Music> searched = new ArrayList();
		
		// 조회 => 내가 입력한 keyword가 포함된 Music 객체만 조회
		// 1. list의 길이만큼 반복하면서 
		// 2_1. 요소를 하나하나 비교
		// 2_2. 키워드가 요소의 title필드에 포함이 되어있는가?
		// 3. 포함이 되어있다면 요소를 searched 에 추가 
//		int count = 0;
//		String title = ((Music)list.get(count))
				
		for(int i = 0; i < list.size(); i++)/* 1번 끝 */ {
			// 문자열.contains(포함되어있는지 궁금한 문자열)
			// 해당 문자열이 포함되어있다면 true / 없으면 false 반환
			if(list.get(i).getTitle().contains(keyword)) {
				searched.add(list.get(i));
			}
		}
		return searched;
	}
	
	// 특정 곡을 삭제 요청 시 마다 실행할 메소드
	public int deleteMusic(String title) {
		
		// 결과를 담을 변수 먼저 선언 초기화
		int result = 0; // 삭제가 진행될 횟수
		
		// 처리
		// 전체 곡 목록 중에서(반복문)
		
		for(int i = 0; i < list.size(); i++) {
			// 요소의 곡 제목이 사용자가 입력한 그 무언가와 동일하다면(조건문)
			if(list.get(i).getTitle().equals(title)) {
				// 그 요소를 제거한다 remove()
				list.remove(i);					// 이거 알아야함
				// 삭제 횟수를 증가시킨다.
				result++;
			}
		}
		return result;	// result가 0 이라면 삭제가 이루어지지 않았다.
	}
	
	// 특정 곡 수정 요청 시 실행할 메소드
	public int updateMusic(String title, String updateTitle, String updateArtist) {
		// 결과를 담을 변수 먼저 생성
		int result = 0; // 곡 수정 횟수
		
		// 처리
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)){
				// 방법 1. 이것도 맞음 
//				list.set(i, new Music(updateTitle, updateArtist));
				// 방법 2. 다른 방법
				list.get(i).setTitle(updateTitle);
				list.get(i).setTitle(updateArtist);
				result++;
			}
		}
		return result;	// 0이라면 수정이 이루어지지 않았다는 뜻!
	}
	
	// 무조건 처리는 Controller에서
	public void outputFile(){
		
		new MusicDao().outputFile(list);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
