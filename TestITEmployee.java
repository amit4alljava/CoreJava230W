
public class TestITEmployee {
public static void main(String[] args) {
	ITEmployee ram = new ITEmployee(1001, "Ram", 9000);
	ram.setSalary(12000);
	ram.setBonus(2000);
	System.out.println(ram.getBonus());
	System.out.println(ram.calculateNetSalary());
}
}
