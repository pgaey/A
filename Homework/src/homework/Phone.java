package homework;

public class Phone {

	// 만든 회사, 모델명, 용량, 가격, 배터리용량
	
	// [ 필드부 ] 
	private String company;
	private String model;
	private int memory;
	private int price;
	private int battery;       
	
	// [생성자부] 
	
	
	// [메소드부] 

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
		return "이 제품은 " + company + "회사의 " + memory + "GB 용량을 지닌 " + model + "입니다. \n" + 
				"배터리 용량은 " + battery + "mAh이고 가격은 " + price + "$ 입니다."; 
	}
	
	
	
	
	
}
