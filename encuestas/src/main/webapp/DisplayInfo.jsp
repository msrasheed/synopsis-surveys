<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "ws.synopsis.surveys.model.User"%>
<%@ page import ="java.io.IOException"%>
<%@ page import ="javax.servlet.ServletException" %>
<%@ page import ="javax.servlet.http.HttpServlet" %>
<%@ page import ="javax.servlet.http.HttpServletRequest"%>
<%@ page import ="javax.servlet.http.HttpServletResponse"%>

<%@ page import ="ws.synopsis.surveys.servlets.Estudiante"%>
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

<style>
h1{
font-size: 3em;
background-color: rgba(255,69,0,0.7);
margin:0;
padding-top:1000px;
text-align: center;
height: 300px;
}
.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #f4511e;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 20px;
  padding: 10px;
  width: 150px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
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
	<jsp:useBean id="user" class="ws.synopsis.surveys.model.User">
<h1>
<img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style= "float:left">
<br>Por favor, verifica si esta informaci&oacuten es correcta
</h1>

<div id="CuentaNueva" style="display: none">
<<jsp:include page="/CuentaNueva.jsp"></jsp:include>
</div>

  <%
  String userType = (String) session.getAttribute("userType"); 
  System.out.println(userType);
  User estudiante = (User) request.getAttribute("estudiante"); 
/* 	String DNI = request.getParameter("DNI");
    String userType = "estudiante";
	String nombre = request.getParameter("nombre");
	String apellido = request.getParameter("apellido");
	String userName = request.getParameter("userName");
	String contrasena = request.getParameter("contrasena");
	String correo = request.getParameter("correo");
	String telefono = request.getParameter("telefono");
	String empresa = request.getParameter("empresa");
	String cargo = request.getParameter("cargo");
	System.out.println("asuh");
	User estudiante = new User(DNI, userType, nombre, apellido, userName, contrasena, correo, telefono, empresa, cargo); 
	request.setAttribute("estudiante", estudiante);
	System.out.println(estudiante);
	EstudianteDB.insertEstudiante(estudiante); */
	
	
	System.out.println("bitch");
	
  %>
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
<form class ="monospace" action="/encuestas/CursosE.jsp" method="post">
<button class="button" style="vertical-align:middle"><span>S&iacute </span></button>
</form>
<form class ="monospace" action="/encuestas/EditInfoE.jsp" method="post">
<button class="button" style="vertical-align:middle"><span>No </span></button>
</form>

</jsp:useBean>
</body>
</html>