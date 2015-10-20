class K
{
	static void show(){
		System.out.println("K Show");
	}
}
class N extends K{
	//@Override
	static void show(){
		System.out.println("N Show");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		N obj = new N();
		obj.show();

	}

}
