package com.kh.chap01_file.run;

import java.io.File; // 1�ܰ�
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// �����ϰ� ������ ����� ����
		// File Ŭ������ ������ �۾�
		// java.io ��Ű���� ����
		
		// ����Ŭ���� ��ü ����
		// 1. ������ ��������� ���� �ʰ� ���ϸ� �����ؼ� ����
		// ���� �� ������Ʈ ���� ���� ������
		File file1 = new File("test.txt");			// File�� �⺻�����ڰ� ����. ������ �� ����
		
		try {
			// createNewFile() : ������ �������ִ� �޼ҵ�
			file1.createNewFile();
			
			
			// 2. ��������� ���� ���ϸ��� �����ϸ鼭 ����� ����
			// => ���� �����ϴ� ��θ� �����ؾ���!!
			// C:\file		���⿡ ����� ����
			File file2 = new File("C:\\file\\test.txt"); // C:\file\test���� \�� Ż��� �ν�.  \\�� �ѹ� �� �������
			file2.createNewFile();
			
			
			// 3. ������ �����ϰ� �ȿ� ���ϵ� ����
			File forder = new File("ff");
			forder.mkdir();		// mkdir = make directory (��Ī�� �ٸ��� ������� �����ϸ� ��)
			
			File file3 = new File("ff\\test.txt");
			file3.createNewFile();
			
			
			// 4. ��� ���� �� ���� ���� �� ���� ����
			File fileForder = new File("C:\\file\\file");
			fileForder.mkdir();
			
			File file4 = new File("C:\\file\\file\\test.txt");
			file4.createNewFile();
			
			// File���� �����ϴ� �޼ҵ��
			System.out.println("�����̴� ??? " + file4.isFile()); 		// isXXX booleanŸ���� getter����
			
			System.out.println("�����̴� ??? " + fileForder.isFile());
			
			System.out.println("���� �̸� : " + file4.getName());
			
			System.out.println("���� ���� : " + file4.getParent());
			
			System.out.println("���� ũ�� : " + file4.length());
			
			System.out.println("������  : " + file4.getAbsolutePath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * ���α׷����� �����͸� �ܺθ�ü(�����, ����Ŀ, "����")�� ����ϰų�
	 * �Է���ġ(Ű����, ���콺, ī�޶�, ����ũ, "����")�� �Է¹޴� ����
	 * 
	 * => IO(Input & Output), �����
	 * 
	 * IO�� �����ϰ� ������
	 * �켱������ "�ݵ��" ���α׷��� �ܺθ�ü���� "���"�� �������Ѵ�.
	 * => ��Ʈ��(Stream)  -> ���.
	 * 
	 * ��Ʈ���� Ư¡
	 * - �ܹ��� : �Է��̸� �Է�, ����̸� ���
	 * 			�Է¿� ��Ʈ�� ����, ��¿� ��Ʈ���� ���� ���� // ���ÿ� �ϳ��� ��Ʈ������ �� �� ���� XXXXX
	 * 
	 * - ���Լ���(First In First Out) : ���� ������ ���� ���� ������ �� => ť(Queue)
	 * 
	 * �ð����� ������ �߻��� �� ����
	 * 
	 * ��Ʈ���� ����
	 * 
	 * - ����� ������
	 * 
	 * ����Ʈ ��Ʈ�� : 1Byte¥���� �̵��� �� �ִ� ���� ���
	 * 							=> �Է�(XXXInputStream) // ���(XXXOutputStream)
	 * 
	 * ���� ��Ʈ�� : 2Byte¥���� �̵��� �� �ִ� ���� ���
	 * 							=> �Է�(XXXReader) // ���(XXXWriter)
	 * 
	 * 
	 * - �ܺθ�ü���� �������� ���� ����
	 * 
	 * ��ݽ�Ʈ�� : �ܺθ�ü�� ���������� ����Ǵ� ���
	 * ������Ʈ�� : ��ݽ�Ʈ�������� ������ ������ �������ִ� �뵵�� ������� ��Ʈ��
	 * 			=> �ܵ� ��� �Ұ�(�ݵ�� ��ݽ�Ʈ���� �߰����ִ� �뵵)
	 * 			=> �ӵ����, �ڷ����� ���缭 ��ȯ, ��ü������ ������ϰ� ����
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
