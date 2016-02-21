import java.util.ArrayList;
import java.util.HashSet;


public class Demo1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList(100);
		// Dynamic + No Duplicate + Sorted
		HashSet ts = new HashSet();
		//TreeSet ts = new TreeSet();
		//LinkedHashSet ts = new LinkedHashSet();
		for(int i = 20; i>=1; i--){
			ts.add(i*2);
		}
		//TreeSet ts = new TreeSet();
		/*ts.add("It's my life");
		ts.add("Bang Bang");
		ts.add("It's my life");
		ts.add("Boom Boom");*/
		System.out.println(ts);

	}

}
