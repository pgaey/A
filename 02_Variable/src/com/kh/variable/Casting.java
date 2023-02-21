package com.kh.variable;

public class Casting {

	/*
	 *  형변환(Type Casting) : 자료형을 바꾸는 개념
	 * 
	 *  자바에서 값을 처리하는 규칙
	 *  
	 *  ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	 *  ★1. =(대입연산자)를 기준으로 왼쪽, 오른쪽이 같은 자료형이여야 한다. ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	 *  ★=> 같은 자료형에 해당하는 리터럴값만 대입이 가능 - 리터럴은 데이터(값) 그 자체를 뜻한다. 즉, 변수에 넣는 변하지 않는 데이터를 의미하는 것.★
	 *  ★=> 자료형이 다를 경우? == 값을 바꿔서 대입해야함★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	 *  ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	 *  
	 *  2. 같은 자료형들끼리만 연산이 가능함
	 *  => 자료형이 다른데 연산이 하고 싶다?? 둘 중에 하나를 "형변환"을 해서 나머지 하나와 동일하게 만들어야함
	 *  
	 *  3. 연산의 결과물도 같은 자료형이어야 한다.
	 *  ex) 1 + 1 = 2(정수),  1.1 + 1.1 = 2.2(실수)
	 *  		1 + 1.1    같은 자료형이 아님. 자바에서 성립 불가
	 *  
	 *  [ 표현법 ]		(바꿀자료형)값
	 *  형변환연산자, cast연산자
	 *  
	 *  형변환의 종류
	 *  
	 *  1. 자동형변환(Promotion) : 자동으로 형변환이 진행됨
	 *  						작은 크기의 자료형 -> 큰 크기의 자료형
	 *  						내가 형변환을 할 필요가 없음	컴파일러가 알아서 해줌
	 *  
	 *  2. 강제형변환(Type Casting) : 자동형변환이 이루어지지 않는 경우에 진행
	 *  							직접 내가 형변환을 해야할 때 !!!! => ()을 통해서 진행
	 *  
	 */
	
	// 자동형변환 : 작은 바이트 -> 큰 바이트
	public void autoCasting() {
		
		// 1. int(4Byte, 정수) -> double(8byte, 실수)
		
		int i1 = 10;
		System.out.println(i1);
		double d1 = /*(double)*/i1;			// i1 앞에 "(double)" 생략 = Type Casting이 자동으로 이루어짐   ->  같은 자료형이 됨
		System.out.println(d1);
		System.out.println(i1);
		
		// 자동형변환 완료 !
		// int는 정수 double은 실수   d1 = 10 -> 10.0
		
		// 2.int(4Byte, 정수) -> long(8Byte, 정수)
		
//		int i2 = 120;
//		long l3 = /*(long)*/i2;
//		System.out.println(l3);
		
		// 3. long(8Byte, 정수) -> float(4Byte, 실수)
		// 특이케이스. 정수가 실수에 담길 때 큰 사이즈의 정수가 작은 사이즈의 실수에 대입 가능
		// 4Byte float형이 long형보다 표현할 수 있는 값의 범위가 더 크기 때문
		// 자바에서 이 특이케이스에 대해서 자동형변환을 해줌
		
		long l4 = 1000L;		// 뒤에 L이 안붙으면 int로 인식 -> int는 4Byte long은 8Byte 때문에 자동형변환이 일어나서 문제 없음
		// float f4 = 3.33F;	// 3.33은 double형   양쪽 자료형이 다름.    8Byte를 4Byte에 넣으려니 문제가 생김
		float f5 = l4;
		
		System.out.println(f5);
		
		
		// 4. char(2Byte) <-> int(4byte)
		// 아스키 코드표
		
		char ch = 'b';
		// System.out.println(ch);
		
		char ch2 = 98;
		// System.out.println(ch2);
		
		int num = ch;
		// System.out.println(num);
		
		/*
		System.out.println('b'); // b
		System.out.println((int)'b'); // 98
		System.out.println('b' + 2); // 100
		System.out.println('b' + '2'); // 148
		System.out.println('b' + "2"); // b2
		System.out.println("b" + "2"); // b2

		System.out.println('2'); 
		System.out.println((char)'2');
		System.out.println((char)2);
		*/
		
		// 비교연산자( == )
		// 좌항과 우항의 값을 비교해서 결과값을 반환
		// true, false
		
		/*
		System.out.println('a' == 'b');			// false
		System.out.println(2 == (int)'2');		// 2와 50이 같아?? 라고 물어본 것		'2'은 50.
		System.out.println((char)2 == '2');		// 이상한 문자와 '2'가 같아? 라고 물어봄	정수 2는 문자로 STX(아스키코드 참고) 
		System.out.println((int)'2' == '2');	// true
		*/
		
		// 5. byte, short간의 연산
		
		byte b1 = 126;
		byte b2 = 2;
		
		System.out.println(b1 + b2);
		
		// 결과값이 int형 => CPU가 값을 처리하는 기본크기가 int형 크기(4Byte)
		
		byte b3 = (byte)128;
		System.out.println(b3);
	}
	
	
	
	// 강제형변환 : 큰 바이트 -> 작은 바이트   문제가 발생할 수 있음
	public void forceCasting() {
		
		// 명시적 형변환이라고도 함
		// (바꿀자료형)값
		
		// 1. double(8Byte) -> float(4Byte)
		
		double d1 = 8.0;				// 8.0 이라는 값이 float로 충분히 처리할 수 있는 값이라고 여겨짐 -> 강제형변환
		float f1 = (float) d1;          // d1 앞에    (float)  를 붙여줌
		
		// System.out.println(f1);
		
		
		
		
		// 2. double(8Byte) -> int(4Byte)
		
		double d2 = 10.123123;
		int i1 = (int) d2;       // (정수에는 소수점이 붙을 수 없음)
		
		// System.out.println(i1);
		
		// 0.123123 소수점 뒷 부분이 절삭!! => 데이터가 손실
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
