
public class Calculator {
	Calculator(){
		System.out.println("Calc Cons Call");
	}
	static{
		System.out.println("Static Block Call...");
	}
public int add(int x , int y){
	return x + y;
}
public int subtract(int x , int y){
	return x - y;
}
public int multiply(int x , int y){
	return x * y;
}
public int divide(int x , int y){
	return x / y;
}

}
