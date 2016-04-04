import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
public boolean isUserExist(String userid, String password) throws SQLException, ClassNotFoundException{
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try{
		con= CommonDAO.getConnection();
		pstmt = con.prepareStatement("select * from user_mst where userid=? and password=?");
		pstmt.setString(1,userid);
		pstmt.setString(2,password);
		rs = pstmt.executeQuery();
		if(rs.next()){
			return true;
		}
	}
	
	finally{
		if(rs!=null){
		rs.close();
		}
		if(pstmt!=null){
			pstmt.close();
		}
		if(con!=null){
			con.close();
		}
	}
	return false;
}
}
