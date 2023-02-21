package com.kh.controller;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	// 문자열을 분리시키는 방법
	
	String str = "집에가고싶다, 주말언제와, 쉬는시간이요, 졸려요";
	
	// 1. 구분자를 제시해서 해당 문자열을 분리시키는 방법 => 배열이용
	// 2. 분리된 각각의 문자열을 토큰으로 취급하는 방법 => 토큰이용
	
	
	// 방법 1.
	public void method1() {
		// 문자열.split(String 구분자) : String[]
		String[] arr = str.split(", ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		// 향상된 for문 : 초기식, 조건식 , 증감식 안씀 !!!
		// [ 표현법  ]
		// for(값을 받아줄 변수 선언 : 순차적으로 요소에 접근할 배열(컬렉션)) {   }
		for(String s : arr) {
			System.out.println(s);
		}
		// 출력만 가능
		// 배열의 값을 수정할 수는 없음
	}
	
	// 방법 2.
	public void method2() {
		
		// 각각의 문자열을 토큰으로 처리
		// java.util.StringTokenizer 클래스를 이용하는 방법
		// 객체 생성
		// StringTokenizer stn = new StringTokenizer(문자열, ",");
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("분리된 문자열의 개수 : " + stn.countTokens());
		// 										   countTokens() 분리된 문자열의 개수를 반환해주는 메소드
		
		// 실제 분리된 내용물을 보고싶다면...??
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		// 남아있는 토큰이 없는 상태에서 nextToken()을 호출하면..?
		
		System.out.println(stn.nextToken());
		*/
		
		while(stn.hasMoreTokens()) {
			   // hasMoreTokens -> 남아 있는 토큰이 있으면 True, 없으면 false
			   // stn에 남아 있는 토큰이 있다면 true, 없다면 false
			System.out.println(stn.nextToken());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
