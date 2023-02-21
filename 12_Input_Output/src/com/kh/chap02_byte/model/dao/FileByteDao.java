package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object) : �����Ͱ� �����Ǿ��ִ� ������ ���� �����ؼ�
//							   �����͸� ������ϴ� �޼ҵ���� ��Ƶ� Ŭ����(DAO��Ű���ȿ� ��Ƶ�)

public class FileByteDao {

	public void fileSave() {															// �ڡڡ�    close(); �ڡڡ�
		// ����Ʈ ��Ʈ�� ���
		
		// ���
		// ���α׷� --> �ܺθ�ü(����)
		// ��� : ���α׷� ���� �����͸� ���Ϸ� ��������(���Ͽ� ����ϰڴ�)
		// FileOutputStream : "����"�� �����͸� ����ϵ�, 1Byte������ ����ϰڴ�.		OutputStream �տ� file
		// �ش� ������ �������� �ʴ� ��� : �ش������� �����Ǹ鼭 ��ε� �����
		// �ش� ������ �����ϴ�        ��� : �׳� ��θ� �����   => �ɼ� ��������
		
		// �Ű����� ������ ȣ�� ��
		// true���� �߰��� �����Ѵٸ� => �ش� ���Ͽ� ������ ���� ��� �̾ �ۼ�
		// true���� ���� �ʴ´ٸ� => �����
		
		// 1. FileOutputStream ��ü ����
		// => �ش� ���ϰ� ���� ����Ǵ� ��θ� ����ڴ�.
		
		FileOutputStream fout = null;			//  OuputStream
		
		try {																		//	 �ڡڡ�    close(); �ڡڡ�
			fout = new FileOutputStream("a_byte.txt"/*, true*/);
			
			// 2. ������θ� ���� ������ ��� : write() ȣ�� 
			// 1Byte�� ���� : -128 ~ 127������ ���ڰ� ��� ������
			// ���������� 0 ~ 127������ ���ڸ� ���  => �ƽ�Ű�ڵ�ǥ ����(������ ����Ұ�!!!)
			
			// ������ ���
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

			fout.write('��');
			fout.write('��');
			fout.write('��');
			// �ѱ��� 2Byte�� ������ ����
			// ����Ʈ ��Ʈ�� �ܵ����δ� �ذ��� �Ұ����ϴ�
			// ���ڽ�Ʈ���� ���� �ذᰡ��
			
			// 3. ��Ʈ���� �� ����ߴٸ� ��!!!!!!!!!! �ݵ�� ������ϴ� �۾��� �ִ�.
			// ����� ������ �ݵ��!!!!!!!!!������!!!!!!!!!!!!! �ڡڡ��ڿ��ݳ��ڡڡ��� ������� -- ���
							// �ڡڡڡڡڡڡڡ�
			fout.close();	// �� �ڿ� �ݳ�  ��											//  �ڡڡ�    close(); �ڡڡ�
							// �ڡڡڡڡڡڡڡ�
			// �ʹ� �߿���!! �ݵ�� �ݳ��� �ؾ���!!!! �� �ݳ��� �������!! .close() ȣ��
			// ������ try �����ȿ� �ֱ� ������ fout.close()�� ���� ���� ������ �߻��ϸ� catch�� �̵��ϱ� ������ �����ϰ� ����
			
			// �ݳ� ������ try�� �ȿ� ������ �ȉ�
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {		 // ���ܰ� �߻��ߴ� ���ߴ� ������ ������ ������ finally ���ȿ� ���
		
			try {
				if(fout != null) fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// ���α׷� <---- �ܺθ�ü(����)
	// �Է� : ���Ϸκ��� �����͸� ������ ���ڴ�.
	public void fileRead() {														//	�ڡڡ�    close(); �ڡڡ�
		
		// FileInputStream
		// ���Ϸκ��� �����͸� �����ͼ� �Է¹����ǵ�, 1Byte������ �Է¹ްڴ�.
		
		FileInputStream fis = null;
		
		
		try {
			// 1. ��ü����		����(�ܺθ�ü)�� ��θ� �����ϰڴ�.
			fis = new FileInputStream("a_byte.txt");
			
			
			// 2. ��ηκ��� ������ �Է¹ޱ�
			// read() �̿�
			// 1Byte������ �ϳ��� �о��
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
			
			
			// ���� : ������ �Է¹ޱ� �ݺ���.  �߿��� �� ! ������ ����.
			int value = 0;						
			while((value = fis.read()) != -1) {
				System.out.println(value);
			}
			
			// ������ ������ �����͸� �Է¹ް��� read()ȣ���ϸ�
			// -> -1�� ��ȯ�Ѵ�.
			
			
			
			// 3. ���������� �ؾ��� �� 		 �ڡڡ�    close(); �ڡڡ�
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
