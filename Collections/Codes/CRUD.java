import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class SortByName implements Comparator<Customer>{
	public int compare(Customer first,Customer second){
		return first.getName().
				compareToIgnoreCase(second.getName());
	}
}
class SortById implements Comparator<Customer>{
	public int compare(Customer first, Customer second){
		return ((Integer)first.getId())
				.compareTo(second.getId());
	}
}
class Customer implements Comparable<Customer>{
	private int id;
	private String name;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	Customer(int id ,String name, String city){
		this.id = id;
		this.name = name;
		this.city =city;
	}
	@Override
	public int compareTo(Customer o){
		//Customer c = (Customer)o;
		return o.name.compareToIgnoreCase(this.name);
		//return this.name.compareToIgnoreCase(o.name);
		//return ((Integer)this.id).compareTo(o.id);
	}
/*	@Override
	public int compareTo(Object o){
		Customer c = (Customer)o;
		return ((Integer)this.id).compareTo(c.id);
	}*/
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
		Customer amit = new Customer(1000,"amit","IN");
		customerList.add(amit);
		Customer tom = new Customer(1002,"Tom","NY");
		customerList.add(tom);
		Customer mike = new Customer(1001,"Mike","LA");
		//System.out.println(mike.toString());
		//System.out.println(mike);
		customerList.add(mike);
		
		System.out.println(customerList);
		System.out.println("After Sort");
		//Collections.sort(customerList,new SortByName());
		/*Collections.sort(customerList
				,new Comparator<Customer>() {
	public int compare(Customer first,Customer second){
	return first.getCity().
						compareTo(second.getCity());
			}
		});*/
		Collections.sort(customerList,(first,second)->{
			return first.getCity().compareTo(second.getCity());	
		});
		System.out.println("Now "+customerList);
		/*Customer searchCustomer = new Customer(0,"Tom",null);
		int index = customerList.indexOf(searchCustomer);
		//if(customerList.contains(searchCustomer)){
			if(index>=0){
				//customerList.remove(index);
				customerList.set(index, new Customer(1001,"Kim","Delhi"));
			System.out.println("Found..");
		}
		else
		{
			System.out.println("Not Found..");
		}
		*/
		
	}

}







