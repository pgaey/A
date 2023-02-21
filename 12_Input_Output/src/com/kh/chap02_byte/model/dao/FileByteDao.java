package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object) : 데이터가 보관되어있는 공간에 직접 접근해서
//							   데이터를 입출력하는 메소드들을 모아둔 클래스(DAO패키지안에 모아둠)

public class FileByteDao {

	public void fileSave() {															// ★★★    close(); ★★★
		// 바이트 스트림 출력
		
		// 출력
		// 프로그램 --> 외부매체(파일)
		// 출력 : 프로그램 내의 데이터를 파일로 내보내기(파일에 기록하겠다)
		// FileOutputStream : "파일"로 데이터를 출력하되, 1Byte단위로 출력하겠다.		OutputStream 앞에 file
		// 해당 파일이 존재하지 않는 경우 : 해당파일이 생성되면서 통로도 연결됨
		// 해당 파일이 존재하는        경우 : 그냥 통로만 연결됨   => 옵션 지정가능
		
		// 매개변수 생성자 호출 시
		// true값을 추가로 전달한다면 => 해당 파일에 내용이 있을 경우 이어서 작성
		// true값을 적지 않는다면 => 덮어쓰기
		
		// 1. FileOutputStream 객체 생성
		// => 해당 파일과 직접 연결되는 통로를 만들겠다.
		
		FileOutputStream fout = null;			//  OuputStream
		
		try {																		//	 ★★★    close(); ★★★
			fout = new FileOutputStream("a_byte.txt"/*, true*/);
			
			// 2. 연결통로를 통해 데이터 출력 : write() 호출 
			// 1Byte의 범위 : -128 ~ 127까지의 숫자가 출력 가능함
			// 실질적으로 0 ~ 127까지의 숫자만 사용  => 아스키코드표 참조(음수는 절대불가!!!)
			
			// 데이터 출력
			fout.write(97);	// a
			fout.write(98);	// b
			fout.write(99);	// c
			fout.write(100); // d
			
			
			byte[] arr = {101, 102, 103};
			fout.write(arr);
			
			fout.write(80);
			fout.write(81);
			fout.write('[');
			fout.write('A');
			fout.write('B');

			fout.write('이');
			fout.write('예');
			fout.write('찬');
			// 한글은 2Byte기 때문에 깨짐
			// 바이트 스트림 단독으로는 해결이 불가능하다
			// 문자스트림을 쓰면 해결가능
			
			// 3. 스트림을 다 사용했다면 꼭!!!!!!!!!! 반드시 해줘야하는 작업이 있다.
			// 사용이 끝나면 반드시!!!!!!!!!무조건!!!!!!!!!!!!! ★★★자원반납★★★을 해줘야함 -- 약속
							// ★★★★★★★★
			fout.close();	// ★ 자원 반납  ★											//  ★★★    close(); ★★★
							// ★★★★★★★★
			// 너무 중요함!! 반드시 반납을 해야함!!!! 꼭 반납을 해줘야함!! .close() 호출
			// 문제는 try 구문안에 있기 때문에 fout.close()에 오기 전에 문제가 발생하면 catch로 이동하기 때문에 생략하고 나감
			
			// 반납 구문은 try문 안에 있으면 안됌
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {		 // 예외가 발생했던 안했던 무조건 실행할 구문을 finally 블럭안에 기술
		
			try {
				if(fout != null) fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// 프로그램 <---- 외부매체(파일)
	// 입력 : 파일로부터 데이터를 가지고 오겠다.
	public void fileRead() {														//	★★★    close(); ★★★
		
		// FileInputStream
		// 파일로부터 데이터를 가져와서 입력받을건데, 1Byte단위로 입력받겠다.
		
		FileInputStream fis = null;
		
		
		try {
			// 1. 객체생성		파일(외부매체)와 통로를 연결하겠다.
			fis = new FileInputStream("a_byte.txt");
			
			
			// 2. 통로로부터 데이터 입력받기
			// read() 이용
			// 1Byte단위로 하나씩 읽어옴
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			
			
			// 연습 : 데이터 입력받기 반복문.  중요한 점 ! 변수값 생성.
			int value = 0;						
			while((value = fis.read()) != -1) {
				System.out.println(value);
			}
			
			// 파일의 마지막 데이터를 입력받고나서 read()호출하면
			// -> -1을 반환한다.
			
			
			
			// 3. 마지막으로 해야할 일 		 ★★★    close(); ★★★
			// close(); 
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
