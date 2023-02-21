package com.kh.chap06.run;

import com.kh.chap06.controller.MethodController1;
import com.kh.chap06.controller.MethodController2;

public class Run {

	public static void main(String[] args) {
		
		MethodController1 mc1 = new MethodController1();
		
//		mc1.method1();
//		System.out.println(mc1.method2());
//		String na = mc1.method2();
//		System.out.println(na);
//		
//		mc1.method3();
//		String na3 = mc1.method3();
//		System.out.println(na3);
		
//		mc1.method4(1, 10);
		
//		mc1.method5(2);
//		int a = mc1.method5(2);
//		System.out.println(a);
		
//		mc1.abc(mc1);		//	얕은 복사   
//							// 호출, 매개변수는 stack 메모리에 쌓임
							// 실행을 하려면 stack 메모리에 올라가야함
							// 그래서 메소드 실행시 stack 영역에 abc 생기는 것
		
		
////		-------
//		-----------------------------------------------------------
//		
//		OverloadingController oc = new OverloadingController();
//		
//		oc.test();
//		oc.test(2);
//		oc.test(2, "a");
//		oc.test("a", 2);
//		oc.test(2, 2);
//		oc.test(2, 2, "asd");
		
		
//		------------------------------------------------------------
		
		// static : 객체를 생성하지 않아도 사용 가능
		// Math.random():
		// [ 표현법  ] 풀클래스경로, 메소드식별자();
		
//		MethodController2.method1();
//		String str = MethodController2.method2();
//		System.out.println(MethodController2.method2());
//		MethodController2.method3("이름");
//		
//		
		System.out.println(MethodController2.method4("이름"));
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
