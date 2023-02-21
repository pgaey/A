package com.kh.run;

import com.kh.controller.A_UnchechedException;
import com.kh.controller.B_CheckedException;

public class Run {
	
	/*
	 * 에러
	 * 
	 * - 시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러
	 * 				=> (심각) 소스코드로 해결이 안됨
	 * 
	 * 
	 * - 컴파일 에러 : 프로그램 실행 전 소스코드상의 문법적인 문제로 발생하는 에러
	 * 				=> 소스코드 수정으로 해결(빨간줄로 오류 알려줌)
	 * 
	 * 
	 * - 런타임 에러 : 프로그램 실행 중 발생하는 에러
	 * 			      소스코드상 문법적인 문제는 없는데 발생!!
	 * 			 => 개발자가 예측 가능한 경우 처리하지 않았을 때
	 * 			 => 사용자의 잘못일 가능성도 있음
	 * 
	 * - 로지컬(논리) 에러 : 소스코드상 문법적인 문제도 없고, 실행했을 때도 굳이 문제가 발생하진 않지만
	 * 					프로그램 의도상 맞지 않는 것(기획과 설계가 잘못되었을 경우 발생)
	 * 
	 * 예외 : 시스템 에러는 제외한 나머지 컴파일, 런타임, 논리에러와 같이 비교적 덜 심각한 에러들
	 * 		주로 런타임 에러를 의미함.
	 * 
	 * 예외처리
	 * 
	 * 방법 1. try ~ catch 구문 이용
	 * 방법 2. throws 구문을 이용해서 떠넘긴다.
	 * 
	 * 
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		
		A_UnchechedException a = new A_UnchechedException();
		
//		a.method1();
//		a.method2();
//		a.method3();
		
		
		B_CheckedException b = new B_CheckedException();
		
		// b.method1();
//		b.method2();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
