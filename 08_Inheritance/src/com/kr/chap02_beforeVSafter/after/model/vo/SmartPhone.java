package com.kr.chap02_beforeVSafter.after.model.vo;
//			�θ�Ŭ����				�ڽ�Ŭ����		<- �ڹٿ��� ���� ���� �ϴ� ǥ��
//			����Ŭ����				�ļ�Ŭ����
//			����Ŭ����				����Ŭ����
//			����Ŭ����				����Ŭ����
//			Ȯ��Ŭ����				�Ļ�Ŭ����

public class SmartPhone extends Product{		// �ڿ� extends + ��ӹ��� Ŭ���� �̸�  
	
	// �ʵ��
	// brand, pCokde. pNume, price <= ProductŬ�����κ��� ��� ���� ��
	private String mobileAgancy;
	
	// �����ں�
	public SmartPhone() {
		super();					// �θ�Ŭ���� Product()
		System.out.println("�ȳ� ���� �ڽİ�ü ����Ʈ���̾�~");
//		super();  �θ�Ŭ������ ���� ���;��ϹǷ� �Ұ�
	}
	 
	// �ʱ�ȭ�� ��� ������ ������
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		
		// this.brand = brand;
		// super : �ش� ��ü�� �θ��� �ּҸ� ��� ����(super. �θ� ���ٰ���)
		// super.brand = brand; => ���������ڰ� private�̱� ������ ������ ����
		
		// === �ذ��� 3����  ===
		
		// �ذ��� 1. �θ�Ŭ������ ���������ڸ� �����ϴ� ���  -  ex) 06_Object - chap04 - fieldtest2
		// �θ�Ŭ������ ���������ڸ� protected�� �ٲ��ش�
		// but ĸ��ȭ ��Ģ ����
		
		// �ذ��� 2. �θ�Ŭ������ �ִ� public ���������� setter�޼ҵ带 ȣ���Ѵ�.
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		
		// �ذ��� 3.
		super(brand, pCode, pName, price);
		this.mobileAgancy = mobileAgency;
		
	}
	
	// �޼ҵ��
	public String getMobileAgency() {
		return mobileAgancy;
	}
	
	public void setmobileAgency(String mobileAgency) {
		this.mobileAgancy = mobileAgency;
	}
	
	
}
