package com.kr.example.practice7.run;

import com.kr.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee em1 = new Employee();
		Employee em2 = new Employee(100, "ȫ�浿");
		Employee em3 = new Employee(100, "ȫ�浿", "������", "����", 25, 'M',
				2500000, 0.05, "010-1234-5678", "����� ������");
		
		
		em1.setEmpNo(1);
		em1.setEmpName("�ƹ���");
		em1.setDept("������");
		em1.setJob("�븮");
		em1.setAge(28);
		em1.setGender('��');
		em1.setSalary(2500000);
		em1.setBonusPoint(0.1);
		em1.setPhone("010-5555-7777");
		em1.setAddress("����� ������ �������");
		
		System.out.print(em1.getEmpNo() + " ");
		System.out.print(em1.getEmpName() + " ");
		System.out.print(em1.getDept() + " ");
		System.out.print(em1.getJob() + " ");
		System.out.print(em1.getAge() + " ");
		System.out.print(em1.getGender() + " ");
		System.out.print(em1.getSalary() + " ");
		System.out.print(em1.getBonusPoint() + " ");
		System.out.print(em1.getPhone() + " ");
		System.out.print(em1.getAddress() + " ");
		
		
		
		
		
		
		
	}

}
