package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.vo.Child1;
import com.kh.chap01_poly.part01_basic.vo.Child2;
import com.kh.chap01_poly.part01_basic.vo.Parent;

public class Run {
	/*
	 * 
	 * ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆ 타입 ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		// 부모꺼는 내꺼, 내꺼는 내꺼
		
		// =
		// ★★★★★★★★★★★★★★★★★★★★★★★★ 양변의 자료형이 같아야한다 ★★★★★★★★★★★★★★★★★★★★★★★★
		
		// 1. 부모 타입 자료형으로 부모 객체를 다루는 경우
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild1(); 자식꺼는 내께 아님....
		// p1으로는 Parent에만 접근가능
		
		// 2. 자식 타입 자료형으로 자식 객체를 다루는 경우 
		Child1 c1 = new Child1();
		c1.printChild1();	// 내껀 내꺼 ~
		c1.printParent();	// 부모껏도 내꺼 ~
		// c1으로는 Parent, Child1에 둘 다 접근가능
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ3. 부모타입 자료형으로 자식 객체를 다루는 경우ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 3. 부모타입 자료형으로 자식 객체를 다루는 경우		=> 다형성 적용
		Parent p2 = (Parent)/*이 생략된 것*/new Child1();
		p2.printParent();
//		p2.printChild1();
		// p2로는 Parent만 접근이 가능
		// 양쪽의 자료형이 다름에도 불구하고 오류가 나지 않음
		
//		(Child1)p2.printChild1();		// p2.printChild1 가 먼저 일어나고 (Child1) 로 넣는 것이 후 순위로 되기 때문에 안됌
		((Child1)p2).printChild1();  	// 이렇게 괄호로 우선순위를 바꾸어 주면 가능함
		
//		p2 는 child1 객체인데  Parent형이라 printChild1(); 호출이 안되지만 [강제]로 (Child1)로 형변환을 해줘서 할 수 있게 해준다.
		
		
		
		
//		Child1 c2 = (Child1)new Parent();
//		c2.printChild1();
		
		
		/*
		 * 클래스 형 변환
		 * 
		 * '상속구조'일 경우에만 클래스간의 형변환이 가능하다
		 * 
		 * 1. Upcasting
		 * 
		 * 자식타입 => 부모타입
		 * 생략이 가능하다.		30행의 c1.printParent(); 경우 (Parent)c1.printParent(); 로 앞에 (Parent)가 생략돼있음
		 * 
		 * ex ) 자식.부모메소드();
		 * 
		 * 
		 * 2. Down Casting
		 * 
		 * 부모타입 => 자식타입
		 * 생략이 불가능하다.
		 * 
		 * ex ) ((자식)부모).자식메소드(); 
		 * 
		 */
		
		// 다형성을 사용하면 뭐가 좋아져??
		// 배열을 써보자
		// 배열을 특징 == 한 종류의 자료형인 값들을 묶어서 관리가 가능
		
		// 다형성 적용 전
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 3);
		arr1[1] = new Child1(2, 3, 4);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(3, 4, 5);
		arr2[1] = new Child2(4, 5, 6);
		
		System.out.println("----- 다형성을 적용하기 전 배열 -----");
		arr1[0].printChild1();
		arr1[1].printChild1();
		arr2[0].printChild2();
		arr2[1].printChild2();
		
		System.out.println("----- 다형성을 적용한 배열 -----");
		Parent[] arr = new Parent[4];
		arr[0] = /*(Parent)*/new Child1(4, 5, 6);
		arr[1] = /*(Parent)*/new Child2(2, 5, 6);
		arr[2] = /*(Parent)*/new Child2(7, 5, 3);
		arr[3] = /*(Parent)*/new Child1(3, 2, 1);
		
		// printParent() 메소드호출
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
		}
		// printChild1(), printChild2() 호출이 하고 싶다!!!
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n---------------- 구분자 ------------------");
		System.out.println("오버라이딩 적용");
		for(int i = 0; i < arr.length; i++) {
			/*
			if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			*/
		
			/*
			 * 
			 * instanceof 연산자 => true / false
			 * 
			 * 
			 * 현재 레퍼런스가 실질적으로 어떤 클래스 타입을 참조하고 잇는지 확인할 때 사용
			 */
			/*
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			arr[i].print();
			// 각 배열의 인덱스에 차근차근 접근
			// "나 부모야 ~ " 4번 찍혀야함
			
			/*
			 * 동적 바인딩 : 프로그램 실행 전 컴파일 되면서 정적바인딩(자료형의 메소드를 가리킴)
			 * 
			 * 				단, 실질적으로 참조하는 자식클래스에 해당 메소드가 오버라이딩 되어있다면
			 * 				프로그램 실행 시 동적으로 자식클래스의 오버라이딩 된 메소드를 찾아서 실행
			 * 
			 */
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}