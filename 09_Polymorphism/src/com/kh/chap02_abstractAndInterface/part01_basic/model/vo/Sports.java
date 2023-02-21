package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

// �߻�Ŭ����
// [ ǥ����  ]
// ���������� abstract class Ŭ���� �̸� {
// abstract ����� -> �߻�Ŭ��, �߻�޼ҵ带 ������ �� ����

/*
 * �߻�޼ҵ带 �����ϴ� ���� �߻�Ŭ������ �����ؾ���
 * abstract��� Ű���带 �ٿ���
 * ��ü ������ �Ұ����ϴ�. �θ�Ŭ���� ������ ����(������ ������ ����)
 * 
 * �߻�Ŭ���� == �Ϲ� �ʵ� + �Ϲ� �޼ҵ� + �߻�޼ҵ�(��������)
 * 
 * => �߻�޼ҵ尡 �������� �ʾƵ� �߻�Ŭ������ ���� ����
 * 
 * => ��������� �����ڰ� �Ǵ����� �� '�� Ŭ�����δ� ��ü ������ �Ұ����ؾ��Ѵ�'��� �����̵�� �߻�Ŭ������ ���� ����
 * => ���������� �����ڰ� �Ǵ����� �� '�ش� Ŭ������ ���� ��ü������ �Ϻ��ϰ� �������� ���� ������ �� ����' ��� �����̵�� �߻�Ŭ������ ���� ����
 */


public abstract class Sports {
	
	private int people;
	
	
	public Sports() {}
	public Sports(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	// �߻�޼ҵ�. abstract�� ���̴� ����  ����
	// ǥ�� ��
	// ���������� abstract ��ȯ�� �޼ҵ�ĺ���();
	// �߻�޼ҵ尡 �ϳ��� ���� ������ ��� �߻�Ŭ������ �Ǿ����
	// �߻�Ŭ�����δ� ��ü������ü�� �Ұ�
	public abstract void rule();
	
	
	@Override
	public String toString() {
		return "Sports [people = " + people + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
