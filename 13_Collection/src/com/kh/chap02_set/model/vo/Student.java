package com.kh.chap02_set.model.vo;

public class Student implements Comparable<Student>  {
	
	private String name;
	private int age;
	private int score;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	/*
	// hashCode()
	@Override
	public int hashCode() {
		// 객체들의 주소 16진수 어쩌고저쩌고 뭐시뭐시기 해시알고리즘을 돌려서 10진수로 반환
		return (name + age + score).hashCode();
		
		// 이승철 15 100
		// 이승철 50 50
		
		// 위를 더하면 String + int + int 라서 String으로 자동형변환됌
		// 이승철15100
		// 이승철5050 
		// 이렇게 달라진 문자열의 hashCode() 를 구함
		// (name + age + score).hashCode()
		
		// 이승철 15 0
		// 이승철 1 50
		// 위와 같은 경우에는 hashCode가 완벽하지 않음
		// 이건 잘못된 방법 
	}
	
	// equals()
	public boolean equals(Object obj) {
		Student other = (Student)obj;
		
		// 이름, 나이, 점수
		// 셋 중에 하나라도 다르면 false반환
		
		if(!this.name.equals(other.name) || this.age != other.age || this.score != other.score) {
			return false;
		}
		// 필드값이 동일하다면 true값 반환
		return true;
	}
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;		// 적당히 애매한(연산이 너무 커지지 않을) 소수(prime) 
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	@Override
	public boolean equals(Object obj/*Object라서 주소값이 들어가있음*/) {
		
		// 현재 객체(this)와 obj를 비교
		if (this == obj) // 현재 객체와 비교객체의 주소값이 일치하는가 ?
			return true; // == 같은 곳을 가리키고 있음 == 모든 필드값이 일치
		if (obj == null) // 비교대상이 null
			return false; // 비교할 가치가 없음 false
		if (getClass() != obj.getClass()) // 메소드로 타입비교	<----??? 클래스명비교(패키지 경로까지)라는데..?
			return false;
		
		// 위에 세가지 조건을 만족하지 못했을 경우
		// 각 내용물을 다 비교
		Student other = (Student) obj;
		if (age != other.age)	// 현재 객체랑 들어온 객체랑 나이가 다를 경우
			return false;
		if (name == null) {		// 현재 객체 이름값이 null일 경우 
			if (other.name != null)	// 비교 객체 이름이 null이 아니라면?
				return false;
		} else if (!name.equals(other.name)) // 현재 객체 이름과 비교객체 이름이 다를 경우
			return false;
		if (score != other.score) // 점수가 달라도!
			return false;
		return true;
	}
	
	@Override		// 이거 잘 모르겠음
	public int compareTo(Student s){		// 
		if(this.name.charAt(0) < s.getName().charAt(0)) {
			return 1;
		}else if(this.name.charAt(0) > s.getName().charAt(0)) {
			return -1;
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
}
