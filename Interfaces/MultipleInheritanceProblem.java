interface P1{
	default void show(){
		System.out.println("P1 Show Call");
	}
}
interface P2{
	default void show(){
		System.out.println("p2 show Call");
	}
}
class P3 implements P1, P2{
	@Override
	public void show(){
		P1.super.show();
		P2.super.show();
		System.out.println("P3 Show Call");
	}
}
public class MultipleInheritanceProblem {

	public static void main(String[] args) {
		P3 obj = new P3();
		obj.show();

	}

}
