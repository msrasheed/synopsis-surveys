package ws.synopsis.surveys.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.synopsis.surveys.model.User;
import ws.synopsis.surveys.utils.EstudianteDB;
import ws.synopsis.surveys.utils.HashingUtil;

/**
 * Servlet implementation class Estudiante
 */
public class MergeEstudiante extends HttpServlet {
	
		
	private static final long serialVersionUID = 1L;
       
   
    public MergeEstudiante() { 
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Estudiante.java");
		
		User estudiante = new User();
		
		estudiante.setDNI(request.getParameter("DNI")); 
		estudiante.setuserType(request.getParameter("userType"));
		estudiante.setNombre(request.getParameter("nombre"));
		estudiante.setApellido(request.getParameter("apellido"));
		estudiante.setUserName(request.getParameter("userName"));
		estudiante.setContrasena(HashingUtil.shaw256((request.getParameter("contrasena"))));
		estudiante.setCorreo(request.getParameter("correo"));
		estudiante.setTelefono(request.getParameter("telefono"));
		estudiante.setEmpresa(request.getParameter("empresa"));
		estudiante.setCargo(request.getParameter("cargo"));
		
		
		EstudianteDB.mergeEstudiante(estudiante);
		
		System.out.println("maybe this worked??");
		
		HttpSession session = request.getSession(true);
		System.out.println(session);
		
		session.setAttribute("username", request.getParameter("userName"));
		session.setAttribute("estudiante", estudiante);
	
		response.sendRedirect("/encuestas/stuDash.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}




	

	
	}


