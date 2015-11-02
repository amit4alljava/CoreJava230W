
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("ramesh");
		sb.insert(0, "Mr");
		//sb.append(90);
		sb.delete(2, 4);
		sb.deleteCharAt(0);
		System.out.println(sb);
		System.out.println(sb.reverse());

	}

}
