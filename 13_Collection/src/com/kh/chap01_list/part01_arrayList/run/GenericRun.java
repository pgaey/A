package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class GenericRun {

	public static void main(String[] args) {
		
		/*
		 * ���׸�<Generic> 	<E>					E : elements(���)
		 * �÷��� �ȿ��� �ٷ� Ÿ�Ե��� �̸� �������ִ� ���� > ��������� <Music>, <String> ....
		 * => ���� ����ϰ� ���� Ÿ�Ը� ����� �� �ְ� �����ش�.
		 * 
		 * ������ ���׸� ���� ���� �÷��� ��ü ���� �� (E == Object)
		 * 
		 * ���׸��� ���� ����
		 * 1. ������ Ÿ���� ������ �α� ���ؼ�	(�Ǽ��� ���� �� �ִ�)
		 * 2. �� �� ����ȯ�ϴ� ������ ���� �� ����
		 * 
		 */
		
		
		// �÷��� ���� �� ���׸��� ����
		// [ ǥ����  ]
		// ArrayList<E> list = new ArrayList();
		
//		ArrayList<Music> list = new ArrayList<Music>();  �̰� �������� ���� ���
//		ArrayList<Music> list = new ArrayList();	<Music> ��������
		List<Music> list = new ArrayList();		// List�� �������̽�.
												// ���߿� �������� ������ ���ɼ��� �����ϰ� List<Music>����.
		System.out.println(list);
		
		// �� �߰�
		list.add(new Music("OMG", "������"));
		list.add(new Music("Ditto", "������"));
		list.add(new Music("hypeboy", "������"));
		// list.add("��!");
		
		System.out.println(list);
		
		
		list.get(0); 		// �̰� ������ ������
		Music m = list.get(0);		// ���� : �̹� ���� List<Music>���� Music���¸� �����߱� ������
									// �ٿ� ĳ������ �� �ʿ䰡 ����.
	
		System.out.println(list.get(0).getTitle());
		
		for(Music music : list) {			// �׳� ArrayList�� ���� for�� ������ ���̰� ����
			System.out.println(music);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
