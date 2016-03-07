import java.util.ArrayList;
import java.util.Collections;


public class Demo2 {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>(1000);
		list.add("Hello");
		list.add(0,"Bye");
		list.remove(0);
		
		int index = list.indexOf("Hi");
		String prevValue = list.get(index);
		list.set(index, "Hello...");
		Collections.sort(list);
		if(list.contains("Hi")){
			System.out.println("Found...");
		}
		else
		{
			System.out.println("Not Found...");
		}
		System.out.println(list.size());
		list.trimToSize();
		//list.clear();
		//list.add(100);
		//list.add(true);
		// 1.4
		//list.add(new Integer(10));
		//list.add(new Boolean(true));
		String val =(String) list.get(0);
		System.out.println(val);

	}

}
