<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "ws.synopsis.surveys.model.User"%>
<%@ page import ="java.io.IOException"%>
<%@ page import ="javax.servlet.ServletException" %>
<%@ page import ="javax.servlet.http.HttpServlet" %>
<%@ page import ="javax.servlet.http.HttpServletRequest"%>
<%@ page import ="javax.servlet.http.HttpServletResponse"%>
<%@ page import= "ws.synopsis.surveys.model.User" %>
<%@ page import= "ws.synopsis.surveys.utils.EstudianteDB" %>
<%@ page import= "ws.synopsis.surveys.utils.EntityMan" %>
<%@ page import ="javax.persistence.*" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Info</title>
</head>
<body>

  <%

	String DNI = request.getParameter("DNI");
	String nombre = request.getParameter("nombre");
	String apellido = request.getParameter("apellido");
	String userName = request.getParameter("userName");
	String contrasena = request.getParameter("contrasena");
	String correo = request.getParameter("correo");
	String telefono = request.getParameter("telefono");
	String empresa = request.getParameter("empresa");
	String cargo = request.getParameter("cargo");
	User estudiante = new User(DNI, nombre, apellido, userName, contrasena, correo, telefono, empresa, cargo); 
	request.setAttribute("estudiante", estudiante);
	System.out.println(estudiante);
	EstudianteDB.insertEstudiante(estudiante);

	
  %>
<style>
h1{
font-size: 3em;
background-color: rgba(255,69,0,0.7);
margin:0;
padding-top:1000px;
text-align: center;
height: 300px;
}
div {
  font-family: "Lucia Console", "Courier New", monospace;
  font-size: 1.5em;
  line-height: 2;
  background-color: rgba(128,128,128,0.3);
}
* {
  box-sizing: border-box;
}
/* Create two unequal columns that floats next to each other */
.column {
  float: left;
  padding: 10px;
  
}
.left {
  width: 50%;
}
.right {
  width: 50%;
}
/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

</style>
	<jsp:useBean id="user" class="ws.synopsis.surveys.servlets.Estudiante">
<h1>
<img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style= "float:left">
<br>Por favor, verifica si esta informaci&oacuten es correcta
</h1>

<div id="CuentaNueva" style="display: none">
<<jsp:include page="/CuentaNueva.jsp"></jsp:include>
</div>

<div class= "column left" style="text-align:right">

User Name: <br>
Nombre: <br>
Apellido: <br>
DNI: <br>
Correo: <br>
Tel&eacutefono: <br>
Empresa: <br>
Cargo: <br>

</div>
<div class="column right"style="text-align:left">
${estudiante.userName}<br>
${estudiante.nombre}<br>
${estudiante.apellido}<br>
${estudiante.DNI}<br>
${estudiante.correo}<br>
${estudiante.telefono}<br>
${estudiante.empresa}<br>
${estudiante.cargo}<br>


</div>

</jsp:useBean>
</body>
</html>