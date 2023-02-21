package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	// 변수(Variable) : 
	// 메모리(RAM)에 DATA(VALUE)값을 저장하기 위한 공간
	
	
	// 변수의 특징 : 
	// 1. 코드블록(Scope)안에서 선언되고 사용된다.
	// 2. 자료형이 지정되어야한다.
	
	// 3. 지역변수의 경우 초기화를 해야만 사용이 가능하다.
	// 4. 식별자를 붙여서 사용한다.
	// 5. 크기가 정해져있다.
	// 6. 변수공간의 값을 새로 대입해서 값을 변경할 수 있다.
	// 7. 연산이 가능하다.
	// 8. 기본자료형의 경우 stack메모리에 저장된다.
	// 9. 초기화는 한번만 가능하다.
	// 10. 하나의 변수공간에는 하나의 값만 저장이 가능하다.
	
	// 11. 참조형은 주소값을 저장한다.
	
	/*
	 * 배열 (Array) : 하나의 공간에 여러개의 값을 담을 수 있음
	 * 				단, "같은 자료형의 값들"만 담을 수 있음★		동종모음
	 * 				=> 배열의 각 인덱스에 실제 값이 담김 *** 인덱스는 '0'부터 시작한다.
 	 * 
	 */
	
	public void method1() {
		
		// 값이 늘어날 때마다 변수를 만들어서 기록하고 싶음
		/*
		int num1 = 1;
		int num2 = 5;
		int num3= 11;
		int num4= 17;
		int num5= 20;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		int sum = 0;
		for(int i =1; i <= 5; i++) {
			// sum += numi;
		}
		sum = num1 + num2 + num3 + num4 + num5;
		*/
		// 변수가 100개면..? 더 많으면..?
		// 해결 : 배열!
		
		
		// 1. 배열 선언
		
		/*
		 * 변수의 경우?
		 * 자료형 변수식별자;
		 * 
		 * 배열 선언법!
		 * 1) 자료형 배열식별자[];
		 * 2) 자료형[] 배열식별자;		=> 이 방법을 주로 사용할 것
		 */
		
		/*
		int num; // 변수 선언!
		
		int nums[]; // 1번 방법으로 int형 배열을 선언!		"int형 배열" 이라고 이름
		
		int[] nums2; // 2번 방법으로 int형 배열을 선언!		배열이라 보통 뒤에 s를 붙이는 형태로 많이 만듬.
		*/
		
		// 2. 배열 할당
		
		/*
		 * 배열에 몇개의 값이 들어갈지 배열의 크기를 정해주는 과정 . 반드시 값을 지정해야함
		 * 지정한 개수만큼 값이 들어갈 공간이 만들어짐 
		 * 
		 * [ 표현법  ]
		 * int[] arr;
		 * arr = new int[S]; // 할당
		 * int[] arr2 = new int[5]; // 선언과 동시에 할당
		 * 
		 * 배열은 참조형이다!!!!
		 * 참조형 : new 			new가 붙으면 참조형이라고 생각하면 됌
		 */
		
		int[] arr1;
		arr1 = new int[15];   //  arr1에 15칸의 공간이 생김
		
		int[] arr2 = new int[5];		// arr2에 5칸 짜리 공간이 생김
		
		
		// 3. 배열의 각 인덱스에 값 대입
		
		/*
		 * [ 표현법   ]
		 * 배열식별자[인덱스 번호] = 값; // 0부터 시작
		 */
		
		arr2[0] = 1;	//	int형 배열이기 때문에 int만 가능
		arr2[1] = 5;
		arr2[2] = 7;
		arr2[3] = 9;
		arr2[4] = 17;
		
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[2]);
//		System.out.println(arr2[3]);
//		System.out.println(arr2[4]);
		
		// 변수랑 차이가 없네?
		
		int sum = 0;
		for(int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}
		
		System.out.println(sum);
		// 현시점에서 배열을 사용해서 얻을 수 있는 가장 큰 장점 : 반복문을 사용 가능
	}

	public void method2() {
		
		// String형 배열
		// 1. 배열의 선언과 할당
		// names 27칸짜리 String[]
		
		String[] names = new String[27];
		
		// 2. 배열의 인덱스에 값을 대입
		names[0] = "김연대";
		names[1] = "김채은";
		names[2] = "김태령";
		names[3] = "김하은";
		names[4] = "김호재";
		names[5] = "김효기";
		names[6] = "김희재";
		names[7] = "당서희";
		names[8] = "박민성";
		names[9] = "박한솔";
		names[10] = "배선재";
		names[11] = "신세희";
		names[12] = "신혜린";
		names[13] = "심현정";
		names[14] = "양유진";
		names[15] = "엄기일";
		names[16] = "염경훈";
		names[17] = "윤희진";
		names[18] = "이규빈";
		names[19] = "이예찬";
		names[20] = "이유진";
		names[21] = "이지현";
		names[22] = "전태영";
		names[23] = "정영경";
		names[24] = "조준혁";
		names[25] = "최지성";
		names[26] = "홍준빈";
		
//		names[100] = "이승철";		// 빨간줄 안뜨는 이유 : 문법적으로는 맞게 썼다. 틀린거 없어~~
		
		// ArrayIndexOutOfBounds : 100 <= 이유
		// 배열의 인덱스 범위를 벗어났다.
		// at com.kh.array.Array.method2(Array.java:163) <- 인덱스의 범위를 벗어난 위치!
		
		System.out.println("names배열의 길이 : " + names.length); 	// names.length 값이 27임
					     	  /* 27 */
		for(int i = 0; i <= names.length; i++) {	//	i < names.length 로
			System.out.printf("출석번호 %d번 %s \n", i + 1, names[i]);		// 문법적으로는 맞게 썼다.
		}
	}
	
	public void method3() {
		
		// 1. 사용자로부터 입력을 통해 배열에 값을 담기
		// 다섯칸 짜리 인트형 배열 
		
		// 배열 선언 -> 배열의 크기 할당
		
		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수를 입력하세요");
			nums[i] = sc.nextInt();
			System.out.println("nums라는 배열의 " + i + "번 째 인덱스에 들어가는 값 : " + nums[i]);
			
		} // System.out.println(Arrays.toString(nums));
		
		// 2. 해달 배열에서 가장 작은 값, 최소값을 구하는 기능을 만들어보자
		
		int min = nums[0];				// 0 같은 값을 입력하면 들어가는 값에 따라 문제가 생길 수 있어서 보통 [0]이 들어감
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
	    	} 
		}	
		System.out.println("최소값 : " + min);
	}
	
	public void method4() {
		
		// 1. 배열 선언 + 할당
		int[] iArr = new int[3];	// 0, 1, 2				// new에서 나온건 heap메모리에 들어감
		double[] dArr = new double[4];	// 0, 1, 2, 3
		
		System.out.println(iArr);
		System.out.println(dArr);
		
		
		// 배열식별자.length : 배열의 크기(길이) => 정수
		System.out.println(iArr.length);		// iArr뒤에 [ . ]을 참조연산자 or 직접접근연산자(포인터, 레퍼런스) 라고 함
		System.out.println(dArr.length);
		
		// int i	int[] iArr
		// double d double[] dArr
		
		/*
		int i;		
		double d;	// 변수선언 => stack 영역에 메모리가 생김
		
		i = 1;
		
		System.out.println(i);	
		System.out.println(d);	// 선언만 하고 값이 없어서 출력이 안됌	 =>	 빨간줄 생김
		
		*/
		
		
//		iArr = 3; // 주소가 들어있는 stack 메모리에 3을 넣겠다고 표현한 것
				  // 그래서 iArr[0] = 3; 이처럼 인덱스로 접근해야함.
		
		
		System.out.println(iArr);
		System.out.println(dArr);		// heap메모리에 올라가면 값이 없을 수가 없어서 기본 값이 들어감 ex) 0.0
										// 출력 => 0.0
		
		
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 * => 실제 값을 바로 담을 수 있음 : 일반 변수
		 * 
		 * 참조자료형 : String, int[], double[], short[], float[]...
		 * => 주소 값을 담고 있는 변수 : 참조 변수(레퍼런스 변수)
		 * 
		 */
		
		// 참조자료형에는 == (동등비교 시) 주소값을 비교하기 때문에 원하는 결과를 얻을 수 있음
		// 문자열.equals("비교할문자열");
		
		int[] iArr2 = new int[3];				// new하면 heap 메모리에 무조건 생성된다고 생각하면 됌
		System.out.println(iArr == iArr2);
		
		System.out.println("iArr의 해시코드 값 : " + iArr.hashCode());	// hashCode (해시코드) int형 : 해싱한 값(16진수)를 10진수로 바꿔준다. 
		System.out.println("iArr2의 해시코드 값 : " + iArr2.hashCode());  // hashCode 가 다르다면   a! = b, 같다고 무조건 같진 않다.
		System.out.println("dArr의 해시코드 값 : " + dArr.hashCode());
		// 해시코드 : 주소값을 십진수의 형태(int형)으로 나타낸것
		
		// 반복문
		// 0번 인덱스부터 마지막 인덱스까지 1씩 증가시키면서 순차적으로 출력
		// 마지막 인덱스 == 배열의 크기 - 1
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}
	
	/*
	 * 배열의 아쉬운점??
	 * 
	 * 한 번 지정한 배열의 크기를 변경 불가 !!!
	 */
	
	public void method5() {
		
		String[] sArr = new String[3];		//sArr은 heap 주소에 [3]를 만들어 연결되어있음  284 ->296행
		
		sArr[0] = "이";
	    sArr[1] = "예";
	    sArr[2] = "찬";
	    
	    for(int i = 0; i < sArr.length; i++) {
	    	System.out.print(sArr[i]);
	    }
	    System.out.println("\nsArr의 해시코드 : " + sArr.hashCode());
	    
	    sArr = new String[5];				//sArr은 heap 주소에  [5]를 만듬
	    System.out.println("죽었다 살아난 sArr의 해시코드 : " + sArr.hashCode());		// hashCode가 원래 sArr[3] 값에서 sArr[5] 값으로 가르키는 값을 바꿈.
	    // 배열의 크기를 변경하고자 한다면 어쩔 수 없이 배열을 다시 만들어야한다.
	    
	    for(int i = 0; i < sArr.length; i++) {			
	    	System.out.print(sArr[i]);
	    }
	    
	    /*
	     * 연결이 끊긴 기존의 배열은??
	     * heap영역에 둥둥 떠다니다가 일정시간이 지나면
	     * GC가 삭제시켜준다!! : 자동 메모리 관리        GC = Garbage Collection
	     * 
	     * 배열은 항상 고유한 주소값이 부여됨
	     * 기존 배열식별자(이름)에 할당만 다시한다면??
	     * => 기존에 참조하고 있던 연결이 끊기고 새로운 배열과 연결됨
	     * => 새로운 곳을 참조한다.
	     * 
	     * 주소값이 다르면 다른배열이다!!!!
	     */
	    
	    // 현재 연결고리를 끊고만 싶다.
	    sArr = null;  // null 값. 값임. 아무것도 존재하지 않음을 의미하는 [값]
	    
	    
	    // sArr[0] = "뭐어쩌라고";
	    
	    // NullPointerException
	    // 가르키고 있는게 null인데 주소가 없는데 어떻게 접근할래?
	    // null에 접근해?? 어떻게 대입할래??
	    
	    System.out.println("\n\n\n" + sArr);
	    
	    /*
	     * 기본자료형 할 때는 없던 개념
	     * 
	     * 참조자료형에는 null이라는 개념이 추가!!! => 주소값이 있냐 없냐
	     * 
	     * 기본자료형 기본값이
	     * 
	     * int a = 0;
	     * double d = 0.0;
	     * char c= '';
	     * 
	     * 참조자료형의 기본값이 => null(주소값이 없다)
	     * 
	     * 
	     * int[] iArr = null;
	     * double[] dArr = null;
	     * 
	     * 일단 String은 예외
	     */
	    String str = new String();
	    
	    System.out.println(str); // String str에 ""이 기본 값으로 들어있는 것
	    
	    str = null;		// 억지로 String값에  null 대입
	    
	    System.out.println(str); 
	}

	
	public void method6() {
		
		// 배열 선언 및 할당과 동시에 초기화(대입)까지 한번에 끝내는 방법
		
		/*
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 * arr[3] = 5;
		 */
		
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		
		// 방법 1.
		int[] arr1 = new int[] {1, 2, 3, 5};
		
		// 방법 2.								<<== 보편적으로 제일 많이 씀
		int[] arr2 = {1, 2, 3, 5};  
	}
	
	/*
	 * 배열 복사
	 * 
	 * 1. 얕은 복사		-> 개념적으로 더 중요.
	 * 
	 * 
	 * 
	 * 
	 * 2. 깊은 복사 
	 * 
	 * 
	 */
	
	// 얕은 복사
	public void method7() {
		
		int[] origin = {1, 2, 3, 4, 5};

		System.out.println("원본배열");
		for(int i = 0; i < origin.length; i ++) {
			System.out.print(origin[i] + " ");
		}
		
		
		// 얕은 복사
		int[] copy = origin;		// origin이 가지고 있는 값을 copy에 보내는 것. origin 값(주소)이 ABC였다면 copy에도 값(주소) ABC를 보냄.
		
		System.out.println("\n복사본배열");
		for(int i = 0; i < copy.length; i ++) {
			System.out.print(copy[i] + " ");
		}
		
		origin[3] = 100;
		System.out.println("\n원본배열");
		for(int i = 0; i < origin.length; i ++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n복사본배열");
		for(int i = 0; i < copy.length; i ++) {
			System.out.print(copy[i] + " ");
		}
		
		// 두 개 똑같나??
		
		System.out.println("\n원본 배열의 해시코드 : " + origin.hashCode());
		System.out.println("복사본 배열의 해시코드 : " + copy.hashCode());
		
		// 얕은복사 => 배열의 주소값을 대입하기 때문에 가리키고 있는 배열이 같다.
	}
	
	// 2. 깊은 복사
	public void method8() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// 1단계. 복사하고자 하는 기존 배열과 동일한 크기의 새 배열을 생성 및 할당
		
		int[] copy = new int[origin.length];		// origin 배열 값이 더 늘어날 수도 있기 때문에 숫자'5'를 적기보다 origin.length가 유리
		
		// 2단계.
		// 
		// copy[0] = origin[0]
		// copy[1] = origin[1]
		// copy[2] = origin[2]
		// copy[내가 넣고자 하는 인덱스] = origin[내가 복사하고자 하는 인덱스]
		
		for(int i = 0; i < origin.length; i++) {		
			copy[i] = origin[i];
		}
		
		origin[2] = 99;
		System.out.println("\n원본 배열 출력");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n복사본 배열 출력");					// 얕은 복사에서는 [주소를 복사]했기 때문에 복사본의 값도 변했지만
		for(int i = 0; i < copy.length; i++) {				// 지금은 인덱스의 크기만 복사.
			System.out.print(copy[i] + " ");
		}													
		
		System.out.println("\n원본 배열의 해시코드 : " + origin.hashCode());
		System.out.println("\n원본 배열의 해시코드 : " + copy.hashCode());
		
		// 주소값을 복사한 것이 아니라 원본배열의 인덱스에 접근해서 실제 값을 복사본배열의 인덱스에 대입한 것.
	}
	
	// 깊은복사 2. arraycopy() 호출
	public void method9() {
		
		// 새로운 배열을 생성한 후
		// System클래스에서의 arraycopy() 호출
		// 몇 번 인덱스부터 몇 개를 어느 위치부터 넣을건지 직접 지정 가능
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10];
		
		/*
		 * [ 표현법  ]
		 * 
		 * System.arraycopy(원본배열식별자, 원본배열에서 복사를 시작할 인덱스, 복사본 배열식별자, 복사본 배열에서 복사가 시작될 인덱스, 복사할 개수);
		 */
		
		System.arraycopy(origin, 0, copy, 0, 5);
		System.arraycopy(origin, 0, copy, 3, 5);
