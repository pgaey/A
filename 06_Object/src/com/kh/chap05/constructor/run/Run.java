package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		 
		// 1. 기본 생성자를 사용해서 객체를 생성
		User user = new User();		// new 뒤에 User() 가 '생성자'이다.
		
		// 2. 객체 생성과 동시에 필드값을 초기화
		// 아이디, 비번, 이름
		User user02 = new User("user02", "pass02", "유저02");
		System.out.println(user02.information());
		
		System.out.println("------------------------------------------");
		
		// 3. 생성자로 모든 필드 초기화!
		User user03 = new User("user03", "pass03", "user03", 25);
		System.out.println(user03.information());
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
}
