package com.kr.example.practice8.game;

import java.util.Scanner;

public class Game {

Scanner sc = new Scanner(System.in);
int j = 0;
int yes = 0;
int no = 0;
	
	public void method1() {
		
		System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~");
		System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]"); // 아직 남음
		System.out.println("=====================\n# 엔터를 누르면 시작합니다.");
		sc.nextLine();
		System.out.print("\n\n# 난이도를 입력하세요! [상, 중, 하]\n>> ");
		String level = sc.nextLine();
			
		switch(level) {			
		case "상" : level3();
		break;
		case "중" : level2();
		break;
		case "하" : level1();
		break;
		default : System.out.print("안해");
		
			} 
	} 
	
//	-------------------------------------------------------------------------------

	
	public void level3() {
		System.out.println("상급 난이도입니다. 1 ~ 1000 범위로 출제됩니다.");
		
		
		
		
		method2();
	}
	
	public void level2() {
		System.out.println("중급 난이도입니다. 1 ~ 100 범위로 출제됩니다.");
	}
	
	public void level1() {
		System.out.println("하급 난이도입니다. 1 ~ 10범위로 출제됩니다.");
	}
	
	
//	-----------------------------------------------------------------------------------
	
	
	
	public void plus() {
		while(true) {
			
				int random1 = (int)(Math.random() * 1000 + 1);
				int random2 = (int)(Math.random() * 1000 + 1);
				
				System.out.printf("Q%d) %s + %s = ? \n>>  ", j, random1, random2);
				int answer = sc.nextInt();
				
				if (answer == (random1 + random2)) {
					System.out.println("# 정답입니다!");
					yes++;
				} else {
					System.out.println("# 틀렸습니다!");
					no++;
				}
			method2();
		}
	}
	
	public void minus() {
		while(true) {
			
			int random1 = (int)(Math.random() * 1000 + 1);
			int random2 = (int)(Math.random() * 1000 + 1);
			
			if(random1 > random2) {
				System.out.printf("Q%d) %s - %s = ? \n>>  ", j, random1, random2);
				int answer = sc.nextInt();
				
				if (answer == (random1 - random2)) {
					System.out.println("# 정답입니다!");
					yes++;
				} else {
					System.out.println("# 틀렸습니다!");
					no++;
				} 
				
			}else if(random1 < random2){
			
				System.out.printf("Q%d) %s - %s = ? \n>>  ", j, random2, random1);
				int answer = sc.nextInt();
				
				if (answer == (random2 - random1)) {
					System.out.println("# 정답입니다!");
					yes++;
				} else {
					System.out.println("# 틀렸습니다!");
					no++;
				}
			}else if(random1 == random2) {
					
			}
			method2();
		}
	}
	
	public void multi() {
		while(true) {
			
			int random1 = (int)(Math.random() * 1000 + 1);
			int random2 = (int)(Math.random() * 1000 + 1);
			
			System.out.printf("Q%d) %s X %s = ? \n>>  ", j, random1, random2);
			int answer = sc.nextInt();
			
			
			if (answer == (random1 + random2)) {
				System.out.println("# 정답입니다!");
				yes++;
			} else {
				System.out.println("# 틀렸습니다!");
				no++;
			} method2();
		}
	}
	
	
	
	
	public void method2() {
		j++;
		
		int dice = (int)(Math.random()*3 +1);
		
		switch(dice) {
		case 1 : plus();
		break;
		
		case 2 : minus();
		break;		
		
		case 3 : multi();
		break;
		
		}
	
	}
}
