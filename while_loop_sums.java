package Jan_Batch_2026;

import java.util.Scanner;

public class while_loop_sums {

	public static void main(String[] args) {
		
//		Given a string, count how many vowels (a, e, i, o, u) are in it (case-insensitive).
		
//		Input: "Hello World"
//		Output: 3
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string : ");
//		String s = sc.nextLine();
//		int count = 0;
//		for(int i=0;i<s.length();i++) {
//			char c =s.charAt(i);
//			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
//					c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
//				count++;
//			}
//		}
//		System.out.println("Vowels : "+count);
		
		
//		Armstrong Number
//		int y = 123;
//		int x = y;
//		int z = y;
//		int digit = 0;
//		while(y>0) {
//			y=y/10;
//			digit++;
//		}
//		
//		int sum = 0;		
//		while(x>0) {
//			int rem = x%10;
//			sum = sum +(int)(Math.pow(rem, digit));
//			x=x/10;
//		}
//		
//		if (z==sum) {
//			System.out.println("Armstrong Number");
//		}
//		else {
//			System.out.println("Not Armstrong Number");
//		}
		
		//palindrome
//		
//		String s = "mom";
//		
//		String t ="";
//		for(int i=s.length()-1;i>=0;i--) {
//			t = t + s.charAt(i);
//		}
//		
//		if(s.equalsIgnoreCase(t)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not a palindrome");
//		}
		
		//fibonacci series
		
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int c = 0;
		while(c<n) {
			c = a+b;
			if(c<=n) {
				System.out.print(c+" ");
			}
			a = b;
			b = c;
    }	

	}

}
