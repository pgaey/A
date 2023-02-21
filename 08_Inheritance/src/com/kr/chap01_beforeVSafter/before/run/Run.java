package com.kr.chap01_beforeVSafter.before.run;

import com.kr.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kr.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kr.chap01_beforeVSafter.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		// Desktop ��ü�� ����
		// brand, pCode, pName, price, allInOne
		Desktop desktop = new Desktop("����", "1234", "������", 120000, false);
		
		// SmartPhone ��ü�� ����
		// brand, pCode, pName, price, mobileAgency
		SmartPhone smartPhone = new SmartPhone("LG", "v-01", "����", 120000, "LG");
		
		// Tv ��ü�� ����
		// brand, pCode, pName, price, inch
		Tv tv = new Tv("LG", "n-tv", "���뼿TV", 8000000, 80);
		
		System.out.println(desktop.information());
		System.out.println(smartPhone.information());
		System.out.println(tv.information());
		
		/*
		 * �� Ŭ�������� �ߺ����ڵ���� �ϳ��ϳ� ����ϰ� �Ǹ�
		 * �ڵ��� ������ ���� ���������� �� ��� ���� �Ѷ��Ѷ� ã�Ƽ� �����ؾ��ϴ� ���ŷο��� ����!!
		 * 
		 * ����̶�� ������ ������Ѽ�
		 * �� Ŭ�������� �ߺ��� �ʵ�, �޼ҵ����
		 * �� �ϳ��� Ŭ����(�θ�Ŭ����)�� ��������, ���Ǹ� �صΰ�
		 * �ش� �θ�Ŭ������ �Ӽ�, ������ ������ ���� ���·� ����
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
	}

}