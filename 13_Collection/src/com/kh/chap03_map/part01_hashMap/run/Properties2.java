package com.kh.chap03_map.part01_hashMap.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties2 {

	public static void main(String[] args) {
		
		// .xml
		// ȣȯ���� ����.
		
		Properties prop = new Properties();
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		
		try {
			prop.storeToXML(new FileOutputStream("test.xml"), "�޷�");
			// storeToXML(OutPutStream os , String comments)
			// Properties�� Ű + ��� ��Ʈ�� XML���Ϸ� ����
			
			// �ҷ������ loadFromXML(InputStream is)
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
