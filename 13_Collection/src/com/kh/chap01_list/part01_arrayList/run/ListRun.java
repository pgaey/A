package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {

	public static void main(String[] args) {
		/*
		 * 컬렉션 (Collection Framework)
		 * 
		 * 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"
		 * 
		 * - 자료구조 : 데이터들을 효율적으로 다루는데(조회, 정렬, 추가, 수정, 삭제 등) 필요한 개념
		 * 
		 * - 프레임워크 : 효율적인 기능들이 이미 정의되어있는 틀
		 * 
		 * 데이터들이 새롭게 추가되거나, 삭제되거나, 수정되는 기능(알고리즘)들이 이미 정의되어있는 틀
		 * 
		 * 
		 * 배열과 컬렉션의 차이점
		 * - 배열의 단점
		 * 1. 한 타입의 데이터들만 저장 가능
		 * 2. 배열을 사용하려 할 때 먼저 크기를 저장해야함
		 * => 한 번 지정된 크기는 변경이 불가능
		 * 새로운 값을 추가하고 싶으면 크기가 넘치니까 새로운 크기의 배열을 만들고 기존의 내용들을 복사하는 코드를 내가 짜야함
		 * 3. 배열 중간 위치에 새로운 값을 추가하거나 삭제하는 경우 기존의 값들을 땡겨주거나, 밀어주는 코드를 직접 짜야함
		 * 
		 * 
		 * 
		 * - 컬렉션의 장점
		 * 1. 기본적으로 여러 타입의 데이터들을 저장 가능
		 * => 같은 타입의 데이터들만 묶어서도 저장 가능
		 * (제네릭 설정을 통해 한 타입의 데이터들만 묶을 수 있게끔도 만들 수 있음)
		 * 2.크기에 제약이 없음
		 * => 굳이 크기 지정을 하지 않아도 된다.
		 * => 만약 내가 크기지정을 했고, 크기를 넘어서는 값을 더 추가하고자 할 때 알아서 크기가 늘어난다.
		 * 3. 중간에 값을 추가하거나 삭제하는 경우 값을 땡겨주거나 밀어주는 코드가 이미 메소드로 정의되어 있음
		 * => 그때그때 필요한 메소드들을 호출해서 쓰면 된다!!!!!!!!!
		 * 
		 * 방대한 데이터들을 담아만두고  "조회"만 할 목적 => 배열
		 * 방대한 데이터들을 추가, 수정, 삭제 할 경우 => 컬렉션
		 * 
		 * 컬렉션의 종류
		 * 
		 * - List 계열 : 담고자하는 값(Value)만 저장 / 저장 시 순서 유지(Index), 중복값 허용
		 * 				예 ) ArrayList, LinkedList, Vector
		 * 					ArrayList
		 * 
		 * - Set 계열 : 담고자하는 값(Value)만 저장 / 저장 시 순서 유지 XXX, 중복값 허용 XXX
		 * 				예 ) HashSet, TreeSet 
		 * 					HashSet
		 * 
		 * - Map 계열 : 키(Key) + 값(Value) 세트로 저장 / 저장 시 순서 유지 XXX, 중복 키 허용 XXX / 중복 값 허용
		 * 				예 ) HashMap, HashTable, TreeMap, Properties
		 * 					HashMap, Properties
		 */
		
		
		// ArrayList의 선언 방법 			// 내가 이렇게 작동되게 만들어볼 것
		// [ 표현법   ]
		// ArrayList 리스트식별자 = new ArrayList();
		// 1. 크기를 따로 지정하지 않는 방법
		// ArrayList 리스트식별자 = new ArrayList(크기);
		// 2. 크기만큼 만들겠다. 크기의 범위를 벗어날 경우 자동으로 늘어남
		
		ArrayList list = new ArrayList(3);
		// 내부적으로 크기가 3칸짜리인 ArrayList를 만들겠다!!!
		
		System.out.println(list.toString());
		
		// 1. 비어있는 list에 요소를 추가하자!!  => Music 객체로 만들어서 추가해보자!!!!!
		// add(E e) : 해당 리스트에 마지막에 인자로 전달된 요소를 추가해주는 메소드		E는 Object라고 생각 
		// E --> element : 제네릭 
		list.add(new Music("Hypeboy", "뉴진스"));
		list.add(new Music("개화", "루시"));
		list.add(new Music("LoveDive", "Ive"));
		// 순서가 유지되면서 요소가 추가된다.(Index 개념)
		list.add("끝!");		// 3칸 만들었는데 추가됌, 타입이 다른데 들어감.
		// 크기가 늘어난다. 여러 종류의 요소를 담을 수 있다.
		
		System.out.println(list);
		
		
		// add메소드 사용 시 오버로딩 된 형태를 사용해보자
		// add(int index, E e) : List의 index위치에 전달된 요소(e)를 추가해주는 메소드
		list.add(0, "시작1");
		list.add(3, new Music("ditto", "뉴진스"));
		// 중간에 값 추가 시 알아서 기존의 값들을 뒤로 한 칸씩 밀어주는 작업이 내부적으로 진행됨
		System.out.println(list);
		
		
		// 2. 값을 추가해봤으니까 수정
		// set(int index)
		list.set(2, new Music("흔들의자", "구원찬"));
		System.out.println(list);
		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ삭제시작ㅡㅡㅡㅡㅡㅡㅡ");
		// 3. 요소를 삭제!
		// remove(int index) : List의 index위치에 담긴 요소를 삭제해주는 메소드
		list.remove(0);
		System.out.println("3번 인덱스[ditto, 뉴진스] 삭제 : \n" + list);
		String str = (String)list.remove(4); // IndexOutOfBoundsException : index 발생!! Index의 값을 잘 고려해서 지워야함!!
		System.out.println(str);
		System.out.println(list);
		
		Music m = (Music)list.remove(0);
		
		System.out.println(m.getArtist() + "의 " + m.getTitle() + "이(가) 삭제되었습니다!!");
		

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		// 4. 리스트의 크기를 반환해보자
		// size() : 리스트에 담겨있는 요소의 개수
		// 기본적으로 10칸.
		// 늘려야하면 기존 칸의 50%가 늘어남
		System.out.println("리스트에 담긴 요소의 개수 : " + list.size());
		
		System.out.println("리스트에 마지막 인덱스 번호 : " + (list.size() - 1)); // 연산우선순위확인
		
		list.add(1, new Music("OMG", "뉴진스"));
		System.out.println(list);
		
		// 5. 리스트의 해당 index위치에 담긴 요소를 반환해주는 메소드
		// get(int index) : E
		System.out.println("\n 5. 리스트의 해당 index위치에 담긴 요소를 반환해주는 메소드 : get ");
		Music music = (Music)list.get(1);
		System.out.println(music); 		// "OMG", "뉴진스"가 나와야하지만
										// music 객체를 선언했기 때문에 뒤에     .toString이 자동으로 붙는다
										// 그래서 music.toString이 선언된다.
		
		// 1번 인덱스의 곡 제목을 출력하고 싶다.
		String title = ((Music)list.get(1)).getTitle();
		System.out.println("1번 인덱스의 곡 제목 : " + title);
		
		// index개념 + get() => 반복문
		// 1번째 곡 : OMG
		// 2번째 곡 : hypeboy
		// 3번째 곡 : ditto
		// 4번째 곡 : lovedive
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 곡 " + ((Music)list.get(i)).getTitle());
		}
		
		// 향상된 for문 => 값을 조회하는 목적으로 사용이 가능
		// for(값을 받아줄 변수 : 순차적으로 접근할 배열 또는 컬렉션)
		for(Object obj : list) {
			System.out.println(obj);
		}
		//★★★★★위에 Object는  list안에 있는 형과 식별자 즉, list배열안에 도는 Music형과 관련이 있다.
		//	Music O, ArrayList X
		
		
		
		// 6. 리스트의 부분만 추출
		// subList(int index1, int index2) : List   // 반환형이 List 
		// index1부터 index2까지의 데이터값들을 추출해서 새로운 리스트 반환
		
		System.out.println("\n6. 리스트의 부분만 추출 ");
		List sub = list.subList(0, 2);
		
		System.out.println(sub);
		
		//혼자해보는거 [시작]
		System.out.println("혼자");
		List sub1 = list.subList(1, 2);
		List sub2 = list.subList(0, 1);
		sub1.addAll(sub2);
		System.out.println(sub1);		// 이거 왜 불가? 값 형태 때문같은데....
		//[끝]
		
		
		
		
		
		// 7. 리스트 + 리스트
		//allAll(Collection c) : 해당 리스트에 다른 컬렉션에 잇는 데이터들을 통채로 추가해주는 메소드	Collection은 List랑 Set의 최상위 부모
		System.out.println("\n 7. 리스트 + 리스트 ");	
		System.out.println("원래 list : \n" + list);
		list.addAll(sub);
		System.out.println("allAll 사용한 버전 \n" + list);		// 데이터(Value)값이 중복 가능
		
		
		// 8. 리스트 비어있는지 확인하는 메소드
		// isEmpty() : 요소가 없으면 true / 요소가 하나라도 존재한다면 false   반환형 boolean
		System.out.println("\n8. 리스트 비어있는지 확인하는 메소드 : isEmpty()");
		System.out.println(list.isEmpty());
		System.out.println(!list.isEmpty());
		
		
		// 9. 해당 리스트를 비워주는 메소드
		// clear()
		System.out.println("\n9.해당 리스트를 비워주는 메소드 : clear() ");
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
