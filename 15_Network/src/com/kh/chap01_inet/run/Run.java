package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * ��Ʈ��ũ(Network)
		 * ��Ű����� �� �� �̻��� ��ġ���� ������ �Ǵ� �������� ������ ����
		 * ��Ʈ��ũ�� ���� ������ ��ȯ�� ��������
		 * 
		 * MAC�ּҿ� IP�ּҿ� Port��ȣ
		 * 
		 * - MAC(Media Access Control) Address : NIC(Network Interface Card)�� ���� ������ �ٿ����� �������� �ּ�
		 * 
		 * - IP Address : Internet �� �� Host���� �ĺ����� �� �ִ� ������ �ּ� (���� �� �ִ� ���θ� �ּ� �����Ŷ���..)
		 * 
		 * - Port Number : Host ���ο��� �۵��ϴ� Process�� �ĺ��� �� ������ Process�� �ĺ����ִ� ���� ��ȣ
		 * 
		 * => IP�ּҿ� Port��ȣ�� �׻� �������� �ƴ϶� ������ ������ �������� ���̴�.
		 * 	    ��, ���� �ٲ� �� IP�ּ� ���� ���� ���� ���� ��Ʈ��ũ���� ���� �ȿ���, Port��ȣ�� ���� ��ǻ�� ���ο��� �ߺ��� �߻��ϸ� �ȵ�!!!(�浹�� �Ͼ!!)
		 * 
		 * 
		 * - Server�� Client
		 * 
		 * - ���� : Client(��)���� ���񽺸� �������ִ� �������� ��ǻ�� �Ǵ� ���α׷�
		 * 		     ��, Client�� ��û�� ���� ������ ���ִ� ���� ������
		 * 
		 * - Ŭ���̾�Ʈ : Server���� ���񽺸� ��û�ϴ� ��ǻ�� �Ǵ� ���α׷�
		 * 			     ��, ���񽺸� �����޴� ��
		 * 
		 * => Ŭ���̾�Ʈ ���忡���� ������ ��û�ϱ� ���ؼ� ��û�ϰ����ϴ� ������ IP�ּҿ� Port��ȣ�� �˾ƾ� ��
		 * => ������ �ڱ� ȥ�ڼ� ������ ���� �� ����!!!! Ŭ���̾�Ʈ�� ��û�� ���;����� ������ ���� �� �ִ� ����
		 */
		
		// InetAddress : ��Ʈ��ũ ������ Ȯ���� �� �ִ� Ŭ����
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			// localhost => (����)�� PC�� ��Ī
			// getLocalHost() : �۾��ϰ� �ִ� Host�� ������ ��ȯ���ִ� �޼ҵ�
			
			System.out.println(localhost);	// �� PC�̸� + "/" + �� IP�ּ�
			
			System.out.println(localhost.getHostName());
			System.out.println(localhost.getHostAddress());
			
			System.out.println("=======================================================================================================");
			
			// ���� �˰� �ִ� �����γ����� ���ؼ� ���� ��ǻ�Ϳ� ���õ� ������ �� �� ����
			// DomainName : ����ڰ�  �� ����Ʈ�� ������ �� �� �� �ش� ������ IP�ּҸ� �ܿ�� ��Ʊ� ������ �ܿ�� ���� ������ ����ڿ��� �����Ǵ� �̸�
			// �ּ�â�� www.google.com -> DNS(Domain Name Server) -> ������ IP�ּҸ� ������ �������� HTTP ��û
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			// getByName() : ������ �̸��̶�� ������ �̸��� ���� �ش� ������ ������ ���� ��ȯ
			
			System.out.println(googleHost.getHostName());
			System.out.println(googleHost.getHostAddress());
			// ������ ������ �� ���� �ƴϴ�!! �л걸���� �̷�����ִ�.
			
			System.out.println("=======================================================================================================");
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("���̹� ȣ��Ʈ ���� : " + naverHost.length);
			
			for(InetAddress n : naverHost) {
				System.out.println(n.getHostName());
				System.out.println(n.getHostAddress());
				
				
			}
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
