import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;


public class ConcurrentCollections {

	public static void main(String[] args) {
		// 1.6
		CopyOnWriteArrayList<Integer> x = new CopyOnWriteArrayList<>();
		//ArrayList<Integer> x = new ArrayList<>();
		x.add(10);
		x.add(20);
		x.add(30);
		for(int i : x){
			System.out.println(i);
			x.add(9000);
		}
		System.out.println("After Loop "+x);
		System.out.println("NAV Example");
		NavigableSet<Integer> nav = new TreeSet<Integer>();
		nav.add(100);
		nav.add(10);
		nav.add(200);
		nav.add(20);
		nav.add(21);
		nav.add(22);
		nav.add(30);
		System.out.println(nav.ceiling(23));
		System.out.println(nav.floor(23));
		System.out.println(nav.first());
		System.out.println(nav.last());
		System.out.println(nav.higher(30));
		System.out.println(nav.lower(20));
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		List list2 = Collections.synchronizedList(list);
		

	}

}
