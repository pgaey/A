package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Soup;

public class Run {

	// ★★★★★ Key + Value 세트로 추가 ★★★★★
	
	public static void main(String[] args) {
		
		// hashMap				Collection이라고는 하나 상속받지 않음
		// [ 표현법   ]
		// HashMap 이름 = new HashMap();
		
		// Key == 식별자 역할  => 찌개 이름
		// Value == 값           => 열량(높으면 맛있음)
		
		HashMap<String, Soup> map = new HashMap();
		
		// 비어있는 해시맵에 추가해보자!!
		// ArrayList, HashSet => add()
		// List계열, Set계열    =>  Collection을 구현한 클래스
		
		// HashMap => put()				Map계열(interface)은 전부 put() 사용해서 넣음
		// => key + value 세트로 추가
		
		// 1. put(K key, V value) : 맵 공간에 key + value 세트로 추가
		map.put("김치찌개(국내산)", new Soup("김치", 1200));
		map.put("순두부김치찌개", new Soup("순두부", 1100));
		map.put("만두김치찌개", new Soup("만두", 1150));
		map.put("참치김치찌개", new Soup("참치", 1120));
		map.put("부대김치찌개", new Soup("소세지", 1300));
		map.put("종합김치찌개", new Soup("다", 1500));
		
		System.out.println(map/*.toString*/);
		// 값 저장 순서 유지 X, Key = Value
		// Key값은 중복 X   =>   Value값은 중복 저장 허용 
		map.put("김치찌개(국내산)", new Soup("돼지고기", 1200));	// Value 값이 덮어씌워짐
		System.out.println(map);
		// 기존 Key값으로 다른 Value값을 추가하면 덮어씌워짐!!!!
		
		// 2. get(Object key) : Object
		// 해당 key값에 해당하는 value값을 반환해주는 메소드
		// Key는 식별자개념 !! => Key로 Value값을 찾아감
		// => 제네릭 설정을 해놨기 때문에 keyType은 String, returnType은 Soup
		
		System.out.println(map.get("종합김치찌개"));
		
		Soup c = map.get("참치김치찌개");				// 좌항 Soup = 우항 Object인데 다운캐스팅 안해도 되네??
													// HashMap<String, Soup> map = new HashMap();
													// Generic을 사용했기 때문 
		// 제네릭 설정을 안해놨으면 매번 다운캐스팅을 했어야 함  		// -> Soup c = map.get("참치김치찌개"); (Soup) 생략
													// => Soup c = (Soup)map.get("참치김치찌개");
		
		// 3. size() : Map에 담겨있는 요소의 개수
		System.out.println(map.size());
		
		// 4. replace(K key, V value) : 해당 키 값을 찾아서 밸류를 변경시켜줌
		map.replace("종합김치찌개", new Soup("종합", 1600));		// put()이랑 비슷하지 않나? put()도 덮어씌우면서 바꿀 수 있는데??
															// put()은 무조건 추가되지만 replce()는 Key값이 없으면 아무일도 일어나지 않음
		map.replace("없는김치찌개", null);
		// 기존에 존재하지 않는 키값을 제시하면 추가 X
		System.out.println(map);
		
		
		// 5. remove(Object key) => 해당 키 값을 찾아서 => 키 + 밸류 세트로 지워주는 메소드
		
		map.remove("순두부김치찌개");
		System.out.println(map);
		
		System.out.println("\n\n");
		System.out.println("------------------------------------------------------------------");
		
		// HashMap에 들어있는 모든 요소들에 순차적으로 접근하고자 한다면..?
		// for문 X : index개념이 없음, 향상된 for문 X
		// List에 addAll하는 방법??
		// Iterator를 쓰는 방법 => 바로 호출 불가
		
		// Map이 가지고 있는 Key값을 Set계열로 바꿔서 => Iterator를 사용할 것
		
		// keySet()을 이용하는 방법
		// => HashMap에서 제공하는 메소드, Set에다가 key들만 담아줌
		// 반환형은 Set
		
		// 1단계. key들만 Set에 담는다.
		Set<String> keyset = map.keySet();		// value 는 중복이 될 수 있기 때문에 key 값을 담음
		
		// 2단계. 1단계에서 만들어진 Set의 내용물들을 Iterator에 담기
		Iterator<String> itKey = keyset.iterator();
		
		// 3단계. Iterator로부터 반복문을 이용해서 순차적으로 key - value 출력
		while(itKey.hasNext()) {
			
			String key = itKey.next();
			System.out.println(key + " - " + map.get(key));
		}
		System.out.print("\n\n");
		System.out.println("------------------------------------------------------------------");
		
		// 2. entrySet() 이용하는 방법
		
		// 1) Map에 있는 Key + Value 세트를
		// Entry형식으로 Set에 담기       반환형 : set
		Set<Entry<String, Soup>> entrySet = map.entrySet();
		
		// Set이기 때문에 일반 for문 불가능.  향상된 for문 써야함
		for(Entry<String, Soup> e : entrySet) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
		/*
		 * Map계열 특성상 요소들에 순차적으로 접근할 직접적인 방법이 없음
		 * 
		 * => Map계열을 Set계열로 바꿔서 => 반복문, ArrayList로 바꿔서 반복문
		 * 
		 * Iterator를 쓰는 방법
		 * 
		 * keySet(), en
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
