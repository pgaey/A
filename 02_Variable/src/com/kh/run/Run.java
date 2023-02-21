package com.kh.run;

import com.kh.variable.A_Variable;		// import는 다른 패키지에 있는 클래스를 사용 : 주소까지 다 적어줘야함
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.Casting;

public class Run {
	
	public static void main(String[] args) {
		
		// calPay();
		
		A_Variable a = new A_Variable();		// import를 사용하지 않으면 A_Variable를 찾을 수 없음
		// a.calPay();
		// a.declareVariable();
		// a.constant();
		
		B_KeyboardInput b = new B_KeyboardInput();
//		b.inputTest();
		
		Casting c = new Casting();
//		c.autoCasting();
		c.forceCasting();
				
		
		
	}

}
