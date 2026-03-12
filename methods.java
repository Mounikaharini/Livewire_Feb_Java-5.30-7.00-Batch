package Jan_Batch_2026;

import java.util.Scanner;

public class methods {
	
	public static void oddOrEven() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = s.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	
	public static void arrayPhoneNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = s.nextInt();
		long[] a = new long[size];
		System.out.println("Enter the elements :");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextLong();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void method1() {
		System.out.println("Without Return Without Parameter");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num1 = s.nextInt();
		System.out.println("Enter a number :");
		int num2 = s.nextInt();
		
		System.out.println("Output :"+(num1+num2));
		
	}
	
	public static void method2(int n1 , int n2) {
		
		System.out.println("Without Return With Parameter");
		System.out.println(n1+n2);
		
	}
	
	public static int method3() {
		
		System.out.println("With Return Without Parameter");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num1 = s.nextInt();
		System.out.println("Enter a number :");
		int num2 = s.nextInt();
		
		return (num1 + num2);
	}
	
	public static int method4(int n1 , int n2) {
		System.out.println("With return with parameter");
		return n1+n2;
	}
	

	public static void main(String[] args) {
//		oddOrEven();
//		arrayPhoneNumber();
		
//		method1();
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a number :");
//		int num1 = s.nextInt();
//		System.out.println("Enter a number :");
//		int num2 = s.nextInt();
//		method2(num1,num2);
		
//		int a = method3();
//		System.out.println(a);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num1 = s.nextInt();
		System.out.println("Enter a number :");
		int num2 = s.nextInt();
		int op = method4(num1,num2);
		System.out.println(op);
	
	}

}
