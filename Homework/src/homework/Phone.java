package homework;

public class Phone {

	// ���� ȸ��, �𵨸�, �뷮, ����, ���͸��뷮
	
	// [ �ʵ�� ] 
	private String company;
	private String model;
	private int memory;
	private int price;
	private int battery;       
	
	// [�����ں�] 
	
	
	// [�޼ҵ��] 

	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}

	
	
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public int getMemory() {
		return memory;
	}
	public int getPrice() {
		return price;
	}
	public int getBattery() {
		return battery;
	}
	
	
	public String information() {
		return "�� ��ǰ�� " + company + "ȸ���� " + memory + "GB �뷮�� ���� " + model + "�Դϴ�. \n" + 
				"���͸� �뷮�� " + battery + "mAh�̰� ������ " + price + "$ �Դϴ�."; 
	}
	
	
	
	
	
}
