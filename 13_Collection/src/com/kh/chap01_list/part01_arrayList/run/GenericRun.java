package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class GenericRun {

	public static void main(String[] args) {
		
		/*
		 * 제네릭<Generic> 	<E>					E : elements(요소)
		 * 컬렉션 안에서 다룰 타입들을 미리 지정해주는 역할 > 명시적으로 <Music>, <String> ....
		 * => 내가 사용하고 싶은 타입만 사용할 수 있게 도와준다.
		 * 
		 * 별도의 제네릭 제시 없이 컬렉션 객체 생성 시 (E == Object)
		 * 
		 * 제네릭을 쓰는 이유
		 * 1. 저장할 타입의 제한을 두기 위해서	(실수를 줄일 수 있다)
		 * 2. 매 번 형변환하는 절차를 없앨 수 있음
		 * 
		 */
		
		
		// 컬렉션 생성 시 제네릭을 설정
		// [ 표현법  ]
		// ArrayList<E> list = new ArrayList();
		
//		ArrayList<Music> list = new ArrayList<Music>();  이게 정석으로 적는 방법
//		ArrayList<Music> list = new ArrayList();	<Music> 생략가능
		List<Music> list = new ArrayList();		// List는 인터페이스.
												// 나중에 다형성을 적용할 가능성을 염두하고 List<Music>으로.
		System.out.println(list);
		
		// 값 추가
		list.add(new Music("OMG", "뉴진스"));
		list.add(new Music("Ditto", "뉴진스"));
		list.add(new Music("hypeboy", "뉴진스"));
		// list.add("끝!");
		
		System.out.println(list);
		
		
		list.get(0); 		// 이걸 변수로 빼보자
		Music m = list.get(0);		// 이유 : 이미 위에 List<Music>으로 Music형태를 선언했기 때문에
									// 다운 캐스팅을 할 필요가 없음.
	
		System.out.println(list.get(0).getTitle());
		
		for(Music music : list) {			// 그냥 ArrayList와 향상된 for문 돌리는 차이가 있음
			System.out.println(music);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
