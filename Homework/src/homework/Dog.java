package homework;

public class Dog {
	
	// [필드부]
	// 이름, 종, 성별, 나이, 몸무게

	private String name;
	private String breed;
	private char gender;
	private int age;
	private int weight;
	
	// [생성자부]
	
	// [메소드부]
	
	public void bow() {
		System.out.print(name + " 멍멍 ");
	}
	
	public void bow1(int weight) {
		if(weight < 30) {
			System.out.println("밥먹을래");
		}else System.out.println("밥 안먹어 ");
	}
	
	// [ setter ]
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// [ getter ]
	
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public int getWeight() {
		return weight;
	}
	
	// information 
	
	public String info() {
		return "제 강아지 이름은 " + name + "이고 " + breed + "종이며 성별은 " + gender + "입니다. 나이는 "
				+ age + "살이고 몸무게는 " + weight + "kg입니다." ;
	}
	
}
