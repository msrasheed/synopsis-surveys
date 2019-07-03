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

import ws.synopsis.surveys.model.Coffeebean;
import ws.synopsis.surveys.utils.EstudianteDB;

/**
 * Servlet implementation class coffee
 */
public class Coffeeinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Coffeeinsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("I am in insert mode");
		String curso = request.getParameter("curso");
		String instructor = request.getParameter("instructor");
		System.out.println(instructor);
		int rate1 = Integer.parseInt(request.getParameter("rate1"));
		System.out.println(rate1);
		int rate2 = Integer.parseInt(request.getParameter("rate2"));
		int rate3 = Integer.parseInt(request.getParameter("rate3"));
		int rate4 = Integer.parseInt(request.getParameter("rate4"));
		int rate5 = Integer.parseInt(request.getParameter("rate5"));
		String mejoraria = request.getParameter("mejoraria");
		Coffeebean result = new Coffeebean(curso, instructor, rate1, rate2, rate3, rate4, rate5, mejoraria); 
		EstudianteDB.insertCoffee(result);
		request.setAttribute("result", result);
		
		
		response.sendRedirect("/encuestas/stuDash/stuDash.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
