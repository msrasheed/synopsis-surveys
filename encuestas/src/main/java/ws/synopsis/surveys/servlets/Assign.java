package ws.synopsis.surveys.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.synopsis.surveys.model.Attendance;
import ws.synopsis.surveys.utils.AdminDB;


/**
 * Servlet implementation class Assign
 */

public class Assign extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assign() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Attendance attendance = new Attendance();
		
		System.out.println("Did I do it?");
		attendance.setNombre(request.getParameter("nombre"));
		attendance.setApellido(request.getParameter("apellido"));
		attendance.setStartdate(request.getParameter("startdate"));
		attendance.setEndate(request.getParameter("endate"));
		attendance.setAula(request.getParameter("aula"));
		attendance.setCoursecode(request.getParameter("coursecode"));
		attendance.setCoursename(request.getParameter("coursename"));
		attendance.setInstructor(request.getParameter("instructor"));	
		attendance.setHora(request.getParameter("hora"));
		AdminDB.insertAttendance(attendance);
		response.sendRedirect("/encuestas/adminDash.html");
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
