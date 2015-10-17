import java.util.Scanner;

class M
{
	static{
		System.out.println("M Static Call");
	}
}
class P
{
	int x;  // When Object is Created
	static int y; // When Class is Loaded
	P(){
		x++;
		y++;
		System.out.println("I am Call When Object is Created X "+x+" Y "+y);
	}
	static{
		System.out.println("I am P Call When Class is Loaded... "+y);
	}
}		
		
		
		
		
		
		
		
		
		
		


public class StaticDemo {

	public static void main(String[] args) throws Exception{
		//TT obj = new TT();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class Name to Load");
		String className = scanner.next();
		Class.forName(className);
		//System.out.println(P.y);
		/*P obj1 = new P();
		P obj2 = new P();
		P obj3 = new P();*/

	}

}





