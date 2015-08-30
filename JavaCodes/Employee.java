// Functionality
public class Employee {
	int id;  //Member Variables (Instance Variables)
	double salary;
	String name;
	
	void takeInput(int i , String n , double s){
		id = i;
		name = n;
		salary = s;
	}
	
	void print(){
		System.out.println("Id "+this.id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}

}
