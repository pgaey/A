package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 단독 if문 : 
	 * [ 표현법   ]
	 * 
	 * if(조건식) {
	 * 		조건식이 true일 경우 실행될 코드
	 * }
	 *
	 * => 조건식의 결과가 true일 경우 : {}(중괄호) 안의 코드들이 실행됨
	 * => 조건식의 결과가 false일 경우 : {}(중괄호) 안의 코드들을 건너뜀
	 * 
	 */
	
	public void lunchMenu() {
		
		// 영춘옥
		// 고냉지
		
		// 맑음  / 비옴
		
		Scanner sn = new Scanner(System.in);
		System.out.println("오늘의 날씨는 ?? (맑음, 비옴) > ");
		String weather = sn.nextLine();
		
		
		String lunch = (weather.equals("맑음"))? "영춘옥" : "고냉지";				// equals 를 쓰면 ()안에 있는 것과 같은지 비교. 같으면 true, 다르면 false
						// 문자열 값 비교는  .equals() 메소드 사용
		System.out.println("오늘의 점심은 " + lunch + "입니다.");
		
	}
	
	// 삼항연산자 때 해봤던거
	public void method1() {
		// 정수를 입력받고 양수 / 0 / 음수 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 내놔 > ");
		int num = sc.nextInt();
		
		// 만약에 사용자가 입력한 값이 0보다 크다면
		if(num > 0) {
			System.out.println(num + "은(는) 양수다!!");
		}
		
		// 만약에 사용자가 입력한 값이 0이라면
		if(num == 0) {System.out.println("0이다!!");}
		
		// 만약에 사용자가 입력한 값이 0보다 작다면
		if(num < 0) System.out.println(num + "은(는) 음수다!!");   // 다중행이 아닐경우 생략이 가능하긴 함
		
		
		// 간단한 if문 경우 삼항연산자로 대체 가능
		
		
	}

	public void method2() {
		
		// if문을 이용해서 홀수 / 짝수 판별
		// 양수일 경우에만 조건문을 실행!!!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양수를 입력해주세요");
		int num = sc.nextInt();
		
		
		// 홀수 + 양수
		// 짝수 + 양수
		
		// 만약에 사용자가 입력한 값이 양수 이고 사용자가 입력한 값이 짝수면
		// if         num    >0           num    % 2 == 0 
//		 if((num > 0) && (num % 2 == 0)) System.out.println("양수이면서 짝수!"); 
		
		// 만약에 사용자가 입력한 값이 양수 이고 사용자가 입력한 값이 홀수면
		// if         num    >0           num   % 2 == 1
		// if((num > 0) && (num % 2 != 0)) System.out.println("양수이면서 홀수!"); 
		
		// 중첩 if문
		// 결과는 동일
		if(num > 0) {
			if(num % 2 == 0) System.out.println(num + "은 짝수다");
			if(num % 2 != 0) System.out.println(num + "은 홀수다");
		}
		System.out.println("asdfasdf");
	}
	
	public void method3() {
		
		// 주민번호 체크
		// 주민번호를 입력 받아서 성별 체크
		//					000000-?000000
		//						   1, 3    2, 4
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 (- 포함)");
		String personId = sc.nextLine();				// buffer에 있는 값을 RAM으로 가져오기 위해 next(); 사용
				// next(), nextLine()

		// System.out.println(personId);
		
		// 문자열 = "순서가 있는 (단일)문자들의 나열"
		// "a b c d e f g"
		//  0 1 2 3 4 5 6
		// 순서는 index라고 부름 ** index는 0번부터 시작
		
		
		// 111111-2222222
		
		// 입력받은 주민번호로부터 성별에 해당하는 '문자'를 추출
		// chatAt(7) => 주민번호 문자열 상 8번째에 있는 7번 index를 추출하겠다.
		
		char gender = personId.charAt(7);
		
		// 1 / 3이면 남자입니다 출력
		// 2 / 4이면 여자입니다 출력
		// 넷다 아니면 ????? 출력
		
		// 만약에 사용자가 입력한 주민등록번호에서 8번째 문자가 1이거나 3이면
		if('1' == gender || gender == '3') {
			System.out.println("당신은 남성입니다.");
		}	
		
		// 만약에 사용자가 입력한 주민등록번호에서 8번째 문자가 2이거나 4이면		
		if('2' == gender || gender == '4')	{
			System.out.println("당신은 여성입니다.");
		}
															// 1도 아니고 2도 아니고 3도 아니고
		// 만약에 사용자가 입력한 주민등록번호에서 8번째 문자가 넷 다 아니면		   != '1' && != '2' && != '3' &&
		//  if			 gender					
		if(gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.println("?????");
		}
		
		
	}
	
	
	
	
	
}
