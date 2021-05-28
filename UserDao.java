package in.sankarvinoth.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.sankarvinoth.model.User;
import in.sankarvinoth.util.Connection.ConnectionUtil;

public class UserDao {
	

	   private UserDao() {
		
	}

	public static void addUserToUserRegister(User user) throws ClassNotFoundException, SQLException {
		   String fullName=user.getFullName();
		   String userName=user.getUserName();
		   String email=user.getEmail();
		   Long mobileNumber=user.getPhoneNumber();
		   String password= user.getPassword();
		   Connection con=ConnectionUtil.getConnection();
		   
		   try {
			  
			   String sql = "insert into UserRegister (fullName,userName,email,mobileNumber,password) values(?,?,?,?,?)";
			   PreparedStatement pst= con.prepareStatement(sql);
			   pst.setString(1,fullName);
			   pst.setString(2,userName);
			   pst.setString(3,email);
			   pst.setLong(4,mobileNumber );
			   pst.setString(5,password);
			   pst.executeUpdate();
		     
		} catch (SQLException e) {
		e.printStackTrace();
		}
		   finally {
			   ConnectionUtil.close(con);
		   }
		   
		   
	   }
	 
	   
}
