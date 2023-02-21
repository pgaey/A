package com.kh.chap04.model.vo;
/*
 * 필드(field) : 클래스를 구성하는 요소 중 하나!  = 멤버변수, 인스턴스변수
 * 			  	데이터를 저장하기 위한 역할(변수!)
 * 				클래스 내부지만 메소드 밖 영역에 정의함
 * 				
 * 변수 구분
 * - field : 클래스 영역에 바로 선언하는 변수!
 * - local variable (= 지역변수) : 클래스 영역내에 특정한 구역({}) => method, for문 등등..
 * 															for(int i = 0; <- 초기식){}
 * 
 * 1. 전역 변수의 역할을 하는 친구
 * 
 * - 클래스 변수 (static) : static이라는 예약어가 붙은 변수
 * 						생성시점 : 프로그램 시작과 동시에 static 영역에 할당됨		// 애초에 메모리에 할당되는 영역이 다름
 * 						=> 해당 객체를 생성하지 않더라도 무조건 프로그램 실행과 동시에 할당
 * 						소멸시점 : 프로그램이 끝날 때 소멸						// 이런 의미에서 전역변수라고 하는 사람도 있음
 * 						
 * 
 * 
 * - 멤버 변수(field(필드), 인스턴스 변수) : 
 * 							생성시점 : new 키워드를 사용해서 해당 객체를 생성하는 순간 메모리 영역에 할당  // field는 heap영역에 올라감
 * 							소멸시점 : 객체가 소멸될 때 => Garbage Collector
 * 													문제 : OOM(Out Of Memory)가 발생함
 * 
 * 2. 지역변수
 * 							생성시점 : 특정한 영역({})을 실행 시 메모리 영역에 할당 => stack영역!
 * 							소멸시점 : 특정한 영역({})종료 시 소멸
 */

public class FieldTest1 {
	
	
	// 필드(멤버변수, 인스터스 변수)
	public int global;
	
	public void testVariable(int num/*(int num)은 매개변수 = 지역변수*/) {		// test메소드 시작
		// 지역변수를 사용해보자!
		
//		int local; // 지역변수   => 반드시 초기화
//		
//		System.out.println(local);	// (local) 빨간줄 -> 초기화 안해서 !!  -> 지역변수 : 반드시 초기화를 해줘야함!!
		
		int local = 1;
		
		System.out.println(global);	// 필드, 멤버변수
		System.out.println(local);	// 지역변수
		System.out.println(num);	// 매개변수
		
	} // 테스트 메소드 영역 끝
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
