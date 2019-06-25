<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "ws.synopsis.surveys.model.User" %>
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
padding-top:0;
text-align: center;
height: 175px;
}
form.monospace {
  font-family: "Lucia Console", "Courier New", monospace;
  font-size: 1.4em;
  line-height: 0.7;
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
<jsp:useBean id="user" class="ws.synopsis.surveys.model.User">
<h1>
   <%
   HttpSession sess = request.getSession(true);
   String userType = (String) session.getAttribute("userType"); 
   System.out.println(userType);
   System.out.println("EditInfoE.jsp");
   %>
<img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style= "float:left">
<br>Corregir su informaci&oacuten 

</h1>

<form class ="monospace" action="/encuestas/CursosE.jsp" method="post">
<br>

  Nombre:&nbsp&nbsp&nbsp&nbsp
  <input type="text" name="nombre" >
  <jsp:getProperty name="user" property="nombre"/>
  <br><br>
  Apellido:&nbsp&nbsp
  <input type="text" name="apellido" value=apellido>
  <br><br>
  DNI: &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <input type="int" name="DNI" value="DNI">
  <br><br>
  Correo:&nbsp&nbsp&nbsp&nbsp
  <input type="email" name="correo">
  <br><br>
  Teléfono: &nbsp&nbsp
  <input type="text" name="telefono" >
  <br><br>
  Empresa:&nbsp&nbsp&nbsp 
  <input type="text" name="empresa">
  <br><br>
  Cargo: &nbsp&nbsp&nbsp&nbsp
  <input type="text" name="cargo">
  <br><br><br>
  
  El nombre de usuario:
  <input type="text" name="userName" required>
  <br><br>
  Contrase&ntildea:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <input type="password" name="contrasena" required>
  <br><br><br>
     <button class="button" style="vertical-align:middle"><span>Corregir la cuenta </span></button>
  
  
     
     
     
     
</form>
</jsp:useBean>
</body>
</html>
    