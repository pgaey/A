package com.kr.chap02.run;

import java.util.Scanner;

import com.kr.chap02.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		// int[] arr = new int[3];
		// 객체배열 선언 및 할당!
		
		Phone[] arr = new Phone[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println(arr); 					// 주소값
		System.out.println(arr.length);
		System.out.println(arr[0]); 				// null  초기값 이다.
		
		arr[0] = new Phone();						// 값
		System.out.println(arr[0]);					// 주소값 (information)
		
		arr[0].setColor("스그");
		arr[0].setBrand("Apple");
		arr[0].setSeries("14");
		arr[0].setPrice(1000000);
		
		System.out.println(arr[0]); 				// 주소값
		System.out.println(arr[0].information());	// 헷갈리지 않게
		
		arr[1] = new Phone("Samsung", "Z4", "하늘색", 230000);
		arr[2] = new Phone("샤오미",  "샤오미폰", "금색", 150000);
		
		System.out.println(arr[1].information());
		
		// 가격 총 합계, 평균가 출력
		
		int sum = 0;			// 합계나오면 일단 sum 선언
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].getPrice();
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / arr.length));
		

	}

	
	
	
}
