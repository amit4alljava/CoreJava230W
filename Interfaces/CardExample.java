interface ICreditCard
{
	// public abstract void points();
	void points();
	void paymentPlan();
}
abstract class CreditCard implements ICreditCard{
	@Override
	public void points(){
		System.out.println("Common Points Logic...");
	}
}
class GoldCard extends CreditCard{
	@Override
	public void paymentPlan(){
		System.out.println("Payment can be made in 90 days");
	}
}
class Silver extends CreditCard{
	@Override
	public void paymentPlan(){
		System.out.println("Payment can be made in 60 days");
	}
}
public class CardExample {

	public static void main(String[] args) {
		ICreditCard card = new Silver();
		card.points();
		card.paymentPlan();

	}

}
