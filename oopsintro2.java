package Jan_Batch_2026;

import java.util.Scanner;

class FoodMenu{
	FoodMenu(){
		System.out.println("      MENU");
		System.out.println("\n -----  Veg Foods -----");
		String vegMenu[] = {"1.Idly","2.Dosa","3.Poori","4.veg-rice","5.Pongal"};
		for(int i=0;i<vegMenu.length;i++) {
			System.out.println(vegMenu[i]);
		}
		System.out.println("\n -----  Non-Veg Foods -----");
		String nonVegMenu[] = {"1.Chicken Briyani","2.Mutton Mandi","3.Chicken Noodels","4.Chicken Rice","5.Prawn fry"};
		for(int i=0;i<nonVegMenu.length;i++) {
			System.out.println(nonVegMenu[i]);
		}
	}
	FoodMenu(String type , int ch){
		System.out.println(type);
		System.out.println(ch);
	}
}

public class oops2 {
	public static void main(String[] args) {
		FoodMenu f = new FoodMenu();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Veg / non-veg");
		
		String type = s.nextLine();
		
		System.out.println("Enter the menu number :");
		
		int ch = s.nextInt();
		
		FoodMenu f1 = new FoodMenu(type,ch);
		
	
		
	}

}
