package homework;

public class Dog {
	
	// [�ʵ��]
	// �̸�, ��, ����, ����, ������

	private String name;
	private String breed;
	private char gender;
	private int age;
	private int weight;
	
	// [�����ں�]
	
	// [�޼ҵ��]
	
	public void bow() {
		System.out.print(name + " �۸� ");
	}
	
	public void bow1(int weight) {
		if(weight < 30) {
			System.out.println("�������");
		}else System.out.println("�� �ȸԾ� ");
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
		return "�� ������ �̸��� " + name + "�̰� " + breed + "���̸� ������ " + gender + "�Դϴ�. ���̴� "
				+ age + "���̰� �����Դ� " + weight + "kg�Դϴ�." ;
	}
	
}
