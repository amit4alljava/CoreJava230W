class Parent
{
	Parent(){
		System.out.println("Parent Class Default Cons");
	}
	Parent(int x){
		this();
		System.out.println("Parent Class Param Cons");
	}
}
class Child extends Parent
{
	Child(){
		//this(55);
		super(555);
		//super();
		System.out.println("Child Class Default Cons");
	}
	Child(int x){
		this();
		//super(888);
		System.out.println("Child Class Param Cons");
	}
}
public class ConstructorChain {

	public static void main(String[] args) {
		Child obj = new Child(8888);

	}

}
