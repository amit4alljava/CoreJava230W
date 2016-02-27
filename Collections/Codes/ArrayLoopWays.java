import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayLoopWays {
	 void evenOdd2(int i){
		
		if(i%2==0){
			System.out.println("Even "+i);
		}
		else
		{
			System.out.println("Odd "+i);
		}
	
}
	static void evenOdd(int i){
		
			if(i%2==0){
				System.out.println("Even "+i);
			}
			else
			{
				System.out.println("Odd "+i);
			}
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(100);
		numList.add(7);
		numList.add(300);
		numList.add(10);
		numList.add(9);
		// 1st Way
		/*int sum = 0;
		for(int i = 0; i<numList.size(); i++){
			sum = sum + numList.get(i);
			System.out.println(numList.get(i));
		}
		System.out.println("Sum is "+sum);*/
		// 2nd Way
		/*Iterator<Integer> i = numList.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			//i.remove();
		}*/
		// 3rd Way
		/*ListIterator<Integer> i= numList.listIterator();
		while(i.hasNext()){
			System.out.println(i.next());
			//i.remove();
		}
		System.out.println("**************");
		while(i.hasPrevious()){
			System.out.println(i.previous());
			//i.remove();
		}*/
		// 4th Way 
		/*for(Integer i : numList){
			System.out.println(i);
		}*/
		//5th Way
		//numList.forEach(ArrayLoopWays::evenOdd);
		ArrayLoopWays obj = new ArrayLoopWays();
		numList.forEach(obj::evenOdd2);
		
		
		
		
		
		
		
		
		

	}

}
