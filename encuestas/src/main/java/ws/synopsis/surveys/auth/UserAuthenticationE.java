package ws.synopsis.surveys.auth;


import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import ws.synopsis.surveys.utils.EstudianteDB; 
import ws.synopsis.surveys.utils.HashingUtil;

public class UserAuthenticationE{

	public static boolean authenticateUser(String username, String password) {

	boolean isCorrect = false;

		password = HashingUtil.shaw256(password);
		String actualPassword = EstudianteDB.getPasswordByUsername(username);//student DB pending
		System.out.println("Checking if username and password match and exist...");	
		if (password.equals(actualPassword)) {
			isCorrect = true;
		}
		System.out.println(isCorrect);
		return isCorrect;

	}
	
}
