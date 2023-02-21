package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.House;

public class ObjectDao {
	
	
	// ���α׷� --> �ܺθ�ü(����)
	// ���
	
	// ObjectOutputStream : 
	// => ��ü������ ���Ͽ� ����ϰ��� �� �� �ʿ��� ���� ��Ʈ��
	
	// ���θ޼ҵ忡�� ���� �̸��� �Է¹޾Ƽ� ���� �����ϱ�
	
	public void fileSave(String fileName) {
		
		House house = new House(500000000, 2, "����", 200);
		
		// 1�ܰ� . ��ݽ�Ʈ�� => FileOutputStream
		// 2�ܰ� . ������Ʈ�� => ObjectOutputStream
		// 3�ܰ� . ��ü �����͸� ���Ͽ� ��� => writeObject()
		// 4�ܰ� . �ڿ��ݳ� => close()
		
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			oos.writeObject(house);
			
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
	// ��ü�� ������ ����ߴ��� �̻��Ѱ� �� ������ Exception��¼�� ����
	// �̰� Ȯ���ϰ� ������ �ٽ� �Է¹޾Ƽ� �ֿܼ� ���� Ȯ���� �������� ������..?
	
	
	public void fileRead(String fileName) {
		
		// ObjectInputStream : ��ü ������ ���Ϸκ��� �о�� �� ����ϴ� ������Ʈ��
		// FileInputStream : ��ݽ�Ʈ��
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		
		
		// 1. ��ݽ�Ʈ�� ����
		// 2. ������Ʈ�� ����
		// 3. �о���� => readObject()
		// 4. �ڿ��ݳ�
		
		
		try {
			// 1. ��ݽ�Ʈ�� �����
			fin = new FileInputStream(fileName);
			
			// 2. ������Ʈ�� �����
			ois = new ObjectInputStream(fin);
			
			// 3. �о���� readObject()
			House house = (House)ois.readObject();
			
			System.out.println(house);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// 4. �ڿ��ݳ�
			try {
				ois.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
}
	
}
