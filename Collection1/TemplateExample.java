import java.util.ArrayList;

class MyStack<T extends Number,E>{
	T data;
	ArrayList<T> stackList = new ArrayList<>();
	
	public void push(T data){
		this.data = data;
		stackList.add(this.data);
		
	}
	public void pop(){
		System.out.println("Pop is "+stackList.remove(stackList.size()-1));
	}
	@Override
	public String toString() {
		return "MyStack [ stackList=" + stackList + "]";
	}
	
}
public class TemplateExample {

	public static void main(String[] args) {
		MyStack<Integer,String> myStack = new MyStack<>();
		myStack.push(10);
		myStack.push(20);
		System.out.println("Now the Stack is "+myStack);
		myStack.pop();
		System.out.println("After Pop "+myStack);
		MyStack<Double,String> myStack2 = new MyStack<>();

	}

}
