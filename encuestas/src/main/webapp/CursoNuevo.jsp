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
<br><br>Complete la informaci&oacuten requerida para crear un curso nuevo

</h1>
   <%
   System.out.println("CursoNuevo.jsp");
   %>

<form class ="monospace" action="/encuestas/InsertCurso" method="post">
<br>
  Curso:&nbsp&nbsp&nbsp&nbsp
  <input type="text" name="curso">
  <br><br>
    C&oacutedigo:&nbsp&nbsp&nbsp
<input type="text" name="codigo">
<br><br>
  Fecha Inicio:
  <input type="date" name="fechaI">

  Fecha Fin:
  <input type="date" name="fechaF">
  <br><br>
  Tiempo Inicio:
  <input type="time" name="tiempoI">
  Tiempo Fin:
  <input type="time" name="tiempoF">
  <br><br>
  Instructor:
  <input type="text" name="instructor">
  <br> <br>

  <br><br><br>
     <button class="button" style="vertical-align:middle"><span>Crear el curso</span></button>
</form>
</body>
</html>
    