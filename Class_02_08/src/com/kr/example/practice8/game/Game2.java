package com.kr.example.practice8.game;

import java.util.Scanner;

public class Game2 {

Scanner sc = new Scanner(System.in);

	
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
		
		int dice = (int)(Math.random()*3+1);
		int rd1 = (int)(Math.random()*1000+1);
		int rd2 = (int)(Math.random()*1000+1);
		int result1 = rd1 + rd2;
		int result2 = rd1 - rd2;
		int result3 = rd1 * rd2;
		int i = 1;
		int yes = 0;
		int no = 0;
		
		
		System.out.println("��� ���̵��Դϴ�. 1 ~ 1000 ������ �����˴ϴ�.\n");
			for(;;i++) {
				
				if(dice == 1) {
					System.out.print("Q" + i + ")" + rd1 + "+" + rd2 + "= ?\n>> ");
					int answer = sc.nextInt();
					
					if(answer == result1) {
						System.out.println("# �����Դϴ�.");
						yes++;
					}else {
						System.out.println("# Ʋ�Ƚ��ϴ�.");
						no++;
					}
				
			} else if(dice == 2) {
					System.out.print("Q" + i + ")" + rd1 + "-" + rd2 + "= ?\n>> ");
					int answer = sc.nextInt();
					
					if(answer == result2) {
						System.out.println("# �����Դϴ�.");
						yes++;
					}else {
						System.out.println("# Ʋ�Ƚ��ϴ�.");
						no++;
					}
				
			} else if(dice == 3) {
					System.out.print("Q" + i + ")" + rd1 + "*" + rd2 + "= ?\n>> ");
					int answer = sc.nextInt();
					
					if(answer == result3) {
						System.out.println("# �����Դϴ�.");
						yes++;
					}else{
						System.out.println("# Ʋ�Ƚ��ϴ�.");
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
		
		
		System.out.println("�߱� ���̵��Դϴ�. 1 ~ 100 ������ �����˴ϴ�.\n");
		for( ; ;i++) {
			
			if(dice == 1) {
				cal = '+';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result1) {
					System.out.println("# �����Դϴ�.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# Ʋ�Ƚ��ϴ�.");
					no++;
					return;
				}
			} else if(dice == 2) {
				cal = '-';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result2) {
					System.out.println("# �����Դϴ�.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# Ʋ�Ƚ��ϴ�.");
					no++;
					return;
				}
			} else if(dice == 3) {
				cal = '*';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result3) {
					System.out.println("# �����Դϴ�.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# Ʋ�Ƚ��ϴ�.");
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
		
		
		System.out.println("�ϱ� ���̵��Դϴ�. 1 ~ 10 ������ �����˴ϴ�.\n");
		for( ; ;i++) {
			
			if(dice == 1) {
				cal = '+';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result1) {
					System.out.println("# �����Դϴ�.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# Ʋ�Ƚ��ϴ�.");
					no++;
					return;
				}
			} else if(dice == 2) {
				cal = '-';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result2) {
					System.out.println("# �����Դϴ�.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# Ʋ�Ƚ��ϴ�.");
					no++;
					return;
				}
			} else if(dice == 3) {
				cal = '*';
				System.out.println("Q" + i + ")" + rd1 + cal + rd2 + "= ?\n>> ");
				int answer = sc.nextInt();
				
				if(answer == result3) {
					System.out.println("# �����Դϴ�.");
					yes++;
					return;
				}else if (answer != result2) {
					System.out.println("# Ʋ�Ƚ��ϴ�.");
					no++;
					return;
				}
			}
		}
	}
}
