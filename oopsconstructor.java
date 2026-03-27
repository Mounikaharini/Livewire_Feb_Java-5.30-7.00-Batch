package Jan_Batch_2026;

class add{
	
	//non - parameterized constructor
	add(){
		System.out.println("No value is assigned");
	}
	
	//parameterized constructor
	add(int a){
		System.out.println(a);
	}
	add(int a , int b){
		System.out.println(a+b);
	}
	add(int a , int b, int c){
		System.out.println(a+b+c);
	}
}
public class ConstructorTopic {

	public static void main(String[] args) {
		add a = new add(10,10,90);

	}

}
