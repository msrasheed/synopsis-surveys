<!DOCTYPE html>
<html>

<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Admin Dash</title>
<style>
* {box-sizing: border-box}

/* Set height of body and the document to 100% */
body, html {
  height: 100%;
  margin: 0;
  font-family: Arial;
}

.tab{
background-color:rgba(255,69,0,0.7);
}
/* Style tab links */
.tablink {
  background-color: rgba(255,69,0,0.7);
  color: white;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px ;
  font-size: 20px;
  width: 14.28%;
}

.tablink:hover {
  background-color: rgba(242, 38, 19, 1);
}

/* Style the tab content (and add height:100% for full page content) */
.tabcontent {
  color: black;
  display: none;
  height: 100%;
  paddinh: 50px;
}

#Info {background-color: rgba(128,128,128,0.2);}
#Encuestas {background-color: rgba(128,128,128,0.2);}
h1 {
margin:0;
font-size:2em;
line-height:5.3;
color:black;
text-align:right;
background-color:beige;
  text-shadow: 0 1px 0 #ccc,
               0 2px 0 #c9c9c9,
               0 3px 0 #bbb,
               0 4px 0 #b9b9b9,
               0 5px 0 #aaa,
               0 6px 1px rgba(0,0,0,.1),
               0 0 5px rgba(0,0,0,.1),
               0 1px 3px rgba(0,0,0,.3),
               0 3px 5px rgba(0,0,0,.2),
               0 5px 10px rgba(0,0,0,.25),
               0 10px 10px rgba(0,0,0,.2),
               0 20px 20px rgba(0,0,0,.15);
}
.gracias{
font-size:24px;
}
.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #f4511e;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 24px;
  padding: 20px;
  width: 400px;
  transition: all 0.5s;
  cursor: pointer;
  margin:10px;

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
.Assign
{
	text-align:center;
}
</style>

</head>
 <form action="/encuestas/Logout">
 &nbsp&nbsp<button type="submit" style="float:right;" name="logout" value="logout"><span>Log out</span></button>
</form>
</div>
<h1><img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style = "float:left;">&iexclHola! &iquestC&oacutemo est&aacute?&nbsp&nbsp&nbsp&nbsp </h1>
<body>

<div class="tab" style="overflow:auto;">
  <button class="tablink" onclick="openPage('Estudiantes',this,'rgba(242, 38, 19, 1)')" color>Estudiantes</button>
  <button class="tablink" onclick="openPage('Instructors',this,'rgba(242, 38, 19, 1)')" color>Instructors</button>
  <button class="tablink" onclick="openPage('Admin',this,'rgba(242, 38, 19, 1)')" color>Administrators</button>
  <button class="tablink" onclick="openPage('Cursos',this,'rgba(242, 38, 19, 1)')" color>Cursos</button>
  <button class="tablink" onclick="openPage('Aulas',this,'rgba(242, 38, 19, 1)')" color>Aulas</button>
  <button class="tablink" onclick="openPage('Empresas',this,'rgba(242, 38, 19, 1)')" color>Empresas</button>
  <button class="tablink" onclick="openPage('Assign',this,'rgba(242, 38, ,19, 1)')" color>Assign</button>
</div>


<div id="Cursos" class="tabcontent" style="padding:20px;">

<span class="gracias">&iquestQu&eacute quiere hacer?</span>
<!--
the reason for the "&iquest" and other strange characters is that in some browsers
special characters do not show up. So "&iquest" is the specific character for "�" and similar for other strange characters.
-->
<br>
  <p>
  <br>
  <form action="/encuestas/login/CosaNueva.jsp">
  <button class = "button" type="submit" ><span>A&ntildeadir un curso nuevo</span></button>
   <input hidden type="text" name="type" value="curso">
   <input hidden type="text" name="action" value="anadir">
  </form><br>
  </p><p>
  <form  action="/encuestas/AdminView">
   C&oacutedigo de un curso:
  <input type="text" name="codigo">
  <button type="submit" class="button" ><span>Ver/Corregir un curso</span></button>
   <input hidden type="text" name="type" value="curso">
   <input hidden type="text" name="action" value="ver">
  </form>
  <form action="/encuestas/AdminView">
  C&oacutedigo de un curso:
  <input type="text" name="codigo">
    <button type="submit" class="button" ><span>Ver encuesta respuestas</span></button>
   <input hidden type="text" name="type" value="curso">
   <input hidden type="text" name="action" value="respuestas">
  </form>
  <br>
  </p>
</div>

<div id="Estudiantes" class="tabcontent" style="padding:20px;">
<span class="gracias">&iquestQu&eacute quiere hacer?</span>
<br>
  <p>
  <br>
  <form action="/encuestas/login/CosaNueva.jsp">
  <button class = "button" type="submit" ><span>A&ntildeadir un estudiante nuevo</span></button>
  <input hidden type="text" name="type" value="estudiante">
  <input hidden type="text" name="action" value="anadir">
  </form><br>
  </p><p>
  <form action="/encuestas/AdminView">
  Nombre de un estudiante
  <input type="text" name="codigo">
  <button type="submit" class="button" ><span>Ver/Corregir un estudiante</span></button>
   <input hidden type="text" name="type" value="estudiante">
   <input hidden type="text" name="action" value="ver">
  </form>
  <br>

  </p>
