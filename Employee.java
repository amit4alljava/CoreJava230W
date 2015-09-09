// Functionality

// Instance Variables Must Be Private and Instance Methods must
// be public
public class Employee {
	private int id;  //Member Variables (Instance Variables)
	private double salary;
	private String name;
	private String companyName;
	
	Employee(){
		companyName = "TCS";
		/*id = 1001;
		name="Shyam";
		salary = 9090;*/
	}
	Employee(int id , String name , double salary){
		//Employee();
		this(); //Call the Default Constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void takeInput(int i , String n , double s){
		if(i>0 && s>0){
			id = i;
			name = n;
			salary = s;	
		}
		else
		{
			System.out.println("Invalid Data Can't Take this");
		}
		
	}
	
	public void print(){
		System.out.println("Company Name "+companyName);
		System.out.println("Id "+this.id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}

}
