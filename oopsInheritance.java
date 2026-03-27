package Jan_Batch_2026;

// single inheritance

class Warehouse{
	void product() {
		System.out.println("Dress");
		System.out.println("Jewels");
		System.out.println("Electronic Gadgets");
		System.out.println("Grocery");
		System.out.println("Beauty Products");
	}
}

class Franchise extends Warehouse{
	void franchiseProduct() {
		System.out.println("Household Products");
		System.out.println("Accessories");
		System.out.println("Stationary Things");
	}
}

public class OopsInheritance {
	public static void main(String[] args) {
		Franchise f = new Franchise();
		f.product();
		f.franchiseProduct();
		
		Warehouse w = new Warehouse();
		w.product();

	}

}
