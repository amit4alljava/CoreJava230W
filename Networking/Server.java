import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9001);
		System.out.println("Waiting for Client");
		Socket socket = server.accept();
		System.out.println("Client Join the Server");
		OutputStream os = socket.getOutputStream();
		System.out.println("Enter the Data Send to Client");
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		os.write(data.getBytes());
		os.close();
		socket.close();
		scanner.close();
		System.out.println("Data Send....");
		
		
		
		
		
		
		
		
		
		
	}

}
