<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
 <title> Eres un </title>

</head>
<style>
h1{
font-size: 4em;
background-color: rgba(255,69,0,0.7);
margin:0;
padding-top:0;
text-align: center;
height: 100px;
padding-top: 100px;
}
form.monospace {
  font-family: "Lucia Console", "Courier New", monospace;
  font-size: 1.4em;
  line-height: 0.7;
  text-align:center;
  
}
body {margin:1em;padding:1em;
    background-color: rgba(211,211,211,0.7);
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
  width: 300px;
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
<body>
<h1> &iquestEres un...?</h1>
<br>
<form action="/UserType?userType=estudiante" class="monospace">
<button class="button" style="vertical-align:middle"><span>Estudiante </span></button>
</form>
<form action="/UserType?userType=instructor" class="monospace" >
<button class="button" style="vertical-align:middle"><span>Instructor </span></button>
</form>
<%System.out.println("Success bitch"); %>
<form action="/UserType?userType=admin" class="monospace" >
<button class="button" style="vertical-align:middle"><span>Administrador </span></button>
</form>
</body>
</html>