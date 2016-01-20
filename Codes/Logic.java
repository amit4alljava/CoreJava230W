
public class Logic {
	public int add(int x , int y){
		return x + y;
	}
	public int add(String x , String y){
		int a = 0;
		int b = 0;
		try{
			a = Integer.parseInt(x);
		}
		catch(NumberFormatException e){
			a=0;
		}
		try{
			b = Integer.parseInt(y);
		}
		catch(NumberFormatException e){
			b=0;
		}
		return a+b;
	}
}
