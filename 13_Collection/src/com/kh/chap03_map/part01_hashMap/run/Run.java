package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Soup;

public class Run {

	// �ڡڡڡڡ� Key + Value ��Ʈ�� �߰� �ڡڡڡڡ�
	
	public static void main(String[] args) {
		
		// hashMap				Collection�̶��� �ϳ� ��ӹ��� ����
		// [ ǥ����   ]
		// HashMap �̸� = new HashMap();
		
		// Key == �ĺ��� ����  => � �̸�
		// Value == ��           => ����(������ ������)
		
		HashMap<String, Soup> map = new HashMap();
		
		// ����ִ� �ؽøʿ� �߰��غ���!!
		// ArrayList, HashSet => add()
		// List�迭, Set�迭    =>  Collection�� ������ Ŭ����
		
		// HashMap => put()				Map�迭(interface)�� ���� put() ����ؼ� ����
		// => key + value ��Ʈ�� �߰�
		
		// 1. put(K key, V value) : �� ������ key + value ��Ʈ�� �߰�
		map.put("��ġ�(������)", new Soup("��ġ", 1200));
		map.put("���κα�ġ�", new Soup("���κ�", 1100));
		map.put("���α�ġ�", new Soup("����", 1150));
		map.put("��ġ��ġ�", new Soup("��ġ", 1120));
		map.put("�δ��ġ�", new Soup("�Ҽ���", 1300));
		map.put("���ձ�ġ�", new Soup("��", 1500));
		
		System.out.println(map/*.toString*/);
		// �� ���� ���� ���� X, Key = Value
		// Key���� �ߺ� X   =>   Value���� �ߺ� ���� ��� 
		map.put("��ġ�(������)", new Soup("�������", 1200));	// Value ���� �������
		System.out.println(map);
		// ���� Key������ �ٸ� Value���� �߰��ϸ� �������!!!!
		
		// 2. get(Object key) : Object
		// �ش� key���� �ش��ϴ� value���� ��ȯ���ִ� �޼ҵ�
		// Key�� �ĺ��ڰ��� !! => Key�� Value���� ã�ư�
		// => ���׸� ������ �س��� ������ keyType�� String, returnType�� Soup
		
		System.out.println(map.get("���ձ�ġ�"));
		
		Soup c = map.get("��ġ��ġ�");				// ���� Soup = ���� Object�ε� �ٿ�ĳ���� ���ص� �ǳ�??
													// HashMap<String, Soup> map = new HashMap();
													// Generic�� ����߱� ���� 
		// ���׸� ������ ���س����� �Ź� �ٿ�ĳ������ �߾�� ��  		// -> Soup c = map.get("��ġ��ġ�"); (Soup) ����
													// => Soup c = (Soup)map.get("��ġ��ġ�");
		
		// 3. size() : Map�� ����ִ� ����� ����
		System.out.println(map.size());
		
		// 4. replace(K key, V value) : �ش� Ű ���� ã�Ƽ� ����� ���������
		map.replace("���ձ�ġ�", new Soup("����", 1600));		// put()�̶� ������� �ʳ�? put()�� �����鼭 �ٲ� �� �ִµ�??
															// put()�� ������ �߰������� replce()�� Key���� ������ �ƹ��ϵ� �Ͼ�� ����
		map.replace("���±�ġ�", null);
		// ������ �������� �ʴ� Ű���� �����ϸ� �߰� X
		System.out.println(map);
		
		
		// 5. remove(Object key) => �ش� Ű ���� ã�Ƽ� => Ű + ��� ��Ʈ�� �����ִ� �޼ҵ�
		
		map.remove("���κα�ġ�");
		System.out.println(map);
		
		System.out.println("\n\n");
		System.out.println("------------------------------------------------------------------");
		
		// HashMap�� ����ִ� ��� ��ҵ鿡 ���������� �����ϰ��� �Ѵٸ�..?
		// for�� X : index������ ����, ���� for�� X
		// List�� addAll�ϴ� ���??
		// Iterator�� ���� ��� => �ٷ� ȣ�� �Ұ�
		
		// Map�� ������ �ִ� Key���� Set�迭�� �ٲ㼭 => Iterator�� ����� ��
		
		// keySet()�� �̿��ϴ� ���
		// => HashMap���� �����ϴ� �޼ҵ�, Set���ٰ� key�鸸 �����
		// ��ȯ���� Set
		
		// 1�ܰ�. key�鸸 Set�� ��´�.
		Set<String> keyset = map.keySet();		// value �� �ߺ��� �� �� �ֱ� ������ key ���� ����
		
		// 2�ܰ�. 1�ܰ迡�� ������� Set�� ���빰���� Iterator�� ���
		Iterator<String> itKey = keyset.iterator();
		
		// 3�ܰ�. Iterator�κ��� �ݺ����� �̿��ؼ� ���������� key - value ���
		while(itKey.hasNext()) {
			
			String key = itKey.next();
			System.out.println(key + " - " + map.get(key));
		}
		System.out.print("\n\n");
		System.out.println("------------------------------------------------------------------");
		
		// 2. entrySet() �̿��ϴ� ���
		
		// 1) Map�� �ִ� Key + Value ��Ʈ��
		// Entry�������� Set�� ���       ��ȯ�� : set
		Set<Entry<String, Soup>> entrySet = map.entrySet();
		
		// Set�̱� ������ �Ϲ� for�� �Ұ���.  ���� for�� �����
		for(Entry<String, Soup> e : entrySet) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
		/*
		 * Map�迭 Ư���� ��ҵ鿡 ���������� ������ �������� ����� ����
		 * 
		 * => Map�迭�� Set�迭�� �ٲ㼭 => �ݺ���, ArrayList�� �ٲ㼭 �ݺ���
		 * 
		 * Iterator�� ���� ���
		 * 
		 * keySet(), en
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
