class P
{
	void show(){
		System.out.println("P Show");
	}
	void print(){
		System.out.println("Print Call");
	}
}
class S extends P
{
	@Override
	void show(){
		
		System.out.println("S Show");
		super.show();
		super.print();
	}
}
public class SuperAndThis2 {

	public static void main(String[] args) {
		S obj = new S();
		obj.show();

	}

}
