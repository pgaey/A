package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {
	
	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println();
			System.out.println("-- 메뉴 구성 --");
			System.out.println("1. 차량 주차");
			System.out.println("2. 차량 출차");
			System.out.println("3. 주차된 차량 검색");
			System.out.println("4. 전체 출력");
			System.out.println("0. 프로그램 종료하기");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertCar(); break;
			case 2 : deleteCar(); break;
			case 3 : searchCar(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("프로그램을 종료"); return;
			default : System.out.println("다시 입력하세요"); break;
			}
		}
	}
	public void insertCar() {
		System.out.print("차량 번호를 입력하세요  > ");
		int carNum = sc.nextInt();
		sc.nextLine();
		System.out.println("해당번호를 눌러주세요");
		System.out.println("1.경차 / 2.세단 / 3.SUV / 4.트럭");
		int carType = sc.nextInt();
		sc.nextLine();
		
		String carTypeName = null;
		switch(carType) {
		case 1 : carTypeName = "경차"; break;
		case 2 : carTypeName = "세단"; break;
		case 3 : carTypeName = "SUV"; break;
		case 4 : carTypeName = "트럭"; break;
		default : System.out.println("잘못 입력하셨습니다."); return;
		}
		System.out.print("이름을 입력하세요 > ");
		String owner = sc.nextLine();
		ptc.insertCar(carNum, carType, owner);
		
		System.out.println("주차 완료");
		System.out.println();
	}
	
	public void deleteCar() {
		System.out.println("차량 출차 메뉴입니다.");
		System.out.println("차량 번호를 입력하세요");
		int carNum = sc.nextInt();
		sc.nextLine();
		int removeCar = ptc.deleteCar(carNum);
		if(removeCar == 0) {
			System.out.println("등록되어있는 차량이 아닙니다.");
		} else {
			System.out.println("번호 : " + removeCar + "차량이 출차되었습니다.");
		}
	}
	public void searchCar() {
		System.out.println("주차된 차량 검색 메뉴입니다.");
		System.out.println("이름을 입력하세요");
		String owner = sc.nextLine();
		ArrayList<Car> equalsList = ptc.searchCar(owner);
		
		if(equalsList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(int i = 0; i < equalsList.size(); i++) {
				System.out.println(equalsList);
			}
		}
	}
	public void selectList() {
		System.out.println("주차된 차량 전체 출력 메뉴입니다.");
		ArrayList<Car> carList = ptc.selectList();
		if(carList.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		} else {
			for(Object obj : carList) {
				System.out.println(obj);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
