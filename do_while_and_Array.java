package Jan_Batch_2026;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
//		int x = 10;
//		do {
//			System.out.println(x);
//			x--;
//		}while(x>=0);
		
//		int x = 0;
//		do {
//			System.out.println(x);
//			x++;
//		}while(x<=10);
		
		//c-array
		
//		int a[] = {10,20,30,40,50};
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
//		int b[][] = {{1,2,3},
//					 {2,3,4}};
		
//		System.out.println(b[0][0]);
//		System.out.println(b[0][1]);
//		System.out.println(b[0][2]);
//		System.out.println(b[1][0]);
//		System.out.println(b[1][1]);
//		System.out.println(b[1][2]);
		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		Scanner s = new Scanner(System.in);
		int n = 5;
//		int n = s.nextInt();
		int y[] = new int[n];
		
		System.out.println("Enter 5 integer elements :");
		
		for(int i=0;i<y.length;i++) {
			y[i]=s.nextInt();
		}
		
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]);
		}

	}

}
