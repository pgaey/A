package homeworkrun;

import homework.Snack;

public class Run_Snack {

	public static void main(String[] args) {
	
		
		Snack sn = new Snack();
		
		sn.setName("Æ÷½ºÆ½");
		sn.setCompany("³ó½É");
		sn.setMainIngredient("°¨ÀÚ");
		sn.setPrice(1700);
		sn.setKcal(395);
		
		String name = sn.getName();
		String company = sn.getCompany();
		String mainIngredient = sn.getMainIngredient();
		int price = sn.getPrice();
		int kcal = sn.getKcal();
		
		
		
		
		System.out.println(sn.Info());
		
		
		
	}
}
