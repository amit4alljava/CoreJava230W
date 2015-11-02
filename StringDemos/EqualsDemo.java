class Employee
{
	int id ;
	String name;
	 Employee(int id , String name) {
		this.id = id;
		this.name = name;
	}
	 
	 @Override
	 public boolean equals(Object o){
		 Employee e = (Employee)o;
		 if(this.id==e.id && this.name.equals(e.name) ){
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
}
public class EqualsDemo {

	public static void main(String[] args) {
		Employee ram1 =new Employee(1001, "Ram");
		Employee ram2 = new Employee(1001, "Ram");
		if(ram1.equals(ram2)){
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}

	}

}
