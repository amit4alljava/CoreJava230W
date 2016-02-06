import java.net.InetAddress;
import java.net.UnknownHostException;


public class IPTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet.getHostName());
		System.out.println(inet.getHostAddress());
		InetAddress inetArr[]= InetAddress
				.getAllByName("www.flipkart.com");
		for(InetAddress i : inetArr){
			System.out.println(i.getHostAddress());
		}

	}

}
