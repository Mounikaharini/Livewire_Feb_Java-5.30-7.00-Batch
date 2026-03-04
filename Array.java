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

//----------------------------------------------------------------------------------


package Jan_Batch_2026;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		System.out.println("Enter the size of an array : ");
//		int size = s.nextInt();
//		
//		int a[]= new int[size];
//		
//		System.out.println("Enter the value for the array :");
//		for(int i=0;i<a.length;i++) {
//			a[i]=s.nextInt();
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		
//		System.out.println("Enter the size of an array (row) : ");
//		int row = s.nextInt();
//		
//		System.out.println("Enter the size of an array (col) : ");
//		int col = s.nextInt();
//		
//		int a[][]= new int[row][col];
//		
//		System.out.println("Enter the value for the array :");
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				a[i][j]=s.nextInt();
//			}
//		}
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//sums using array
		
		System.out.println("Enter the size of an array : ");
		int size = s.nextInt();
		
		int a[]= new int[size];
		
		System.out.println("Enter the value for the array :");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		// sum of elements in an array
		
//		int sum = 0;
//		for(int i=0;i<a.length;i++) {
//			sum = sum + a[i];
//		}
//		System.out.println("Sum : "+sum);
		
		// multiple of elements in an array
		
//		int multiple = 1;
//		for(int i=0;i<a.length;i++) {
//			multiple = multiple * a[i];
//		}
//		System.out.println("Multiple : "+multiple);
		
//		System.out.println("Enter the key element : ");
//		int key = s.nextInt();
//		boolean flag = false;
//		
//		for(int i=0;i<a.length;i++) {
//			if(key==a[i]) {
//				flag=true;
//			}
//		}
//		if(flag==true) {
//			System.out.println("Element Found");
//		}
//		else {
//			System.out.println("Element Not Found");
//		}

		//maximum element in an array
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Maximum Element :"+max);
		
		//minimum element in an array
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Minimum Element :"+min);
		

	}

}
