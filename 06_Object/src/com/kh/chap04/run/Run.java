package com.kh.chap04.run;

import com.kh.chap04.model.vo.FieldTest1;
import com.kh.chap04.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		
		// ---------------------- 1. FieldTest1 -----------------------
		
		FieldTest1 f1 = new FieldTest1();
		// 1. stack영역에 f1이라는 지역변수 생성
		// 2. 객체 생성 시(new 키워드를 만났을 때) global 멤버변수 할당!
		
		System.out.println(f1.global);		// ?
		f1.testVariable(8);		// 값 확인해보기
		// testVariable 호출 시 ! num, local 지역변수 할당!!(stack)
		// testVariable 호출 종료 시 ! num, local 지역변수 소멸!
		System.out.println(f1.global);	// 지역변수는 소멸했지만 field는 그대로 있음
		f1 = null;	/* f1.global 값을 없애주려면 GC가 와야하는데
					   Fieldtest1 을 향하는 값이 없게 null 값을 대입하면 
  					   global 사용 불가능
					*/
//		System.out.println(f1.global);
		
		
		
		// ---------------------- 3. FieldTest3 -----------------------
		
		System.out.println(FieldTest3.str);		// 객체를 생성하지 않고 static 영역에 할당됨!!
												// 단, 앞에 클래스명(FieldTest3.)은 붙여야함
		System.out.println(FieldTest3.NUM);
		
		Math.random();
		System.out.println(Math.PI);
		
//		Math m = new Math();	// not visible -> 접근제한자가 private임을 유추 -> 객체생성이 안됨
		
		
		
		
		
		
		
		
		
		
	}

}
