package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class House implements Serializable {
	
	// �ʵ��
	// ����, �� ����, ����, ����
	private int price;
	private int room;
	private String location;
	private int water;
	
	// �⺻ ������
	// Alt + Shift + s -> o -> Alt + d -> Alt + g
	public House() {
		super();
	}
	
	// ��� �ʵ带 �Ű������� ���� �Ű����� ������
	// Alt + Shift + s -> o -> Alt + g
	public House(int price, int room, String location, int water) {
		super();
		this.price = price;
		this.room = room;
		this.location = location;
		this.water = water;
	}
	
	// getter() / setter()
	// Alt + Shift + s -> r -> Alt + a -> Alr + r
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	// toString()
	// Alt + Shift +s -> s -> Alt + g
	@Override
	public String toString() {
		return "House [price=" + price + ", room=" + room + ", location=" + location + ", water=" + water + "]";
	}
	
	
	
}
