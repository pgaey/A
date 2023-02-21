package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	public void method0() {		// method0 영역 시작
		
		
		// ctrl + shift + o		: import 단축키
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇층에 가시나요? : ");
		int floor = sc.nextInt();
		
		switch(floor) {
			case 1 : System.out.println("1층입니다. 문이 열립니다.");
			break;
			case 2 : System.out.println("2층입니다. 문이 열립니다.");
			break;
			case 3 : System.out.println("3층입니다. 문이 열립니다.");
			break;
		}
		
	}		// method0 영역 끝
	
	/*
	 * switch
	 * 
	 * [ 표현식  ]
	 * 
	 * switch(아래 기술할 값들과 동등비교를 할 대상자){
	 * 		case 정수, 문자, 문자열 : 실행할 코드1;
	 * }
	 * 
	 * 			// 동등비교대상
	 * switch(정수, 문자, 문자열){
	 * 		case 값1 : 실행할코드1; // 동등비교대상 == 값1		true일 경우 실행할코드1을 수행
	 * 		break;				// switch영역을 빠져나간다.
	 * 		case 값2 : 실행할코드2; // 동등비교대상 == 값2		true일 경우 실행할코드2를 수행
	 * 		break;
	 * 		case 값n : 실행할코드n; // 동등비교대상 == 값n		true일 경우 실행할코드n을 수행
	 * 		break;
	 * 		default : 실행할코드; // == else    if문의 else와 동일한 역할을 한다
	 * }
	 * 
	 */
	
	public void method1() {
		// 사용자에게 값을 입력받아서 홀수 / 짝수 판별
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 내놔");
		int num = sc.nextInt();
		
		int oddEven = num % 2; // 0 : 짝수, 1 : 홀수
		
		switch(oddEven) {
			case 0 : System.out.println("짝수인데?"); break;  // break를 만나면 switch문 밖으로 나감 
			case 1 : System.out.println("홀수인데?"); // 마지막 줄은 break가 없어도 밖으로 나감 -> 적지 않아도 됌
		}
	}

	public void method2() {
		
		// 1. 사용자로부터 주민번호 입력받기 (String personId => xxxxxx-0xxxxxx)
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력해주세요    >   - 포함");
		String personId = sc.nextLine();
		
		// 2. 입력받은 주민번호로부터 성별에 해당하는 문자를 추출
		char gender = personId.charAt(7);
		
		// 3. 스위치문을 이용해서 조건문 작성
	
		String gender2;
		
		switch(gender) {
		
		
			case '1': 
			case '3': gender2 = "남자";
			break;
			
			case '2': 
			case '4': gender2 = "여자";
			break;
			
			default : gender2 = "외계인";
		}
		System.out.println(gender2 + "입니다.");
	}
	
	// switch
	// 쌀국수, 김밥, 순두부, 비빔밥, 도시락, 피자
	public void foodCourt() {	// 롯백지하 1층
		
		// 사용자에게 구매할 음식의 이름을 입력받아
		// 각 음식마다의 가격을 출력해줄 것
		
		// 쌀국수, 	김밥,		순두부,		비빔밥,		도시락,		피자
		// 12000   5000	    8000	    10000		6000	   12000
		
		// 나가 ~ 우리집에 없어 ~ 딴집 가 ~
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 음식을 입력해주세요(쌀국수, 김밥, 순두부, 비빔밥, 도시락, 피자) : ");
		String food = sc.nextLine();
		
		int price = 0;
		switch(food) {
			case "쌀국수" : 
			case "피자" : price += 12000; break;
			case "김밥" : price += 5000 ; break;
			case "순두부" : price += 8000; break;
			case "비빔밥" : price += 10000; break;
			case "도시락" : price += 6000; break;
			default : System.out.println("그런 음식은 없습니다.");
			return;		// 현재 실행되고 있는 메소드 영역을 아예 빠져나감
						// 메소드 호출 부분으로 돌아간다 
		}
		System.out.printf("%s의 가격은 %d원 입니다.", food, price);
	}		// return; 하면 빠져나가는 부분
	
	public void login() {
		
		// 로그인 기능! 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		String id = "user01";
		String pwd = "pass01";
		String nickName = "자바개발자";
		
		if(userId.equals(id) && userPwd.equals(pwd)) {
			System.out.println("로그인 성공 ~ ! " + nickName + "님 환영합니다 ^.^");
		// 사용자가 입력한 문자열과 회원가입시 입력한 문자열이 일치하지 않는다면
			
		} else if(!userPwd.equals(pwd) && !userId.equals(id)) {
			System.out.println("아이디, 비번 모두 존재하지 않습니다!");
			
		} else if(!userId.equals(id)) {
			System.out.println("아이디 존재하지 않습니다!");
			
		} else {
			System.out.println("비밀번호가 존재하지 않습니다!");
		}
		
			
			
//		} else if((userId != id) || (userPwd != pwd)) {
//			System.out.println("아이디가 존재하지 않는다");		//		<<== 이게 String인데 되는 이유
//		}
	
		
		
		// 기본자료형 : boolean, byte, short, int, long, char, float, double
		// => 기본자료형 같은 경우에는 동등비교(==, !=)가 잘 됨!!!
		
		// 참조자료형 : String				참조자료형은 동등비교가 될 수도 있지만 String은 불가능
		// => 동등비교(==, !=)가 불가능
		// 이유? 참조자료형의 경우 실제로 변수에 담기는 값이 '주소값'이기 때문
		// 문자열의 값을 비교 : equals()를 사용한다. => true, false
		// [표현법] 문자열.equals("비교할문자열");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
