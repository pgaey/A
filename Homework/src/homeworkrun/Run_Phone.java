package homeworkrun;

import homework.Phone;

public class Run_Phone {

	public static void main(String[] args) {

		Phone phone = new Phone();
		
		phone.setCompany("Apple");
		phone.setModel("iphone");
		phone.setMemory(128);
		phone.setPrice(1000);
		phone.setBattery(4000);
		
		String comp = phone.getCompany();
		System.out.println(comp);
		String model = phone.getModel();
		System.out.println(model);
		int memory = phone.getMemory();
		System.out.println(memory);
		int price = phone.getPrice();
		System.out.println(price);
		int battery = phone.getBattery();
		System.out.println(battery);
				
		
				
		System.out.println(phone.information());
		
	}

}
