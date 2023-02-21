package com.kh.variable;

public class A_Variable {
	// 변수의 필요성          변수 : (메모리에)값을 저장할 수 있는 [공간]이다.(변수 = 값 -> 수학적 정의)     값을 다루는 가장 기본적인 기능
	// 지역변수  = STACK이라는 영역에 있음
	
	// 주급계산을 해주는 메소드
	public void calPay() {
		System.out.println("--- 변수를 사용하기 전 ---");
		
		System.out.println("시급 : 9980원");
		System.out.println("근무 시간 : 8시간");
		System.out.println("근무 일수 : 5일");
		
		// 주급 = 시급 X 근무시간 X 근무일수
		// 출력형식 「XXX : 00000원」       「 = ㄴ한자
		// 자바에서 + 기호는 값과 값을 붙일 때 사용 
		// 자바에서 * 기호는 값과 값을 곱할 때 사용
		
		// System.out.println("이승철 : " + 9980 X 8 X 5 + "원");	 Syntax error 구문 오류
		System.out.println("이예찬 : " + (9980 * 8 * 5) + "원");		//
		System.out.println("김태령 : " + (9980 * 8 * 5) + "원");
		System.out.println("심현정 : " + (9980 * 8 * 5) + "원");
		System.out.println("염경훈 : " + (9980 * 8 * 5) + "원");

		
		System.out.println("--- 변수 사용 후 ---");
		
		// 각각의 시급, 근무시간, 근무일수라는 값을 담을 공간
		// 즉, 변수를 만들고 그 안에 값을 담는다.
		int pay = 9980;
		int time = 8;
		int day = 6;
		
		System.out.println("시급 : " + pay +"원");
		System.out.println("근무 시간 : " + time + "시간");
		System.out.println("근무 일수 : " + day + "일");
		
		System.out.println("이예찬 : " + (pay * time * day) + "원");
		System.out.println("김태령 : " + (pay * time * day) + "원");
		System.out.println("심현정 : " + (pay * time * day) + "원");
		System.out.println("염경훈 : " + (pay * time * day) + "원");
		
		/*
		 * 변수를 사용하는 이유
		 * 
		 * 1. 단 한번의 값을 기록함으로써 필요할 때마다 재사용이 가능 => 재사용성이 높아짐
		 * 2. 변수는 값에 의미를 부여하기 위해 사용 => 가독성이 좋아짐
		 * 
		 * 가독성과 재사용성이 높아지면 유지보수가 용이해짐
		 * 
		 */
	} // calPay() 끝

