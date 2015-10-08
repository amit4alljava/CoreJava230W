class T
{
	T(){
		System.out.println("I am Cons");
	}
	void T(){
		System.out.println("I am Method");
	}
	
}
public class ConsQuestion {

	public static void main(String[] args) {
		T obj = new T();
		obj.T();

	}

}
