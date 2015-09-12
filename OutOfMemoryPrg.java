import java.util.ArrayList;

class A
{
	String y = new String("Hello");
	int x ;
	float b;
	double c;
}
public class OutOfMemoryPrg {

	public static void main(String[] args) throws Exception {
		System.out.println("Program Starts");
		ArrayList list = new ArrayList();
		while(true){
			A obj  = new A();
			list.add(obj);
			Thread.sleep(50);
		}

	}

}









