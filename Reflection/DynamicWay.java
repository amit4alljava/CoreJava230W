import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;


public class DynamicWay {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		int a = 100;
		int b = 200;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ClassName");
		String className = scanner.next();
		Object obj =Class.forName(className).newInstance(); // It load the Class
		//Calculator calc = new Calculator(); 
		System.out.println("add");
		System.out.println("subtract");
		System.out.println("multiply");
		System.out.println("divide");
		System.out.println("Type Operation Name");
		String methodName = scanner.next();
		Class cls = obj.getClass();
		Method method = cls.
				getDeclaredMethod(methodName, int.class,int.class);
		/*Method method = obj.getClass()
				.getDeclaredMethod
				(methodName, int.class,int.class) ;*/
		Integer result  =(Integer)method.invoke(obj, a,b);
		System.out.println("Result is "+result);
		/*switch(operation){
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
*/
	}

}
