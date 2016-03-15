import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.PreparedStatement;


public class LoginDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.nextLine();
		System.out.println("Enter the Password");
		String password = scanner.nextLine();
		System.out.println("Enter the PinCode");
		String pinCode = scanner.nextLine();
		// Step -1 Load the Driver (Class)
		// oracle.jdbc.driver.OracleDriver
		// org.postgresql.Driver
		Class.forName("com.mysql.jdbc.Driver");
		// Step - 2 Create Connection
		// jdbc:mysql://hostname:port/dbname
		// jdbc:oracle:thin:@hostname:portno:dbname
		Connection con = 
				DriverManager.
				getConnection("jdbc:mysql://localhost:3306/jdbc230","root","root");
		if(con!=null){	
			System.out.println("Connection Created...");
		}
		// Step - 3 Do Query
		//Statement stmt = con.createStatement();
		PreparedStatement stmt = con.prepareStatement("select userid,password,pincode from user_mst where userid=? and password=? and pincode=?");
		stmt.setString(1,userid);
		stmt.setString(2,password);
		stmt.setInt(3,Integer.parseInt(pinCode));
		// Step - 4 Query and Get the Result
		//ResultSet rs = stmt.executeQuery("select userid,password,pincode from user_mst where userid='"+userid+"' and password='"+password+"' and pincode="+pinCode);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()){
			System.out.println("Welcome "+userid);
		}
		else
		{
			System.out.println("Invalid Userid ");
		}
		/*while(rs.next()){
			System.out.println(rs.getInt("id")
					+" "+rs.getString("name")
					+" "+rs.getDouble("salary"));
		}*/
		// Step-5 Close all Resources
		rs.close();
		stmt.close();
		con.close();
				
				
				
				
				
				
				
				
				
				
				
	}

}
