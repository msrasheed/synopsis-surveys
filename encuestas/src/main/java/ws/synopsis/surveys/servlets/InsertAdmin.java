package ws.synopsis.surveys.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ws.synopsis.surveys.model.Admin;
import ws.synopsis.surveys.utils.HashingUtil;
import ws.synopsis.surveys.utils.AdminDB;


public class InsertAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public InsertAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("InsertAdmin.java");
		
		HttpSession session = request.getSession(true);
		
		Admin admin = new Admin();
		
		admin.setDNI(request.getParameter("DNI"));
		admin.setUserType((String) session.getAttribute("userType"));
		admin.setNombre(request.getParameter("nombre"));
		admin.setApellido(request.getParameter("apellido"));
		admin.setUsername(request.getParameter("userName"));
		admin.setContrasena(HashingUtil.shaw256((request.getParameter("contrasena"))));
		admin.setCorreo(request.getParameter("correo"));
		admin.setTelefono(request.getParameter("telefono"));
		
		AdminDB.insertAdmin(admin);
		
		
		System.out.println(session);
		
		session.setAttribute("username", request.getParameter("userName"));
		session.setAttribute("admin", admin);
	
		response.sendRedirect("/encuestas/adminDash.html");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
