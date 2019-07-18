<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Instructor Dash</title>
<style>
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
  padding: 14px 17px;
  font-size: 17px;
  width: 25%;
}

.tablink:hover {
  background-color: rgba(242, 38, 19, 1);
}

/* Style the tab content (and add height:100% for full page content) */
.tabcontent {
  color: black;
  display: none;
  height: 100%;
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
#curso {background-color: rgba(128,128,128,0.2);}
#hoja {background-color: rgba(128,128,128,0.2);}
</style>
</head>
 <form action="/encuestas/Logout">
 &nbsp&nbsp<button type="submit" style="float:right;" name="logout" value="logout"><span>Log out</span></button>
</form>
<h1><img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style = "float:left;">&iexclHola! &iquestC&oacutemo est&aacute?&nbsp&nbsp&nbsp&nbsp </h1>
<body>
<div class="tab" style="overflow:auto;">
  <button class="tablink" onclick="openPage('Info',this,'rgba(242, 38, 19, 1)')" color>Info</button>
  <button class="tablink" onclick="openPage('hoja de asistencia',this,'rgba(242, 38, 19, 1)')" color>Asistencia</button>
</div>

<div id="Info" class="tabcontent">
 <form action="/encuestas/login/AdminDisplay.jsp">
 &nbsp&nbsp<button type="submit" class="button"> <span>Ver su informaci&oacuten</span></button>
<%
session.setAttribute("type","instructor");
session.setAttribute("action", "ver");
session.setAttribute("codigo", session.getAttribute("username"));
%>
 
 </form>
 <br>
 <form action="/encuestas/login/CursosE.jsp"> <%--a different page named CursosI.jsp needs to be made --%>
 &nbsp&nbsp<button type="submit" class="button"> <span>Ver sus cursos</span></button>
 </form>
 <br>
</div>

<div id="hoja de asistencia" class="tabcontent">
updating student hour <br>
<br> pulling the info from course info for instructor where end date >= current date<br>
edit in a new page<br>
my idea is to insert hours added with every attendance to database.
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