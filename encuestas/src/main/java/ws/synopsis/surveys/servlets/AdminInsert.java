package ws.synopsis.surveys.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.synopsis.surveys.model.*;
import ws.synopsis.surveys.utils.*; 

public class AdminInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AdminInsert() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AdminInsert.java");
		HttpSession session = request.getSession(true);
		
		String type = (String) session.getAttribute("type"); 
		
		if(type.equals("curso")) {
			Curso curso = new Curso();
			
			curso.setCourseId(request.getParameter("courseId"));
			curso.setCourseName(request.getParameter("courseName"));
			System.out.println(request.getParameter("courseName"));
			curso.setStartDate(request.getParameter("startDate"));
			curso.setEndDate(request.getParameter("endDate"));
			curso.setStartTime(request.getParameter("startTime"));
			curso.setEndTime(request.getParameter("endTime"));
			curso.setInstructor(request.getParameter("instructor"));
			
			
			AdminDB.insertCurso(curso);
			
		} else if (type.equals("instructor")) {
			Instructor instructor = new Instructor();
			
			instructor.setDNI(request.getParameter("DNI"));
			instructor.setUserType("instructor");
			instructor.setNombre(request.getParameter("nombre"));
			instructor.setApellido(request.getParameter("apellido"));
			instructor.setUsername(request.getParameter("userName"));
			instructor.setContrasena(HashingUtil.shaw256((request.getParameter("contrasena"))));
			instructor.setCorreo(request.getParameter("correo"));
			instructor.setTelefono(request.getParameter("telefono"));
			
			InstructorDB.insertInstructor(instructor);
			
		} else if (type.equals("aula")) {
			Aula aula = new Aula(); 
			
			aula.setNombre(request.getParameter("nombre"));
			aula.setUbicacion(request.getParameter("ubicacion"));
			
			AdminDB.insertAula(aula); 
			
		} else if (type.equals("empresa")) {
			Empresa empresa = new Empresa(); 
			
			empresa.setNombre(request.getParameter("nombre"));
			empresa.setUbicacion(request.getParameter("ubicacion"));
			empresa.setCorreo(request.getParameter("correo"));
			empresa.setTelefono(request.getParameter("telefono"));
			
			AdminDB.insertEmpresa(empresa); 
		}
	
		response.sendRedirect("/encuestas/adminDash.html"); //tb created
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
