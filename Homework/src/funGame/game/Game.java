package funGame.game;

import java.util.Scanner;

public class Game {
	
	public int yesN =0;
	public int noN = 0;

	
	public void go() {
	
		System.out.println("~~~~재미있는 사칙연산 게임~~~~~~~\n-정수만 입력해주세요! ");
		System.out.println("-즐겁게 문제를 풀다가 지겨우면 0을 누르세요!");
		System.out.println("-엔터를 누르면 시작합니다.");
		System.out.println("=============================");
		Scanner sc = new Scanner(System.in);
	    String enter = sc.nextLine();
		System.out.println("난이도를 입력 하세요! [ 상, 중, 하 ]");
		String nanedo = sc.nextLine();
		String yes = "정답입니다.";
		String no = "틀렸습니다.";
		
		
		
		// 상급 난이도 선택 시 
		if (nanedo.equals("상")){
			System.out.println("상급 난이도입니다. 1~1000 범위로 출제 됩니다.");
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
						System.out.println("게임을 종료합니다");
					System.out.println("정답 횟수 : " + yesN + ", 오답 횟수 : " + noN );
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
				 // 중급 난이도 선택 시 
				} else if(nanedo.equals("중")) {
					System.out.println("중급 난이도입니다. 1~100 범위로 출제 됩니다.");
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
							System.out.println("게임을 종료합니다");
							System.out.println("정답 횟수 : " + yesN + ", 오답 횟수 : " + noN );
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
				 // 하급난이도 선택 시 
			} else if(nanedo.equals("하")) {
				System.out.println("하급 난이도입니다. 1~10 범위로 출제 됩니다.");
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
						System.out.println("게임을 종료합니다");
						System.out.println("정답 횟수 : " + yesN + ", 오답 횟수 : " + noN );
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

		System.out.println("난이도를 제대로 입력하지 않아 종료 합니다.");
		
		
	}
}

		
	
	


