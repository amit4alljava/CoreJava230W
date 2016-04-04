import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;


public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = 
				DriverManager.
				getConnection("jdbc:mysql://localhost:3306/jdbc230","root","root");
		PreparedStatement pstmt = con.prepareStatement("insert into employee (id,name,salary) values(?,?,?)");
		pstmt.setInt(1, 101);
		pstmt.setString(2,"KIM");
		pstmt.setDouble(3, 9999);
		int recCount = pstmt.executeUpdate();
		if(recCount>0){
			System.out.println("Added...");
		}
		else
		{
			System.out.println("Not Added...");
		}
		pstmt.close();
		con.close();

	}

}
