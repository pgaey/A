package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		// HashSet											// Collection을 상속받고 있음
		// Value값만 저장, index개념 없음, 순서 보장 X, 중복 X
		// [ 표현법  ]
		// HashSet 객체이름 = new HashSet(); // 빈 HashSet
		
		// 문자열만 담을 수 있는 HashSet		 제네릭 리스트처럼 형태 정하는 거 가능
		HashSet<String> set = new HashSet();
		System.out.println(set);
		
		// 값 추가
		// add(추가할 값)
		set.add("안녕하세요~");
		set.add(new String("반갑습니다~"));		// 객체 생성
		set.add("자바는 오늘 끝입니다~");
		set.add("목요일 평가입니다~");
		set.add("반갑습니다~");					// StringPool에 생성 그러므로  24행("반갑습니다~")과 주소가 다름
		set.add("안녕하세요~");
		set.add("어쩌고저쩌고");
		
		System.out.println(set);	// 저장순서유지 X, 중복 저장 X(중복제거가능)
		
		// 크기 구하기
		// size()
		System.out.println("set의 크기 : " + set.size());
		
		// 요소 삭제
		// remove()
		set.remove("목요일 평가입니다~");		// HashSet : set.remove(value) < index 개념이 없기 때문
		System.out.println(set);		// List : list.remove(int index)
		
		// 모든 요소 삭제
		// clear()
		set.clear();
		System.out.println(set);
		
		
		// Student객체
		HashSet<Student> students = new HashSet();
		
		students.add(new Student("이승철", 20, 100));
		students.add(new Student("이예찬", 30, 100));
		students.add(new Student("홍길동", 18, 200));
		students.add(new Student("박성철", 48, 60));
		students.add(new Student("이승철", 20, 100));
		
		System.out.println(students);
		
		// 저장순서 유지 X, 중복저장????
		// 왜??????????? => 동일 객체로 판단이 되지 않기 때문
		// => String(23 ~ 29행)은 equals가 오버라이딩 되어있어서 같다고 판단되어있고
		// => (51 ~ 55행)은 equals 오버라이딩 X
		// => (51 ~ 55행)의 중복을 없애주려면 VO에 HashSet을 오버라이딩 해줘야함
		// => [VO를 만들 때 작업을 필수]로 해줘야함
		// HashSet의 특징 : 값이 추가 될 때마다 equals()와 hashCode()로 비교 후 둘다 결과가 true일 경우 동일 객체로 판단
		
		// equals() : 현재 객체의 주소값을 비교해서 결과를 반환(같으면 true) : boolean		// Object 클래스
		// hashCode() : 현재 객체의 주소값을 해싱알고리즘을 돌려서 10진수로 반환 : int			// Object 클래스
		
		// ★질문★ 51 ~ 55행이 동일 객체로 판단되지 않는 이유는?
		// 내 대답 : equals()랑 hashCode()가 없으니까 비교할 수가 없어서 그런가..?
		// 정답 : 87행 - 매개변수는 동일하지만 서로 new Student() 이기 때문에 다른 주소값을 가지고 있다.
		// 		그래서 주소값 비교가 아니라 문자열 값 비교처럼 되도록 해줘야함
		
		/*
		 * 정리
		 * 
		 * HashSet에 객체를 담을 대 내부적으로는 equals()와 hashCode()를 기준으로 값이 일치하는지 비교하고 담는다.
		 * --> equals() 결과가 true(이고) hashCode()의 값도 일치하다면 => 동일객체로 판단!(중복저장을 하지 않음!!)
		 * 
		 * Object 클래스
		 * equals() : 두 객체의 주소값을 비교해서 일치하면 true
		 * hashCode() : 객체의 주소값을 해싱해서 10진수 형태로 반환
		 * => 반환한 결과들끼리 비교!!
		 * 
		 * 내용물은 같은데 주소값이 달라서 동일 객체가 아닌 것으로 판단되어 중복저장 => 방지하고 싶다면??
		 * equals()와 hashCode()를 오버라이딩해서 사용해야한다.
		 * 
		 * Student 클래스
		 * 
		 * hashCode() : 세 필드의 값을 하나의 문자열로 만들어서 해시코드 값을 만들어서 반환
		 * equals() : 세 필드의 값이 모두 일치한다면 true
		 * 
		 */
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		
		// HashSet에 들어있는 모든 값들을 출력하는 방법!
		// 1. 반복문	// set의 경우 인덱스 개념이 없기 때문에 그냥 for문은 불가능. -> 향상된 for문을 사용-> 인덱스 개념이 아님.
		for(Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("-------------------------------------------------------------");
		
		// 2. HashSet의 내용물을 ArrayList에 담아서
		// 인덱스를 이용해서 출력
		
		// 1단계 ) ArrayList 생성
		ArrayList list = new ArrayList();
		// 2단계 ) addAll(Collection c)		Collection은 List랑 Set의 최상위 부모. -> Set인 students 사용가능
		list.addAll(students); 
		
		// 1 + 2단계 ) 생성과 동시에 초기화
		ArrayList<Student> stds = new ArrayList(students);
		
		Collections.sort(list, Collections.reverseOrder());	
		
		// 이제는 index개념이 생겼기 때문에 일반 for문 사용 가능
		for(int i = 0; i < students.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("-------------------------------------------------------------");
		
		// 3. Iterator(반복자) => HashSet클래스에서 제공
		// String의 StringTokenizer(11_API)와 비슷한 원리 -> 각 문자열을 토큰으로 처리
		
		Iterator it = students.iterator();		// Set을 Iterator로 바꿈  
		
		/*
		System.out.println(it.next()); 			// next() 를 이용해서 빼냄
		System.out.println(it.next()); 			
		System.out.println(it.next()); 			
		System.out.println(it.next()); 			
//		System.out.println(it.next()); 			다 꺼냈는데 또 꺼내면  java.util.NoSuchElementException << 더 꺼낼 거 없다는 뜻
		*/
		
		while(it.hasNext()) {	// it에 next로 더 빼올 값이 남아있나?? 있으면 true  /  없으면 false		-> 존재할 때만 반복을 돌림
			System.out.println(it.next());
		}
		
		// Iterator() : Set계열과 List계열에서만 호출이 가능!!
		// Map계열에서는 바로 호출이 불가능!!!
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
}