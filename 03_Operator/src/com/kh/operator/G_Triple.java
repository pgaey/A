package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 *  삼항연산자  : 피 연산자가 3개  => 값 3개와 연산자 1개로 이루어짐(조건식 형식으로 쓰임)
	 *  
	 *  조건식 : 결과값에 따라서 연산을 처리하는 방식
	 *  		결과값이 참일 경우 첫번째 식을 처리하고,
	 *   		결과값이 거짓일 경우 두번째 식을 처리하는 방식
	 *   
	 *   
	 * [ 표현식  ]
	 * 
	 * (조건식)?  조건이 true일 경우 결과값  : 조건이 false일 경우 결과값
	 *  
	 */
	
	public void method1() {
		// 사용자가 입력한 값이 양수인지 아닌지 판별 후 그에 맞는 결과 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();
		
//		String result = (num > 0)? "양수" : "음수";
					  // 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값   => 문제발생. 0을 입력할 때도 음수라고 뜸
		
		String result = (num > 0)? "양수" : (num == 0)? "0이" : "음수";
		
		// 10	은   양수	다!!
		// -7	은   음수	다!!
		System.out.println(num + "은 " + result + "다!!");
		
	}
	
	public void method2() {
		
		// 짝수  / 홀수 판별
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0)? "짝수" : "홀수";
		
		System.out.println(num + "은 " + result + "이다!!");
	}
	
	public void method3() {
		
		//사용자에게 영문자를 하나 입력받아서 대문자인지 아닌지 판별!!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자 하나를 입력해주세요 > ");
		char ch = sc.next().charAt(0);
		
		// 'A' ~ ch ~ 'Z'
		// 'a' ~ ch ~ 'z'
//		String result = (65 <= ch && ch <= 90)? "대문자" : "소문자";  	 =====>>>>>    'a'도 형변환이 이뤄지기 때문에 숫자가 아니라 문자를 입력해서 쓸 수 있음 ↓↓↓
		String result = ('a' <= ch && ch <= 'z')? "대문자" : "소문자";
		
		
		System.out.println(ch + "는 " + result + "이다!!");
		
	}
	

	public void method4() {
		
		// 문자 3개를 입력받아서 다 똑같으면 똑같다 !! 하나라도 다르다면 다르다 !!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 문자 입력해주세요");
		char a = sc.next().charAt(0);
		
		System.out.println("두 번째 문자 입력해주세요");
		int b = sc.next().charAt(0);
		
		System.out.println("세 번째 문자 입력해주세요");
		char c = sc.next().charAt(0);
		
		
		String result = (a == b && b == c)? "똑같다" : "다르다";
		
		System.out.println(result);
				
	}
	
	
	
	
	
	
	
	
	
	
	
}
