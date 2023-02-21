package com.kr.chap02_beforeVSafter.after.model.vo;


// �ڽ�Ŭ���� extends �θ�Ŭ�����ĺ���
public class Desktop extends Product {
	
	// �θ�κ��� ��ӹ��� �κ��� ������� �ʴ´�!! => �ʵ� ����
	// ��, �޼ҵ�� ����! ����� �޾Ƽ� �������ؼ� ����� ���!!	=> �������̵�
	
	// [�ʵ��]
	private boolean allInOne;
	
	// [�����ں�]
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}
	
	// [�޼ҵ��]
	// brand, pCode, pName, price : setter()/getter() == �ۼ����� �ʾƵ� ȣ���� ���� ��? ��ӹ޾����ϱ�
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String information() {
		return super.information() + " / ���ο����� : " + false ;		// �������̵� : ������(�����)
	}
	
//	public String information() {
//		return "brand : " + super.getBrand() + ....  // super.getter ���
//	}			
	
	
	
	
	
	
	
	
	
	
	
	
	
}
