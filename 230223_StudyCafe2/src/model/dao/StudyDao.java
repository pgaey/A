package model.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import view.CafeMenu;


public class StudyDao {
	
	public void connect() {
		
		CafeMenu cafemenu = new CafeMenu();
		
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
	try{
		int port = 6666;
		
		server = new ServerSocket(port);
		System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� ��........");
		Socket socket = server.accept();
		System.out.println(socket.getInetAddress().getHostAddress() + "�� ������ ��û��...");
		
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(socket.getOutputStream());
		
		cafemenu.mainMenu(br, pw);
		
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			pw.close();
			br.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}	
}
