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
			System.out.println("�޴��� �������ּ���");
			System.out.println();
			System.out.println("-- �޴� ���� --");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ������ ���� �˻�");
			System.out.println("4. ��ü ���");
			System.out.println("0. ���α׷� �����ϱ�");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertCar(); break;
			case 2 : deleteCar(); break;
			case 3 : searchCar(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("���α׷��� ����"); return;
			default : System.out.println("�ٽ� �Է��ϼ���"); break;
			}
		}
	}
	public void insertCar() {
		System.out.print("���� ��ȣ�� �Է��ϼ���  > ");
		int carNum = sc.nextInt();
		sc.nextLine();
		System.out.println("�ش��ȣ�� �����ּ���");
		System.out.println("1.���� / 2.���� / 3.SUV / 4.Ʈ��");
		int carType = sc.nextInt();
		sc.nextLine();
		
		String carTypeName = null;
		switch(carType) {
		case 1 : carTypeName = "����"; break;
		case 2 : carTypeName = "����"; break;
		case 3 : carTypeName = "SUV"; break;
		case 4 : carTypeName = "Ʈ��"; break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
		}
		System.out.print("�̸��� �Է��ϼ��� > ");
		String owner = sc.nextLine();
		ptc.insertCar(carNum, carType, owner);
		
		System.out.println("���� �Ϸ�");
		System.out.println();
	}
	
	public void deleteCar() {
		System.out.println("���� ���� �޴��Դϴ�.");
		System.out.println("���� ��ȣ�� �Է��ϼ���");
		int carNum = sc.nextInt();
		sc.nextLine();
		int removeCar = ptc.deleteCar(carNum);
		if(removeCar == 0) {
			System.out.println("��ϵǾ��ִ� ������ �ƴմϴ�.");
		} else {
			System.out.println("��ȣ : " + removeCar + "������ �����Ǿ����ϴ�.");
		}
	}
	public void searchCar() {
		System.out.println("������ ���� �˻� �޴��Դϴ�.");
		System.out.println("�̸��� �Է��ϼ���");
		String owner = sc.nextLine();
		ArrayList<Car> equalsList = ptc.searchCar(owner);
		
		if(equalsList.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(int i = 0; i < equalsList.size(); i++) {
				System.out.println(equalsList);
			}
		}
	}
	public void selectList() {
		System.out.println("������ ���� ��ü ��� �޴��Դϴ�.");
		ArrayList<Car> carList = ptc.selectList();
		if(carList.isEmpty()) {
			System.out.println("������ ������ �����ϴ�.");
		} else {
			for(Object obj : carList) {
				System.out.println(obj);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
