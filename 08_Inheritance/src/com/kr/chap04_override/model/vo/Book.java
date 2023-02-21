package com.kr.chap04_override.model.vo;

public class Book /*extends Object */{
	
	// ��� Ŭ������ �ֻ��� �θ�Ŭ������ Object -> �������� (���� �Ⱦ��� �ڹٰ� �˾Ƽ� �ٿ���)
	
	// �ʵ�
	// ����, ����
	
	private String title;
	private int price;
	
	public Book() {
		/*super();*/
	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	
	public void setTitle(String title) {
		/*return*/this.title = title;
	}
	public void setPrice(int price) {
		/*return*/this.price = price;
	}
	
	 			// @�̶�� �����ϴ� �� "������̼�"�̶�� �θ�, ������ ����� ���� �ּ�	// ������� 1. �������̵� �� �� �˾ƺ����� 
	@Override														// 		 2.													
	public String toString() {		//toString �������̵�
		return "å�̸� : " + title + " / ���� : " + price;
	}
	/*
	 * �������̵�(Overriding)
	 * 
	 * - ��ӹް� �ִ� �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� ������(���ۼ�) �ϴ� ��
	 * - �θ�Ŭ������ �����ϰ� �ִ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ�
	 * - �ڽ�Ŭ������ �������̵� �� �޼ҵ尡 �켱���� ������ ȣ��ȴ�.
	 * 
	 * �������̵��� ��������
	 * 1. �θ�޼ҵ��� �޼ҵ��� ������ ��
	 * 2. �Ű������� �ڷ���, ����, ������ ����(�Ű���������� ����)
	 * 3. ��ȯ���� ����
	 * ��� ������ ����߸� ����
	 * 
	 * => �Ծ��ǰ���
	 * 1. �������̵��� �޼ҵ忡�� @Override �ֳ����̼�(������̼�)�� �ٿ�����
	 * 2. �θ�޼ҵ��� ���������ں��� ���������� ���ų� �о�� ��
	 * 
	 * @Override
	 * �ֳ����̼�(annotation)
	 * ������ �ּ�
	 * - ���� ����
	 * 		=> ������� �ʾƵ� �θ�޼ҵ�� ���°� ���ٸ� �������̵� �� ������ �Ǵ�
	 * 		=> �Ǽ��� ������!
	 * 		=> �������� �������̵�
	 * 
	 * �����ڵ鳢���� ���
	 * ������ ���������� ����� ����Ű�� ȥ���� ������ �� �ۼ��ϴ� ������ ������!
	 */
	
	
	
}
