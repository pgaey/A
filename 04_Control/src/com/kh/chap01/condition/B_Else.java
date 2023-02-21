package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * if - else 
	 * 
	 * [ 표현법  ]
	 * 
	 * if(조건식) {
	 * 		조건식이 true일 때 실행할 코드 - 1
	 * } else {
	 * 		조건식이 false일 때 실행할 코드 - 2
	 * }
	 * 
	 * => 조건식의 결과가 true일 경우 1을 실행
	 * => 조건식의 결과가 false일 경우 2를 실행
	 * 
	 */
	
	public void method1() {
		
		// 연산자 문제
		// 정수 입력받아서 	양수 / 0 / 음수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 내놔 > ");
		int num = sc.nextInt();

		// 만약에 사용자가 입력한 정수값이 양수(0보다 크다면)
		// if 			num			> 0
		
		if(num > 0) {	// 양수일 경우 이 코드블럭 내부를 실행하겠다.

			System.out.println("양수다 ~ ");
	
			// 조건식의 결과가 true => else블럭을 건너뜀
			// 불필요한 연산이 줄어듬 => 처리속도 향상
			
		} else {		// 양수가 아닐 경우 실행
		
			if(num == 0) { // 0일 경우
				System.out.println("0이다~");
			} else {
				System.out.println("음수다~");
			}
		}
	}
	
	public void method2() {
		// 주민번호 입력 후 성별 판별
		// 1. 사용자로부터 주민번호 입력받기 (String personId => XXXXXX-XXXXXXX)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요 (-포함) : ");
		String personId = sc.nextLine();
		
		// 2. 입력받은 주민번호로부터 성별에 해당하는 문자를 추춘 charAt(index) => 7번 index
		char gender = personId.charAt(7);
		
		
		// gender == '1' || gender == '2' || gender == '3' || gender == '4'
		// 가정!!!!)    ??('1'이 아스키코드표로 int 49) == 49 || ?? == 50 || ?? == 51 || ?? == 52 ||
		
		if('1' <= gender && gender <= '4' ) {
			
			// 유효한 주민번호를 입력했을 경우
			if(gender == '1' || gender == '3') {
				System.out.println("남자다~");
			} else {
				System.out.println("여자다~");
			}
			
		} else {
			// 유효한 주민번호를 입력하지 않았을 경우
			System.out.println("유효하지 않은 주민번호입니다~~");
		}
	}
	
	/*
	 * if - else if문
	 * 
	 * [ 표현법  ]
	 * 
	 * if(조건식1) {
	 * 		조건식1이 true일 경우 실행할 코드1
	 * } else if(조건식2){
	 * 		조건식2가 true일 경우 실행할 코드2
	 * } else if(조건식3){
	 * 		조건식3이 true일 경우 실행할 코드3
	 * } else if(조건식4){
	 * 		조건식4가 true일 경우 실행할 코드4
	 * } else {
	 * 		앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드
	 * }
	 */
	
	public void method3() {
		
		// 정수 입력받아서 양수 / 0 / 음수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("0보다 큰수 ~ ");
		} else if (num < 0) {
			System.out.println("0보다 작은 수 ~");
		} else {
			System.out.println("0 ~");
		}
		
	}
	
	public void method4() {
		// 나이를 입력받고 어린이 / 청소년 / 성인 판단
		// 0 ~ 13 : 어린이
		// 14 ~ 19 : 청소년
		// 20~ : 성인
		// ~ : ???
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요  >  살");
		int age = sc.nextInt();
		
		// 큰 범위의 값 순서대로  !!!
		
		if(age < 0) {									// 어린이부터 구분하는거보다 음수부터 날리는 것이 좋음
			System.out.println("???");
		} else if(age >= 20) {
			System.out.println("성인입니다~");
		} else if(age >= 14 ) {
			System.out.println("청소년~");
		} else {
			System.out.println("어린이");
		}
		
	}
	
	
	
	
}
