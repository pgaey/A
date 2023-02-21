package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.House;

public class ObjectDao {
	
	
	// 프로그램 --> 외부매체(파일)
	// 출력
	
	// ObjectOutputStream : 
	// => 객체단위를 파일에 출력하고자 할 때 필요한 보조 스트림
	
	// 메인메소드에서 파일 이름을 입력받아서 파일 생성하기
	
	public void fileSave(String fileName) {
		
		House house = new House(500000000, 2, "서울", 200);
		
		// 1단계 . 기반스트림 => FileOutputStream
		// 2단계 . 보조스트림 => ObjectOutputStream
		// 3단계 . 객체 데이터를 파일에 출력 => writeObject()
		// 4단계 . 자원반납 => close()
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			oos.writeObject(house);
			
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
	// 객체로 파일을 출력했더니 이상한게 막 깨져서 Exception어쩌고 나옴
	// 이걸 확인하고 싶으면 다시 입력받아서 콘솔에 찍어보면 확인이 가능하지 않을까..?
	
	
	public void fileRead(String fileName) {
		
		// ObjectInputStream : 객체 단위로 파일로부터 읽어올 때 사용하는 보조스트림
		// FileInputStream : 기반스트림
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		
		
		// 1. 기반스트림 생성
		// 2. 보조스트림 생성
		// 3. 읽어오기 => readObject()
		// 4. 자원반납
		
		
		try {
			// 1. 기반스트림 만들기
			fin = new FileInputStream(fileName);
			
			// 2. 보조스트림 만들기
			ois = new ObjectInputStream(fin);
			
			// 3. 읽어오기 readObject()
			House house = (House)ois.readObject();
			
			System.out.println(house);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// 4. 자원반납
			try {
				ois.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
}
	
}
