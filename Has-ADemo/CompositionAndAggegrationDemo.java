class Emp{
	int id;
	String name;
	Dept dept;
	Emp(Dept dept){
		System.out.println("Emp Cons Call");
		this.dept = dept;
		//dept = new Dept();
	}
	protected void finalize(){
		System.out.println("Gud Bye Employee");
	}
}
class Dept {//extends Object{
	int deptNo;
	Dept(){
		System.out.println("Dept Cons Call");
	}
	@Override
	protected void finalize(){
		System.out.println("Gud Bye Dept");
	}
}
public class CompositionAndAggegrationDemo {

	public static void main(String[] args) {
		Dept dept = new Dept();
		Emp ram = new Emp(dept);
		ram = null;
		System.gc();
		for(int i = 1 ; i<=10; i++){
			System.out.println("I is "+i);
		}

	}

}
