package homework;

public class Snack {

	
	// [ �ʵ�� ] 
	private String name;
	private String company;
	private String mainIngredient;
	private int price;
	private int kcal;
	
	// [�����ں�]
	
	
	
	// [�޼ҵ��]
	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public String getMainIngredient() {
		return mainIngredient;
	}
	public int getPrice() {
		return price;
	}
	public int getKcal() {
		return kcal;
	}
	
	
	
	public String Info() {
		return "�� ������ �̸��� " + company + "ȸ���� " + name + "�Դϴ�. �ּ����� " + mainIngredient +
				"�̰�, " + kcal + "kcal���ϰ� " + price + "���Դϴ�.";
	}
	
	
}
