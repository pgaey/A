package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] count = new int[2];
		// Student 객체 수 구하기
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) count[0]++;
		}
		// Employee 객체 수 구하기
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) count[1]++;
		}
		return count;
	}
	
	public void /*set*/insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null)
				s[i] = new Student(name, age, height, weight, grade, major);
				return;
		}
	}
	
	public Student[] /*get*/printStudent() {
		return s;
	}
	
	public void /*set*/inserEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
		for(int i = 0; i < e.length; i++) {
			if(e[i] == null)
				e[i] = new Employee(name, age, height, weight, salary, dept);
				return;
		}
	}
	
	public Employee[] /*get*/printEmployee() {
		return e;
	}
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
