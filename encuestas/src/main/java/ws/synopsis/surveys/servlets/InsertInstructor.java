package ws.synopsis.surveys.servlets; 

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.synopsis.surveys.model.Instructor;
import ws.synopsis.surveys.utils.HashingUtil;
import ws.synopsis.surveys.utils.InstructorDB;

/**
 * Servlet implementation class InsertInstructor
 * 
 * This servlet takes in information about new instructors and inserts it into the database table for 
 * instructors. Then takes you back to the instructor Dash
 * 
 */
public class InsertInstructor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public InsertInstructor() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("InsertInstructor.java");
		
		HttpSession session = request.getSession(true);
		
		Instructor instructor = new Instructor();
		
		instructor.setDNI(request.getParameter("DNI"));
		instructor.setUserType((String) session.getAttribute("userType"));
		instructor.setNombre(request.getParameter("nombre"));
		instructor.setApellido(request.getParameter("apellido"));
		instructor.setUsername(request.getParameter("userName"));
		instructor.setContrasena(HashingUtil.shaw256((request.getParameter("contrasena"))));
		instructor.setCorreo(request.getParameter("correo"));
		instructor.setTelefono(request.getParameter("telefono"));
		
		InstructorDB.insertInstructor(instructor);
		
		
		System.out.println(session);
		
		session.setAttribute("username", request.getParameter("userName"));
		session.setAttribute("instructor", instructor);
	
		response.sendRedirect("/encuestas/insDash.html");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public Object getPassword() {
		// tbh i don't want this, but added it so it would compile
		return null;
	}



	

	


}
