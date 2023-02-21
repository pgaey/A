package com.kr.example.practice8.game;

import java.util.Scanner;

public class Game_02_21 {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void game() {
		while(true) {
			
			System.out.println("~~~~~~~~ ����ִ� ��Ģ���� ���� ~~~~~~~~");
			System.out.println("[��̰� ������ Ǫ�ôٰ� ���ܿ�� 0�� ��������~]"); // ���� ����
			System.out.println("=====================\n# ���͸� ������ �����մϴ�.");
			sc.nextLine();
			System.out.print("\n\n# ���̵��� �Է��ϼ���! [��, ��, ��]\n>> ");
			String level = sc.nextLine();
			
			switch(level) {
			case "��" : level3(); break;
			case "��" : level2(); break;
			case "��" : level1(); break;
			default : System.out.println("�ٽ� �Է����ּ���\n\n\n\n"); break;
			}
			return;
		}
	}
	
	public void level3() {
		System.out.println("��� ���̵��Դϴ�. 1 ~ 1000 ������ �����˴ϴ�.");
		
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
						System.out.println("�����Դϴ�.");
						correct++;
						break;
					} else {
						System.out.println("Ʋ�Ƚ��ϴ�.");
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
						System.out.println("�����Դϴ�.");
						correct++;
						break;
					} else {
						System.out.println("Ʋ�Ƚ��ϴ�.");
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
							System.out.println("�����Դϴ�.");
							correct++;
							break;
						} else {
							System.out.println("Ʋ�Ƚ��ϴ�.");
							wrong++;
						}
					} else if(random1 - random2 <0) {
						System.out.println("Q" + i + ")" + random2 + " - " + random1 + " = ? \n>> ");
						int answer = sc.nextInt();
						sc.nextLine();
						if(answer == 0) {
							return;
						} else if(answer == (random2 - random1)) {
							System.out.println("�����Դϴ�.");
							correct++;
							break;
						} else {
							System.out.println("Ʋ�Ƚ��ϴ�.");
							wrong++;
						}
					}
				}
			}
		System.out.println("==================");
		System.out.println("# ���� Ƚ�� : " + correct + "ȸ, ���� Ƚ�� : " + wrong + "ȸ" );
		}
	}
	public void level2() {
		
	}
	public void level1() {
		
	}
	
	
	
	
	
	
	
}
