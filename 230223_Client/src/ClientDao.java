import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDao {
	
	ClientView cv = new ClientView();
	Scanner sc = new Scanner(System.in);
	
	public void connect() {
		
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		String serverIp = "192.168.31.33";
		int port = 6666;
		
		try {
			socket = new Socket(serverIp, port);
			
			if(socket != null) {
				
				System.out.println("서버에 연결 성공");
				
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream());
				
				cv.Menu(br, pw);
	
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
