package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {
	/*
	 * break : break문을 만나는 순간 "가장 가까운 반복문"을 빠져나간다.
	 * 			해당 break문이 속해있는 반복문 "한겹"만 빠져나감!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * 
	 * * 주의사항 : switch문 안에 break;와 다른개념
	 * 			 switch문 내부에 있는 break 해당 switch문을 빠져나가는 용도일 뿐!!!
	 * 
	 */
	
	public void method1() {
		
		// 매 번 반복해서 새롭게 랜덤값 (1~100)을 생성해서 출력 => 무한하게
		
		// 1. while(true)
		// 2. for(;;)
		
		// 반복을 하다가 생성된 임의의 정수가 홀수일 경우 반복을 중단시키고 싶음!
		
		for(;;) {
			int num = (int)(Math.random() * 100) + 1;
			if(num % 2 == 1) {
				System.out.println(num + "반복끝!");
				break;
			}
			System.out.println(num);
		} // break문의 가까운 반복문 for의 끝지점
	}
	
	public void method2() {
		// 매 번 사용자에게 문자열을 입력 받은 후
		// 해당 문자열의 길이를 출력해보자 ~
		// 단, 사용자가"exit"을 입력할 경우 반복문을 빠져나가게 해줄 것.
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("문자열을 입력해주세요 > ");
			String str = sc.nextLine();
			
			// 사용자가 입력한 문자열과 "exit"이 도일하다면
			if(str.equals("exit")) {
				System.out.println("나가기");
				break;
			}
			System.out.println("글자수 : " + str.length());
		}
	}
	
	// 매 번 사용자로부터 숫자를 입력받고
	// 만약에 해당 숫자가 음수라면 " 프로그램을 종료합니다 " 라는 문구를 출력하고 종료!
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력해주세요");
			int num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
	}
	
	/*
	 * 사용자로부터 한 개의 값을 입력 받아서 
	 * 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력해보세요!
	 * 
	 * 단, 입력한 수는 1보다 크거나 같아야합니다.
	 * 
	 * 만약에 1미만의 숫자가 입력됐다면
	 * "1이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자에게 값을 입력받으세요!
	 * 
	 * ex)
	 * 
	 * 1이상의 숫자로 입력하세요 : 4
	 * 4 3 2 1
	 * 
	 * 1이상의 숫자를 입력하세요 : -1
	 * 1이상의 숫자를 입력해주세요!!!
	 * 1이상의 숫자를 입력하세요 : 5
	 * 5 4 3 2 1
	 * 
	 * 
	 */
	public void method4() {	
	
		Scanner sc = new Scanner(System.in);
		int num;
		
		boolean flag;
		do {
			System.out.println("1이상의 숫자 > ");
			num = sc.nextInt();
			flag = num < 1;
			if(flag) System.out.println("1이상의 숫자를 입력해주세요");
		} while(flag);
		
		for(; num > 0; num--) {
			System.out.println(num + " ");
		}
	}
	/*
	 * 사용자로부터 [시작 숫자]와 [공차]를 입력받아서
	 * 일정한 값으로 숫자가 커지는 프로그램을 만들어봅시다.
	 * 단, [출력되는 숫자]는 총 10개 입니다.
	 * * '공차'란 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말합니다.
	 * 
	 * ex) 1, 4, 7, 10, 13, ....
	 * 		3	3  3   3 		-> 여기서 공차는 3
	 * 
	 * 시작숫자 : 5
	 * 공차 : 2
	 * 
	 * 5 7 9 11 13 15 17 19 21 23 25
	 * 
	 * 시작숫자 + 공차 * n
	 */
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력");
		int startNum = sc.nextInt();
		System.out.println("공차 > ");
		int gongcha = sc.nextInt();
			
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d ", startNum + (gongcha * i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
