package com.kh.run;

public class WrapperRun {
	
	public static void main(String[] args) {
		
		/*
		 * Wrapper Class
		 * 
		 * => 기본자료형을 객체로 포장해주는 클래스들을 래퍼 클래스라고 함
		 * 
		 * 기본자료형			<ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ>				Wrapper 클래스
		 * 
		 * boolean										Boolean
		 * char											Character
		 * byte											Byte
		 * short										Short
		 * int											Integer
		 * long											Long
		 * float										Float
		 * double										Double
		 * 
		 * 
		 */
		
		// 기본자료형을 객체로 취급해야하는경우
		// 메소드의 매개변수 타입으로 기본자료형이 아닌 객체 타입만 요구될 때
		// 다형성을 적용시키고 싶을 때
		
		int num1 = 10;
		int num2 = 15;
		
		Integer i5 = 50;
		// num1과 num2를 동등비교 하고 싶다.
		System.out.println(num1 == num2);
//		System.out.println(num1.equals(num2));
		// equals() => Object
		// equals() => 주소값을 비교해서 같으면 true / 다르면 false return
		
//		Integer i1 = new Integer(num1);
		// 기본 자료형 => Wrapper클래스 자료형 
		Integer i1 = num1;   //  권장하는 방법
		Integer i2 = num2;
		
		System.out.println();
		System.out.println("compareTo, equals");
		System.out.println(i1.compareTo(i2));
		System.out.println(i1.equals(i2));
		// a.compareTo(b);
		// a가 b보다 크면 1 return
		// a가 b보다 작으면 -1 return
		// 같으면 0 return
		
		System.out.println("ㅡㅡㅡㅡㅡ구분자ㅡㅡㅡㅡㅡ");
		
		String str = "123";
		String str2 = "123";
		// str과 str2 문자열을 246으로 만들고 싶다면?
		
		
		// 문자열을 Integer타입으로
		// Integer i3 = "123";		불가능
		Integer i4 = new Integer("123");		// Integer 타입안에 넣는다
		int num5 = i4.intValue();				// .intValue()로 int로 바꾼다	"12가나34" 이렇식으로 되어있으면 안되고 오직 "(숫자)"만.   아마  ""을 없애는 방식이지 않을까
		System.out.println(num5);				// !오로지! .intValue()는 [Integer => int]임
		
		int num4 = Integer.parseInt("123");		// 더 편한 방법		앞에 뭐가 붙던 parseInt() 에 있는 () 안에 것
		System.out.println(num4);
		
		
		System.out.println("기본자료형 ---> String  시작 ");
		// 기본자료형 --> String		이 경우에 Wrapper클래스를 가장 많이 사용함
		String str3 = "10";		// int
		String str4 = "15.0";	// double
		
		System.out.println(str3 + str4);
		// 1. String형을 기본자료형으로 parsing
		// [ 표현법  ]
		// 해당 Wrapper클래스이름.parseXXX(변환할문자열);					형변환이 아님!!!			parsing(대강 해석)이라는 개념임
		int i =	Integer.parseInt(str3);			// "10" -> 10
		double d = Double.parseDouble(str4);	// "15.0" -> 15.0
		System.out.println(i + str3);	// 숫자 10  +  "10"
		
		
		
		System.out.println("2. 기본자료형을 String형으로 ");
		// 2. 기본자료형을 String형으로 
		// => String.valueOf(변환할 자료형 값) : String
		String strI = String.valueOf(i);		//    int i = 10;
		String strD = String.valueOf(d);		// double d = 15.0;
		
		System.out.println(strI + strD);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
