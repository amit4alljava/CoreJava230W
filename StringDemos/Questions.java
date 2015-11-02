import java.util.Scanner;


public class Questions {

	public static void main(String[] args) {
		String tempString = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = scanner.next();
		StringBuffer sb = new StringBuffer(name);
		StringBuffer sb2 = new StringBuffer(name);
		sb2.reverse();
		/*name.substring(name.length()-1,0);*/
		/*for(int i = name.length()-1 ; i>=0 ; i--){
			tempString = tempString + name.charAt(i);
			//System.out.print(name.charAt(i));
		}*/
		System.out.println("Sb "+sb.length()+" sb2 "+sb2.length());
		if(sb.toString().equals(sb2.toString())){
			System.out.println("Same String");
		}
		else
		{
			System.out.println("Not Same String");
		}
	}

}
