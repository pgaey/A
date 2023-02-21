package com.kh.controller;

public class StringPool {
	
	// String 클래스 -> String 클래스는 어떤 클래스야??   A : 불변클래스(변하지 않는 클래스)
	
	/*
	 * String 클래스 형태의 객체 생성 방법
	 * 
	 * 1. new 키워드를 이용한 String() 생성자 호출 ★★★★★★★★★★★절대 쓰면 안되는 방법★★★★★★★★★★★
	 * 2. 대입연산자를 통해서 직접 값을 대입해서 생성
	 * 
	 */
	
	
	
	// 1. 생성자를 통해서 문자열 담기	  ★★★★★★★★★★★절대 쓰면 안되는 방법★★★★★★★★★★★
	public void method1() { //★★★★★★★★★★★절대 쓰면 안되는 방법★★★★★★★★★★★
		
		String str1 = new String("hello");		// 참조자료형 뒤
		String str2 = new String("hello");
		
		// toString()
		System.out.println(str1.toString());
		System.out.println(str2);
		// 1. String클래스의 toString()의 경우
		// 실제 담겨있는 [문자열값]을 반환하게끔 오버라이딩이 되어있음
		
		
		// equals() 	[문자열 비교] O , [주소값 비교] X
		System.out.println(str1.equals(str2));
		// true => 문자열을 비교했는데 똑같다.
		// 주소값 비교가 아닌 [문자열 비교]를 하도록 오버라이딩	
		
		
		// hashCode()	[문자열 값으로 만듬]
		// 16진수 => 10진수의 주소값
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());		// 가지고 있는 주소값이 아니라 [문자열 값]을 가지고 hashCode를 만들어냄
		// 3. String클래스의 hashCode()
		// 주소값을 변환해주는 것이 아닌 실제 담긴 [문자열을 기반으로] 해시코드 값을 만들어서 변환
		
		// 진짜 주소값을 알고 싶다!!		[결과가 다르다]
		// System.identityHashCode(참조형변수명);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 실제 객체들을 식별할 수 있는 해시코드를 출력!
		// str1과 str2 결과가 다르다!!
		
		System.out.println("ㅡㅡㅡㅡㅡ비교ㅡㅡㅡㅡㅡ");
		System.out.println(str1 == str2);		// [주소값 비교]
		System.out.println(str1.equals(str2));	// [문자열 비교]
		System.out.println("ㅡㅡㅡㅡ method1 끝 ㅡㅡㅡㅡ");
	}
	
	// String 클래스 -> String 클래스는 어떤 클래스야??   A : 불변클래스(변하지 않는 클래스)
	
	// 2. 문자열 리터럴을 대입
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		// toString
		System.out.println(str1);
		System.out.println(str2);
		
		// equals()		[문자열 비교]
		System.out.println(str1.equals(str2));	
		
		// hashCode()	[문자열 -> 코드]
		System.out.println(str1.hashCode());	
		System.out.println(str2.hashCode());
		
		// System.identityHashCode
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 왜 똑같지???
		
		System.out.println(str1 == str2);
		
	}
	
	// String 클래스 -> String 클래스는 어떤 클래스야??   A : 불변클래스(변하지 않는 클래스)
	
	// StringPool
	public void method3() {
		
		String str1 = "hello";		// stack : str1    heap -> StringPool 생성  ->  "hello" 생성
		String str2 = "hello";		// stack : str2    heap -> StringPool -> "hello" 이미 존재하는 것을 가리킴
		// 리터럴값 대입 시 String Pool 영역에 올라감
		// StringPool의 특징 : 동일한 내용의 문자열이 존재할 수 없음
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));		// 같은 곳을 가리키니 주소가 같다
		
		
		String str = "hello";		// StringPool -> "hello" 		
		System.out.println("hello  " + System.identityHashCode(str));		// str1, str2 값과 같음
		
		str = "goodbye";			// StringPool -> "goodbye" 새로 생성 		  "hello"는 남아있음그래서 불변이라고 함
		System.out.println("goodbye" + System.identityHashCode(str));		 // heap영역에 있는 "hello"는 GC가 알아서 정리
		// 연결이 끊긴 문자열들은 GC가 알아서 정리해줌
		// 객체는 여전히 불변 변수에는 새로운 주소값을 참조하게 만듬
		
		str += "abc";
		System.out.println(System.identityHashCode(str));
		System.out.println(str);
		
	}
	
	public void method4() {
		// 문자열은 안에 내용물이 변경될 때마다 새로운 공간을 할당하고 새롭게 집어넣는다.
		
		// StringBuffer ( Thread Safe 동시제어기능 O )		StringBuilder와 똑같음 But, StringBuilder가 더 빠름
		// 이를 막기 위해서 임시공간(Buffer)을 하나 준비하여
		// 임시공간에 차곡차곡 담아두었다가 한번에 처리해주는 클래스
		
		StringBuffer sb = new StringBuffer();
		
		
		sb.append("Hello");				// Scanner처럼 sc.next()   append는 StringBuffer를 사용하기 위해 쓰는 
		System.out.println(sb.hashCode());
		System.out.println("Hello".hashCode());
		
		sb.append(" World!");
		System.out.println(sb.hashCode());				// sb는 값이 바뀌지 않음 
		System.out.println("Hello World!".hashCode());
		
		System.out.println(sb);
		
		// StringBuffer는 동시제어기능(Thread Safe)기능을 가짐
		// 간단한 프로그램 구현이나, 동시제어를 다른 프로그램이 제공하는 경우
		// 굳이 StringBuffer까지 동시제어기능을 구현할 필요가 없음
		// 이 기능만 쏙 뺀 클래스가 필요했는데 그게 StringBuilder임.
	
	}
	
	public void method5() {
		// StringBuilder (동시제어기능x Thread Safe)	== StringBuffer 똑같음 But, StringBuilder가 더 빠름
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello");
		System.out.println(sb.hashCode());
		System.out.println("Hello".hashCode());
		
		sb.append(" World!");
		System.out.println(sb.hashCode());
		System.out.println("Hello World".hashCode());
		
		System.out.println(sb);
	}
	
	
}
