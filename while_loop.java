package Jan_Batch_2026;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
//		//increment 
//		int i = 1;
//		while(i<=5) {
//			System.out.println(i);
//			i++;
//		}
//		
//		int i1 = 2;
//		while(i1<=10) {
//			System.out.println(i1);
//			i1+=2;
//		}
//		
//		//decrement	
//		int j = 5;
//		while(j>=1) {
//			System.out.println(j);
//			j--;
//		}
//		
//		int j1 = 10;
//		while(j1>=2) {
//			System.out.println(j1);
//			j1-=2;
//		}
		
//		* * *
//		* * *
//		* * * 
//		for(int i =1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		//count the digit
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int y = s.nextInt();
		int c = 0;
		while(y>0) {
			y=y/10;
			c++;
		}
		System.out.println("Total Digits : "+c);
		
		//sum of digit
		System.out.println("Enter a number : ");
		int v = s.nextInt();
		int sum = 0;
		while(v>0) {
			int d = v%10;
			sum = sum+d;
			v/=10;
		}
		System.out.println("Sum of digits : "+sum);

	}

}
