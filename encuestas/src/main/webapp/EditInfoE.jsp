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
  <title> Corregir su informaci&oactuen </title>
</head>

<h1>
   <%
   	System.out.println("EditInfoE.jsp");
      Estudiante estudiante = (Estudiante) session.getAttribute("estudiante");
      String userType = (String) session.getAttribute("userType");
   %>
<img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style= "float:left">
<br><br>Corregir su informaci&oacuten 

</h1>

<form action="/encuestas/MergeEstudiante" method="post">
  Nombre:&nbsp&nbsp&nbsp&nbsp
  <input type="text" name="nombre" value=${estudiante.nombre}>
  <br>
  Apellido:&nbsp&nbsp
  <input type="text" name="apellido" value=${estudiante.apellido}>
  <br>
  DNI: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <input type="int" name="DNI" value=${estudiante.DNI}>
  <br>
  Correo:&nbsp&nbsp&nbsp&nbsp
  <input type="email" name="correo" value=${estudiante.correo}>
  <br>
  Teléfono:&nbsp&nbsp
  <input type="text" name="telefono" value=${estudiante.telefono}>
  <br>
  Empresa:&nbsp&nbsp&nbsp 
  <input type="text" name="empresa" value=${estudiante.empresa}>
  <br>
  Cargo: &nbsp&nbsp&nbsp&nbsp
  <input type="text" name="cargo" value=${estudiante.cargo}>
  <br><br>
  <input hidden type="text" name="userType" value=estudiante>
  El nombre de usuario:
  <input type="text" name="userName" required value=${estudiante.userName}>
  <br>
  Contrase&ntildea:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <input type="password" name="contrasena" required>
  <br>
     <button class="button" style="vertical-align:middle"><span>Corregir la cuenta </span></button>
  
  
     
     
     
     
</form>
</body>
</html>
    