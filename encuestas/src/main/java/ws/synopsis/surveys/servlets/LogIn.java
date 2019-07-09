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
		
		String username = request.getParameter("userName");
		String password = request.getParameter("contrasena");
		session.setAttribute("userName", username);
		session.setAttribute("password", password);
		

		if (UserAuthentication.authenticateUser(username, password, userType)) {
				session.setMaxInactiveInterval(30 * 60); //the lines below still need adjustments
				System.out.println(username);
				
				if(userType.equals("estudiante")) 
				{
					Estudiante estudiante = EstudianteDB.getEstudianteByUsername(username);
					session.setAttribute("estudiante",estudiante);
					response.sendRedirect("/encuestas/stuDash.html");
				}
				else if (userType.equals("instructor")) 
				{
					Instructor instructor = InstructorDB.getInstructorByUsername(username);
					session.setAttribute("instructor", instructor);
		            response.sendRedirect("/encuestas/insDash.html");
				}
				else if (userType.equals("admin")) 
				{
					Admin admin = AdminDB.getAdminByUsername(username);
					session.setAttribute("admin",admin);
					response.sendRedirect("/encuestas/adminDash.html");
				}
				  
				  
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
