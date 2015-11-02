import java.util.Scanner;


public class StringDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String data = scanner.next();
		StringBuffer sb = new StringBuffer(data);
		//for(int i = 0 ; i<data.length(); i++){
		for(int i = 0 ; i<sb.length(); i++){
			char e = sb.charAt(0);
			sb.append(e);
			sb.deleteCharAt(0);
			//data = data.substring(1)+data.charAt(0);
			System.out.println(sb);
		}
	}

}
