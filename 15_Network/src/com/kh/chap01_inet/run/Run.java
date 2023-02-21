package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 네트워크(Network)
		 * 통신가능한 두 대 이상의 장치들을 물리적 또는 논리적으로 연결한 상태
		 * 네트워크를 통해 데이터 교환이 가능해짐
		 * 
		 * MAC주소와 IP주소와 Port번호
		 * 
		 * - MAC(Media Access Control) Address : NIC(Network Interface Card)에 실제 제조시 붙여지는 물리적인 주소
		 * 
		 * - IP Address : Internet 상 각 Host들을 식별해줄 수 있는 논리적인 주소 (변할 수 있는 도로명 주소 같은거랄까..)
		 * 
		 * - Port Number : Host 내부에서 작동하는 Process를 식별할 때 각각의 Process를 식별해주는 내부 번호
		 * 
		 * => IP주소와 Port번호는 항상 고정값이 아니라 변동이 가능한 유동적인 값이다.
		 * 	    단, 값을 바꿀 때 IP주소 같은 경우는 현재 같은 네트워크에서 범위 안에서, Port번호는 같은 컴퓨터 내부에서 중복이 발생하면 안됨!!!(충돌이 일어남!!)
		 * 
		 * 
		 * - Server와 Client
		 * 
		 * - 서버 : Client(고객)에게 서비스를 제공해주는 물리적인 컴퓨터 또는 프로그램
		 * 		     즉, Client의 요청에 대한 응답을 해주는 서비스 제공자
		 * 
		 * - 클라이언트 : Server에게 서비스를 요청하는 컴퓨터 또는 프로그램
		 * 			     즉, 서비스를 제공받는 고객
		 * 
		 * => 클라이언트 입장에서는 서버에 요청하기 위해서 요청하고자하는 서버의 IP주소와 Port번호를 알아야 함
		 * => 서버는 자기 혼자서 응답을 보낼 수 없음!!!! 클라이언트의 요청이 들어와야지만 응답을 보낼 수 있는 구조
		 */
		
		// InetAddress : 네트워크 정보를 확인할 수 있는 클래스
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			// localhost => (보통)내 PC를 지칭
			// getLocalHost() : 작업하고 있는 Host의 정보를 반환해주는 메소드
			
			System.out.println(localhost);	// 내 PC이름 + "/" + 내 IP주소
			
			System.out.println(localhost.getHostName());
			System.out.println(localhost.getHostAddress());
			
			System.out.println("=======================================================================================================");
			
			// 내가 알고 있는 도메인네임을 통해서 서버 컴퓨터와 관련된 정보도 얻어낼 수 있음
			// DomainName : 사용자가  웹 사이트에 접속할 때 매 번 해당 서버의 IP주소를 외우기 어렵기 때문에 외우기 쉬운 구조로 사용자에게 제공되는 이름
			// 주소창에 www.google.com -> DNS(Domain Name Server) -> 구글의 IP주소를 가지고 웹서버로 HTTP 요청
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			// getByName() : 도메인 이름이라는 고유한 이름을 통해 해당 서버의 정보를 얻어내서 반환
			
			System.out.println(googleHost.getHostName());
			System.out.println(googleHost.getHostAddress());
			// 구글의 서버는 한 개가 아니다!! 분산구조로 이루어져있다.
			
			System.out.println("=======================================================================================================");
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("네이버 호스트 개수 : " + naverHost.length);
			
			for(InetAddress n : naverHost) {
				System.out.println(n.getHostName());
				System.out.println(n.getHostAddress());
				
				
			}
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
