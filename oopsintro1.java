package Jan_Batch_2026;

class Calculator{
//	final static int c=20;
	public int add(int a, int b) {
		return a+b;
	}
public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int op = c.add(60,30);
		System.out.println(op);

	}
}


public class oopsIntro {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int op = c.add(10,30);
		System.out.println(op);

	}

}
