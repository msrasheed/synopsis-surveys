package ws.synopsis.surveys.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.synopsis.surveys.auth.UserAuthenticationE;
import ws.synopsis.surveys.filters.LoginFilter;
import ws.synopsis.surveys.model.User;
import ws.synopsis.surveys.utils.EstudianteDB;

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
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletContext context = getServletContext();
		System.out.println("Entering Dashboard Servlet");
		System.out.println(context.getContextPath() + " " + context.getRealPath("stuDash.html"));
		
		String operation = request.getParameter("operation");
		
		if (operation == null || operation.equals("login")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			if (UserAuthenticationE.authenticateUser(username, password)) {
				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(30 * 60); //the lines below still need adjustments
//				session.setAttribute("Estudiante", estudiante);
//				request.setAttribute("Estudiante", estudiante);
				System.out.println("Dashboard serving dashboard"); //This chunk
				getServletContext().getRequestDispatcher("/app/stuDash/stuDash.html").forward(request, response);
			}
			else {
				System.out.println("Dashboard Rediricting to login");
				response.sendRedirect("/surveys/loginE ");
			}
		}
		else if (operation.equals("logout")) {
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect("/surveys/index.htm");
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