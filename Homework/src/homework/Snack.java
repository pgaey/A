package homework;

public class Snack {

	
	// [ 필드부 ] 
	private String name;
	private String company;
	private String mainIngredient;
	private int price;
	private int kcal;
	
	// [생성자부]
	
	
	
	// [메소드부]
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
		return "이 과자의 이름은 " + company + "회사의 " + name + "입니다. 주성분은 " + mainIngredient +
				"이고, " + kcal + "kcal지니고 " + price + "원입니다.";
	}
	
	
}
