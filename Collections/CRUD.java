import java.util.ArrayList;

class Customer{
	private int id;
	private String name;
	private String city;
	Customer(int id ,String name, String city){
		this.id = id;
		this.name = name;
		this.city =city;
	}
	public boolean equals(Object o){
		Customer c = (Customer)o;
		if(this.id==c.id && this.name.equals(c.name) 
				&& this.city.equals(c.city)){
			return true;
		}
		else{
			return false;
		}
		
		
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
public class CRUD {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("mike");
		list.add("tom");
		/*if(list.contains("mike")){
			System.out.println("Mike Found...");
		}
		else
		{
			
			System.out.println("Not Found..");
		}*/
		//System.out.println(list);
		String a = "Hello";
		System.out.println(a.toString());
		System.out.println(a);
		
		ArrayList<Customer> customerList = new ArrayList<>();
		Customer mike = new Customer(1001,"Mike","LA");
		//System.out.println(mike.toString());
		//System.out.println(mike);
		customerList.add(mike);
		Customer tom = new Customer(1002,"Tom","NY");
		customerList.add(tom);
		System.out.println(customerList);
		Customer searchCustomer = new Customer(0,"Tom",null);
		if(customerList.contains(searchCustomer)){
			System.out.println("Found..");
		}
		else
		{
			System.out.println("Not Found..");
		}
		
		
	}

}







