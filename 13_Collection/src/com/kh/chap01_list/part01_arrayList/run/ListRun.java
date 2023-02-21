package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {

	public static void main(String[] args) {
		/*
		 * �÷��� (Collection Framework)
		 * 
		 * �ڹٿ��� �����ϴ� "�ڷᱸ��"�� ����ϴ� "�����ӿ�ũ"
		 * 
		 * - �ڷᱸ�� : �����͵��� ȿ�������� �ٷ�µ�(��ȸ, ����, �߰�, ����, ���� ��) �ʿ��� ����
		 * 
		 * - �����ӿ�ũ : ȿ������ ��ɵ��� �̹� ���ǵǾ��ִ� Ʋ
		 * 
		 * �����͵��� ���Ӱ� �߰��ǰų�, �����ǰų�, �����Ǵ� ���(�˰���)���� �̹� ���ǵǾ��ִ� Ʋ
		 * 
		 * 
		 * �迭�� �÷����� ������
		 * - �迭�� ����
		 * 1. �� Ÿ���� �����͵鸸 ���� ����
		 * 2. �迭�� ����Ϸ� �� �� ���� ũ�⸦ �����ؾ���
		 * => �� �� ������ ũ��� ������ �Ұ���
		 * ���ο� ���� �߰��ϰ� ������ ũ�Ⱑ ��ġ�ϱ� ���ο� ũ���� �迭�� ����� ������ ������� �����ϴ� �ڵ带 ���� ¥����
		 * 3. �迭 �߰� ��ġ�� ���ο� ���� �߰��ϰų� �����ϴ� ��� ������ ������ �����ְų�, �о��ִ� �ڵ带 ���� ¥����
		 * 
		 * 
		 * 
		 * - �÷����� ����
		 * 1. �⺻������ ���� Ÿ���� �����͵��� ���� ����
		 * => ���� Ÿ���� �����͵鸸 ����� ���� ����
		 * (���׸� ������ ���� �� Ÿ���� �����͵鸸 ���� �� �ְԲ��� ���� �� ����)
		 * 2.ũ�⿡ ������ ����
		 * => ���� ũ�� ������ ���� �ʾƵ� �ȴ�.
		 * => ���� ���� ũ�������� �߰�, ũ�⸦ �Ѿ�� ���� �� �߰��ϰ��� �� �� �˾Ƽ� ũ�Ⱑ �þ��.
		 * 3. �߰��� ���� �߰��ϰų� �����ϴ� ��� ���� �����ְų� �о��ִ� �ڵ尡 �̹� �޼ҵ�� ���ǵǾ� ����
		 * => �׶��׶� �ʿ��� �޼ҵ���� ȣ���ؼ� ���� �ȴ�!!!!!!!!!
		 * 
		 * ����� �����͵��� ��Ƹ��ΰ�  "��ȸ"�� �� ���� => �迭
		 * ����� �����͵��� �߰�, ����, ���� �� ��� => �÷���
		 * 
		 * �÷����� ����
		 * 
		 * - List �迭 : ������ϴ� ��(Value)�� ���� / ���� �� ���� ����(Index), �ߺ��� ���
		 * 				�� ) ArrayList, LinkedList, Vector
		 * 					ArrayList
		 * 
		 * - Set �迭 : ������ϴ� ��(Value)�� ���� / ���� �� ���� ���� XXX, �ߺ��� ��� XXX
		 * 				�� ) HashSet, TreeSet 
		 * 					HashSet
		 * 
		 * - Map �迭 : Ű(Key) + ��(Value) ��Ʈ�� ���� / ���� �� ���� ���� XXX, �ߺ� Ű ��� XXX / �ߺ� �� ���
		 * 				�� ) HashMap, HashTable, TreeMap, Properties
		 * 					HashMap, Properties
		 */
		
		
		// ArrayList�� ���� ��� 			// ���� �̷��� �۵��ǰ� ���� ��
		// [ ǥ����   ]
		// ArrayList ����Ʈ�ĺ��� = new ArrayList();
		// 1. ũ�⸦ ���� �������� �ʴ� ���
		// ArrayList ����Ʈ�ĺ��� = new ArrayList(ũ��);
		// 2. ũ�⸸ŭ ����ڴ�. ũ���� ������ ��� ��� �ڵ����� �þ
		
		ArrayList list = new ArrayList(3);
		// ���������� ũ�Ⱑ 3ĭ¥���� ArrayList�� ����ڴ�!!!
		
		System.out.println(list.toString());
		
		// 1. ����ִ� list�� ��Ҹ� �߰�����!!  => Music ��ü�� ���� �߰��غ���!!!!!
		// add(E e) : �ش� ����Ʈ�� �������� ���ڷ� ���޵� ��Ҹ� �߰����ִ� �޼ҵ�		E�� Object��� ���� 
		// E --> element : ���׸� 
		list.add(new Music("Hypeboy", "������"));
		list.add(new Music("��ȭ", "���"));
		list.add(new Music("LoveDive", "Ive"));
		// ������ �����Ǹ鼭 ��Ұ� �߰��ȴ�.(Index ����)
		list.add("��!");		// 3ĭ ������µ� �߰���, Ÿ���� �ٸ��� ��.
		// ũ�Ⱑ �þ��. ���� ������ ��Ҹ� ���� �� �ִ�.
		
		System.out.println(list);
		
		
		// add�޼ҵ� ��� �� �����ε� �� ���¸� ����غ���
		// add(int index, E e) : List�� index��ġ�� ���޵� ���(e)�� �߰����ִ� �޼ҵ�
		list.add(0, "����1");
		list.add(3, new Music("ditto", "������"));
		// �߰��� �� �߰� �� �˾Ƽ� ������ ������ �ڷ� �� ĭ�� �о��ִ� �۾��� ���������� �����
		System.out.println(list);
		
		
		// 2. ���� �߰��غ����ϱ� ����
		// set(int index)
		list.set(2, new Music("�������", "������"));
		System.out.println(list);
		
		
		System.out.println("�ѤѤѤѤѤѤѤѻ������ۤѤѤѤѤѤѤ�");
		// 3. ��Ҹ� ����!
		// remove(int index) : List�� index��ġ�� ��� ��Ҹ� �������ִ� �޼ҵ�
		list.remove(0);
		System.out.println("3�� �ε���[ditto, ������] ���� : \n" + list);
		String str = (String)list.remove(4); // IndexOutOfBoundsException : index �߻�!! Index�� ���� �� ����ؼ� ��������!!
		System.out.println(str);
		System.out.println(list);
		
		Music m = (Music)list.remove(0);
		
		System.out.println(m.getArtist() + "�� " + m.getTitle() + "��(��) �����Ǿ����ϴ�!!");
		

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		// 4. ����Ʈ�� ũ�⸦ ��ȯ�غ���
		// size() : ����Ʈ�� ����ִ� ����� ����
		// �⺻������ 10ĭ.
		// �÷����ϸ� ���� ĭ�� 50%�� �þ
		System.out.println("����Ʈ�� ��� ����� ���� : " + list.size());
		
		System.out.println("����Ʈ�� ������ �ε��� ��ȣ : " + (list.size() - 1)); // ����켱����Ȯ��
		
		list.add(1, new Music("OMG", "������"));
		System.out.println(list);
		
		// 5. ����Ʈ�� �ش� index��ġ�� ��� ��Ҹ� ��ȯ���ִ� �޼ҵ�
		// get(int index) : E
		System.out.println("\n 5. ����Ʈ�� �ش� index��ġ�� ��� ��Ҹ� ��ȯ���ִ� �޼ҵ� : get ");
		Music music = (Music)list.get(1);
		System.out.println(music); 		// "OMG", "������"�� ���;�������
										// music ��ü�� �����߱� ������ �ڿ�     .toString�� �ڵ����� �ٴ´�
										// �׷��� music.toString�� ����ȴ�.
		
		// 1�� �ε����� �� ������ ����ϰ� �ʹ�.
		String title = ((Music)list.get(1)).getTitle();
		System.out.println("1�� �ε����� �� ���� : " + title);
		
		// index���� + get() => �ݺ���
		// 1��° �� : OMG
		// 2��° �� : hypeboy
		// 3��° �� : ditto
		// 4��° �� : lovedive
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "��° �� " + ((Music)list.get(i)).getTitle());
		}
		
		// ���� for�� => ���� ��ȸ�ϴ� �������� ����� ����
		// for(���� �޾��� ���� : ���������� ������ �迭 �Ǵ� �÷���)
		for(Object obj : list) {
			System.out.println(obj);
		}
		//�ڡڡڡڡ����� Object��  list�ȿ� �ִ� ���� �ĺ��� ��, list�迭�ȿ� ���� Music���� ������ �ִ�.
		//	Music O, ArrayList X
		
		
		
		// 6. ����Ʈ�� �κи� ����
		// subList(int index1, int index2) : List   // ��ȯ���� List 
		// index1���� index2������ �����Ͱ����� �����ؼ� ���ο� ����Ʈ ��ȯ
		
		System.out.println("\n6. ����Ʈ�� �κи� ���� ");
		List sub = list.subList(0, 2);
		
		System.out.println(sub);
		
		//ȥ���غ��°� [����]
		System.out.println("ȥ��");
		List sub1 = list.subList(1, 2);
		List sub2 = list.subList(0, 1);
		sub1.addAll(sub2);
		System.out.println(sub1);		// �̰� �� �Ұ�? �� ���� ����������....
		//[��]
		
		
		
		
		
		// 7. ����Ʈ + ����Ʈ
		//allAll(Collection c) : �ش� ����Ʈ�� �ٸ� �÷��ǿ� �մ� �����͵��� ��ä�� �߰����ִ� �޼ҵ�	Collection�� List�� Set�� �ֻ��� �θ�
		System.out.println("\n 7. ����Ʈ + ����Ʈ ");	
		System.out.println("���� list : \n" + list);
		list.addAll(sub);
		System.out.println("allAll ����� ���� \n" + list);		// ������(Value)���� �ߺ� ����
		
		
		// 8. ����Ʈ ����ִ��� Ȯ���ϴ� �޼ҵ�
		// isEmpty() : ��Ұ� ������ true / ��Ұ� �ϳ��� �����Ѵٸ� false   ��ȯ�� boolean
		System.out.println("\n8. ����Ʈ ����ִ��� Ȯ���ϴ� �޼ҵ� : isEmpty()");
		System.out.println(list.isEmpty());
		System.out.println(!list.isEmpty());
		
		
		// 9. �ش� ����Ʈ�� ����ִ� �޼ҵ�
		// clear()
		System.out.println("\n9.�ش� ����Ʈ�� ����ִ� �޼ҵ� : clear() ");
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
