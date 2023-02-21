package com.kh.controller;

import java.util.Scanner;

public class StringMethod {

	// 문자열과 관련된 메소드들
	
	public void method1() {
		
		String str1 = "경실련하이텔 정보교육원";
		
		// 1. 문자열.charAt(int index) : char
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String			메소드체이닝
		// => 문자열과 전달받은 또 다른 문자열을 하나로 합쳐서 반환
		String str2 = str1.concat(" 너무 좋아요").concat("!!!!").concat(" 하하하하");
		System.out.println(str2);
		
		
		
//					.length 는 필드
		// 3. 문자열.length() : int
		// => 문자열의 길이를 반환
		System.out.println("str1의 길이 : " + str1.length());
		
		// 4. 문자열.substring(int beginindex) : String
		// => 문자열의 beginindex의 위치에서 문자열 끝까지 문자열을 추출해서 반환
		// 문자열.substring(int beginindex, int endindex) : String
		// => 문자열의 beginindex의 위치에서 endindex까지만 문자열을 추출해서 반환 
		
		System.out.println(str1.substring(6));		// index부터 ~
		System.out.println(str1.substring(0, 6));	
		// index 번호 라인을 칼로 자른다고 생각하면 될 듯
		
		
		
		// 5. 문자열.replace(CharSequence old, CharSequence new) : String
		// 문자열에서 old문자를 new 문자로 변환한 문자열을 반환
		//				   CharSequence 또한 문자열(String)을 저장할 수 있는 하나의 자료형
		String str3 = str1.replace("경실련", "K");
		System.out.println(str3);
		
		
		// 6. 문자열.trim() : String
		// => 문자열의 앞 뒤 공백을 제거한 문자열을 반환
		String str4 = "				Java				";
		System.out.println(str4.trim()); 		// 가운데 공백은 안날림
		
		
		// 7. 문자열.toUppereCase() : String
		// 모든 문자열을 대문자로 변경 후 문자열 반환
		//	     문자열.toLowerCase() : String   짝꿍
		// 모든 문자열을 소문자로 변경 후 문자열 반환
		
		System.out.println(str4.toUpperCase());
		System.out.println(str4.toLowerCase());

		
		// 8. 문자열.toCharArray() : char[]
		// => 문자열의 각 문자들을 char[]에 옮겨담은 후 해당 배열을 반환
		char[] chArr = str1.toCharArray();
		for(int i = 0; i <chArr.length; i++) {
			System.out.print(chArr[i] + " ");
		}
		System.out.println();
		// char[] -> String 
		char[] arr = {'a', 'p', 'p', 'l', 'e'};
		char apple = 'a' + 'p' + 'p' + 'l' + 'e';
		System.out.println(apple);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ구분자ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				
		System.out.println(String.valueOf(arr)); 		// 데이터 -> String으로 바꿔야겠다 생각들면 바로  valueOf
		
		
	}
	
	
	public void method2() {
		
		
		// 종료하시겠습니까?(Y/N) : Y아니면 N입력받기
		// 경우의 수
		// 1. y
		// 2. n
		// 3. Y
		// 4. N
		
		
		
		
		// 5. 와이
		// 6. 엔 등..
		
		Scanner sc = new Scanner(System.in);
		System.out.println("종료하시겠습니까? (Y/N) : ");
		
		char ch = sc.nextLine().toUpperCase().charAt(0);		// 메소드체이닝
		
		
		if(ch == 'Y') {
			System.out.println("종료 ~ ");
			return;
		} else if(ch == 'N') {
			System.out.println("종료 안해 ~ ");
		} else {
			System.out.println("??");
		}
		
		
		
		
		
		
		
	}
	
	
	
}
