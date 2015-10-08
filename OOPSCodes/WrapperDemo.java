import java.util.LinkedList;


public class WrapperDemo {

	public static void main(String[] args) {
		//1.5 AutoBoxing
		// 1.4
		Integer x = new Integer(1000);
		Integer y = new Integer(2000);
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(l.get(0) + l.get(1));
		//l.add(x);
		//l.addFirst(y);
		int z1= x.intValue() + y.intValue();
		Integer z = new Integer(z1);
		l.add(z);
		/*int x = 100;
		Integer y = x;  // Boxing
		Integer z = 200;
		int w = y.intValue();*/   // UnBoxing

	}

}
