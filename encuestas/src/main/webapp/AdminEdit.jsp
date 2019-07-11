<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "ws.synopsis.surveys.model.*" %>
<%@ page import= "ws.synopsis.surveys.utils.*" %>
<%@ page import ="javax.persistence.*" %>

<!DOCTYPE html>

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
   System.out.println("AdmitEdit.java");
   String type = (String) session.getAttribute("type");
   String codigo = (String) session.getAttribute("codigo");
   String action = (String) session.getAttribute("action");
   
   if(type.equals("curso")){ 
	   Curso cosa = (Curso) session.getAttribute("cosa");
   } else if (type.equals("instructor")){ 
	   Instructor cosa = (Instructor) session.getAttribute("cosa");
   } else if (type.equals("aula")){ 
	   Aula cosa = (Aula) session.getAttribute("cosa");
   } else if (type.equals("empresa")){ 
	   Empresa cosa = (Empresa) session.getAttribute("cosa");
   }
   System.out.println(type);

   %>
   
  <meta charset = "utf-8">
  <%if(type.equals("curso")){ %>
  <title> Corregir el curso </title>
  <%}else if (type.equals("instructor")){ %>
   <title> Corregir el instructor </title>
  <%}else if (type.equals("aula")){ %>
   <title> Corregir la aula </title>
  <%}else if (type.equals("empresa")){ %>
  <title> Corregir la empresa </title>
  <%} %>
</head>

<h1>

<img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style= "float:left">
<br><br>  <%if(type.equals("curso")){ %>
   Corregir el curso 
  <%}else if (type.equals("instructor")){ %>
    Corregir el instructor 
  <%}else if (type.equals("aula")){ %>
   Corregir la aula 
  <%}else if (type.equals("empresa")){ %>
  Corregir la empresa 
  <%} %>

</h1>

<form class ="monospace" action="/encuestas/AdminInsert" method="post">
<br>
<%
if (type.equals("curso")){
%>
  Curso:&nbsp&nbsp&nbsp&nbsp
  <input type="text" name="courseName" value=${cosa.courseName}>
  <br><br>
    C&oacutedigo:&nbsp&nbsp&nbsp
<input type="text" name="courseId" value=${cosa.courseId}>
<br><br>
  Fecha Inicio:
  <input type="date" name="startDate" value=${cosa.startDate}>

  Fecha Fin:
  <input type="date" name="endDate" value=${cosa.endDate}>
  <br><br>
  Tiempo Inicio:
  <input type="time" name="startTime" value=${cosa.startTime}>
  Tiempo Fin:
  <input type="time" name="endTime" value=${cosa.endTime}>
  <br><br>
  Instructor:
  <input type="text" name="instructor" value=${cosa.instructor}>
  <br> <br>

  <br><br><br>
     <button class="button" style="vertical-align:middle"><span>Corregir el curso</span></button>
<% 
/* AdminDB.mergeCurso(cosa); */

} else if(type.equals("instructor")) { %>
<br>
  Nombre:&nbsp&nbsp&nbsp&nbsp
  <input type="text" name="nombre" value=${cosa.nombre}>
  <br>
  Apellido:&nbsp&nbsp
  <input type="text" name="apellido" value=${cosa.apellido}>
  <br>
  DNI: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <input type="int" name="DNI" value=${cosa.DNI}>
  <br>
  Correo:&nbsp&nbsp&nbsp&nbsp
  <input type="email" name="correo" value=${cosa.correo}>
  <br>
  Teléfono:&nbsp&nbsp
  <input type="text" name="telefono" value=${cosa.telefono}>
  <br>
  El nombre de usuario:
  <input type="text" name="userName"  value=${cosa.userName}required>
  <br>
  Contrase&ntildea:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <input type="password" name="contrasena" value=${cosa.contrasena} required>
  <br>
    <br><br><br>
     <button class="button" style="vertical-align:middle"><span>Corregir el instructor</span></button>
<% }else if(type.equals("aula")) { %>
<br> 
	Nombre:
	<input type="text" name="nombre" value=${cosa.nombre}>
	<br>
	Ubicaci&oacuten:
	<input type="text" name="ubicacion" value=${cosa.ubicacion}>
	<br>
     <br><br><br>
     <button class="button" style="vertical-align:middle"><span>Corregir la aula</span></button>
  <% }else if(type.equals("empresa")) { %>   
  <br>
	Nombre:
	<input type="text" name="nombre" value=${cosa.nombre}>
	<br>
	Ubicaci&oacuten:
	<input type="text" name="ubicacion" value=${cosa.ubicacion}>
	<br>
  Correo:&nbsp&nbsp&nbsp&nbsp
  <input type="email" name="correo" value=${cosa.correo}>
  <br>
  Teléfono:&nbsp&nbsp
  <input type="text" name="telefono" value=${cosa.telefono}>
  <br>
     <br><br><br>
     <button class="button" style="vertical-align:middle"><span>Corregir la empresa</span></button>
     <%} %>
</form>
</body>
</html>
    