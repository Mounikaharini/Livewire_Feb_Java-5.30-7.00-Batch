package Jan_Batch_2026;

public class ControlStatements {

	public static void main(String[] args) {
		
		int a = 100;
		//simple if else
		if (a==10) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		//odd or even
		if (a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		//if , else if , else
		if (a>0) {
			System.out.println("+ve");
		}
		else if(a<0) {
			System.out.println("-ve");
		}
		else {
			System.out.println("zero");
		}
		
		//vowels or consonants
		char ch = '+';
		if(ch>='a' && ch<='z') {
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println("vowel");
			}
			else {
				System.out.println("consonant");
			}
		}
		else {
			System.out.println("It is not an alphabet");
		}

	}

}
