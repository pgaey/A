package com.kh.chap02_set.model.vo;

public class Student implements Comparable<Student>  {
	
	private String name;
	private int age;
	private int score;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	/*
	// hashCode()
	@Override
	public int hashCode() {
		// ��ü���� �ּ� 16���� ��¼����¼�� ���ù��ñ� �ؽþ˰����� ������ 10������ ��ȯ
		return (name + age + score).hashCode();
		
		// �̽�ö 15 100
		// �̽�ö 50 50
		
		// ���� ���ϸ� String + int + int �� String���� �ڵ�����ȯ��
		// �̽�ö15100
		// �̽�ö5050 
		// �̷��� �޶��� ���ڿ��� hashCode() �� ����
		// (name + age + score).hashCode()
		
		// �̽�ö 15 0
		// �̽�ö 1 50
		// ���� ���� ��쿡�� hashCode�� �Ϻ����� ����
		// �̰� �߸��� ��� 
	}
	
	// equals()
	public boolean equals(Object obj) {
		Student other = (Student)obj;
		
		// �̸�, ����, ����
		// �� �߿� �ϳ��� �ٸ��� false��ȯ
		
		if(!this.name.equals(other.name) || this.age != other.age || this.score != other.score) {
			return false;
		}
		// �ʵ尪�� �����ϴٸ� true�� ��ȯ
		return true;
	}
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;		// ������ �ָ���(������ �ʹ� Ŀ���� ����) �Ҽ�(prime) 
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	@Override
	public boolean equals(Object obj/*Object�� �ּҰ��� ������*/) {
		
		// ���� ��ü(this)�� obj�� ��
		if (this == obj) // ���� ��ü�� �񱳰�ü�� �ּҰ��� ��ġ�ϴ°� ?
			return true; // == ���� ���� ����Ű�� ���� == ��� �ʵ尪�� ��ġ
		if (obj == null) // �񱳴���� null
			return false; // ���� ��ġ�� ���� false
		if (getClass() != obj.getClass()) // �޼ҵ�� Ÿ�Ժ�	<----??? Ŭ�������(��Ű�� ��α���)��µ�..?
			return false;
		
		// ���� ������ ������ �������� ������ ���
		// �� ���빰�� �� ��
		Student other = (Student) obj;
		if (age != other.age)	// ���� ��ü�� ���� ��ü�� ���̰� �ٸ� ���
			return false;
		if (name == null) {		// ���� ��ü �̸����� null�� ��� 
			if (other.name != null)	// �� ��ü �̸��� null�� �ƴ϶��?
				return false;
		} else if (!name.equals(other.name)) // ���� ��ü �̸��� �񱳰�ü �̸��� �ٸ� ���
			return false;
		if (score != other.score) // ������ �޶�!
			return false;
		return true;
	}
	
	@Override		// �̰� �� �𸣰���
	public int compareTo(Student s){		// 
		if(this.name.charAt(0) < s.getName().charAt(0)) {
			return 1;
		}else if(this.name.charAt(0) > s.getName().charAt(0)) {
			return -1;
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
}
