package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		
		while(true) {
			int[] count = pc.personCount();
					
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� �л��� " + count[0] + "���Դϴ�.");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� ����� " + count[1] + "���Դϴ�.");
			System.out.println();
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.println("�޴� ��ȣ : " );
			int select = sc.nextInt();
			
			switch(select) {
			case 1 : studentMenu(); break;
			case 2 : employeeMenu(); break;
			case 9 : System.out.println("�����մϴ� ~"); return;
			default : System.out.println("�̻��Ѱ� �������� ~");
			}
		}
	}
	
	public void studentMenu() {
		
		while(true) {
			System.out.println();
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			
			int count = pc.personCount()[0];
			if(count == 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			}
			int select = sc.nextInt();
			
			switch(select){
			case 1 :
				if(count == 3) System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
				else insertStudent();
				break;
			case 2 : printStudent(); break;
			case 9 : System.out.println("�������� ���ư��ϴ�"); return;
			default : System.out.println("�̻��Ѱ� �������� ~ ");
			}
		}
	}
	public void employeeMenu() {
		
		while(true) {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			
			int count = pc.personCount()[1];
			if(count == 10) {
				System.out.println("�� �� �ȵ�");
			}
			
			System.out.println("�޴� ��ȣ : ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1 :
				if(count == 10) System.out.println("����� ���� ��");
				else insertEmployee();
				break;
			case 2 : printEmployee(); break;
			case 9 : return;
			default : System.out.println("�߸��Է���");
			}
		}
	}
	public void insertStudent() {
		while(true) {
			System.out.print("�л� �̸� : ");
			String name = sc.next();
			System.out.print("�л� ���� : ");
			int age = sc.nextInt();
			System.out.print("�л� Ű : ");
			double height = sc.nextDouble();
			System.out.print("�л� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("�л� �г� : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.print("�л� ���� : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			int count = pc.personCount()[0];
			if(count < 3) {
				System.out.println("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				String select = sc.nextLine();
				if(select.equals("N") || select.equals("n")) {
					return;
				}
			} else {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
				return;
			}
		}
	}
	public void printStudent() {
		
		Student[] s = pc.printStudent();
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) System.out.println(s[i].toString());
		}
	}
	
	
	public void insertEmployee() {
		while(true) {
			System.out.print("��� �̸� : ");
			String name = sc.next();
			System.out.print("��� ���� : ");
			int age = sc.nextInt();
			System.out.print("��� Ű : ");
			double height = sc.nextDouble();
			System.out.print("��� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("��� �޿� : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("��� �μ� : ");
			String dept = sc.nextLine();
			
			pc.inserEmployee(name, age, height, weight, salary, dept);
			int count = pc.personCount()[1];
			if(count < 10) {
				System.out.println("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				String select = sc.nextLine();
				if(select.equals("N") || select.equals("n")) {
					return;
				}
			} else if(count == 10) {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
				return;
			}
		}
	}
	public void printEmployee() {
		
		Employee[] e = pc.printEmployee();
		
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) System.out.println(e[i].toString());
		}
	}
	
	
	
	
	
	
}
