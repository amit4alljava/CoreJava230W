class Z1 {
	int a = 1000;
}
class X1 extends Z1
{
	int a; 
	X1(){
		a = 100;
	}
}
class Y1 extends X1
{
	int a = 200;
	Y1(int a)  // Local Var
	{
		Z1 z = (Z1)this;
		System.out.println(z.a+super.a+this.a+a);
	}
	
}
public class SuperAndThis {

	public static void main(String[] args) {
		Y1 obj = new Y1(300);

	}

}
