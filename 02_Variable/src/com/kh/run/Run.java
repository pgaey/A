package com.kh.run;

import com.kh.variable.A_Variable;		// import�� �ٸ� ��Ű���� �ִ� Ŭ������ ��� : �ּұ��� �� ���������
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.Casting;

public class Run {
	
	public static void main(String[] args) {
		
		// calPay();
		
		A_Variable a = new A_Variable();		// import�� ������� ������ A_Variable�� ã�� �� ����
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
