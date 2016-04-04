import java.io.Serializable;
import java.util.ArrayList;

class TT implements Serializable{
	
}
class TTT {
	
}

class Q
{
	
}
class PP extends Q
{
	
}
class PPP extends Q
{
	
}

public class WildCard {
	static void print6(ArrayList<?> list){
		System.out.println(list);
	}
	static void print4(ArrayList<? super PP> list){
		System.out.println(list);
	}
	static void print5(ArrayList<? extends Q> list){
		System.out.println(list);
	}
	static void print3(ArrayList<? super Integer> list){
		System.out.println(list);
	}
	static void print(ArrayList<? extends Number> list){
		System.out.println(list);
	}
	static void print2(ArrayList<? extends Serializable> list){
		System.out.println(list);
	}
	public static void main(String[] args) {
		ArrayList<Float> floatList= new ArrayList<>();
		ArrayList<Integer> intList= new ArrayList<>();
		ArrayList<String> strList= new ArrayList<>();
		floatList.add(90.99f);
		print(floatList);
		print(intList);
		//print(strList);
		ArrayList<TT> ttList = new ArrayList<>();
		print2(ttList);
		ArrayList<TTT> tttList = new ArrayList<>();
		
		print3(intList);
		print6(strList);
		print6(intList);
		//print3(floatList);
		//print2(tttList);

	}

}
