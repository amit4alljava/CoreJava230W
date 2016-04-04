import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Stack<T extends Serializable,T2>{
	ArrayList<T> data= new ArrayList<>();;
	Map<T,T2> map = new HashMap<>();
	
	void push(T value, T2 value2){
		data.add(value);
		map.put(value, value2);
	}
	void peep(){
		System.out.println("Map is "+map);
		for(int i = data.size()-1; i>=0; i--){
			System.out.println(data.get(i));
		}
	}
}
public class TemplateDemo {

	public static void main(String[] args) {
		Stack<String,Double> stack1 = new Stack<>();
		stack1.push("hello", 90.20);
		//Stack<String> stack2 = new Stack<String>();
		//stack.push(10);
		//stack.push(20);
		//stack.push("Hello");
		stack1.peep();

	}

}
