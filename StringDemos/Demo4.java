
public class Demo4 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(4444);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("gfgd75567567567567657567567567567657567675fgdfgdfgdfgdfgdfgdg");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		/*sb.append("TT");
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/
	}

}
