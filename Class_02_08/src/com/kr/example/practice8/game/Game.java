package com.kr.example.practice8.game;

import java.util.Scanner;

public class Game {

Scanner sc = new Scanner(System.in);
int j = 0;
int yes = 0;
int no = 0;
	
	public void method1() {
		
		System.out.println("~~~~~~~~ ����ִ� ��Ģ���� ���� ~~~~~~~~");
		System.out.println("[��̰� ������ Ǫ�ôٰ� ���ܿ�� 0�� ��������~]"); // ���� ����
		System.out.println("=====================\n# ���͸� ������ �����մϴ�.");
		sc.nextLine();
		System.out.print("\n\n# ���̵��� �Է��ϼ���! [��, ��, ��]\n>> ");
		String level = sc.nextLine();
			
		switch(level) {			
		case "��" : level3();
		break;
		case "��" : level2();
		break;
		case "��" : level1();
		break;
		default : System.out.print("����");
		
			} 
	} 
	
//	-------------------------------------------------------------------------------

	
	public void level3() {
		System.out.println("��� ���̵��Դϴ�. 1 ~ 1000 ������ �����˴ϴ�.");
		
		
		
		
		method2();
	}
	
	public void level2() {
		System.out.println("�߱� ���̵��Դϴ�. 1 ~ 100 ������ �����˴ϴ�.");
	}
	
	public void level1() {
		System.out.println("�ϱ� ���̵��Դϴ�. 1 ~ 10������ �����˴ϴ�.");
	}
	
	
//	-----------------------------------------------------------------------------------
	
	
	
	public void plus() {
		while(true) {
			
				int random1 = (int)(Math.random() * 1000 + 1);
				int random2 = (int)(Math.random() * 1000 + 1);
				
				System.out.printf("Q%d) %s + %s = ? \n>>  ", j, random1, random2);
				int answer = sc.nextInt();
				
				if (answer == (random1 + random2)) {
					System.out.println("# �����Դϴ�!");
					yes++;
				} else {
					System.out.println("# Ʋ�Ƚ��ϴ�!");
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
					System.out.println("# �����Դϴ�!");
					yes++;
				} else {
					System.out.println("# Ʋ�Ƚ��ϴ�!");
					no++;
				} 
				
			}else if(random1 < random2){
			
				System.out.printf("Q%d) %s - %s = ? \n>>  ", j, random2, random1);
				int answer = sc.nextInt();
				
				if (answer == (random2 - random1)) {
					System.out.println("# �����Դϴ�!");
					yes++;
				} else {
					System.out.println("# Ʋ�Ƚ��ϴ�!");
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
				System.out.println("# �����Դϴ�!");
				yes++;
			} else {
				System.out.println("# Ʋ�Ƚ��ϴ�!");
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
