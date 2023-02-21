package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	// 프로그램  --> 외부매체(파일)
	// 출력
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2Byte단위로 출력하는 스트림					Writer로 끝나면 무조건 
		
		FileWriter fw = null;
		
		
		try {
			// 1. 객체 생성 => 파일과 연결된 통로를 만들겠다.
			fw = new FileWriter("b_Char.txt");
			
			// 2. 파일에 출력 => write()
			fw.write("문자열이 넘어가네 ;; fw.close()안했더니 안넘어가더라\n");
			fw.write("B\n");
			char[] arr = {'a', 'b', 'c', 'd'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close(); 			// ★★★★★★★★★★★★★★ 자원 반납 ★★★★★★★★★★★★★★★★★
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 프로그램 	<--     외부매체(파일)
	// 입력
	public void fileRead() {
		// 0. 객체 선언
		
		FileReader fr = null;
		
		
		try {
			// 1. 객체 생성
			fr = new FileReader("b_Char.txt");
			
			// 2. 읽어들이기 => read()
//			System.out.println(fr.read());
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.println((char)value);			//  System.out.println(value); 로 하면 숫자가 나옴
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
