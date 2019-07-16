package ws.synopsis.surveys.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.synopsis.surveys.model.*;
import ws.synopsis.surveys.utils.*; 
/*
This is the servlet that either creates a new object or edits an object that already exists depending on the value
of the "action" parameter. It first makes a new object given the parameters of the previous page, and depending on "action"
either adds it to the appropriate database table or merges the information with already existing information. 
Then we are redirected back to the adminDash.html 

*/
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
		String action = (String) session.getAttribute("action");
		System.out.println(action);
		
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
			
			if(action.equals("anadir")) {
				AdminDB.insertCurso(curso);
			}else if(action.equals("corregir")) {
				AdminDB.mergeCurso(curso);
			}
			
			
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
			
			if(action.equals("anadir")) {
				InstructorDB.insertInstructor(instructor);
			}else if(action.equals("corregir")) {
				InstructorDB.mergeInstructor(instructor);
			}
			
		} else if (type.equals("estudiante")) {
			Estudiante estudiante = new Estudiante();
			
			estudiante.setDNI(request.getParameter("DNI"));
			estudiante.setuserType("estudiante");
			estudiante.setNombre(request.getParameter("nombre"));
			estudiante.setApellido(request.getParameter("apellido"));
			estudiante.setUserName(request.getParameter("userName"));
			estudiante.setContrasena(HashingUtil.shaw256((request.getParameter("contrasena"))));
			estudiante.setCorreo(request.getParameter("correo"));
			estudiante.setTelefono(request.getParameter("telefono"));
			estudiante.setEmpresa(request.getParameter("empresa"));
			estudiante.setCargo(request.getParameter("cargo"));
			
			if(action.equals("anadir")) {
				EstudianteDB.insertEstudiante(estudiante);
			}else if(action.equals("corregir")) {
				EstudianteDB.mergeEstudiante(estudiante);
			}
			
		} else if (type.equals("aula")) {
			Aula aula = new Aula(); 
			
			aula.setNombre(request.getParameter("nombre"));
			aula.setUbicacion(request.getParameter("ubicacion"));
			
			if(action.equals("anadir")) {
				AdminDB.insertAula(aula); 
			}else if(action.equals("corregir")) {
				AdminDB.mergeAula(aula);
			}
			
		} else if (type.equals("empresa")) {
			Empresa empresa = new Empresa(); 
			
			empresa.setNombre(request.getParameter("nombre"));
			empresa.setUbicacion(request.getParameter("ubicacion"));
			empresa.setCorreo(request.getParameter("correo"));
			empresa.setTelefono(request.getParameter("telefono"));
			
			if(action.equals("anadir")) {
				AdminDB.insertEmpresa(empresa); 
			}else if(action.equals("corregir")) {
				AdminDB.mergeEmpresa(empresa);
			}
			
		}
	
		response.sendRedirect("/encuestas/adminDash.html"); //tb created
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
