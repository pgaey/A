package com.kh.chap03_map.part01_hashMap.model.vo;

public class Soup {
	
	private String topping;
	private int calorie;
	
	public Soup() {
		super();
	}
	public Soup(String topping, int calorie) {
		super();
		this.topping = topping;
		this.calorie = calorie;
	}
	
	
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	
	@Override
	public String toString() {
		return "Soup [topping=" + topping + ", calorie=" + calorie + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calorie;
		result = prime * result + ((topping == null) ? 0 : topping.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soup other = (Soup) obj;
		if (calorie != other.calorie)
			return false;
		if (topping == null) {
			if (other.topping != null)
				return false;
		} else if (!topping.equals(other.topping))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
