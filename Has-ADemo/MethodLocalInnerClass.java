class K
{
	void show(){
		System.out.println("K Show");
		class V{
			void show(){
				System.out.println("V Show");
			}
		}
		V obj = new V();
		obj.show();
	}
}
public class MethodLocalInnerClass {

	public static void main(String[] args) {
		K obj = new K();
		obj.show();

	}

}
