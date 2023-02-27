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
				pw.println("���� �޴�");
				pw.flush();
				
				pw.println("1. �� ���");
				pw.println("2. �� �α���");
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
					pw.println("�� ���");
					pw.flush();
					insertuser(br, pw); break;
				case 2: 
					pw.println("�� �α���");
					pw.flush();
					loginuser(br, pw); break;
				}
			} else {
				pw.println("���� �޴�");
				pw.flush();
				
				pw.println("1. ���� �޴�");
				pw.println("2. �� �α׾ƿ�");
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
					pw.println("���� �޴�");
					pw.flush();
					int quit = submenu(br, pw); 
					if (quit == 0) {break;}
					else if (quit == 1) {return 0;}
				case 2 : 
					pw.println("�� �α׾ƿ�");
					pw.flush();
					logoutuser(br, pw); break;
				}
			}
		}
	}
		
	public void insertuser(BufferedReader br, PrintWriter pw) {
		try {
		
		pw.println("����� ���� ���̵� �Է����ּ��� >> ");
		pw.flush();
		
		String userId = br.readLine();
		
		
		pw.println("����� ���� ��й�ȣ�� �Է����ּ��� >> ");
		pw.flush();
		
		String userPwd = br.readLine();
		
		pw.println("����� ���� �̸��� �Է����ּ��� >> ");
		pw.flush();
		
		String userName = br.readLine();
		
		int possible = cc.insertUser(userId, userPwd, userName);
		
		switch(possible) {
		case 0 :
			pw.println(userId + " ���� ����� �Ϸ�Ǿ����ϴ�."); 
			pw.flush();
			break; 
		case 1 :
			pw.println("���� ID�� �ֽ��ϴ�.");
			pw.flush();
			break;
		}
		
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		}


	public void loginuser(BufferedReader br, PrintWriter pw) {
		try {
			
		pw.println("���� ���̵� �Է����ּ��� >> ");
		pw.flush();
		
		String userId = br.readLine();
		
		pw.println("���� ��й�ȣ�� �Է����ּ��� >> ");
		pw.flush();
		
		String userPwd = br.readLine();

		int sucess = cc.loginUser(userId, userPwd);
		
		if (sucess == 1) {
			pw.println(userId + "�� �α��ο� �����߽��ϴ�.");
			pw.flush();
			privilege = true;
		} else {
			pw.println("���̵�� ��й�ȣ�� �ٽ� Ȯ�����ּ���");
			pw.flush();
		}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void logoutuser(BufferedReader br, PrintWriter pw) {
		
		privilege = false;
		
		pw.println("�α׾ƿ� �Ǿ����ϴ�.");
		pw.flush();
		
	}
	public int submenu(BufferedReader br, PrintWriter pw) {
				
		while(true) {
			
			pw.println("1. �̿�� ����");
			pw.println("2. �̿�� ���");
			pw.println("3. �¼� �̵�");
			pw.println("4. �¼� ���");
			pw.println("5. �޴� �ֹ�");
			pw.println("0. ���� �޴���");
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
				pw.println("�����մϴ�");
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
		
		pw.println("�����Ͻ� Ƽ�� ������ �������ּ���");
		pw.println("1. �Ⱓ��");
		pw.println("2. �ð���");
		pw.println(">> ");
		pw.println("quit");
		
		pw.flush();
		
		String ticketvalueString = br.readLine();
		ticketvalue = Integer.parseInt(ticketvalueString);
		
		if(ticketvalue == 1) {
			pw.println("�����Ͻ� �Ⱓ�� ������ �������ּ���");
			pw.println("1. 1����");
			pw.println("2. 3����");
			pw.println("3. 6����");
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
			pw.println("�����Ͻ� �ð��� ������ �������ּ���");
			pw.println("1. 1�ð�");
			pw.println("2. 3�ð�");
			pw.println("3. 12�ð�");
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
