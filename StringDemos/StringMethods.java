
public class StringMethods {

	public static void main(String[] args) {
		String x = "Hello";
		System.out.println(x.length());
		char y = x.charAt(0);  // x[i]
		System.out.println(y);
		//System.out.println(x.toUpperCase());
		x = x.toUpperCase();
		System.out.println(x);
		x = "     Hello    Ram      ";
		System.out.println("["+x+"]");
		System.out.println("["+x.trim()+"]");
		x = "Hello How are you Ram";
		System.out.println(x.indexOf("l"));
		System.out.println(x.lastIndexOf("l"));
		System.out.println(x.contains("are"));
		x = "HEllo";
		System.out.println(x.equals("Hello"));
		System.out.println(x.equalsIgnoreCase("Hello"));
		x = "Mr Ram Kumar";
		System.out.println(x.startsWith("Mr"));
		System.out.println(x.endsWith("Kumar"));
		String y1 = x.substring(2);
		String y2 = x.substring(2,5);
		System.out.println(y2);
		String address="A-21, Shakti Nagar, Delhi-7";
		String array [] = address.split(",");
		for(String d : array){
			System.out.println(d);
		}
		
		

	}

}
