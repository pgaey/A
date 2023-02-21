package com.kh.operator;

public class B_InDecrease {

	/*
	 * 증감연산자 : 단항연산자로써 한번에 1씩 증가(더하거나) 감수(빼거나)하는 연산을 한다.
	 * => 먼저 증감을 할건지, 나중에 증감을 할건지에 따라서 연산자의 위치가 달라진다.
	 * 
	 * [ 표현법  ]
	 * ++ : 값을 1씩만 증가시키는 연산자
	 * -- : 값을 1씩만 감소시키는 연산자
	 * 
	 * 연산자의 위치
	 * 전위 연산 : ++값, --값		--> 먼저 값을 증감하고 그 값을 처리
	 * 후위 연산 : 값++, 값--		--> 값을 처리하고 나서 증가하거나 감소하겠다.
	 * 
	 */
	
	// 후위연산    ※ 주의  : RAM에서 값을 가지는 순서를 생각해볼 것
	public void method1() {
		
		int num = 10;
		System.out.println("num : " + num); // "num : 10"
		
		num++; // num이라는 이름을 가진 변수공간의 값에다가 1을 증가시키겠다.
		// num + 1
		
		System.out.println("num : " + num); // "num : 11"
		
		num--;
		
		System.out.println("num : " + num); // "num : 10"
		
		System.out.println("num : " + num++); // "?"  "num : 10"    출력 후 ++ 처리
		System.out.println("num : " + num++); // "?"  "num : 11"
		
		System.out.println("num : " + num); // 12
	}
	
	
	public void method2() {
		
		int a = 10;
		int b = a++;
		// 우선순위 중요!
		// 1번 b라는 int형 변수공간을 만듬
		// 2번 a라는 변수공간의 리터럴 값을 가져옴
		// 3번 가져온 리터럴 값을 b라는 공간에 대입
		// 4번 a를 1증가
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 10
		// b라는 변수에 a값을 먼저 대입하고(선 처리 부분)
		// a라는 값을 증가시키겠다(후 연산)
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : " + c); // 19
		System.out.println("d : " + d); // 20
	}
	
	// 전위연산		옛날 자바는 전위연산이 성능면에서 우위였음. 현재 시점에는 같음
	public void method3() {
		
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a); // 11  a가 10이었지만 ++a를 거치면서 이미 a = 11 로 증가.
		System.out.println("b : " + b); // 11     고로 b = 11
		
		System.out.println("a : " + --a); // 10
	}
	
	public void method4() {
		
		//후위 연산		많이 씀
		int num1 = 20;
		int result = num1++ * 3;
		
		System.out.println(num1);		// 21
		System.out.println(result);		// 60   후위 연산 : ++은 제일 마지막에 생각
		
		//전위 연산		잘 안씀
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		System.out.println(num2);		// 21
		System.out.println(result2);	// 63
	}
	
	
	
	
	
	
	
	
	
	
}
