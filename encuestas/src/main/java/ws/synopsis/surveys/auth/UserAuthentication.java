package ws.synopsis.surveys.auth;

import ws.synopsis.surveys.utils.*;

import ws.synopsis.surveys.utils.HashingUtil;

public class UserAuthentication {
	public static boolean authenticateUser(String username, String password, String userType) {
		boolean isCorrect = false;
		
		String actualPassword = null;
		password = HashingUtil.shaw256(password);
		
		if(userType.equals("estudiante")) {
			actualPassword = EstudianteDB.getPasswordByUsername(username);
		}else if(userType.equals("instructor")){
			actualPassword = InstructorDB.getPasswordByUsername(username);
		}else if(userType.equals("admin")){
			actualPassword = AdminDB.getPasswordByUsername(username);
		}
		
		if (password.equals(actualPassword)) {
			isCorrect = true;
		}
		return isCorrect; 
	}
}
