import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public interface CommonDAO {
public static Connection getConnection() throws ClassNotFoundException, SQLException{
	ResourceBundle rb = ResourceBundle.getBundle("db");
	Class.forName(rb.getString("drivername"));
	Connection con = 
			DriverManager.
			getConnection(rb.getString("dburl"),rb.getString("userid"),rb.getString("password"));
	return con;
}
}
