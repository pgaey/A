package homeworkrun;

import homework.Person;

public class Run_Person {

	public static void main(String[] args) {

		Person ps = new Person();
		
		ps.setName("박효신");
		ps.setAge(43);
		ps.setHeight(178.5);
		ps.setWeight(65);
		ps.setJob("가수");
		ps.setSignatureSong("야생화");
		
		String name = ps.getName();
		int age = ps.getAge();
		double height = ps.getHeight();
		int weight = ps.getWeight();
		String job = ps.getJob();
		String song = ps.getSignatureSong();
		
		System.out.println(ps.information());
		
		
		
		
	}

}
