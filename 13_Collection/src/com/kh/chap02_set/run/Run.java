package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		// HashSet											// Collection�� ��ӹް� ����
		// Value���� ����, index���� ����, ���� ���� X, �ߺ� X
		// [ ǥ����  ]
		// HashSet ��ü�̸� = new HashSet(); // �� HashSet
		
		// ���ڿ��� ���� �� �ִ� HashSet		 ���׸� ����Ʈó�� ���� ���ϴ� �� ����
		HashSet<String> set = new HashSet();
		System.out.println(set);
		
		// �� �߰�
		// add(�߰��� ��)
		set.add("�ȳ��ϼ���~");
		set.add(new String("�ݰ����ϴ�~"));		// ��ü ����
		set.add("�ڹٴ� ���� ���Դϴ�~");
		set.add("����� ���Դϴ�~");
		set.add("�ݰ����ϴ�~");					// StringPool�� ���� �׷��Ƿ�  24��("�ݰ����ϴ�~")�� �ּҰ� �ٸ�
		set.add("�ȳ��ϼ���~");
		set.add("��¼����¼��");
		
		System.out.println(set);	// ����������� X, �ߺ� ���� X(�ߺ����Ű���)
		
		// ũ�� ���ϱ�
		// size()
		System.out.println("set�� ũ�� : " + set.size());
		
		// ��� ����
		// remove()
		set.remove("����� ���Դϴ�~");		// HashSet : set.remove(value) < index ������ ���� ����
		System.out.println(set);		// List : list.remove(int index)
		
		// ��� ��� ����
		// clear()
		set.clear();
		System.out.println(set);
		
		
		// Student��ü
		HashSet<Student> students = new HashSet();
		
		students.add(new Student("�̽�ö", 20, 100));
		students.add(new Student("�̿���", 30, 100));
		students.add(new Student("ȫ�浿", 18, 200));
		students.add(new Student("�ڼ�ö", 48, 60));
		students.add(new Student("�̽�ö", 20, 100));
		
		System.out.println(students);
		
		// ������� ���� X, �ߺ�����????
		// ��??????????? => ���� ��ü�� �Ǵ��� ���� �ʱ� ����
		// => String(23 ~ 29��)�� equals�� �������̵� �Ǿ��־ ���ٰ� �ǴܵǾ��ְ�
		// => (51 ~ 55��)�� equals �������̵� X
		// => (51 ~ 55��)�� �ߺ��� �����ַ��� VO�� HashSet�� �������̵� �������
		// => [VO�� ���� �� �۾��� �ʼ�]�� �������
		// HashSet�� Ư¡ : ���� �߰� �� ������ equals()�� hashCode()�� �� �� �Ѵ� ����� true�� ��� ���� ��ü�� �Ǵ�
		
		// equals() : ���� ��ü�� �ּҰ��� ���ؼ� ����� ��ȯ(������ true) : boolean		// Object Ŭ����
		// hashCode() : ���� ��ü�� �ּҰ��� �ؽ̾˰����� ������ 10������ ��ȯ : int			// Object Ŭ����
		
		// �������� 51 ~ 55���� ���� ��ü�� �Ǵܵ��� �ʴ� ������?
		// �� ��� : equals()�� hashCode()�� �����ϱ� ���� ���� ��� �׷���..?
		// ���� : 87�� - �Ű������� ���������� ���� new Student() �̱� ������ �ٸ� �ּҰ��� ������ �ִ�.
		// 		�׷��� �ּҰ� �񱳰� �ƴ϶� ���ڿ� �� ��ó�� �ǵ��� �������
		
		/*
		 * ����
		 * 
		 * HashSet�� ��ü�� ���� �� ���������δ� equals()�� hashCode()�� �������� ���� ��ġ�ϴ��� ���ϰ� ��´�.
		 * --> equals() ����� true(�̰�) hashCode()�� ���� ��ġ�ϴٸ� => ���ϰ�ü�� �Ǵ�!(�ߺ������� ���� ����!!)
		 * 
		 * Object Ŭ����
		 * equals() : �� ��ü�� �ּҰ��� ���ؼ� ��ġ�ϸ� true
		 * hashCode() : ��ü�� �ּҰ��� �ؽ��ؼ� 10���� ���·� ��ȯ
		 * => ��ȯ�� ����鳢�� ��!!
		 * 
		 * ���빰�� ������ �ּҰ��� �޶� ���� ��ü�� �ƴ� ������ �ǴܵǾ� �ߺ����� => �����ϰ� �ʹٸ�??
		 * equals()�� hashCode()�� �������̵��ؼ� ����ؾ��Ѵ�.
		 * 
		 * Student Ŭ����
		 * 
		 * hashCode() : �� �ʵ��� ���� �ϳ��� ���ڿ��� ���� �ؽ��ڵ� ���� ���� ��ȯ
		 * equals() : �� �ʵ��� ���� ��� ��ġ�Ѵٸ� true
		 * 
		 */
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		
		// HashSet�� ����ִ� ��� ������ ����ϴ� ���!
		// 1. �ݺ���	// set�� ��� �ε��� ������ ���� ������ �׳� for���� �Ұ���. -> ���� for���� ���-> �ε��� ������ �ƴ�.
		for(Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("-------------------------------------------------------------");
		
		// 2. HashSet�� ���빰�� ArrayList�� ��Ƽ�
		// �ε����� �̿��ؼ� ���
		
		// 1�ܰ� ) ArrayList ����
		ArrayList list = new ArrayList();
		// 2�ܰ� ) addAll(Collection c)		Collection�� List�� Set�� �ֻ��� �θ�. -> Set�� students ��밡��
		list.addAll(students); 
		
		// 1 + 2�ܰ� ) ������ ���ÿ� �ʱ�ȭ
		ArrayList<Student> stds = new ArrayList(students);
		
		Collections.sort(list, Collections.reverseOrder());	
		
		// ������ index������ ����� ������ �Ϲ� for�� ��� ����
		for(int i = 0; i < students.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("-------------------------------------------------------------");
		
		// 3. Iterator(�ݺ���) => HashSetŬ�������� ����
		// String�� StringTokenizer(11_API)�� ����� ���� -> �� ���ڿ��� ��ū���� ó��
		
		Iterator it = students.iterator();		// Set�� Iterator�� �ٲ�  
		
		/*
		System.out.println(it.next()); 			// next() �� �̿��ؼ� ����
		System.out.println(it.next()); 			
		System.out.println(it.next()); 			
		System.out.println(it.next()); 			
//		System.out.println(it.next()); 			�� ���´µ� �� ������  java.util.NoSuchElementException << �� ���� �� ���ٴ� ��
		*/
		
		while(it.hasNext()) {	// it�� next�� �� ���� ���� �����ֳ�?? ������ true  /  ������ false		-> ������ ���� �ݺ��� ����
			System.out.println(it.next());
		}
		
		// Iterator() : Set�迭�� List�迭������ ȣ���� ����!!
		// Map�迭������ �ٷ� ȣ���� �Ұ���!!!
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
}