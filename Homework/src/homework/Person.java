package homework;

public class Person {

	// �̸�, ����, Ű, ������, ����, ��ǥ�뷡
	
	// [ �ʵ�� ] 
	private String name;
	private int age;
	private double height;
	private int weight;
	private String job;
	private String signatureSong;
	
	// [�����ں�]
	
	// [�޼ҵ��]
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSignatureSong(String signatureSong) {
		this.signatureSong = signatureSong;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public String getJob() {
		return job;
	}
	public String getSignatureSong() {
		return signatureSong;
	}
	
	public String information() {
		return "������ " + job + "�� " + name + "���� " + age + "���̰� Ű�� �����Դ� ���� " + height + "cm, "
				+ weight + "�̰� ��ǥ�����δ� " + signatureSong + "�� �ֽ��ϴ�.";
	}
	
}