//		System.arraycopy(origin, 0, copy, 9, 2);		// ArrayIndexOutOfBounds
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");		// heap영역에는 무조건 값이 들어있고 초기값은 0 임
		}
	}
	
	// 깊은복사 3. copyOf() 호출
	public void method10() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// Arrays클래스에서 제공하는 copyOf()
		// [ 표현법  ]
		// 복사본 배열 = Arrays.copyOf(원본배열이름, 복사할개수);
		
		int[] copy = Arrays.copyOf(origin, 10);
		
		// 원본 배열보다 큰 값을 제시하면 복사본배열에 빈 공간을 생성
		
		System.out.println("복사본 배열 출력");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		/*
		 * System.arraycopy()
		 * 몇 번 인덱스부터 몇개를 어느 위치의 인덱스에 복사할 것인지 모두 지정가능
		 * 
		 * Arrays.copyOf()
		 * 무조건 원본배열의 0번 인덱스부터 복사 (내가 지정한 개수만큼)
		 * 
		 */
	}
	
	// 깊은복사 4. clone()
	public void method11() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// int[] copy = origin; 얕은복사
		
		// 깊은복사	[ 표현법  ] 복사본배열식별자 = 원본배열식별자.clone();  반복문을 안쓰고.
		int[] copy = origin.clone();
		// 인덱스를 지정 X, 복사할 개수 X -> 원본배열과 완전히 똑같이 새로 생성해서 복사
		
		// Arrays.toStiring(내용을 출력하고 싶은 배열의 식별자);
		// toString => 이쁘게 좀 보자 ~~~
		// 배열의 요소를 출력해줌
		// ex) [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(copy));
		
		
	}
	
	
	
	
	
	
	
	
}
