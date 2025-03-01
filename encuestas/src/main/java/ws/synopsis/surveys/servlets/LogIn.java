package ws.synopsis.surveys.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ws.synopsis.surveys.model.*;
import ws.synopsis.surveys.utils.*;

import ws.synopsis.surveys.auth.UserAuthentication;


public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 
     * First, users are authenticated using the authenticateUser method in the userAuthentication class. This 
     * method takes the username, password, and userType, since the log in information will be stored on different
     * tables in the database depending on userType
     * 
     * After a successful log in, the userbean information is retrieved using the get___byUsername method in
     * the appropriate _____DB class. This user object is then stored in the session object for later use. 
     * 
     * After this page, we are redirected to the appropriate dash board.
     * 
     * If the log in attempt is failed, we are redirected to the first jsp LogInEIA.jsp
     * 
     */
    public LogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("LogIn.java");
		
		HttpSession session = request.getSession(true);
		
		String userType = (String) session.getAttribute("userType");
		
		String username = request.getParameter("username");
		String password = request.getParameter("contrasena");
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		

		if (UserAuthentication.authenticateUser(username, password, userType)) {
				session.setMaxInactiveInterval(30 * 60); //the lines below still need adjustments
				System.out.println(username);
				System.out.println(userType);
				if(userType.equals("estudiante")) 
				{
					Estudiante estudiante = EstudianteDB.getEstudianteByUsername(username);
					session.setAttribute("cosa",estudiante);
					response.sendRedirect("/encuestas/login/stuDash.jsp");
				}
				else if (userType.equals("instructor")) 
				{
					Instructor instructor = InstructorDB.getInstructorByUsername(username);
					session.setAttribute("cosa", instructor);
		            response.sendRedirect("/encuestas/login/insDash.jsp");
				}
				else if (userType.equals("admin")) 
				{
					Admin admin = AdminDB.getAdminByUsername(username);
					session.setAttribute("cosa",admin);
					response.sendRedirect("/encuestas/login/adminDash.jsp");
				}
				  
				  
			}
		else {
				System.out.println("Wrong");
				response.sendRedirect("/encuestas/LogInEIA.jsp");
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
