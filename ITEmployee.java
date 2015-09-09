
public class ITEmployee {
	private int id;  //Data Hiding
	private String name; // Instance Var
	private double salary;
	private final int pf;
	private final String companyName;
	private String deptName;
	private double bonus;
	private String managerName;
	private String designation;
	private String phone;
	private String email;
	private String pinCode;
	public ITEmployee() {
		pf = 200;
		companyName="TCS";
	}
	// Local Var
	public ITEmployee(int id, String name, double salary){
		//ITEmployee();
		this();  // This will Default Cons
		this.id = id + pf;
		this.name = name;
		this.salary = salary;
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public int getPf() {
		return pf;
	}
	public String getCompanyName() {
		return companyName;
	}
	public double calculateNetSalary(){
		return calculateGrossSalary() - pf;
	}
	private double calculateGrossSalary(){
		return salary + calculateHra() + calculateDa() + calculateTa();
	}
	private double calculateHra(){
		return salary * 0.30;
	}
	private double calculateDa(){
		return salary * 0.20;
	}
	private double calculateTa(){
		return salary * 0.10;
	}
	

}










