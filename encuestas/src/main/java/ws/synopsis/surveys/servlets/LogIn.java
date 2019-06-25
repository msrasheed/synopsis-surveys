package ws.synopsis.surveys.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogIn
 */
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		   
		   HttpSession session = request.getSession(true);
		   String userType = (String) session.getAttribute("userType"); 
		   System.out.println(userType); 
		   System.out.println("LogIn.java");
		   
		if (userType.equals("estudiante"))
			{		
			System.out.println(userType); 
			response.sendRedirect("/encuestas/loginE");
			}
			else if (userType.equals("instructor"))
			{
			response.sendRedirect("/encuestas/loginI");
			}
			else if (userType.equals("admin"))
			{
			response.sendRedirect("/encuestas/loginA");
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
