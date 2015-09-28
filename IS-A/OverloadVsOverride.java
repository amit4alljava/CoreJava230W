class W
{
	void print(){
		System.out.println("W Print Call");
	}
	float print(int x){
		System.out.println("W Print Call int");
		return 0.0f;
	}
}
class H extends W
{
	@Override
	void print(){
		super.print();
		System.out.println("THis is Overriding");
	}
	double print(int x , int y){
		System.out.println("H Print Call int,int");
		return 20.20;
	}
}
public class OverloadVsOverride {

	public static void main(String[] args) {
		H obj = new H();
		obj.print(100,200);
		obj.print(100);
		obj.print();

	}

}
