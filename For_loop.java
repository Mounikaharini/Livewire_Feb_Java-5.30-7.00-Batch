package Jan_Batch_2026;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the sides : ");
		
		int sides = s.nextInt();
		
		switch(sides) {
		case 0:
			System.out.println("circle");
			break;
			
		case 1:
			System.out.println("line");
			break;
			
		case 2:
			System.out.println("cylinder");
			break;
		
		case 3 :
			System.out.println("triangle");
			break;
		
		case 4:
			System.out.println("square");
			break;
			
		default:
			System.out.println("polygonal");
		
		}
		
		s.nextLine();
		System.out.println("Enter a shape : ");
		
		String shape = s.nextLine();
		System.out.println(shape);
		
		switch(shape) {
		case "square":
			System.out.println("4 sides");
			break;
		case "triangle":
			System.out.println("3 sides");
			break;
		default:
			System.out.println("some sides it have");
			
		}
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}
		
		for(int i=6;i>=1;i-=2) {
			System.out.println(i);
		}
		System.out.println("Enter the table : ");
		int t = s.nextInt();
		int t = 2;
		
		System.out.println("Enter the count : ");
		int c = s.nextInt();
		int c = 10;
		
		for(int i=1;i<=c;i++) {
			System.out.println(i*t);
		}
		
		
		for(int i=1;i<=c;i++) {
			System.out.println(i+"x"+t+"="+i*t);
		}
		
		
		for(int j=1; j<=4; j++) {
			for(int i=1;i<=4;i++) {
				if(j==1 || j==4) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		 

	}

}
