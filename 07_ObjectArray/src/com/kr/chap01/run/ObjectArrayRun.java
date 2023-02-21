package com.kr.chap01.run;

import java.util.Scanner;

import com.kr.chap01.model.vo.Coffee;

public class ObjectArrayRun {

	public static void main(String[] args) {
		// 배열의 특징
		// 인덱스라는 개념이 존재(벗어나면 오류난다.)
		// 같은 자료형끼리만 묶을 수 있다.
		// 참조형이다.
		// 크기를 바꿀 수 없다.
		
		// int[] iArr = new int[5];        		//   주소값  = 힙 영역
		// String[] sArr = new String[5];		
		
		// Coffee[] cArr = new Coffee[0];
		// [ 표현법  ]
		// 클래스이름[] 배열식별자 = new 클래스이름[배열크기]
		
		Coffee[] arr = new Coffee[3]; // 0, 1, 2
		Scanner sc= new Scanner(System.in);
		
		
		for(int i = 0; i < arr.length; i++){
			
			System.out.println("사이즈를 입력해주세요 > ");
			String size = sc.nextLine();
					
			System.out.println("가격을 입력해주세요 >");		
			int price = sc.nextInt();		
			sc.nextLine();		
					
			System.out.println("커피이름을 입력해주세요 > ");
			String coffeeName = sc.nextLine();
					
			System.out.println("원두를 입력해주세요 > ");
			String bean = sc.nextLine();
			
			arr[i] = new Coffee(size, price, coffeeName, bean);
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}		
		
		System.out.println("사고 싶은 커피 이름 : ");
		String buy = sc.nextLine();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].getCoffeeName().equals(buy)){
				System.out.println(arr[i].getPrice());
			}
		}
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
					
		}

}
