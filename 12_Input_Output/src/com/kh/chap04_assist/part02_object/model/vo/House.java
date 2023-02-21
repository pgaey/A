package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class House implements Serializable {
	
	// 필드부
	// 집세, 방 개수, 지역, 수압
	private int price;
	private int room;
	private String location;
	private int water;
	
	// 기본 생성자
	// Alt + Shift + s -> o -> Alt + d -> Alt + g
	public House() {
		super();
	}
	
	// 모든 필드를 매개변수로 가진 매개변수 생성자
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
