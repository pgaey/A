package funGame.game;

import java.util.Scanner;

public class Game {
	
	public int yesN =0;
	public int noN = 0;

	
	public void go() {
	
		System.out.println("~~~~����ִ� ��Ģ���� ����~~~~~~~\n-������ �Է����ּ���! ");
		System.out.println("-��̰� ������ Ǯ�ٰ� ���ܿ�� 0�� ��������!");
		System.out.println("-���͸� ������ �����մϴ�.");
		System.out.println("=============================");
		Scanner sc = new Scanner(System.in);
	    String enter = sc.nextLine();
		System.out.println("���̵��� �Է� �ϼ���! [ ��, ��, �� ]");
		String nanedo = sc.nextLine();
		String yes = "�����Դϴ�.";
		String no = "Ʋ�Ƚ��ϴ�.";
		
		
		
		// ��� ���̵� ���� �� 
		if (nanedo.equals("��")){
			System.out.println("��� ���̵��Դϴ�. 1~1000 ������ ���� �˴ϴ�.");
			for(int i=1; ;i++) {
				int randomA = (int)(Math.random() * 1000) + 1;
				int randomB = (int)(Math.random() * 1000) + 1;
				char randomC;
				
				if((randomA - randomB)<= 0) {
					i = i-1;
					continue;
				}
				
				if(randomA % 2 == 0) {
					randomC = '+';
				} else if (randomA % 3 == 0) {
					randomC = 'x';
				} else if (randomA % 4 == 0){
					randomC = '-';
				} else { randomC = '/';
					
				}
				
				int result1 = (randomA + randomB);
				int result2 = (randomA - randomB);
				int result3 = (randomA * randomB);
				int result4 = (randomA / randomB);
				
				System.out.println("Q" + i + ")" + randomA + randomC + randomB + "?" );
				int num = sc.nextInt();
				
				if(num == 0) {
					if(!(result2 == 0)) {
						System.out.println("������ �����մϴ�");
					System.out.println("���� Ƚ�� : " + yesN + ", ���� Ƚ�� : " + noN );
					return;
					}
					
				}
				if(randomC=='+') {
					if(num == result1) {
						System.out.println(yes);
						yesN++;
					}
					else {
						System.out.println(no);
						noN++;
					}
				}
				else if(randomC=='-') {
					if(num == result2) {
						System.out.println(yes);
						yesN++;
					} else {
						System.out.println(no);
						noN++;
					}
					
				}
				else if(randomC =='/') {
					if(num== result4) {
						System.out.println(yes);
						yesN++;
					} else {
						System.out.println(no);
						noN++;
					}
				}
				else {
					if(num == result3) {
					System.out.println(yes);
					yesN++;}

				else {
					System.out.println(no);
					noN++;
				}
			}
				}
				 // �߱� ���̵� ���� �� 
				} else if(nanedo.equals("��")) {
					System.out.println("�߱� ���̵��Դϴ�. 1~100 ������ ���� �˴ϴ�.");
					for(int i=1; ;i++) {
						int randomA = (int)(Math.random() * 100) + 1;
						int randomB = (int)(Math.random() * 100) + 1;
						char randomC;
						
						if((randomA - randomB)<= 0) {
							i = i-1;
							continue;
						}
						if(randomA % 2 == 0) {
							randomC = '+';
						} else if (randomA % 3 == 0) {
							randomC = 'x';
						} else if (randomA % 4 == 0){
							randomC = '-';
						} else {randomC = '-';}
						
						int result1 = (randomA + randomB);
						int result2 = (randomA - randomB);
						int result3 = (randomA * randomB);
						int result4 = (randomA / randomB);
						
						System.out.println("Q" + i + ")" + randomA + randomC + randomB + "?" );
						int num = sc.nextInt();
						if(num == 0) {
							System.out.println("������ �����մϴ�");
							System.out.println("���� Ƚ�� : " + yesN + ", ���� Ƚ�� : " + noN );
							return;
						}
						if(randomC=='+') {
							if(num == result1) {
								System.out.println(yes);
								yesN++;
							} else {
								System.out.println(no);
								noN++;
							}
						} else if(randomC=='-') {
							if(num == result2) {
								System.out.println(yes);
								yesN++;
							} else {
								System.out.println(no);
								noN++;
							}
						}
						else if(randomC =='/') {
							if(num== result4) {
								System.out.println(yes);
								yesN++;
							} else {
								System.out.println(no);
								noN++;
							}
						}
						else {
							if(num == result3) {
							System.out.println(yes);
							yesN++;
							} else {
							System.out.println(no);
							noN++;
						}
					}
						}
				 // �ϱ޳��̵� ���� �� 
			} else if(nanedo.equals("��")) {
				System.out.println("�ϱ� ���̵��Դϴ�. 1~10 ������ ���� �˴ϴ�.");
				for(int i=1; ;i++) {
					
					int randomA = (int)(Math.random() * 10) + 1;
					int randomB = (int)(Math.random() * 10) + 1;
					char randomC;
					if((randomA - randomB)<= 0) {
						i = i-1;
						continue;
					}
					if(randomA % 2 == 0) {
						randomC = '+';
					} else if (randomA % 3 == 0) {
						randomC = 'x';
					}
					else if (randomA % 4 == 0){
						randomC = '-';
					}
					else {randomC = '-';}
					int result1 = (randomA + randomB);
					int result2 = (randomA - randomB);
					int result3 = (randomA * randomB);
					int result4 = (randomA / randomB);
					
					System.out.println("Q" + i + ")" + randomA + randomC + randomB + "?" );
					int num = sc.nextInt();
					if(num == 0) {
						System.out.println("������ �����մϴ�");
						System.out.println("���� Ƚ�� : " + yesN + ", ���� Ƚ�� : " + noN );
						return;
					}
					
					if(randomC=='+') {
						if(num == result1) {
							System.out.println(yes);
							yesN++;
						} else {
							System.out.println(no);
							noN++;
						}
					} else if(randomC=='-') {
						if(num == result2) {
							System.out.println(yes);
							yesN++;
						} else {
							System.out.println(no);
							noN++;
						}
					} 
					else if(randomC =='/') {
						if(num== result4) {
							System.out.println(yes);
							yesN++;
						} else {
							System.out.println(no);
							noN++;
						}
					}
					else {
						if(num == result3) {
						System.out.println(yes);
						yesN++;
						} else {
							System.out.println(no);
						noN++;
					}
				}
					}
			
				}

		System.out.println("���̵��� ����� �Է����� �ʾ� ���� �մϴ�.");
		
		
	}
}

		
	
	


