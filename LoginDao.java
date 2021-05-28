package in.sankarvinoth.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import in.sankarvinoth.model.User;
import in.sankarvinoth.util.connection.ConnectionUtil;

public class LoginDao {
	
	private LoginDao() {
		
		
	}

	/**
	 * method to verify Login , whether the user is registered or not
	 * @param user
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static boolean  loginVerification(User user) throws ClassNotFoundException, SQLException {
		boolean status=false;
		//Long mobilenumber=user.getPhoneNumber();
		String userName=user.getUserName();
		String password=user.getPassword();
		// get the connection
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		    try {
		    	con = ConnectionUtil.getConnection();
			String sql = ("select * from UserRegister where userName='"+userName+"' and password ='"+password+"'"); 
		     st=con.createStatement();
			// execute the query
			 rs=st.executeQuery(sql);
			status=rs.next();
			
			}
		    catch (SQLException e) {
		    	e.printStackTrace();
			}
			   finally {
				   // close the connection
				   ConnectionUtil.close(con,st,rs);
			   }
			return status;
			   
		}
		
		
	
}
