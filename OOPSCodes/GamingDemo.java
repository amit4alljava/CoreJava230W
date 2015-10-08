// 100% Abstract (Java7)
interface SuperPower{
	void power();
}
abstract interface IPlayer{
	void jump();
	void attack(); // public abstract void attack();
}
class BlackPlayer implements IPlayer{

	@Override
	public void jump() {
		System.out.println("Jump Low");
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
}
class RedPlayer implements IPlayer,SuperPower{
	@Override
	public void jump(){
		System.out.println("Jump High");
	}
	@Override
	public void attack(){
		
	}
	@Override
	public void power() {
		// TODO Auto-generated method stub
		
	}
}
public class GamingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
