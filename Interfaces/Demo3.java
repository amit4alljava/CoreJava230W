import java.util.Scanner;


public class Demo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First NO");
		int firstNo = scanner.nextInt();
		System.out.println("Enter the Second NO");
		int secondNo = scanner.nextInt();
		int result = firstNo + secondNo;
		System.out.println("Result is "+result);
		scanner.close();
	}

}
