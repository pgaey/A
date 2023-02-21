package com.kh.chap03_map.part01_hashMap.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Soup;

public class PropertiesRun {

	public static void main(String[] args) {
		
		// Properties : Map �迭 -> key + value��Ʈ�� �����
		// 				Key�� Value ��� String���� �ٷ�	-> ��� ������.
		
		// [ ǥ����  ]
		// Properties �̸� = new Properties();
		
		Properties prop = new Properties();
		
		/*
		prop.put("��ġ�", new Soup("�ӽñ�", 1200));
		System.out.println(prop);
		System.out.println(prop.get("��ġ�"));
		*/
		
		/*
		 * Properties�� �뵵 => ���� ��/����ϱ� ����
		 * key + value��Ʈ�� ���Ͽ� ����Ѵٴ���
		 * ���Ϸκ��� �о���� �뵵�� ���� ����
		 * => .properties ���� Ȯ����
		 * 
		 * ���� ������� ���� ��������
		 * �ش� ���α׷��� �⺻������ ������ �� �������� ��� ����
		 */
		
		// String, String������ ���!
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");		// Key ���� ���Ƽ� ������
		
		System.out.println(prop);
		
		
		try {
			// prop.store(new FileOutputStream("test.properties"), "�ʹ� ��������");
			// store(OutputStream os/*�޼���*/, String comments/*�ּ�*/)
			// ������ ����� �� ����ϴ� �޼ҵ�
			// key=value ���·� ������ �����
			
			// �Է�
			prop.load(new FileInputStream("test.properties"));
			// load(InputStream is) : ���Ϸκ��� �о�� �� ����ϴ� �޼ҵ�
			
			System.out.println(prop.get("Array"));
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
