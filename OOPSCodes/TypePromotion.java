class A
{
	void show(int ...x){
		System.out.println("Var Args Int");
	}
	/*void show(Integer x){
		System.out.println("Wrapper Class Integer");
	}*/
	void show(byte x){
		System.out.println("Byte x show");
	}
	void show(short x){
		System.out.println("Short x Show");
	}
	/*void show(int x){
		System.out.println("int x Show");
	}*/
	/*void show(long x){
		System.out.println("long x show");
	}*/
}
public class TypePromotion {

	public static void main(String[] args) {
		A obj = new A();
		obj.show(1);

	}

}
