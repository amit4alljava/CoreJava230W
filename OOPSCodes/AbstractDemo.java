abstract class Loan1
{
	Loan1(){
		System.out.println("Loan Cons");
	}
	abstract void emi();
	void applyForLoan(){
		System.out.println("Fill the Form");
	}
}
class HomeLoan extends Loan1
{
	HomeLoan(){
		super();
		System.out.println("HomeLoan Cons");
	}
	@Override
	void emi(){
		System.out.println("HomeLoan EMI 14%");
	}
}
class AutoLoan extends Loan1
{
	@Override
	void emi(){
		System.out.println("AutoLoan EMI 12%");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		//AutoLoan fiveYear = new AutoLoan();
		//Loan twoYear = new Loan();
		HomeLoan loan = new HomeLoan();
	}

}
