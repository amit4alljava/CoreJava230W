class Emp{
	int empno;
	double salary;
	void calcSalary(){
		
	}
	void bonus(){
		
	}
}
// Utility Class
/*final class*/ interface MathOperations{
	//private MathOperations(){}
	static void decimalToHexa(){
		
	}
	static void cube(){
		
	}
	static void squareRoot(){
		
	}
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		//MathOperations m = new MathOperations();
		//m.cube();
		MathOperations.cube();

	}

}
