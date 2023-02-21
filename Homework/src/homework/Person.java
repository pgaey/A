package homework;

public class Person {

	// 이름, 나이, 키, 몸무게, 직업, 대표노래
	
	// [ 필드부 ] 
	private String name;
	private int age;
	private double height;
	private int weight;
	private String job;
	private String signatureSong;
	
	// [생성자부]
	
	// [메소드부]
	
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
		return "직업이 " + job + "인 " + name + "씨는 " + age + "세이고 키와 몸무게는 각각 " + height + "cm, "
				+ weight + "이고 대표곡으로는 " + signatureSong + "가 있습니다.";
	}
	
}
