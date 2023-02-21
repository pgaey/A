package com.kh.chap03_map.part01_hashMap.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Soup;

public class PropertiesRun {

	public static void main(String[] args) {
		
		// Properties : Map 계열 -> key + value세트로 저장됨
		// 				Key와 Value 모두 String으로 다룸	-> 사용 목적임.
		
		// [ 표현법  ]
		// Properties 이름 = new Properties();
		
		Properties prop = new Properties();
		
		/*
		prop.put("김치찌개", new Soup("머시기", 1200));
		System.out.println(prop);
		System.out.println(prop.get("김치찌개"));
		*/
		
		/*
		 * Properties의 용도 => 파일 입/출력하기 위함
		 * key + value세트로 파일에 출력한다던가
		 * 파일로부터 읽어오는 용도로 많이 사용됨
		 * => .properties 파일 확장자
		 * 
		 * 자주 변경되지 않은 설정정보
		 * 해당 프로그램이 기본적으로 가져야 할 정보들을 담는 파일
		 */
		
		// String, String형으로 담기!
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");		// Key 값이 같아서 덮어쓰기됨
		
		System.out.println(prop);
		
		
		try {
			// prop.store(new FileOutputStream("test.properties"), "너무 어지러워");
			// store(OutputStream os/*메서드*/, String comments/*주석*/)
			// 파일을 기록할 때 사용하는 메소드
			// key=value 형태로 파일이 출려됨
			
			// 입력
			prop.load(new FileInputStream("test.properties"));
			// load(InputStream is) : 파일로부터 읽어올 때 사용하는 메소드
			
			System.out.println(prop.get("Array"));
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
