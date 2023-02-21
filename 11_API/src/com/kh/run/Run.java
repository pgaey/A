package com.kh.run;

// import java.lang.*;
// 생략이 가능하다
// 보이진 않지만 항상 import
// 자바프로그래밍하면서 필수적인 클래스들을 모아놓은 패키지

public class Run {
	
	public static void main(String[] agrs) {
		
		// Math클래스(수학과 관련)
		
		/*
		 * Math 클래스의 특징
		 * - 모든 필드와 메소드가 전부 다 static이다.
		 * - 객체를 생성할 필요가 없으므로(static 특징) 생성자의 접근제한자 private이다.
		 * - java.lang
		 */
		
		// 필드
		// 파이 => Math클래스 내에 상수필드로 정의되어있음		
		System.out.println(Math.PI);	/*  java.lang*;은 따로 적지 않아도 무조건 import되어있음   */
		
		
		
		
		// 메소드
		// 메소드명(매개변수타입) : 반환형
		// 1. 올림 => Math.ceil(double) : double
		double num1 = 4.1234567;
		System.out.println("올림 : " + Math.ceil(num1));
		
		// 2. 반올림 => Math.round(double) : long
		System.out.println("반올림  : " + Math.round(num1));
		
		// BigDecimal
		// 3. 버림 => Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num1));
		
		// 4. 절대값 => Math.abs(int/double/long/float) : int/double/long/float	abs = absolute '절대적인'의 약자
		int num2 = -18;
		System.out.println(Math.abs(num2));
		
		// 5. 최소값 => Math.min(int, int) : int
		System.out.println("최소값 : " + Math.min(23456451, 12355484));
		
		// 6. 최대값 => Math.max(int, int) : int
		System.out.println("최대값 : " + Math.max(23485, 71542));
		
		// 7. 제곱근(루트) => Math.sqrt(double) : double
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 8 . 제곱 => Math.pow(double, double) : double
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}