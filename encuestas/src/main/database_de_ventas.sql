CREATE TABLE studentinfo(

DNI int NOT NULL,
nombre varchar(255) NOT NULL,
apellido varchar(255) NOT NULL,
empresa varchar(255) NOT NULL,
cargo varchar(255) NOT NULL,
corsonombre varchar(255),
tele int,
corsecodigo varchar(255),
startdate date,
enddate date,
aula varchar(255),
instructor varchar(255),

primary key(DNI)

);

CREATE TABLE cafe(
id INTEGER PRIMARY KEY AUTO_INCREMENT,
cursocodigo varchar(20),
instructor varchar(50),
entrydate date,
item1 int,
item2 int,
item3 int,
item4 int,
item5 int,
mejoria varchar(301)

);

CREATE TABLE encuesta (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
entrydate date,
item1 int,
item2 int,
item3 int,
item4 int,
item5 int,
item6 int,
item7 int,
item8 int,
item9 int,
item10 int,
item11 int,
item12 varchar(255),
item13 int,
item14 int,
item15 int,
item16 varchar(300)

);

CREATE TABLE asistencia (

nombre varchar(50),
apellido varchar(50),
corsocodigo varchar(50),
aula varchar(50),
instructor varchar(50),
hora float
foreign key (nombre),
foreign key (apellido),
foreign key (corsocodigo)
);

CREATE TABLE estudianteaccount (

username varchar(20),
password varchar(30)

);

CREATE TABLE instructoraccount (

username varchar(20),
password varchar(20)

);

CREATE TABLE adminaccount(

username varchar(20),
password varchar(20)

);
