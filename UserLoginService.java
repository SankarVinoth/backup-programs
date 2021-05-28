package in.sankarvinoth.service;

import in.sankarvinoth.model.User;
import in.sankarvinoth.util.validator.UserInputValidator;
import in.sankarvinoth.util.validator.UserValidator;

public class UserLoginService {
	public static boolean userLogin(User user) {
		boolean isValidLogin=false;
		boolean isValidInputs = UserInputValidator.usernameAndPasswordValidation(user.getUserName(),user.getPassword());
		boolean isValidUser=UserValidator.userValidation(user);
		if(isValidInputs) {
			if(isValidUser) {
				isValidLogin=false;
			}
		
		else {
			isValidLogin=true;
		}
		}
		return isValidLogin;
	}
}
