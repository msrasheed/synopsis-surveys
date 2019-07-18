package ws.synopsis.surveys.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.synopsis.surveys.model.*;
import ws.synopsis.surveys.utils.*; 
/**
 * Servlet implementation class AdminView
 * 
 * This servlet retrieves the requested object from the appropriate database table and stores it in the session 
 * object to be displayed on the next jsp AdminDisplay.jsp
 * 
 * I also set it up to retrieve the survey responses and send them to the jsp AdminRespuestas.jsp but I have 
 * yet to get this to work properly
 * 
 * 
 */
public class AdminView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AdminView() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("AdminView.java");
		
		HttpSession session = request.getSession(true);
		String userType = (String) session.getAttribute("userType");
	    String type = request.getParameter("type");
		String action = request.getParameter("action");
		String codigo = null;
		if(userType.equals("estudiante")||userType.equals("instructor")){
			   codigo = (String) session.getAttribute("userName");
		   }else{
		   		codigo = (String) request.getParameter("codigo");
		   }
		System.out.println(type);
		System.out.println(codigo);
		System.out.println(action);
		session.setAttribute("type", type);
		session.setAttribute("action", action);
		session.setAttribute("codigo", codigo);
		
		if(type.equals("curso")) {
			if(action.equals("ver")) {
				Curso cosa = AdminDB.getCursobyCourseId(codigo);
				session.setAttribute("cosa", cosa);
				response.sendRedirect("/encuestas/login/AdminDisplay.jsp");
			}else if (action.equals("respuestas")) {
				String curso = codigo; 
				System.out.println(curso);
				List<Coffeebean> respuestas = AdminDB.getCoffeebeansbyCurso(curso);
				System.out.println("wb this?");
				System.out.println(respuestas);
				session.setAttribute("respuestas", respuestas);
				response.sendRedirect("/encuestas/login/AdminRespuestas.jsp");
			}
		} else if (type.equals("estudiante")) {
			Estudiante cosa = EstudianteDB.getEstudianteByUsername(codigo);
			session.setAttribute("cosa", cosa);
			response.sendRedirect("/encuestas/login/AdminDisplay.jsp");
		} else if (type.equals("instructor")) {
			Instructor cosa = InstructorDB.getInstructorByUsername(codigo);
			session.setAttribute("cosa", cosa);
			response.sendRedirect("/encuestas/login/AdminDisplay.jsp");
		} else if (type.equals("admin")) {
			System.out.println("i'm an admin");
			Admin cosa = AdminDB.getAdminByUsername(codigo);
			session.setAttribute("cosa", cosa);
			response.sendRedirect("/encuestas/login/AdminDisplay.jsp");
		} else if (type.equals("aula")) {
			Aula cosa = AdminDB.getAulabyNombre(codigo);
			session.setAttribute("cosa", cosa);
			response.sendRedirect("/encuestas/login/AdminDisplay.jsp");
		} else if (type.equals("empresa")) {
			Empresa cosa = AdminDB.getEmpresabyNombre(codigo);
			session.setAttribute("cosa", cosa);
			response.sendRedirect("/encuestas/login/AdminDisplay.jsp");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
