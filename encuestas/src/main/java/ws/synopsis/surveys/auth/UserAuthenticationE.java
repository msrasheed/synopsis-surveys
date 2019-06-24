package ws.synopsis.surveys.auth;


import ws.synopsis.surveys.utils.EstudianteDB; 
import ws.synopsis.surveys.utils.HashingUtil;

public class UserAuthenticationE{

	public static boolean authenticateUser(String username, String password) {
		boolean isCorrect = false;
		
		password = HashingUtil.shaw256(password);
		String actualPassword = EstudianteDB.getPasswordByUsername(username);//student DB pending
		System.out.println("Success bitch");
		if (password.equals(actualPassword)) {
			isCorrect = true;
		}
		return isCorrect;

	}
	
}
