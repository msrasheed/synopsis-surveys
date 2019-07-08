package ws.synopsis.surveys.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.synopsis.surveys.auth.UserAuthenticationE;


public class loginE extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginE() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("loginE.java");
		
		HttpSession session = request.getSession(true);
		
		String username = (String) session.getAttribute("userName");
		String password = (String) session.getAttribute("password");
		
			
		
			
		if (UserAuthenticationE.authenticateUser(username, password)) {
				session.setMaxInactiveInterval(30 * 60); //the lines below still need adjustments
              response.sendRedirect("/encuestas/stuDash.html");
			}
		else {
				System.out.println("Wrong");
				response.sendRedirect("/encuestas/LogIn.jsp");
			}
	}
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}