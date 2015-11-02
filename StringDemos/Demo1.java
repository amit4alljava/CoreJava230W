// String use a String Pool
public class Demo1 {

	public static void main(String[] args) {
		String a = "Hello";  // 1 or 0 
		String b = "Hello";
		a= "bye";
		b="ok";
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}

	}

}
