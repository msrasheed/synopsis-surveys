<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "ws.synopsis.surveys.model.*" %>
<%@ page import= "ws.synopsis.surveys.utils.*" %>
<%@ page import ="javax.persistence.*" %>
<%@ page import = "java.util.List" %>

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

div {
  font-family: "Lucia Console", "Courier New", monospace;
  font-size: 1.5em;
  line-height: 1.5;
 
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

<head>
   <%
   System.out.println("AdminDisplay.jsp");
   String type = (String) session.getAttribute("type");
   String action = (String) session.getAttribute("action");
   System.out.println(type);
   System.out.println(action);
   
   if(type.equals("curso")){ 
	   if(action.equals("ver")){
		   System.out.println("Why is this a problem??");
		   Curso cosa = (Curso) session.getAttribute("cosa"); 
	   } else if (action.equals("respuestas")){
		   List<Coffeebean> respuestas = (List<Coffeebean>) session.getAttribute("respuestas");
	   }
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
  <title> Informaci&oacute de curso ${session.codigo } </title>
  <%}else if (type.equals("instructor")){ %>
   <title> Informaci&oacute de instructor ${session.codigo } </title>
  <%}else if (type.equals("aula")){ %>
   <title> Informaci&oacute de aula ${session.codigo } </title>
  <%}else if (type.equals("empresa")){ %>
  <title> Informaci&oacute de empresa ${session.codigo } </title>
  <%} %>
</head>

<h1>

<img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style= "float:left">
<br><br>  <%if(type.equals("curso")){ %>
   Informaci&oacute de curso ${session.codigo } 
  <%}else if (type.equals("instructor")){ %>
    Informaci&oacute de instructor ${session.codigo } 
  <%}else if (type.equals("aula")){ %>
    Informaci&oacute de aula ${session.codigo } 
  <%}else if (type.equals("empresa")){ %>
    Informaci&oacute de empresa ${session.codigo } 
  <%} %>

</h1>
<%if(type.equals("curso")){ %>
<div class= "column left" style="text-align:right">

Curso: <br>
C&oacutedigo: <br>
Fecha Inicio: <br>
Fecha Fin: <br>
Tiempo Inicio: <br>
Tiempo Fin: <br>
Instructor: <br>

</div>
<div class="column right"style="text-align:left">

${cosa.courseName}<br>  
${cosa.courseId}<br>
${cosa.startDate}<br>
${cosa.endDate}<br>
${cosa.startTime}<br>
${cosa.endTime}<br>
${cosa.instructor}<br>

</div>
<%}else if(type.equals("instructor")){ %>
<div class= "column left" style="text-align:right">

Username: <br>
Nombre: <br>
Apellido: <br>
DNI: <br>
Correo: <br>
Tel&eacutefono: <br>
Empresa: <br>
Cargo: <br>

</div>
<div class="column right"style="text-align:left">

${cosa.userName}<br>  
${cosa.nombre}<br>
${cosa.apellido}<br>
${cosa.DNI}<br>
${cosa.correo}<br>
${cosa.telefono}<br>
${cosa.empresa}<br>
${cosa.cargo}<br> 

</div>
<%}else if(type.equals("aula")){ %>
<div class= "column left" style="text-align:right">
Nombre: <br>
Ubicaci&oacuten: <br>

</div>
<div class="column right"style="text-align:left">
${cosa.nombre }<br>
${cosa.ubicacion}<br>
</div>
<%}else if(type.equals("empresa")){ %>
<div class= "column left" style="text-align:right">
Nombre: <br>
Ubicaci&oacuten: <br>
Correo: <br>
Tel&eacutefono: <br>
</div>
<div class="column right"style="text-align:left">
${cosa.nombre }<br>
${cosa.ubicacion}<br>
${cosa.correo}<br>
${cosa.telefono}<br>
</div>
<%} %>
<form action="/encuestas/adminDash.html" >
<button class="button"><span>OK </span></button>
</form>
<form action="/encuestas/AdminEdit.jsp" method="post">
<button class="button"><span>Corregir </span></button>
</form>


</body>
</html>
    