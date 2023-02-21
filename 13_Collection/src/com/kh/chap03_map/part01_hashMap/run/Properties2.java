package com.kh.chap03_map.part01_hashMap.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties2 {

	public static void main(String[] args) {
		
		// .xml
		// 호환성이 좋다.
		
		Properties prop = new Properties();
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		try {
			prop.storeToXML(new FileOutputStream("test.xml"), "메론");
			// storeToXML(OutPutStream os , String comments)
			// Properties의 키 + 밸류 세트를 XML파일로 저장
			
			// 불러오기는 loadFromXML(InputStream is)
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
