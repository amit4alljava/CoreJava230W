import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

class SortByNamePerson implements Comparator<Person1>{

	@Override
	public int compare(Person1 o1, Person1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}

class Person1  implements Comparable<Person1>
{

	String name;
	int age;
	
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person1 o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
		//return this.age-o.age;
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

//***************************************************
class P{
	
}
class A11 extends P{
	
}
class B extends A11{ 
	
}
class C extends A11{
	
}
class K
{
	
}

// Wild Card - The Limitation of Generic is to hold only one type
// to overcome with this problem the solution is Wild Card
public class CollectionNewFeatures {
static void print2(ArrayList list){
		
	}
static void arrayExample(A11 x[]){
	
}
	static void print(ArrayList<A11> list){
		
	}
	static void nonGeneric(ArrayList list){
		list.add("Hello");
		list.add(10);
		list.add(20.90);
	}	
	static void wildCard(ArrayList<?> list){
		
	}
	static void wildCardSuper(ArrayList<? super A11> list){
		
	}
	static void wildCardExtends(ArrayList<? extends A11> list){
		
	}
	static void wildCardExtends2(ArrayList<? extends Serializable> list){
		
	}
	public static void main(String[] args) {
		C c[] = new C[10];
		arrayExample(c);
		ArrayList<P> pList = new ArrayList<>();
		ArrayList<A11> aList = new ArrayList<>();
		ArrayList<C> cList = new ArrayList<>();
		ArrayList<K> kList = new ArrayList<>();
		cList.add(new C());
		wildCardExtends(cList);
		wildCardSuper(pList);
		wildCard(pList);
		wildCard(aList);
		wildCard(cList);
		wildCard(kList);
		ArrayList nonGenericList = new ArrayList();
		nonGenericList.add(new C());
		nonGenericList.add(new B());
		nonGenericList.add(new A11());
		nonGenericList.add(new K());
		nonGeneric(nonGenericList);
		//wildCardExtends(kList);
		
		//cList.add(new B());
		/*Queue<Person1> queue = new PriorityQueue<>(new SortByNamePerson());
		queue.add(new Person1("ram",21));
		queue.add(new Person1("shyam",22));
		queue.add(new Person1("mike",23));
		queue.add(new Person1("sohan",24));
		System.out.println(queue);
		*/
		// Generics
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		//intList.add(20.20);
		ArrayList list = new ArrayList();
		list.add(10); // list.add(new Integer(10));
		list.add("Hello");
		list.add(20.90);
		double d = (double)list.get(2);
	
	}

}
