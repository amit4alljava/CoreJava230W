

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream01 {

	public static void main(String[] args) {
		//WAP to Count those Numbers whose Greater than 10
		// Old Approach
		long counter = 0;
		List<Integer> list = Arrays.asList(10,90,78,34,1,8,3,5,55);
		for(int i : list){
			if(i>10){
				counter++;
			}
		}
		System.out.println("Counter is "+counter);
		
		// Java 8 Style
		list.stream().forEach((x)->System.out.println(x));
		counter = list.stream().filter((x)->x>10).count();
		System.out.println("Counter is "+counter);
		
		// Sum of Array Elements 
		list = Arrays.asList(1,2,3,4,1);
		System.out.println("Sum of ArrayElements "+list.stream().mapToInt(i->i).sum());
		System.out.println("Average "+list.stream().mapToInt(i->i).average());
		/*
		 * A stream does not store its elements. They may be stored in an underlying
			collection or generated on demand.
		 */
		//Optional<Integer> optional = list.stream().filter((x)->x>10).findAny();
		Optional<Integer> optional = list.stream().filter((x)->x>10).findFirst();
		if(optional.isPresent())
		{
			System.out.println(optional.get());
		}
		else
		{
			System.out.println("Not Present");
		}
		
		
	}

}
