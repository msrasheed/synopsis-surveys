package ws.synopsis.surveys.servlets; 

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.synopsis.surveys.model.User;
import ws.synopsis.surveys.utils.EstudianteDB;

/**
 * Servlet implementation class Instructor
 */
public class Instructor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Instructor() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String DNI = request.getParameter("DNI");
		String userType = request.getParameter("userType");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String userName = request.getParameter("userName");
		String contrasena = request.getParameter("contrasena");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String compania = request.getParameter("compania");
		String cargo = request.getParameter("cargo");
		User estudiante = new User(DNI, userType, nombre, apellido, userName, contrasena, correo, telefono, compania, cargo);
		EstudianteDB.insertEstudiante(estudiante);
	}


	public Object getPassword() {
		// tbh i don't want this, but added it so it would compile
		return null;
	}



	

	


}
