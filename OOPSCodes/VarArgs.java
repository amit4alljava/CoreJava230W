
class T14
{
	void add(int ...x){
		int sum = 0;
		for( int j : x){
			sum = sum + j;
		}
		System.out.println("Sum is "+sum);
	}
}
public class VarArgs {

	public static void main(String[] args) {
		T14 obj = new T14();
		obj.add();
		obj.add(10);
		obj.add(10,20);
		obj.add(10,20,30);

	}

}
