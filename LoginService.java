package in.sankarvinoth.service;

import java.sql.SQLException;

import in.sankarvinoth.dao.LoginDao;
import in.sankarvinoth.model.User;

public class LoginService {
  
	public static boolean loginVerification(User user) throws ClassNotFoundException, SQLException {
		boolean isValid=false;
		boolean status=LoginDao.loginVerification(user);
		if(status) {
			isValid=true;
		}
		return isValid;
	
	}
}

