import java.util.Scanner;


public class ScannerDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner("Hello How are you");
		while(s.hasNext()){
			System.out.println(s.next());
		}
	}

}
