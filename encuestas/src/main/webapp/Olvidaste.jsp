<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Olvidaste</title>
<style>
body, html {
  height: 100%;
  margin: 0;
  font-family: Arial;
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
/* Style tab links */

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

</style>
</head>
<h1><img src = "http://www.synopsis.ws/images/logo-synopsis.png" alt = "synopsis" style = "float:left;">Hola! ¿Cómo Esta?&nbsp&nbsp&nbsp&nbsp </h1>

<body>
<form action="/encuestas/Mail">
<font size="6"><strong>Por favor escribe su nombre, apellido, username y empresa.</strong></font><br>
 <textarea name="text1" cols="40" rows="5"  style="width:1500px; height:70px;font-size:16px;" maxlength="280" >Soy...
</textarea><br>
<button class="button"><span>Enviar</span></button>
</form>
</body>
</html>