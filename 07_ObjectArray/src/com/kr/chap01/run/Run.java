package com.kr.chap01.run;

import java.util.Scanner;

import com.kr.chap01.model.vo.Coffee;

public class Run {

	public static void main(String[] args) {
		
		Coffee c1 = new Coffee();
//		System.out.println(c1.information());
		
		Coffee c2 = new Coffee();
		c2.setCoffeeName("아메리카노");
		c2.setPrice(3000);
//		System.out.println(c2.information());
		
		Coffee c3 = new Coffee("라떼", 5000, "자바산", "Venti");
//		System.out.println(c3.information());
		
		// 커피의 정보를 입력받아서 입력받은 커피들의 정보를 출력해주는 프로그램
		// 3개 커피의 정보를 입력받겠다고 가정!
		// 입력은 스캐너를 사용!
		
		c1 = null;
		c2 = null;
		c3 = null;
		
//		System.out.println("커피 사이즈 : ");
//		String size = sc.nextLine();
//		
//		System.out.println("커피 가격 : ");
//		int price = sc.nextInt();
//		
//		System.out.println("커피 이름 : ");
//		String name = sc.nextLine();
//		
//		System.out.println("원두 : ");
//		String bean = sc.nextLine();
		
		
//		c3 = new Coffee(name, price, bean, size);
//		System.out.println(c3.information());
		
		
			Scanner sc = new Scanner(System.in);
			
			for(int i = 0; i < 3; i++) {
			
				System.out.println("커피 이름 : ");
				String name = sc.nextLine();
				
				System.out.println("커피 가격 : ");
				int price = sc.nextInt();
				sc.nextLine(); // sc.nextInt로 하면 개행문자가 남기때문에 지워줘야함 
				
				System.out.println("원두 : ");
				String bean = sc.nextLine();
				
				System.out.println("커피 사이즈 : ");
				String size = sc.nextLine();
			
				if(i == 0) {
					c1 = new Coffee(name, price, bean, size);
				} else if(i == 1) {
					c2 = new Coffee(name, price, bean, size);
				} else {
					c3 = new Coffee(name, price, bean, size);
				}
			}
			
			
			
			
				
				System.out.println(c1.information());
				System.out.println(c2.information());
				System.out.println(c3.information());
				
				
			// 사용자로부터 사고 싶은 커피를 입력 받아서
			// 전체 커피들의 이름과 하나하나 비교해서 일치하는 커피의 가격을 알려주자.
				
		
		System.out.println("사고 싶은 커피 이름 입력 : ");
		String buy = sc.nextLine();
		
		if(buy.equals(c1.getCoffeeName())) {
			System.out.println(c1.getCoffeeName() + "의 가격 : " + c1.getPrice());
		}
		if(buy.equals(c2.getCoffeeName())) {
			System.out.println(c2.getCoffeeName() + "의 가격 : " + c2.getPrice());
		}
		if(buy.equals(c3.getCoffeeName())) {
			System.out.println(c3.getCoffeeName() + "의 가격 : " + c3.getPrice());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
