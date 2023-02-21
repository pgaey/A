package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	//	��ݽ�Ʈ���� Input/Output �迭�� ���
	// 	������Ʈ���� Input/Output �迭�� ���
	// 	��ݽ�Ʈ���� Reader/Writer �迭�� ���
	// 	������Ʈ���� Reader/Writer �迭�� ���		// ���� ������Ʈ���� ���� ��ݽ�Ʈ���� ���
	
	// BufferedReader / BufferedWriter  =>  FileReader / FileWriter ���ڴٴ� ���
	//	Buffered �ӽñ�����
	// => �ӵ� ��� ������ [������Ʈ��] (BufferedXXX) 
	// => ���۰����� �����ؼ� �� ���� ��Ƶξ��ٰ� �Ѳ����� ����� ����
	
	// [ ǥ����  ]
	// ������Ʈ��Ŭ�����̸� ��ü�̸� = new ������Ʈ��Ŭ�����̸�(��ݽ�Ʈ����ü);
	// ������Ʈ���� �ܵ����� ������ �� ����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	// ���α׷� --> �ܺθ�ü(����)
	// ���
	public void fileSave() {
		
		// BufferedWriter : ���۰����� �����ؼ� �� ������ ����� �����ϰڴ�.

		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			// 1. ��ݽ�Ʈ�� ��ü ���� => ������θ� ����ڴ�.
			fw = new FileWriter("c_buffer.txt");
			
			// 2. ������Ʈ�� ��ü ����
			bw = new BufferedWriter(fw/*FileWriter�� ��ü*/);
			// bw = new BufferedWriter(new FileWriter("c_buffer.txt");	// �̷��� ����� ��ݽ�Ʈ���� �ݳ��� ���� => �׷��� ���� ��ü������ ���ش�
			
			// 3. ���Ͽ� ���� => write()
			
			bw.write("�ȳ��ϼ��� ");
			bw.write("\n�ȳ��ϼ��� ");
			bw.newLine();			// ����
			bw.write("�߰����� ~ ");
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 4. �ڿ��ݳ� => close();
			// �ڿ��ݳ��ÿ��� �ݵ�� ������ �ڿ��� �������� �ݳ��Ѵ�.
			
			try {
				if(bw != null && fw != null)
					bw.close();	
					fw.close();					// �̷��Ը� ������ ���� �ƴ����� ���� �ٷ� ������ �ƴ϶� ���Ŀ�..
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// ���� --> ���α׷�
	// �Է�
	public void fileRead() {
		// FileReader�� ������� BufferedReaer�� �߰��ؼ� ����ϰڴ�.
		
		FileReader fr = null;
		BufferedReader br= null;
		
		/*
		try {
			
			// 1. ��� ��Ʈ�� ��ü
			fr = new FileReader("c_buffer.txt");
			// 2. ���� ��Ʈ�� ��ü
			br = new BufferedReader(fr);
			
			// 3. �о�� => br.read()
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
			
			// 4. �ڿ��ݳ� => close();
			try {
			br.close();
			fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		/*
		 * try ~ with ~ resource ���� 
		 * 
		 * - JDK 7 ���� �̻���� ����
		 * 
		 * [ ǥ����  ]
		 * 
		 * try(��Ʈ����ü����;){
		 * 
		 * 		���ܰ� �߻��ҹ��� ����
		 * 
		 * } catch(����Ŭ�����̸� e) {
		 * 
		 * 		���ܰ� �߻����� �� ������ ����
		 * 
		 * }
		 * 
		 * - ��Ʈ����ü�� try( �̰�  ) �� �־������ ��Ʈ�� ��ü�� ���� �� �ش� ����� ������ ���� �Ϸ�Ǿ��� �� �˾Ƽ� �ڿ� �ݳ���
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
