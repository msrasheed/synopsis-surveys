package ws.synopsis.surveys.auth;

import ws.synopsis.surveys.utils.InstructorDB;
import ws.synopsis.surveys.utils.HashingUtil;

public class UserAuthenticationI {
	public static boolean authenticateUser(String username, String password) {
		boolean isCorrect = false; 
		
		password = HashingUtil.shaw256(password);
		String actualPassword = InstructorDB.getPasswordByUsername(username);
		
		if (password.equals(actualPassword)) {
			isCorrect = true;
		}
		return isCorrect;
	}
}
