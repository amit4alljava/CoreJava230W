 class X
{
	int a ;
	final int  b;
	X(){
		b = 200;
	}
	 void show(){
		System.out.println("X Show");
	}
	//final void print(){
	 void print(){
		System.out.println("X Print");
	}
}
class Y extends X
{
	void disp(){
		System.out.println("Y Disp");
	}
	void show(int x){
		System.out.println("Y Show");
	}
	@Override
	void print(){
		System.out.println("Y Print");
	}
}
public class UpcastingTest {

	public static void main(String[] args) {
		X obj = new Y();
		obj.print();
		obj.show();
		if(obj instanceof Y){
		Y obj2 = (Y) obj;
		obj2.disp();
		}

	}

}
