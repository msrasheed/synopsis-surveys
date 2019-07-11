package ws.synopsis.surveys.servlets;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.synopsis.surveys.model.Redbean;
import ws.synopsis.surveys.utils.EstudianteDB;

/**
 * Servlet implementation class coffee
 */
public class Redinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Redinsert() {
        super();
        // TODO Auto-genepreguntad constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-genepreguntad method stub
		System.out.println("I am in insert mode");
		int pregunta1 = Integer.parseInt(request.getParameter("pregunta1"));
		int pregunta2 = Integer.parseInt(request.getParameter("pregunta2"));
		int pregunta3 = Integer.parseInt(request.getParameter("pregunta3"));
		int pregunta4 = Integer.parseInt(request.getParameter("pregunta4"));
		int pregunta5 = Integer.parseInt(request.getParameter("pregunta5"));
		int pregunta6 = Integer.parseInt(request.getParameter("pregunta6"));
		int pregunta7 = Integer.parseInt(request.getParameter("pregunta7"));
		int pregunta8 = Integer.parseInt(request.getParameter("pregunta8"));
		int pregunta9 = Integer.parseInt(request.getParameter("pregunta9"));
		int pregunta10 = Integer.parseInt(request.getParameter("pregunta10"));
		int pregunta11 = Integer.parseInt(request.getParameter("pregunta11"));
		int pregunta12 = Integer.parseInt(request.getParameter("pregunta12"));
		String mejoraria12 = request.getParameter("mejoraria12");
		int pregunta13 = Integer.parseInt(request.getParameter("pregunta13"));
		int pregunta14 = Integer.parseInt(request.getParameter("pregunta14"));
		int pregunta15 = Integer.parseInt(request.getParameter("pregunta15"));
		String pregunta16 = request.getParameter("pregunta16");
		Redbean result = new Redbean(pregunta1, pregunta2, pregunta3, pregunta4, pregunta5, pregunta6, pregunta7, pregunta8, pregunta9, pregunta10, pregunta11, pregunta12, mejoraria12, pregunta13, pregunta14, pregunta15, pregunta16); 
		EstudianteDB.insertRed(result);
		request.setAttribute("result", result);
		
		
		response.sendRedirect("/encuestas/login/stuDash.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-genepreguntad method stub
		doGet(request, response);
	}

}
