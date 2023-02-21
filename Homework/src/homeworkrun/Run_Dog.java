package homeworkrun;

import homework.Dog;

public class Run_Dog {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.setName("개간지");
		dog.setBreed("말티즈");
		dog.setGender('M');
		dog.setAge(2);
		dog.setWeight(20);
		
		dog.bow();
		dog.bow1(30);
		
		String name = dog.getName();
		String breed = dog.getBreed();
		char gender = dog.getGender();
		int age = dog.getAge();
		int weight = dog.getWeight();
		
		System.out.println(dog.info());
		
		

	}

}
