package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnchechedException {
	
	/*
	 * RuntimeException
	 * 프로그램 실행 시 발생되는 예외들 
	 * 
	 * RuntimeException의 자식클래스들
	 * - NullPointerException : 주소값 객체를 참조 했더니 null이 들어있을 경우 발생하는 예외
	 * - ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
	 * - NegativeArraySizeException : 배열 크기를 음수로 지정할 경우 발생하는 예외
	 * - ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외
	 * - ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외
	 * .....
	 * 
	 * RuntimeException과 관련된 예외들은 공통점이 있다!!!!!!!!!!!!!!!!!!!!!!!
	 * 개발자가 예측이 가능함!
	 * 
	 * 
	 * 
	 * 
	 */
	
	// ArithmeticException
	public void method1() {
		// 사용자에게 두 개의 정수값을 입력받아서 나눗셈 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 > ");
		int num1 = sc.nextInt();		
		sc.nextLine();
		
		System.out.println("두 번째 정수 > ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		// 방법 1. 조건문으로 처리(예외발생을 막음)
		/*
		if(num2 != 0) {
			System.out.println("나눗셈 결과 : " + (num1 / num2));
		} else {
			System.out.println("0은 안돼");
		}
		*/
		
		// 방법 2. 예외처리 구문을 이용
		// 예외가 발생했을 때 실행할 내용을 정의해두는 것!!
		
		/*
		 * try ~ catch 문
		 * 
		 * [ 표현법  ]
		 * 
		 * try {
		 * 
		 * 
		 * 
		 * 
		 * 		(num1 / num2) // 예외가 발생할법한 구문
		 * 
		 * 
		 * 
		 * 
		 * 		
		 * } catch(ArithmeticException e (발생할예외클래스이름 + 변수명) 	=> 	일종의 매개변수){
		 * 
		 * 		// 해당 예외가 발생했을 때 실행할 구문
		 * 
		 * }
		 */
		
		try {
			
			System.out.println("나눗셈 결과 : " + (num1/num2));
			
			System.out.println("문제 발생 안했어 ~ ~ ");
			
		} catch(ArithmeticException e) {
			
			System.out.println("num2에 0 넣지마 ~ ~ ~");
			e.printStackTrace(); // 오류를 추적해주는 메소드
			// 현재 오류가 발생한 정보를 볼 수 있고, 어디서 발생했는지 나열해준다.
			// 개발단계하고 테스트단계에서만 사용해야함!! 꼭!!
			
		}
		
		System.out.println("프로그램 끝났어 ~ ");
	}
	
	// 다중 catch문
	public void method2() {
		
		// catch할 예외가 여러개일 경우 주로 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력(0은 제외) > ");
		
		try {
			int num = sc.nextInt(); // 정수를 입력하라니까 이상한 것을 입력   InputMismatchException
			System.out.println("나눗셈 결과 > " + (100/num)); // 0을 입력하지 말라니까 0을 입력   ArithmeticException
				
		}catch(InputMismatchException e) { // 1. 우선적으로 입력받은게 정수인지 판단
			System.out.println("정수 넣어주세요!!");
		}catch(ArithmeticException e) { // 2. 정수라면 0인지 아닌지 판단
			System.out.println("0을 입력하지 말아주세요!!");
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	public void method3() {
		
		// 배열 활용
		
		// ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
		// NegativeArraySizeException : 배열의 크기를 음수로 지정할 때 발생하는 예외
		
		// 사용자로부터 배열의 크기를 입력받아서 배열을 만들기
		// 100번째 인덱스 값을 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기 > ");
		
		try {
			int size = sc.nextInt();	// 1. InputMismatchException  이상한 것을 입력
			int[] arr = new int[size];	  // 2. NegativeArraySizeException 배열의 크기를 음수로 지정할 때 발생하는 예외
			System.out.println(arr[100]);	// 3. ArrayIndexOutOfBoundsException 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
			
			// 다중 catch문 작성시 범위가 작은 자식타입의 예외클래스부터 먼저 기술해야함 (큰 범주 안에 있으면 먼저 잡히기 때문에 밑에 있는 자식캐치문이 의미가 없음)
		} catch(RuntimeException e) {
			System.out.println("배열이 이상해");
			// 뭉뚱그려서 포괄적으로 표현해야함 ==> 단점
			
			// System.out.println(".................");
		}
		
		
		
		/*catch(InputMismatchException e) {
			System.out.println("정수를 입력해주세요");
		}catch(NegativeArraySizeException e) {
			System.out.println("양수를 입력해주세요");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("작다!");
		}*/
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
