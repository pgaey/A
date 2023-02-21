package com.kr.example.practice8.game;

import java.util.Scanner;

public class Game_02_21 {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void game() {
		while(true) {
			
			System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~");
			System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]"); // 아직 남음
			System.out.println("=====================\n# 엔터를 누르면 시작합니다.");
			sc.nextLine();
			System.out.print("\n\n# 난이도를 입력하세요! [상, 중, 하]\n>> ");
			String level = sc.nextLine();
			
			switch(level) {
			case "상" : level3(); break;
			case "중" : level2(); break;
			case "하" : level1(); break;
			default : System.out.println("다시 입력해주세요\n\n\n\n"); break;
			}
			return;
		}
	}
	
	public void level3() {
		System.out.println("상급 난이도입니다. 1 ~ 1000 범위로 출제됩니다.");
		
		int correct = 0;
		int wrong  = 0;
		
		
		for(;;) {
			int dice = (int)(Math.random()*3 + 1);
			if(dice == 3) {
				for(int i = 1; ; i++) {
					int random1 = (int)(Math.random()*1000 + 1);
					int random2 = (int)(Math.random()*1000 + 1);
					System.out.println("Q" + i + ")" + random1 + " + " + random2 + " = ? \n>> ");
					int answer = sc.nextInt();
					sc.nextLine();
					if(answer == 0) {
						return;
					} else if(answer == (random1 + random2)) {
						System.out.println("정답입니다.");
						correct++;
						break;
					} else {
						System.out.println("틀렸습니다.");
						wrong++;
					}
				}
			}
			if(dice == 2) {
				for(int i = 1; ; i++) {
					int random1 = (int)(Math.random()*1000 + 1);
					int random2 = (int)(Math.random()*1000 + 1);
					System.out.println("Q" + i + ")" + random1 + " X " + random2 + " = ? \n>> ");
					int answer = sc.nextInt();
					sc.nextLine();
					if(answer == 0) {
						return;
					} else if(answer == (random1 * random2)) {
						System.out.println("정답입니다.");
						correct++;
						break;
					} else {
						System.out.println("틀렸습니다.");
						wrong++;
					}
				}
			}
			if(dice == 1) {
				
				for(int i = 1; ; i++) {
					int random1 = (int)(Math.random()*1000 + 1);
					int random2 = (int)(Math.random()*1000 + 1);
					if(random1 == random2) {
						i--;
						break;
					} else if(random1 - random2 > 0) {
						System.out.println("Q" + i + ")" + random1 + " - " + random2 + " = ? \n>> ");
						int answer = sc.nextInt();
						sc.nextLine();
						if(answer == 0) {
							return;
						} else if(answer == (random1 - random2)) {
							System.out.println("정답입니다.");
							correct++;
							break;
						} else {
							System.out.println("틀렸습니다.");
							wrong++;
						}
					} else if(random1 - random2 <0) {
						System.out.println("Q" + i + ")" + random2 + " - " + random1 + " = ? \n>> ");
						int answer = sc.nextInt();
						sc.nextLine();
						if(answer == 0) {
							return;
						} else if(answer == (random2 - random1)) {
							System.out.println("정답입니다.");
							correct++;
							break;
						} else {
							System.out.println("틀렸습니다.");
							wrong++;
						}
					}
				}
			}
		System.out.println("==================");
		System.out.println("# 정답 횟수 : " + correct + "회, 오답 횟수 : " + wrong + "회" );
		}
	}
	public void level2() {
		
	}
	public void level1() {
		
	}
	
	
	
	
	
	
	
}
