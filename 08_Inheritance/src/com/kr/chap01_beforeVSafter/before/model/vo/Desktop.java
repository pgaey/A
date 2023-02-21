package com.kr.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	//필드부
	private String brand;
	private String pCode;		// 변수이름 pCode <- 이런식으로 하지말고 풀네임  productCode로
	private String pName;
	private int price;
	private boolean allInOne;
	
	//생성자
	public Desktop() {}
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	//set
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	//get
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public boolean isAllInOne() {		// 오직 boolean 타입의 경우 앞에  get 대신 is를 관례적으로 많이 함
		return allInOne;
	}
	
	//info
	public String information() {
		return "브랜드명 : " + brand + " / 상품코드 : " + pCode + " / 상품명 : " + pName + 
			" / 상품가격 : " + price + "/ 일체여부 : " + allInOne; 
	}
	
	
	
	
	
	
	
}
