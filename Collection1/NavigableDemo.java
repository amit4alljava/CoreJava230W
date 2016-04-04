import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;


public class NavigableDemo {

	public static void main(String[] args) {
		NavigableSet<Integer> nav = new TreeSet<>();
		nav.add(10);
		nav.add(20);
		nav.add(30);
		nav.add(1);
		nav.add(2);
		System.out.println(nav.ceiling(10));  // >=
		System.out.println(nav.higher(30));  //>
		System.out.println(nav.floor(2));  // <=
		System.out.println(nav.lower(2)); // <
		System.out.println(nav);
		
		

	}

}
