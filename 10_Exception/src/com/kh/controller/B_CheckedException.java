package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	
	/*
	 * CheckedException
	 * 
	 * 문법적으로 반드시 예외처리를 해야하는 예외들!
	 * => 주로 외부 매체 어떤 입/출력 시 발생!!
	 * 
	 */
	
	public void method1() throws IOException {
		System.out.println("아무 문자열이나 입력해주세요 > ");
		/*
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// Scanner의 조상같은 느낌
		
		
		// 방법 1. try ~ catch문으로 처리 : 내가 해결하겠다.
		/*
//		String str = "";		// (2). 초기화를 해주지 않으면 sysout구문에서 str.length 를 돌릴 수 없음
		
		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(단, 문자열로만 가능)
		try {
			
			str = br.readLine(); // 이 메소드 호출 시 IOException 발생할 수 있음	// (1). str은 지역변수라 try구문을 나가면 죽음.

		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("문자열의 길이 : " + str.length());
		*/
		
		
		
		
		// 방법 2. throws : 지금 여기서(method1())에서 말고 이 메소드를 호출한 곳에서 예외를 위임해서 처리하게끔 하겠다.
		String str = br.readLine();
		System.out.println("문자열의 길이 : " + str.length());
		
		
	}
	
	public void method2() {
		try {
			method1();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
