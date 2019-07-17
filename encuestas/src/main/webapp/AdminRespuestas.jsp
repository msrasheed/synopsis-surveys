<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import= "ws.synopsis.surveys.model.*" %>
<%@ page import= "ws.synopsis.surveys.utils.*" %>
<%@ page import ="javax.persistence.*" %>
<%@ page import ="java.util.List" %>

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
   System.out.println("AdminRespuestas.jsp");
   
	List<Coffeebean> respuestas = (List<Coffeebean>) session.getAttribute("respuestas");

   %>
   
  <meta charset = "utf-8">

  <title> Respuestas de curso ${session.codigo } </title>

</head>

<h1>

<img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style= "float:left">
<br><br>  
   Respuestas de curso ${session.codigo} 


</h1>
<table>
	<c:forEach items="$respuestas" var="respuestas">
		<tr>
			<td><c:out value ="waddup"> </c:out></td>
			<td><c:out value="${respuestas.rate1}" ></c:out></td>
			<td><c:out value="${Coffeebean.respuesta2}" ></c:out></td>
		</tr>
	</c:forEach>
</table>
<form action="/encuestas/adminDash.html" >
<button class="button"><span>OK</span></button>
</form>
<form action="/encuestas/AdminEdit.jsp" method="post">
<button class="button"><span>Corregir</span></button>
</form>


</body>
</html>
    