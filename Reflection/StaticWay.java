import java.util.Scanner;


public class StaticWay {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		Calculator calc = new Calculator(); 
		System.out.println("add");
		System.out.println("subtract");
		System.out.println("multiply");
		System.out.println("divide");
		System.out.println("Type Operation Name");
		Scanner scanner = new Scanner(System.in);
		String operation = scanner.next();
		int result = 0;
		switch(operation){
		case "add":
			result= calc.add(a, b);
			break;
		case "subtract":
			result=calc.subtract(a, b);
			break;
		case "multiply":
			result=calc.multiply(a, b);
			break;
		case "divide":
			result=calc.divide(a, b);
			break;	
		}
		System.out.println("Result is "+result);

	}
	
	
	
	
	
	
	

}
