package ws.synopsis.surveys.auth;

public class UserAuthenticationI {
	public static boolean authenticateUser(String username, String password) {
		boolean isCorrect = false;
		
		if (username != null && password != null && 
				!username.equals("") && !password.equals("")) {
			isCorrect = true;
		}
		
		return isCorrect;
	}
}
