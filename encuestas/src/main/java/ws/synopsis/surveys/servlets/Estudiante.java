package ws.synopsis.surveys.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.synopsis.surveys.model.User;
import ws.synopsis.surveys.utils.EstudianteDB;

/**
 * Servlet implementation class Estudiante
 */
public class Estudiante extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Estudiante() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String userName = request.getParameter("userName");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String compania = request.getParameter("compania");
		String cargo = request.getParameter("cargo");
		User estudiante = new User(nombre, apellido, userName, correo, telefono, compania, cargo); 
		EstudianteDB.insertEstudiante(estudiante);
	}


	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}



	

	


}
