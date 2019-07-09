package ws.synopsis.surveys.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.synopsis.surveys.model.Curso;
import ws.synopsis.surveys.utils.CursoDB; //tb created

public class InsertCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public InsertCurso() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("InsertCurso.java");
		
		Curso curso = new Curso();
		
		curso.setCourseId(request.getParameter("courseId"));
		curso.setCourseName(request.getParameter("courseName"));
		curso.setStartDate(request.getParameter("startDate"));
		curso.setEndDate(request.getParameter("endDate"));
		curso.setStartTime(request.getParameter("startTime"));
		curso.setEndTime(request.getParameter("endTime"));
		
		CursoDB.insertCurso(curso);
		
		System.out.println("?¿?¿?¿?");
		
		HttpSession session = request.getSession(true);
		System.out.println(session);
		
		session.setAttribute("courseId", request.getParameter("courseId"));
		session.setAttribute("curso", curso);
	
		response.sendRedirect("/encuestas/insDash.html"); //tb created
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
