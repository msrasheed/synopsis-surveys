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
		
	    String type = request.getParameter("type");
		String codigo = request.getParameter("codigo");
		String action = request.getParameter("action");
		System.out.println(type);
		System.out.println(codigo);
		System.out.println(action);
		session.setAttribute("type", type);
		session.setAttribute("action", action);
		
		if(type.equals("curso")) {
			if(action.equals("ver")) {
				Curso cosa = AdminDB.getCursobyCourseId(codigo);
				session.setAttribute("cosa", cosa);
				response.sendRedirect("/encuestas/AdminDisplay.jsp");
			}else if (action.equals("respuestas")) {
				String curso = codigo; 
				System.out.println(curso);
				List<Coffeebean> respuestas = AdminDB.getCoffeebeansbyCurso(curso);
				System.out.println("wb this?");
				System.out.println(respuestas);
				session.setAttribute("respuestas", respuestas);
				response.sendRedirect("/encuestas/AdminRespuestas.jsp");
			}
			
		} else if (type.equals("instructor")) {
			Instructor cosa = InstructorDB.getInstructorByUsername(codigo);
			session.setAttribute("cosa", cosa);
			response.sendRedirect("/encuestas/AdminDisplay.jsp");
		} else if (type.equals("aula")) {
			Aula cosa = AdminDB.getAulabyNombre(codigo);
			session.setAttribute("cosa", cosa);
			response.sendRedirect("/encuestas/AdminDisplay.jsp");
		} else if (type.equals("empresa")) {
			Empresa cosa = AdminDB.getEmpresabyNombre(codigo);
			session.setAttribute("cosa", cosa);
			response.sendRedirect("/encuestas/AdminDisplay.jsp");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
