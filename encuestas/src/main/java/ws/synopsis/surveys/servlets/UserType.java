package ws.synopsis.surveys.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.synopsis.surveys.model.User;
//import ws.synopsis.surveys.model.User;
/**
 * Servlet implementation class UserType
 */
public class UserType extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserType() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userType = request.getParameter("userType");
//		System.out.println("asuh bitch");
//		System.out.println(userType);
		HttpSession session = request.getSession();
		session.setAttribute("userType", userType);
		response.sendRedirect("/encuestas/LogInE.jsp");
	    
//	    if (userType.equals("estudiante"))
//		{		
//		response.sendRedirect("/encuestas");
//		}
//		else if (userType.equals("instructor"))
//		{
//		response.sendRedirect("encuestas/");
//		}
//		else if (userType.equals("admin"))
//		{
//		response.sendRedirect("encuestas/");
//		}
		  
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
