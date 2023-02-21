package com.kh.chap01_file.run;

import java.io.File; // 1단계
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 간단하게 파일을 만드는 과정
		// File 클래스를 가지고 작업
		// java.io 패키지에 존재
		
		// 파일클래스 객체 생성
		// 1. 별도의 경로지정을 하지 않고 파일명만 제시해서 생성
		// 현재 이 프로젝트 폴더 내에 생성됨
		File file1 = new File("test.txt");			// File은 기본생성자가 없음. 무조건 값 대입
		
		try {
			// createNewFile() : 파일을 생성해주는 메소드
			file1.createNewFile();
			
			
			// 2. 경로지정을 통해 파일명을 제시하면서 만들고 싶음
			// => 실제 존재하는 경로를 제시해야함!!
			// C:\file		여기에 만들고 싶음
			File file2 = new File("C:\\file\\test.txt"); // C:\file\test에서 \를 탈출로 인식.  \\로 한번 더 써줘야함
			file2.createNewFile();
			
			
			// 3. 폴더를 생성하고 안에 파일도 생성
			File forder = new File("ff");
			forder.mkdir();		// mkdir = make directory (명칭만 다르고 폴더라고 생각하면 됌)
			
			File file3 = new File("ff\\test.txt");
			file3.createNewFile();
			
			
			// 4. 경로 지정 후 폴더 생성 후 파일 생성
			File fileForder = new File("C:\\file\\file");
			fileForder.mkdir();
			
			File file4 = new File("C:\\file\\file\\test.txt");
			file4.createNewFile();
			
			// File에서 제공하는 메소드들
			System.out.println("파일이니 ??? " + file4.isFile()); 		// isXXX boolean타입의 getter형태
			
			System.out.println("파일이니 ??? " + fileForder.isFile());
			
			System.out.println("파일 이름 : " + file4.getName());
			
			System.out.println("상위 폴더 : " + file4.getParent());
			
			System.out.println("파일 크기 : " + file4.length());
			
			System.out.println("절대경로  : " + file4.getAbsolutePath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 프로그램상의 데이터를 외부매체(모니터, 스피커, "파일")로 출력하거나
	 * 입력장치(키보드, 마우스, 카메라, 마이크, "파일")로 입력받는 과정
	 * 
	 * => IO(Input & Output), 입출력
	 * 
	 * IO를 진행하고 싶으면
	 * 우선적으로 "반드시" 프로그램과 외부매체와의 "통로"를 만들어야한다.
	 * => 스트림(Stream)  -> 통로.
	 * 
	 * 스트림의 특징
	 * - 단방향 : 입력이면 입력, 출력이면 출력
	 * 			입력용 스트림 따로, 출력용 스트림이 따로 존재 // 동시에 하나의 스트림으로 둘 다 절대 XXXXX
	 * 
	 * - 선입선출(First In First Out) : 먼저 전달한 값이 먼저 나오게 됨 => 큐(Queue)
	 * 
	 * 시간지연 문제가 발생할 수 있음
	 * 
	 * 스트림의 구분
	 * 
	 * - 통로의 사이즈
	 * 
	 * 바이트 스트림 : 1Byte짜리가 이동할 수 있는 좁은 통로
	 * 							=> 입력(XXXInputStream) // 출력(XXXOutputStream)
	 * 
	 * 문자 스트림 : 2Byte짜리가 이동할 수 있는 넓은 통로
	 * 							=> 입력(XXXReader) // 출력(XXXWriter)
	 * 
	 * 
	 * - 외부매체와의 직접적인 연결 여부
	 * 
	 * 기반스트림 : 외부매체와 직접적으로 연결되는 통로
	 * 보조스트림 : 기반스트림만으로 부족한 성능을 향상시켜주는 용도로 만들어진 스트림
	 * 			=> 단독 사용 불가(반드시 기반스트림에 추가해주는 용도)
	 * 			=> 속도향상, 자료형에 맞춰서 변환, 객체단위로 입출력하게 도움
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
