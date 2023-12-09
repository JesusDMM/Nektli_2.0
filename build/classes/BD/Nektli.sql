create database Nektli;
use Nektli;

create table Cuentas (
	Id int not null primary key auto_increment,
    Nombre text not null,
    Ocupacion varchar(30) not null,
    Correo text not null,
    Contraseña varchar(30) not null
);

create table Usuarios (
	id int not null auto_increment,
    Correo text not null,
    Contraseña varchar(30) not null,
    FOREIGN KEY (id) REFERENCES Cuentas(Id)
);

create table Colmenas (
	Id int not null primary key auto_increment,
    Nombre text not null,
    N_Alzas int not null,
    N_Bastidores int not null,
    Tipo varchar(15) not null,
    Suelo varchar(20) not null,
    Proteccion varchar(2) not null,
    Estado varchar(15) not null,
    Fecha date not null,
    Longitud double not null,
    Latitud double not null,
    Nombre_Ciudad text not null,
    Descripcion text not null
);
alter table Colmenas add (
	Id_usuario int not null
);

Create table Tareas (
	Id int not null primary key auto_increment,
    id_Usuario int not null,
    id_Colmena int not null,
    Nombre_colmena text not null,
    Tipo varchar(20) not null,
    foreign key (id_Usuario) references Usuarios(Id),
    foreign key (id_Colmena) references Colmenas(Id)
);

create table Tratamientos (
	id_Tarea int not null,
    Fecha_I date not null,
    Fecha_F date not null,
    Enfermedad varchar(100) not null,
    Producto varchar(100) not null,
    Dosis double not null,
    Repeticiones_Dia int not null,
    Encargado text not null,
    foreign key (id_Tarea) references Tareas(Id)
);

 
 create table Cosechas (
	id_Tarea int not null,
    Fecha date not null,
    Producto varchar(10) not null,
    Cantidad double null,
    Descripcion text not null,
    foreign key (id_Tarea) references Tareas(Id)
);

Create table Alimentaciones (
	id_Tarea int not null,
    Fecha date not null,
    Tipo text not null,
    Alimento text not null,
    Cantidad double not null,
    Cantidad_Dias int not null,
    Descripcion text not null,
    foreign key (id_Tarea)references Tareas (Id)
);

Create table Movimientos (
	id_Tarea int not null,
    Fecha_Salida date not null,
    Ciudad_Salida text not null,
    Latitud_Salida double not null,
    Longitud_Salida double not null,
    Fecha_Llegada date null,
    Ciudad_Llegada text null,
    Latitud_Llegada double null,
    Longitud_Llegada double null,
    Motivo text not null,
    foreign key (id_Tarea) references Tareas(Id)
);
alter table Movimientos drop column Longitud_Salida,
drop column Latitud_Salida,
drop column Latitud_Llegada,
drop column Longitud_Llegada;