<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "ws.synopsis.surveys.model.Estudiante" %>
<%@ page import= "ws.synopsis.surveys.utils.EstudianteDB" %>
<%@ page import= "ws.synopsis.surveys.utils.EntityMan" %>
<%@ page import ="javax.persistence.*" %>

<!DOCTYPE html>
<%--
This jsp is used by the admin to create new courses, students, instructos, classrooms, and companies, depending
on the variable "type". All of the collected information is then sent to the servlet AdminInsert.java
 --%>
<html>
<body>
<style>
h1{
font-size: 2em;
background-color: rgba(255,69,0,0.7);
margin:0;
padding-top:10px;
text-align: center;
height: 200px;
}
form{
 font-family: "Lucia Console", "Courier New", monospace;
  font-size: 1.5em;
  line-height: 1.5;
  text-align:center;
  background-color: rgba(128,128,128,0.3);
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
</style>

<head>
   <%
   System.out.println("CosaNueva.jsp");
   String type = request.getParameter("type");
   System.out.println(type);
   session.setAttribute("action", request.getParameter("action"));
   session.setAttribute("type", type);
   %>
  <meta charset = "utf-8">
  <%if(type.equals("curso")){ %>
  <title> A&ntildeadir un curso nuevo </title>
  <%}else if (type.equals("estudiante")){ %>
   <title> A&ntildeadir un estudiante nuevo </title>
  <%}else if (type.equals("instructor")){ %>
   <title> A&ntildeadir un instructor nuevo </title>
  <%}else if (type.equals("aula")){ %>
   <title> A&ntildeadir una aula nueva </title>
  <%}else if (type.equals("empresa")){ %>
  <title> A&ntildeadir una empresa nueva </title>
  <%} %>
</head>

<h1>

<img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style= "float:left">
<br><br>  <%if(type.equals("curso")){ %>
 A&ntildeadir un curso nuevo 
  <%}else if (type.equals("estudiante")){ %>
   A&ntildeadir un estudiante nuevo 
  <%}else if (type.equals("instructor")){ %>
    A&ntildeadir un instructor nuevo 
  <%}else if (type.equals("aula")){ %>
    A&ntildeadir una aula nueva 
  <%}else if (type.equals("empresa")){ %>
 A&ntildeadir una empresa nueva 
  <%} %>

</h1>

<form class ="monospace" action="/encuestas/AdminInsert" method="post">
<br>
<%
if (type.equals("curso")){
%>
  Curso:&nbsp&nbsp&nbsp&nbsp
  <input type="text" name="courseName">
  <br><br>
    C&oacutedigo:&nbsp&nbsp&nbsp
<input type="text" name="courseId">
<br><br>
  Fecha Inicio:
  <input type="date" name="startDate">

  Fecha Fin:
  <input type="date" name="endDate">
  <br><br>
  Tiempo Inicio:
  <input type="time" name="startTime">
  Tiempo Fin:
  <input type="time" name="endTime">
  <br><br>
  Instructor:
  <input type="text" name="instructor">
  <br> <br>

     <button class="button" style="vertical-align:middle"><span>Crear el curso</span></button>
<% } else if(type.equals("instructor")||type.equals("estudiante")) { %>
<br>
  Nombre:&nbsp&nbsp&nbsp&nbsp
  <input type="text" name="nombre">
  <br>
  Apellido:&nbsp&nbsp
  <input type="text" name="apellido">
  <br>
  DNI: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <input type="int" name="DNI">
  <br>
  Correo:&nbsp&nbsp&nbsp&nbsp
  <input type="email" name="correo">
  <br>
  Teléfono:&nbsp&nbsp
  <input type="text" name="telefono" >
  <br>
  El nombre de usuario:
  <input type="text" name="userName" required>
  <br>
  Contrase&ntildea:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <input type="password" name="contrasena" required>
  <br>
  <%if(type.equals("estudiante")){ %>
  	Empresa:&nbsp&nbsp&nbsp 
  <input type="text" name="empresa">
  <br>
  Cargo: &nbsp&nbsp&nbsp&nbsp
  <input type="text" name="cargo">
  <br>
 
     <button class="button" style="vertical-align:middle"><span>A&ntildeadir un estudiante</span></button>
 <%}else{ %>

     <button class="button" style="vertical-align:middle"><span>A&ntildeadir un instructor</span></button>
     <%} %>
<% }else if(type.equals("aula")) { %>
<br> 
	Nombre:
	<input type="text" name="nombre">
	<br>
	Ubicaci&oacuten:
	<input type="text" name="ubicacion">
	<br>
     <br><br><br>
     <button class="button" style="vertical-align:middle"><span>A&ntildeadir una aula</span></button>
  <% }else if(type.equals("empresa")) { %>   
  <br>
  	Nombre:
	<input type="text" name="nombre">
	<br>
	Ubicaci&oacuten:
	<input type="text" name="ubicacion">
	<br>
	Correo:&nbsp&nbsp&nbsp&nbsp
  <input type="email" name="correo">
  <br>
  Teléfono:&nbsp&nbsp
  <input type="text" name="telefono" >
  <br>
  
     <button class="button" style="vertical-align:middle"><span>A&ntildeadir una empresa</span></button>
     <%} %>
</form>
</body>
</html>
    