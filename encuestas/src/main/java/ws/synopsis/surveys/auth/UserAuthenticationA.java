package ws.synopsis.surveys.auth;

import ws.synopsis.surveys.utils.AdminDB;
import ws.synopsis.surveys.utils.HashingUtil; 

public class UserAuthenticationA {
	public static boolean authenticateUser(String username, String password) {
		boolean isCorrect = false;
		
		password = HashingUtil.shaw256(password);
		String actualPassword = AdminDB.getPasswordByUsername(username);
		
		if (password.equals(actualPassword)) {
			isCorrect = true;
		}
		return isCorrect;
	}
}
