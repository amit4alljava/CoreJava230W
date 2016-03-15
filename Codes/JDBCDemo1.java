import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBCDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Salary to Search");
		String salary = scanner.next();
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
		Statement stmt = con.createStatement();
		// Step - 4 Query and Get the Result
		ResultSet rs = stmt.executeQuery("select id,name,salary from employee where salary>"+salary);
		// Loop till there is Row in ResultSet
		while(rs.next()){
			System.out.println(rs.getInt("id")
					+" "+rs.getString("name")
					+" "+rs.getDouble("salary"));
		}
		// Step-5 Close all Resources
		rs.close();
		stmt.close();
		con.close();
				
				
				
				
				
				
				
				
				
				
				
	}

}
