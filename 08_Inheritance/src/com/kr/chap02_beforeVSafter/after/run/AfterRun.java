package com.kr.chap02_beforeVSafter.after.run;

import com.kr.chap02_beforeVSafter.after.model.vo.Desktop;
import com.kr.chap02_beforeVSafter.after.model.vo.SmartPhone;
import com.kr.chap02_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		
		// Product p = new Product();
		// SmartPhone sp = new SmartPhone();
//		SmartPhone sp = new SmartPhone("LG", "�����ڵ�", "����", 5000, "kt");
//		sp.setBrand("LG");
//		System.out.println(sp.information());
		// ���� ȣ���ϰ����ϴ� �޼ҵ尡 �ش� Ŭ������ �������� ������
		// �ڵ����� �ش� Ŭ������ �θ�Ŭ������ �ִ� �޼ҵ�� ȣ����!
		
		Tv tv = new Tv("LG", "����", "����Ƽ��", 500, 80);
		System.out.println(tv.information());
		
		Desktop dt = new Desktop("����Ŀ", "����", "��ǵ���ũ1", 400000, false);
		System.out.println(dt.information());
		
		// �ڽ�Ŭ������ �������̵�(�θ�Ŭ������ �޼ҵ带 ������) ���� ���
		// �ڽ�Ŭ������ �������̵� �� �޼ҵ尡 �켱���� ������ ȣ���̵ȴ�!!!!!!
		
		/*
		 * ����� ����
		 * 
		 * - �ߺ��� �ڵ带 �������� ����
		 * => ���ο� �ڵ带 �ۼ��ϰų� ������ �� �����ϴ�.
		 * => ���� ���� ���� �ڵ�� ���ο� Ŭ������ ���� �� �ִ�.
		 * 
		 * - ���α׷��� ���꼺�� �������� ���������� ũ�� �⿩!
		 * 
		 * ����� Ư¡!
		 * 
		 * - Ŭ�������� ���߻���� �Ұ����ϴ�!!(���� ��Ӹ� ����!!)
		 * 
		 * - ��õǾ������� ������ ��� Ŭ������ ObjectŬ������ �ļ��̴�.
		 * 					(���� ���� Ŭ����, �ڹٿ��� �����ϴ� Ŭ����)
		 * 
		 * 
		 * => ObjectŬ������ �ִ� �޼ҵ带 ȣ���ؼ� �� �� ����
		 * => ObjectŬ������ �ִ� �޼ҵ尡 ������ �ȵ��? �������̵��� ���� ������ ����
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}