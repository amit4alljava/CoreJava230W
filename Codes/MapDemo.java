import java.util.ArrayList;
import java.util.HashMap;


public class MapDemo {

	public static void main(String[] args) {
		HashMap<String,ArrayList<Integer>> phoneMap = new HashMap<>();
		ArrayList<Integer> phoneList = new ArrayList<>();
		phoneList.add(2222);
		phoneList.add(3333);
		phoneList.add(3333);
		
		phoneMap.put("ram", phoneList);
		ArrayList<Integer> phoneList2 = new ArrayList<>();
		phoneList2.add(42222);
		phoneList2.add(23333);
		phoneMap.put("shyam",phoneList2);
		//phoneMap.put("ram", 66666);
		//System.out.println(phoneMap);
		System.out.println(phoneMap.get("ram"));
		phoneMap.remove("ram");
	}

}
