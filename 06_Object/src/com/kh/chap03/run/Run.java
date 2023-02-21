package com.kh.chap03.run;

import com.kh.chap03.model.vo.Person;
import com.kh.chap03.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		// 내가 만든 나만의 자료형(1. 참조자료형, 2. 주소값을 저장, 3. 여러개의 자료형에 여러개의 값을 보관 + 기능)
		// == 사용자 정의 자료형
		// Person이라는 클래스를 통해 객체 생성
		
		Person person = new Person(); // 인스턴스화		instance 랑 object랑 똑같은 말
		// person을 편의상 객체라고 부르지만 실제로는 heap 메모리에 올라가 있다
		
		System.out.println(person.information());
		// 기본값이 들어있음 -> 기본형 0, 0.0, ''  // 참조형은 null
		
		
		person.setName("이예찬");
		person.setAge(30);
		person.setGender('M');
		person.setPersonId("940607");
		person.setPhoneNumber("01088677338");
		person.setMail("pgaey");
		
//		String name = person.getName();
//		int age = person.getAge();
//		char gender = person.getGender();
//		String personId = person.getPersonId();
//		String phoneNumber = person.getPhoneNumber();
//		String mail = person.getMail();
		
		System.out.println(person.information());
		
//		-----------------------------------------------------------------
		
		System.out.println("------------------------------------------");
		
		Product pd = new Product();
		
		System.out.println(pd.information());
		
		pd.setPrice(10000);
		pd.setColor("빨강");
		pd.setProductName("?");	
		
		System.out.println(pd.information());
		
		

	}

	
	
	
	
	
	
	
	
	
}
