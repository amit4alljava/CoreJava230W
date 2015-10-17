interface X
{
	void print();
}
// SAM Interface
@FunctionalInterface
interface Z
{
	void add(int x, int y);
	//void sub(int x, int y);
}
class Y implements X
{
	@Override
	public void print(){
		
	}
}
public class InterfaceUseDemo {

	public static void main(String[] args) {
		// 1. obj create 
		// 2. class create
		// 3. interface implement
		// 4. method override
		// 5. Upcasting
		X obj = new X(){
			@Override
			public void print(){
				System.out.println("Print Call");
			}
		};
		obj.print();
		
		// 1. obj create 
				// 2. class create
				// 3. interface implement
				// 4. method override
				// 5. Upcasting
		X obj2=()->System.out.println("Print Call");
		Z obj3 = (a,b)->{
			System.out.println(a+b);
			System.out.println(a+b);
			System.out.println(a+b);
		};
		obj3.add(90,77);
		/*Y obj = new Y();
		obj.print();*/

	}

}
