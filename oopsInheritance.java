package Jan_Batch_2026;
/*
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
*/
//multilevel-inheritance
/*
class gp{
	public void gpassets() {
		System.out.println("5 crores");
	}
}
class p extends gp{
	public void passets() {
		System.out.println("10 crores");
	}
}
class c extends p{
	public void cassets() {
		System.out.println("nil");
	}
}
public class OopsInheritance {
	public static void main(String[] args) {
		gp g = new gp();
		g.gpassets();
		
		p pa = new p();
		pa.gpassets();
		pa.passets();
		
		c ch = new c();
		ch.gpassets();
		ch.passets();
		ch.cassets();
	}
}
*/
 class resume{
	 public void resume1() {
		 System.out.println("Name \nObjective \nEducation \nProject");
	 }
 }
 class resumeTem1 extends resume{
	 public void resumeT1() {
		 System.out.println("Straight Format with no color");
	 }
 }
 class resumeTem2 extends resume{
	 public void resumeT2() {
		 System.out.println("Straight Format with color");
	 }
 }
 class resumeTem3 extends resume{
	 public void resumeT3() {
		 System.out.println("Table Format with color");
	 }
 }
public class OopsInheritance {
	public static void main(String[] args) {
		resumeTem1 r1 = new resumeTem1();
		r1.resume1();
		r1.resumeT1();
		System.out.println();
		
		resumeTem2 r2 = new resumeTem2();
		r2.resume1();
		r2.resumeT2();
		System.out.println();
		
		resumeTem3 r3 = new resumeTem3();
		r3.resume1();
		r3.resumeT3();
		System.out.println();
	}
}




