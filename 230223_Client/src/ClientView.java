import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ClientView {
	Scanner sc = new Scanner(System.in);
	String line = null;
	
	public void Menu(BufferedReader br, PrintWriter pw) {
		while(true) {
		try {
			line = br.readLine();
			if(line.equals("메인 메뉴")){
				mainmenu(br, pw);
			} else if(line.equals("서브 메뉴")) {
				submenu(br, pw);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}
	
	public void mainmenu(BufferedReader br, PrintWriter pw) {
		try {
			while((line = br.readLine()) != null) {
					if (line.equals("quit")) {
				        break;
				    } else {System.out.println(line);}
				}
				
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				pw.flush();
				
				line = br.readLine();
				
			if(line.equals("고객 등록")) {
			
				if((line = br.readLine()) != null) {
					System.out.println(line);
				}
				
				String userId = sc.nextLine();
				pw.println(userId);
				pw.flush();
									
				if((line = br.readLine()) != null) {
					System.out.println(line);
				}
					
				String userPwd = sc.nextLine();
				pw.println(userPwd);
				pw.flush();
					
				if((line = br.readLine()) != null) {
					System.out.println(line);
				}
		 
					
				String userName = sc.nextLine();
				pw.println(userName);
				pw.flush();
					
					
				if((line = br.readLine()) != null) {
						System.out.println(line);
				}
			} else if(line.equals("고객 로그인")) {
										
				if((line = br.readLine()) != null) {
					System.out.println(line);
				}
				
				String userId = sc.nextLine();
				pw.println(userId);
				pw.flush();
									
				if((line = br.readLine()) != null) {
					System.out.println(line);
				}
					
				String userPwd = sc.nextLine();
				pw.println(userPwd);
				pw.flush();
					
				if((line = br.readLine()) != null) {
					System.out.println(line);
				}
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	public void submenu(BufferedReader br, PrintWriter pw) {
		try {
			while(true) {
				while((line = br.readLine()) != null) {
					if (line.equals("quit")) {
				        break;
				    } else {System.out.println(line);}
				}
				
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				pw.flush();
				line = br.readLine();
				
			if(line.equals("메인 메뉴")) {
				while((line = br.readLine()) != null) {
					if (line.equals("quit")) {break;
				    } else {System.out.println(line);}
				}
				
				String sendMessage2 = sc.nextLine();
				pw.println(sendMessage2);
				pw.flush();
				
				int num = Integer.parseInt(sendMessage2);
				
				switch(num) {
				case 1 : ticketbuy(br, pw); break;
				//case 2 : ticketuse(); break;
				//case 3 : moveseat(); break;
				//case 4 : deleteseat(); break;
				//case 5 : menuorder(); break;
				
				}
				
			} else if(line.equals("고객 로그아웃")) {
				if((line = br.readLine()) != null) {
					System.out.println(line);
				}	
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void ticketbuy(BufferedReader br, PrintWriter pw) {
		try {
			while(true) {
				while((line = br.readLine()) != null) {
					if (line.equals("quit")) { break;
					} else {System.out.println(line);}
				}
		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
