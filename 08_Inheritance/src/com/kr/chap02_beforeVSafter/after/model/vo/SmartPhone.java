package com.kr.chap02_beforeVSafter.after.model.vo;
//			부모클래스				자식클래스		<- 자바에서 제일 많이 하는 표현
//			조상클래스				후손클래스
//			상위클래스				하위클래스
//			슈퍼클래스				서브클래스
//			확장클래스				파생클래스

public class SmartPhone extends Product{		// 뒤에 extends + 상속받을 클래스 이름  
	
	// 필드부
	// brand, pCokde. pNume, price <= Product클래스로부터 상속 받을 것
	private String mobileAgancy;
	
	// 생성자부
	public SmartPhone() {
		super();					// 부모클래스 Product()
		System.out.println("안녕 나는 자식객체 스마트폰이야~");
//		super();  부모클래스가 먼저 나와야하므로 불가
	}
	 
	// 초기화를 모두 진행할 생성자
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		
		// this.brand = brand;
		// super : 해당 객체의 부모의 주소를 담고 있음(super. 부모에 접근가능)
		// super.brand = brand; => 접근제한자가 private이기 때문에 보이지 않음
		
		// === 해결방법 3가지  ===
		
		// 해결방법 1. 부모클래스의 접근제한자를 변경하는 방법  -  ex) 06_Object - chap04 - fieldtest2
		// 부모클래스에 접근제한자를 protected로 바꿔준다
		// but 캡슐화 원칙 깨짐
		
		// 해결방법 2. 부모클래스에 있는 public 접근제한자 setter메소드를 호출한다.
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		
		// 해결방법 3.
		super(brand, pCode, pName, price);
		this.mobileAgancy = mobileAgency;
		
	}
	
	// 메소드부
	public String getMobileAgency() {
		return mobileAgancy;
	}
	
	public void setmobileAgency(String mobileAgency) {
		this.mobileAgancy = mobileAgency;
	}
	
	
}
