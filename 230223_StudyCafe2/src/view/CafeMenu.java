package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import controller.CafeController;
import model.vo.User;

public class CafeMenu {
	
	CafeController cc = new CafeController();
	User user = new User();
	Scanner sc = new Scanner(System.in);
	boolean privilege = false;
	String line = "";
	int menuNum1 = 0;
	
	public int mainMenu(BufferedReader br, PrintWriter pw) {
		
		while(true) {
			
			if(privilege == false) {
				pw.println("메인 메뉴");
				pw.flush();
				
				pw.println("1. 고객 등록");
				pw.println("2. 고객 로그인");
				pw.println(">> ");
				pw.println("quit");
				
				pw.flush();
				
				try {
					if((line = br.readLine()) != null) {
						menuNum1 = Integer.parseInt(line);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
							
				switch(menuNum1) {
				case 1:
					pw.println("고객 등록");
					pw.flush();
					insertuser(br, pw); break;
				case 2: 
					pw.println("고객 로그인");
					pw.flush();
					loginuser(br, pw); break;
				}
			} else {
				pw.println("서브 메뉴");
				pw.flush();
				
				pw.println("1. 메인 메뉴");
				pw.println("2. 고객 로그아웃");
				pw.println(">> ");
				pw.println("quit");
				
				pw.flush();
				
				try {
					if((line = br.readLine()) != null) {
						menuNum1 = Integer.parseInt(line);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				switch(menuNum1) {
				case 1 : 
					pw.println("메인 메뉴");
					pw.flush();
					int quit = submenu(br, pw); 
					if (quit == 0) {break;}
					else if (quit == 1) {return 0;}
				case 2 : 
					pw.println("고객 로그아웃");
					pw.flush();
					logoutuser(br, pw); break;
				}
			}
		}
	}
		
	public void insertuser(BufferedReader br, PrintWriter pw) {
		try {
		
		pw.println("등록할 유저 아이디를 입력해주세요 >> ");
		pw.flush();
		
		String userId = br.readLine();
		
		
		pw.println("등록할 유저 비밀번호를 입력해주세요 >> ");
		pw.flush();
		
		String userPwd = br.readLine();
		
		pw.println("등록할 유저 이름을 입력해주세요 >> ");
		pw.flush();
		
		String userName = br.readLine();
		
		int possible = cc.insertUser(userId, userPwd, userName);
		
		switch(possible) {
		case 0 :
			pw.println(userId + " 고객님 등록이 완료되었습니다."); 
			pw.flush();
			break; 
		case 1 :
			pw.println("같은 ID가 있습니다.");
			pw.flush();
			break;
		}
		
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		}


	public void loginuser(BufferedReader br, PrintWriter pw) {
		try {
			
		pw.println("유저 아이디를 입력해주세요 >> ");
		pw.flush();
		
		String userId = br.readLine();
		
		pw.println("유저 비밀번호를 입력해주세요 >> ");
		pw.flush();
		
		String userPwd = br.readLine();

		int sucess = cc.loginUser(userId, userPwd);
		
		if (sucess == 1) {
			pw.println(userId + "님 로그인에 성공했습니다.");
			pw.flush();
			privilege = true;
		} else {
			pw.println("아이디와 비밀번호를 다시 확인해주세요");
			pw.flush();
		}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void logoutuser(BufferedReader br, PrintWriter pw) {
		
		privilege = false;
		
		pw.println("로그아웃 되었습니다.");
		pw.flush();
		
	}
	public int submenu(BufferedReader br, PrintWriter pw) {
				
		while(true) {
			
			pw.println("1. 이용권 구매");
			pw.println("2. 이용권 사용");
			pw.println("3. 좌석 이동");
			pw.println("4. 좌석 퇴실");
			pw.println("5. 메뉴 주문");
			pw.println("0. 이전 메뉴로");
			pw.println(">> ");
			pw.println("quit");
			
			pw.flush();
			
			try {
				if((line = br.readLine()) != null) {
					menuNum1 = Integer.parseInt(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			switch(menuNum1) {
			case 1 : ticketbuy(br, pw); break;
			case 2 : //ticketuse(br, pw); break;
			case 3 : //moveseat(br, pw); break;
			case 4 : //deleteseat(br, pw); break;
			case 5 : //menuorder(br, pw); break;
			case 0 : 
				pw.println("종료합니다");
				pw.flush();
				return 1;
			}
		}
	}

	public void ticketbuy(BufferedReader br, PrintWriter pw) {
		try {
		int ticketvalue = 0;
		int dayvalue = 0;
		int timevalue = 0;
		int ticketNum = 0;
		
		pw.println("구매하실 티켓 종류를 선택해주세요");
		pw.println("1. 기간권");
		pw.println("2. 시간권");
		pw.println(">> ");
		pw.println("quit");
		
		pw.flush();
		
		String ticketvalueString = br.readLine();
		ticketvalue = Integer.parseInt(ticketvalueString);
		
		if(ticketvalue == 1) {
			pw.println("구매하실 기간권 종류를 선택해주세요");
			pw.println("1. 1개월");
			pw.println("2. 3개월");
			pw.println("3. 6개월");
			pw.println(">> ");
			pw.println("quit");
			
			pw.flush();
			
			String dayvalueString = br.readLine();
			dayvalue = Integer.parseInt(dayvalueString);
			
			switch(dayvalue) {
			case 1: ticketNum = 1; break;
			case 2: ticketNum = 2; break;
			case 3: ticketNum = 3; break;
			}
		} else if(ticketvalue == 2) {
			pw.println("구매하실 시간권 종류를 선택해주세요");
			pw.println("1. 1시간");
			pw.println("2. 3시간");
			pw.println("3. 12시간");
			pw.println(">> ");
			pw.println("quit");
			
			pw.flush();
			
			String timevalueString = br.readLine();
			timevalue = Integer.parseInt(timevalueString);
			
			switch(timevalue) {
			case 1: ticketNum = 4; break;
			case 2: ticketNum = 5; break;
			case 3: ticketNum = 6; break;
			}
		}
		
		cc.ticketbuy(user.getUserId(), ticketNum);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
/*
	public void ticketuse() {
		
		cc.ticketuse(user.getUserId());
		user.setUsingtype(null);
		
	}
	
	public void moveseat() {
	
	}
	public void deleteseat() {
		
		
		
		
		viewuser();
	}
	public void menuorder() {
		cc.menuorder(user.getUserId());
	}
	
	public void viewuser() {
		ArrayList<User> userList = cc.viewuser();
		for(int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i));
		}
	}

}
*/