	// 변수의 선언
	public void declareVariable() {  // declareVariable 변수선언.
		
		/*
		 * 변수 선언 방법
		 * 			int pay;
		 * 
		 * 변수타입(자료형) 변수이름;
		 * 같은 타입의 변수를 선언할 때는 한꺼번에 선언할 수 있음  ex) int pay, day. time; (한줄에 하나씩 쓰는 것을 권장)
		 * 변수를 선언하고 난 뒤에 처음 값을 대입하는 것을 초기화(initialization)라고 함
		 * 초기화를 진행하여 대입한 값을 초기값이라고 함
		 */

		// System.out.println(pay); 변수는 {} 중골호 안에서 선언되고 사용 됌
		

		/*
		 * 식별자(Identifier)
		 * 클래스명, 메소드명, 변수명 등 사용자가 만들어서 이용하는 고유한 이름
		 * 
		 * - 식별자를 생성할 때 지켜야하는 규칙(안지키면 안만들어짐)
		 * 
		 * 1. 대 , 소문자를 구분하고 길이제한은 없음
		 * 2. 문자, 숫자, _, $를 식별자에 포함함 수 가능
		 * 3. 문자, _, $로만 시작할 수 있음
		 * 4. 공백은 포함할 수 없음
		 * 5. 키워드 (예약어)는 식별자로 사용할 수 없음
		 * 
		 * 
		 * - 식별자 이름 규칙(개발자들의 약속)
		 * 
		 * 1. 클래스/인터페이스 이름 규칙
		 * 
		 * - 명사, 형용사를 서술적으로 연결해서 사용
		 * - 첫 글자를 대문자로 표기
		 * - 연결된 단어들의 첫글자도 대문자로 표기
		 * 
		 * ex) HelloWorld
		 * 
		 * 
		 * 2. 변수 이름 규칙
		 * 
		 * - 명사적 의미를 갖게 만듬
		 * - 첫 글자를 소문자로 표기, 연결된 단어들은 대문자로 표기
		 * 
		 * ex) phoneNumber
		 * 
		 * 
		 * 3. 메소드 이름 규칙
		 * 
		 * - 동사적 의미를 갖게만듬
		 * - 첫 글자는 소문자로 표기, 연결된 단어들은 대문자로 표기
		 * - 메소드명을 짓고나서 제일 뒤에 한 쌍의 괄호 "()"가 붙음
		 * - 메소드명은 일반적으로 _를 사용하지 않음
		 * 
		 * ex) calPay(), join()
		 * 
		 * 
		 * 4. 상수 이름 규칙
		 * 
		 * - 문자 문자를 대문자로 표기
		 * - 단어와 단어사이는 _를 사용해서 구분해준다.
		 * 
		 * ex) LOGIN_OK
		 * 
		 */
		
		
		
		// 변수의 자료형(크기까지 외우면 좋음)
		
		/*
		 * 1. 논리형 자료형(논리 값 : true, false)
		 */
		
		boolean isTrue; // 1Byte
		isTrue = true;  // true 는 변수가 아니라 값. 변수인 공간 안에 값을 넣는 것        isTrue : 공간, true : 값
		isTrue = false; // [isTrue공간]에 초기값 true를 넣었다가 false가 들어가면서 true 값은 사라지고 false를 공간에 대입
		boolean isFalse; // 변수선언
		isFalse = false; // 얘는 초기화
		isFalse = true;  // 얘는 초기화가 아니라 대입 
		
		// 변수!! 는 꼭 초기화(initialize)를 진행하지 않으면 사용할 수 없음
		
		/*
		 * 2. 숫자형 자료형
		 * 
		 * 정수형에는 4가지 유형이 있음
		 * 정수형 예약어는 byte, short, int, long형이 있고 int형을 주로 사용하면 된다.
		 * 정수형의 기본형은 int이고 long형을 사용할 때는 할당할 숫자 뒤에 "L"을 붙여야 함
		 * 
		 * 실수형에는 2가지 유형이 있음
 		 * 실수형 예약어는 float, double이라는 키워드를 사용하고 double을 사용함
 		 * float형을 사용하려면 할당할 숫자 뒤에 "F"를 붙여야 함
 		 * 
		 */
		
		// 2_1. 정수형
		byte bNum = 1; // 1Byte
		short sNum = 2; // 2Byte
		int iNum = 3; // 4Byte
		long lNum; // 8Byte
		lNum = 4L;   // 위에 대입 된 1, 2, 3 = 리터럴(값)    4L=long형 리터럴
				// 대입연산자(=) 기준으로 왼쪽에는 공간만 올 수 있음, 오른쪽은 값만 올 수 있음       ex) 공간 = 값

		
		// 2_2. 실수형
		float fNum = 2.22F; // 4Byte
		double dNum = 3.3333; // 8Byte
		
		// 3. 문자형
		char ch; // 2Byte
		ch = 'c'; // 단일 문자에는 반드시 홑따옴표를 붙여줌
							// boolean 1Byte
							// byte 1Byte , short 2Byte , int 4Byte , long 8Byte
							//							  float 4Byte , double 8Byte 
						    //				char 2Byte    string 4Byte
		
		//-------------- 여기까지가 기본자료형(Primitive Type) --------------------------
		
		
		
		
		// 4. 문자열형 : 참조 자료형(기본자료형 아님)  => 주소를 담는다 !
		String str;  // 변수선언  4Byte
		str = "abc"; // 문자열형 같은 경우 반드시 쌍따옴표를 붙인다.
		
		// 1. 9개의 자료형을 선언함
		// 2. 9개의 값의 초기화를 진행함
		// 3. 9개의 값이 잘 들어갔는지 확인해보기!!!!!
		// 출력형식   ==  변수이름 : XXX
		
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("isFalse : " + isFalse);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);
		// 기술!!!
		
		
		// 출력문의 종류 !
		// System.out.println();  => 개행(줄바꿈)해줌
		// System.out.print();  => 개행하지 않음  * ln이 빠짐
		// System.out.printf("출력하고자 하는 데이터 형식");  => f는 format, 개행하지 않음
		
		System.out.printf("isTrue의 값은 %b입니다.\n", isTrue);  //  \n 은 개행
		// => 구멍의 개수와 매꿀 변수 개수와 순서, 종류가 명확해야 한다.
		
		// %b : true, false 논리형 변수를 담을 수 있게 뚫어주는 구멍
		// %d : byte, short, int, long 정수형 변수를 담을 수 있게 뚫어주는 구멍
		// %f : float, double 실수형 변수를 담을 수 있게 뚫어주는 구멍
		// %c, %C : char 문자(단일)형 변수를 담을 수 있게 뚫어주는 구멍   %c는 소문자  %C는 대문자
		// %s, %S : String 문자열형 변수를 담을 수 있게 뚫어주는 구멍    %s는 소문자  %S는 대문자
		System.out.println();
		System.out.printf("fNum의 값은 \t %.1f입니다.\ndNum의 값은 %.2f입니다.\n\n", fNum, dNum); // \t 는 tap    %f 안에 .x를 넣어 소수 x자리까지 표기
		
		System.out.println("개행을 위해서는 \\n을 사용합니다.");  // \\n
	} // declareVariable 영역 끝
	
	
	
	// 상수 (변수인데 값을 고정해서 쓸 때 사용, 실수 방지)
	public void constant() {
		
		int num = 10;
		System.out.println(num);
		num = 20;
		System.out.println(num);
		
		// 1760년부터올해의 년도까지를 계산하는 메소드
		// [ 표현법 ] final 자료형 상수이름;
		
		final int START_YEAR = 1760;    // 상수인거 티내기 위해 전부 대문자 사용, 그리고 바로 초기화 

		final double PI = 3.14;
	}
}
