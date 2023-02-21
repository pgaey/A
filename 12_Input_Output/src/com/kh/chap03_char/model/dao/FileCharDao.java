package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	// ���α׷�  --> �ܺθ�ü(����)
	// ���
	public void fileSave() {
		// FileWriter : ���Ϸ� �����͸� 2Byte������ ����ϴ� ��Ʈ��					Writer�� ������ ������ 
		
		FileWriter fw = null;
		
		
		try {
			// 1. ��ü ���� => ���ϰ� ����� ��θ� ����ڴ�.
			fw = new FileWriter("b_Char.txt");
			
			// 2. ���Ͽ� ��� => write()
			fw.write("���ڿ��� �Ѿ�� ;; fw.close()���ߴ��� �ȳѾ����\n");
			fw.write("B\n");
			char[] arr = {'a', 'b', 'c', 'd'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close(); 			// �ڡڡڡڡڡڡڡڡڡڡڡڡڡ� �ڿ� �ݳ� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ���α׷� 	<--     �ܺθ�ü(����)
	// �Է�
	public void fileRead() {
		// 0. ��ü ����
		
		FileReader fr = null;
		
		
		try {
			// 1. ��ü ����
			fr = new FileReader("b_Char.txt");
			
			// 2. �о���̱� => read()
//			System.out.println(fr.read());
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.println((char)value);			//  System.out.println(value); �� �ϸ� ���ڰ� ����
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
