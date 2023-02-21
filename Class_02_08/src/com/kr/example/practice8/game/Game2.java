package com.kr.example.practice8.game;

import java.util.Scanner;

public class Game2 {

Scanner sc = new Scanner(System.in);

	
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
		
		int dice = (int)(Math.random()*3+1);
		int rd1 = (int)(Math.random()*1000+1);
		int rd2 = (int)(Math.random()*1000+1);
		int result1 = rd1 + rd2;
		int result2 = rd1 - rd2;
		int result3 = rd1 * rd2;
		int i = 1;
		int yes = 0;
		int no = 0;
		
		
		System.out.println("상급 난이도입니다. 1 ~ 1000 범위로 출제됩니다.\n");
			for(;;i++) {
				
				if(dice == 1) {
					System.out.print("Q" + i + ")" + rd1 + "+" + rd2 + "= ?\n>> ");
					int answer = sc.nextInt();
					
					if(answer == result1) {
						System.out.println("# 정답입니다.");
						yes++;
					}else {
						System.out.println("# 틀렸습니다.");
						no++;
					}
				
			} else if(dice == 2) {
					System.out.print("Q" + i + ")" + rd1 + "-" + rd2 + "= ?\n>> ");
					int answer = sc.nextInt();
					
					if(answer == result2) {
						System.out.println("# 정답입니다.");
						yes++;
					}else {
						System.out.println("# 틀렸습니다.");
						no++;
					}
				
			} else if(dice == 3) {
					System.out.print("Q" + i + ")" + rd1 + "*" + rd2 + "= ?\n>> ");
					int answer = sc.nextInt();
					
					if(answer == result3) {
						System.out.println("# 정답입니다.");
						yes++;
					}else{
						System.out.println("# 틀렸습니다.");
						no++;
					}
			}
		}
	}
	public void level2() {
		int dice = (int)(Math.random()*3+1);

		int rd1 = (int)(Math.random()*100+1);
		int rd2 = (int)(Math.random()*100+1);
		int result1 = rd1 + rd2;
		int result2 = rd1 - rd2;
		int result3 = rd1 * rd2;
		char cal;
		
		int i = 1;
		
		int yes = 0;
		int no = 0;
		
		
		System.out.println("중급 난이도입니다. 1 ~ 100 범위로 출제됩니다.\n");
		for( ; ;i++) {
			
			if(dice == 1) {
				cal = '+';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result1) {
					System.out.println("# 정답입니다.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# 틀렸습니다.");
					no++;
					return;
				}
			} else if(dice == 2) {
				cal = '-';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result2) {
					System.out.println("# 정답입니다.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# 틀렸습니다.");
					no++;
					return;
				}
			} else if(dice == 3) {
				cal = '*';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result3) {
					System.out.println("# 정답입니다.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# 틀렸습니다.");
					no++;
					return;
				}
			}
		}
	}
	
	public void level1() {
		int dice = (int)(Math.random()*3+1);

		int rd1 = (int)(Math.random()*10+1);
		int rd2 = (int)(Math.random()*10+1);
		int result1 = rd1 + rd2;
		int result2 = rd1 - rd2;
		int result3 = rd1 * rd2;
		char cal;
		
		int i = 1;
		
		int yes = 0;
		int no = 0;
		
		
		System.out.println("하급 난이도입니다. 1 ~ 10 범위로 출제됩니다.\n");
		for( ; ;i++) {
			
			if(dice == 1) {
				cal = '+';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result1) {
					System.out.println("# 정답입니다.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# 틀렸습니다.");
					no++;
					return;
				}
			} else if(dice == 2) {
				cal = '-';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result2) {
					System.out.println("# 정답입니다.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# 틀렸습니다.");
					no++;
					return;
				}
			} else if(dice == 3) {
				cal = '*';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result3) {
					System.out.println("# 정답입니다.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# 틀렸습니다.");
					no++;
					return;
				}
			}
		}
	}
}
