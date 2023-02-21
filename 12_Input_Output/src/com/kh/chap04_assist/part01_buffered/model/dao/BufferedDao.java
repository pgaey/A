package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	//	기반스트림이 Input/Output 계열일 경우
	// 	보조스트림도 Input/Output 계열을 사용
	// 	기반스트림이 Reader/Writer 계열일 경우
	// 	보조스트림도 Reader/Writer 계열을 사용		// 보통 보조스트림에 맞춰 기반스트림을 사용
	
	// BufferedReader / BufferedWriter  =>  FileReader / FileWriter 쓰겠다는 얘기
	//	Buffered 임시기억공간
	// => 속도 향상 목적의 [보조스트림] (BufferedXXX) 
	// => 버퍼공간을 제공해서 한 번에 모아두었다가 한꺼번에 입출력 진행
	
	// [ 표현법  ]
	// 보조스트림클래스이름 객체이름 = new 보조스트림클래스이름(기반스트림객체);
	// 보조스트림은 단독으로 존재할 수 없다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	// 프로그램 --> 외부매체(파일)
	// 출력
	public void fileSave() {
		
		// BufferedWriter : 버퍼공간을 제공해서 한 꺼번에 출력을 진행하겠다.

		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// 1. 기반스트림 객체 생성 => 연결통로를 만들겠다.
			fw = new FileWriter("c_buffer.txt");
			
			// 2. 보조스트림 객체 생성
			bw = new BufferedWriter(fw/*FileWriter의 객체*/);
			// bw = new BufferedWriter(new FileWriter("c_buffer.txt");	// 이렇게 만들면 기반스트림을 반납을 못함 => 그래서 따로 객체생성을 해준다
			
			// 3. 파일에 쓰기 => write()
			
			bw.write("안녕하세요 ");
			bw.write("\n안녕하세요 ");
			bw.newLine();			// 개행
			bw.write("잘가세요 ~ ");
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. 자원반납 => close();
			// 자원반납시에는 반드시 생성된 자원의 역순으로 반납한다.
			
			try {
				if(bw != null && fw != null)
					bw.close();	
					fw.close();					// 이렇게만 끝나는 것은 아니지만 지금 다룰 내용이 아니라 추후에..
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// 파일 --> 프로그램
	// 입력
	public void fileRead() {
		// FileReader를 기반으로 BufferedReaer를 추가해서 사용하겠다.
		
		FileReader fr = null;
		BufferedReader br= null;
		
		/*
		try {
			
			// 1. 기반 스트림 객체
			fr = new FileReader("c_buffer.txt");
			// 2. 보조 스트림 객체
			br = new BufferedReader(fr);
			
			// 3. 읽어보기 => br.read()
			// System.out.println(br.read());
			
			// System.out.println(br.readLine());
			
			String str = null;
			
			while((str = br.readLine()) != null) {
				System.out.print(str);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 4. 자원반납 => close();
			try {
			br.close();
			fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		/*
		 * try ~ with ~ resource 구문 
		 * 
		 * - JDK 7 버전 이상부터 구문
		 * 
		 * [ 표현법  ]
		 * 
		 * try(스트림객체생성;){
		 * 
		 * 		예외가 발생할법한 구문
		 * 
		 * } catch(예외클래스이름 e) {
		 * 
		 * 		예외가 발생했을 때 실행할 구문
		 * 
		 * }
		 * 
		 * - 스트림객체를 try( 이곳  ) 에 넣어버리면 스트림 객체를 생성 후 해당 블록의 구문이 실행 완료되었을 때 알아서 자원 반납됨
		 * 
		 */
		
		try(BufferedReader bf = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			String str = "";
			while((str = bf.readLine()) != null) {
				System.out.println(str);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