</div>

<div id="Instructors" class="tabcontent" style="padding:20px;">
<span class="gracias">&iquestQu&eacute quiere hacer?</span>
<br>
  <p>
  <br>
  <form action="/encuestas/login/CosaNueva.jsp">
  <button class = "button" type="submit" ><span>A&ntildeadir un instructor nuevo</span></button>
  <input hidden type="text" name="type" value="instructor">
  <input hidden type="text" name="action" value="anadir">
  </form><br>
  </p><p>
  <form action="/encuestas/AdminView">
  Nombre de un instructor
  <input type="text" name="codigo">
  <button type="submit" class="button" ><span>Ver/Corregir un instructor</span></button>
   <input hidden type="text" name="type" value="instructor">
   <input hidden type="text" name="action" value="ver">
  </form>
  <br>

  </p>
</div>

<div id="Admin" class="tabcontent" style="padding:20px;">
<span class="gracias">&iquestQu&eacute quiere hacer?</span>
<br>
  <p>
  <br>
  <form action="/encuestas/login/CosaNueva.jsp">
  <button class = "button" type="submit" ><span>A&ntildeadir un admin nuevo</span></button>
  <input hidden type="text" name="type" value="admin">
  <input hidden type="text" name="action" value="anadir">
  </form><br>
  </p><p>
  <form action="/encuestas/AdminView">
  Nombre de un admin
  <input type="text" name="codigo">
  <button type="submit" class="button" ><span>Ver/Corregir un admin</span></button>
   <input hidden type="text" name="type" value="admin">
   <input hidden type="text" name="action" value="ver">
  </form>
   <form action="/encuestas/login/AdminDisplay.jsp">
 &nbsp&nbsp<button type="submit" class="button"> <span>Ver su informaci&oacuten</span></button>
<%
session.setAttribute("type","admin");
session.setAttribute("action", "ver");
session.setAttribute("codigo", session.getAttribute("username"));
%>
 
 </form>
  <br>

  </p>
</div>
<div id="Aulas" class="tabcontent" style="padding:20px;">
<span class="gracias">&iquestQu&eacute quiere hacer?</span>
<br>
  <p>
  <br>
  <form action="/encuestas/login/CosaNueva.jsp">
  <button class = "button" type="submit" ><span>A&ntildeadir una aula nueva</span></button>
  <input hidden type="text" name="type" value="aula">
  <input hidden type="text" name="action" value="anadir">
  </form><br>
  </p><p>
  <form action="/encuestas/AdminView">
  Nombre de una aula
  <input type="text" name="codigo">
  <button type="submit" class="button" ><span>Ver/Corregir una aula</span></button>
   <input hidden type="text" name="type" value="aula">
   <input hidden type="text" name="action" value="ver">
  </form>
  <br>

  </p>
</div>

<div id="Empresas" class="tabcontent" style="padding:20px;">
<span class="gracias">&iquestQu&eacute quiere hacer?</span>
<br>
  <p>
  <br>
  <form action="/encuestas/login/CosaNueva.jsp">
  <button class = "button" type="submit" ><span>A&ntildeadir una empresa nueva</span></button>
  <input hidden type="text" name="type" value="empresa">
  <input hidden type="text" name="action" value="anadir">
  </form><br>
  </p><p>
  <form action="/encuestas/AdminView">
  Nombre de una empresa:
  <input type="text" name="codigo">
  <button type="submit" class="button" ><span>Ver/Corregir una empresa</span></button>
   <input hidden type="text" name="type" value="empresa">
   <input hidden type="text" name="action" value="ver">
  </form>
  <br>
  </p>

</div>

<div id="Assign" class="tabcontent" style="padding:20px;">

  <br>
<form action="/encuestas/Assign">
Registrar un estudiante con un clase nuevo <br>
Nombre: <input type="text" name="nombre"><br>
Apellido: <input type="text" name="apellido"><br>
Curso C&oacutedigo: <input type="text" name="coursecode"><br>
Curso nombre: <input type="text" name="coursename"><br>
Aula: <input type="text" name="aula"><br>
Instructor: <input type="text" name="instructor"><br>
Start date: <input type="date" name="startdate">
 End date: <input type="date" name="endate"><br>
<input hidden type="int" name="hora" value=0><br>

<button type="submit" class="button" ><span>Terminar</span></button>

</form>
</div>

<script>
document.getElementsByClassName('tablink')[0].click()
function openPage(pageName,elmnt,color) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablink");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].style.backgroundColor = "";
  }
  document.getElementById(pageName).style.display = "block";
  elmnt.style.backgroundColor = color;
}

// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();
</script>


</body>
</html>
