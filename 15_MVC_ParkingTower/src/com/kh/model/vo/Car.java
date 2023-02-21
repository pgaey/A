package com.kh.model.vo;

public class Car {
	
	private int parkingNum;
	private int carNum;
	private int carType;
	private String owner;
	
	public Car() {
	}
	

	public Car(int parkingNum, int carNum, int carType, String owner) {
		super();
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
		this.parkingNum = parkingNum;
	}

	public int getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {			// �������̵� �϶�°� �ٽ� �ؾ���
		
		String carTypeName = null;
		switch(carType) {
		case 1 : carTypeName = "����"; break;
		case 2 : carTypeName = "����"; break;
		case 3 : carTypeName = "SUV"; break;
		case 4 : carTypeName = "Ʈ��"; break;
		}
		
		return "Car [parkingNum=" + parkingNum + ", carNum=" + carNum + ", carType=" + carTypeName + ", owner=" + owner
				+ "]";
	}
	
	
	
	
	
	
}
