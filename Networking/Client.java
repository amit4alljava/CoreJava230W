import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String serverIP = "localhost";
		int serverport  = 9001;
		Socket socket = new Socket(serverIP,serverport);
		InputStream is = socket.getInputStream();
		System.out.println("Client Comes");
		int singleChar = is.read();
		while(singleChar!=-1){
			System.out.print((char)singleChar);
			singleChar = is.read();
		}
		socket.close();
		
		
		
		
		
	}

}
