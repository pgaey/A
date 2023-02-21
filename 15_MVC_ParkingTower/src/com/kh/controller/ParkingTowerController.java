package com.kh.controller;

import java.util.ArrayList;
import java.util.Random;

import com.kh.model.vo.Car;

public class ParkingTowerController {
	
	private ArrayList<Car> carList = new ArrayList();
	
	public void insertCar(int carNum, int carType, String owner) {
		int parkingNum = (int) ((Math.random()*100)+1);
		
		carList.add(new Car(parkingNum, carNum, carType, owner));
		
	}
	public int deleteCar(int carNum) {
		Car removeCar = null; 
		
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getCarNum() == carNum) {
				removeCar = carList.remove(i);
				break;
			}
		}
		return removeCar.getCarNum();
	}
	public ArrayList<Car> searchCar(String owner){
		ArrayList<Car> equalsList = new ArrayList();
//		ArrayList<Car> containsList = new ArrayList();		// 이거는 포함으로도 해보기
		
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getOwner().equals(owner)) {
				equalsList.add(carList.get(i));
			} 
		}
		return equalsList;
	}
	public ArrayList<Car> selectList(){				// 이거 공부
		for(int i = 0; i < carList.size(); i++) {
			carList.get(i);
		}
		return carList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
