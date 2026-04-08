package Jan_Batch_2026;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void f() {
		f();
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("start");
				
		try {
//			int a = 10;
//			int b = 0;
//			System.out.println(a/b);
			
//			int x[] = {1,2,3,4,5};
//			System.out.println(x[6]);
			
//			int a = s.nextInt();
			
//			f();
			
			int x = Integer.MAX_VALUE;
			int a[] = new int[x];
			
		}
		catch(ArithmeticException a) {
			System.out.println("Denominator shouldn't be zero");
		}
		catch(ArrayIndexOutOfBoundsException array){
			System.out.println("Given index is not applicable");
		}
		catch(InputMismatchException i) {
			System.out.println("Invalid data type");
		}
		catch(StackOverflowError ss) {
			System.out.println("Stack overflow");
		}
		catch(Exception e) {
			System.out.println("Some exception");
		}
		catch(Error ee) {
			System.out.println("Some Error");
		}
		System.out.println("end");

	}

}
