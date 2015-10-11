import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface W1
{
	void show();
	void print();
	public default void disp(){
		System.out.println("Interface Disp");
	}
}
abstract class CommonAdapter implements W1{
	public void show(){}
	public void print(){}
}
class W2 extends CommonAdapter{
	public void show(){
		/*WindowListener;
		WindowAdapter;*/
		System.out.println("W2 Show");
	}
}
class W3 extends  CommonAdapter{
	public void print(){
		System.out.println("W3 Print");
	}
}
public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
