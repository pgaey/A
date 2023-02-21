package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	public void method0() {		// method0 ���� ����
		
		
		// ctrl + shift + o		: import ����Ű
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���ó���? : ");
		int floor = sc.nextInt();
		
		switch(floor) {
			case 1 : System.out.println("1���Դϴ�. ���� �����ϴ�.");
			break;
			case 2 : System.out.println("2���Դϴ�. ���� �����ϴ�.");
			break;
			case 3 : System.out.println("3���Դϴ�. ���� �����ϴ�.");
			break;
		}
		
	}		// method0 ���� ��
	
	/*
	 * switch
	 * 
	 * [ ǥ����  ]
	 * 
	 * switch(�Ʒ� ����� ����� ����񱳸� �� �����){
	 * 		case ����, ����, ���ڿ� : ������ �ڵ�1;
	 * }
	 * 
	 * 			// ����񱳴��
	 * switch(����, ����, ���ڿ�){
	 * 		case ��1 : �������ڵ�1; // ����񱳴�� == ��1		true�� ��� �������ڵ�1�� ����
	 * 		break;				// switch������ ����������.
	 * 		case ��2 : �������ڵ�2; // ����񱳴�� == ��2		true�� ��� �������ڵ�2�� ����
	 * 		break;
	 * 		case ��n : �������ڵ�n; // ����񱳴�� == ��n		true�� ��� �������ڵ�n�� ����
	 * 		break;
	 * 		default : �������ڵ�; // == else    if���� else�� ������ ������ �Ѵ�
	 * }
	 * 
	 */
	
	public void method1() {
		// ����ڿ��� ���� �Է¹޾Ƽ� Ȧ�� / ¦�� �Ǻ�
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ����");
		int num = sc.nextInt();
		
		int oddEven = num % 2; // 0 : ¦��, 1 : Ȧ��
		
		switch(oddEven) {
			case 0 : System.out.println("¦���ε�?"); break;  // break�� ������ switch�� ������ ���� 
			case 1 : System.out.println("Ȧ���ε�?"); // ������ ���� break�� ��� ������ ���� -> ���� �ʾƵ� ��
		}
	}

	public void method2() {
		
		// 1. ����ڷκ��� �ֹι�ȣ �Է¹ޱ� (String personId => xxxxxx-0xxxxxx)
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է����ּ���    >   - ����");
		String personId = sc.nextLine();
		
		// 2. �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� ���ڸ� ����
		char gender = personId.charAt(7);
		
		// 3. ����ġ���� �̿��ؼ� ���ǹ� �ۼ�
	
		String gender2;
		
		switch(gender) {
		
		
			case '1': 
			case '3': gender2 = "����";
			break;
			
			case '2': 
			case '4': gender2 = "����";
			break;
			
			default : gender2 = "�ܰ���";
		}
		System.out.println(gender2 + "�Դϴ�.");
	}
	
	// switch
	// �ұ���, ���, ���κ�, �����, ���ö�, ����
	public void foodCourt() {	// �Թ����� 1��
		
		// ����ڿ��� ������ ������ �̸��� �Է¹޾�
		// �� ���ĸ����� ������ ������� ��
		
		// �ұ���, 	���,		���κ�,		�����,		���ö�,		����
		// 12000   5000	    8000	    10000		6000	   12000
		
		// ���� ~ �츮���� ���� ~ ���� �� ~
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է����ּ���(�ұ���, ���, ���κ�, �����, ���ö�, ����) : ");
		String food = sc.nextLine();
		
		int price = 0;
		switch(food) {
			case "�ұ���" : 
			case "����" : price += 12000; break;
			case "���" : price += 5000 ; break;
			case "���κ�" : price += 8000; break;
			case "�����" : price += 10000; break;
			case "���ö�" : price += 6000; break;
			default : System.out.println("�׷� ������ �����ϴ�.");
			return;		// ���� ����ǰ� �ִ� �޼ҵ� ������ �ƿ� ��������
						// �޼ҵ� ȣ�� �κ����� ���ư��� 
		}
		System.out.printf("%s�� ������ %d�� �Դϴ�.", food, price);
	}		// return; �ϸ� ���������� �κ�
	
	public void login() {
		
		// �α��� ���! 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� : ");
		String userId = sc.nextLine();
		
		System.out.println("��й�ȣ : ");
		String userPwd = sc.nextLine();
		
		String id = "user01";
		String pwd = "pass01";
		String nickName = "�ڹٰ�����";
		
		if(userId.equals(id) && userPwd.equals(pwd)) {
			System.out.println("�α��� ���� ~ ! " + nickName + "�� ȯ���մϴ� ^.^");
		// ����ڰ� �Է��� ���ڿ��� ȸ�����Խ� �Է��� ���ڿ��� ��ġ���� �ʴ´ٸ�
			
		} else if(!userPwd.equals(pwd) && !userId.equals(id)) {
			System.out.println("���̵�, ��� ��� �������� �ʽ��ϴ�!");
			
		} else if(!userId.equals(id)) {
			System.out.println("���̵� �������� �ʽ��ϴ�!");
			
		} else {
			System.out.println("��й�ȣ�� �������� �ʽ��ϴ�!");
		}
		
			
			
//		} else if((userId != id) || (userPwd != pwd)) {
//			System.out.println("���̵� �������� �ʴ´�");		//		<<== �̰� String�ε� �Ǵ� ����
//		}
	
		
		
		// �⺻�ڷ��� : boolean, byte, short, int, long, char, float, double
		// => �⺻�ڷ��� ���� ��쿡�� �����(==, !=)�� �� ��!!!
		
		// �����ڷ��� : String				�����ڷ����� ����񱳰� �� ���� ������ String�� �Ұ���
		// => �����(==, !=)�� �Ұ���
		// ����? �����ڷ����� ��� ������ ������ ���� ���� '�ּҰ�'�̱� ����
		// ���ڿ��� ���� �� : equals()�� ����Ѵ�. => true, false
		// [ǥ����] ���ڿ�.equals("���ҹ��ڿ�");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
