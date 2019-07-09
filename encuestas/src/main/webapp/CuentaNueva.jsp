<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "ws.synopsis.surveys.model.Estudiante" %>
<%@ page import= "ws.synopsis.surveys.utils.EstudianteDB" %>
<%@ page import= "ws.synopsis.surveys.utils.EntityMan" %>
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
  <meta charset = "utf-8">
  <title> Crear una cuenta nueva </title>
</head>

<h1>

<img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style= "float:left">
<br><br>Complete la informaci&oacuten requerida para crear su nueva cuenta

</h1>
   <%
   System.out.println("CuentaNueva.jsp");
   String userType = (String) session.getAttribute("userType");
   %>
   
<%if (userType.equals("estudiante")){
	%><form action="/encuestas/InsertEstudiante" method="post"><% 
}else if (userType.equals("instructor")){
	%><form action="/encuestas/InsertInstructor" method="post"><% 
}else if (userType.equals("admin")){
	%><form action="/encuestas/InsertAdmin" method="post"><% 
}
%>

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
  <%
  if(userType.equals("estudiante")){
	  %>
	Empresa:&nbsp&nbsp&nbsp 
  <input type="text" name="empresa">
  <br>
  Cargo: &nbsp&nbsp&nbsp&nbsp
  <input type="text" name="cargo">
  <br>
	  <%
  }
  
  %>

  
  El nombre de usuario:
  <input type="text" name="userName" required>
  <br>
  Contrase&ntildea:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <input type="password" name="contrasena" required>
  <br>
     <button class="button" style="vertical-align:middle"><span>Crear la cuenta </span></button>
  
  
     
     
     
     
</form>
</body>
</html>
    