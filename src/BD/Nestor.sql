/*Cosas a ejecutar*/
use nektli;
INSERT INTO cuentas VALUES (0,'Michael','Intermedio','nektli.aplicacion@gmail.com','Abejas12');
INSERT INTO USUARIOS VALUES (0,'nektli.aplicacion@gmail.com','Abejas12');

/*Insertar colmenas*/
INSERT INTO COLMENAS VALUES (0,'A1',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A2',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A3',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A4',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A5',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A6',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A7',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A8',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A9',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A10',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A11',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1),
(0,'A12',3,10,'Producción','Cemento','SI','Activa','2020-07-04',-98.9747,22.7433,'Ocampo','Colmena de producción',1);

INSERT INTO TAREAS VALUES (0,1,1,'A1','Producción'),
(0,1,2,'A2','Producción'),
(0,1,3,'A3','Producción'),
(0,1,4,'A4','Producción'),
(0,1,5,'A5','Producción'),
(0,1,6,'A6','Producción'),
(0,1,7,'A7','Producción'),
(0,1,8,'A8','Producción'),
(0,1,9,'A9','Producción'),
(0,1,10,'A10','Producción'),
(0,1,11,'A11','Producción'),
(0,1,12,'A12','Producción');

/*Insertar cosechas*/
INSERT INTO COSECHAS VALUES (1,'2023-10-20','Miel',5,'Miel de naranjo'),
(1,'2023-10-20','Miel',10,'Miel de naranjo'),
(1,'2023-10-20','Miel',9,'Miel de naranjo'),
(2,'2023-10-20','Cera',6,'Cera para venta'),
(2,'2023-10-20','Miel',9,'Miel de naranjo'),
(3,'2023-10-20','Miel',4,'Miel de naranjo'),
(4,'2023-10-20','Polen',2,'Polen para la venta'),
(5,'2023-10-20','Miel',8,'Miel de naranjo'),
(6,'2023-10-20','Miel',13,'Miel de naranjo'),
(6,'2023-10-20','Polen',8,'Polen para la venta'),
(7,'2023-10-20','Miel',2,'Miel de naranjo'),
(8,'2023-10-20','Miel',4,'Miel de naranjo'),
(9,'2023-10-20','Miel',7,'Miel de naranjo'),
(10,'2023-10-20','Miel',5,'Miel de naranjo'),
(11,'2023-10-20','Miel',8,'Miel de naranjo'),
(12,'2023-10-20','Miel',4,'Miel de naranjo');

/*Insertar tratamientos*/
INSERT INTO TRATAMIENTOS VALUES (4,'2023-10-15','2023-10-20','Hormigas','Trompa',3,1,'Michael'),
(4,'2023-10-15','2023-10-20','Cochinilla','Piretrinas',3,1,'Michael'),
(7,'2023-10-15','2023-10-20','Cochinilla','Piretrinas',3,1,'Michael'),
(7,'2023-10-15','2023-10-20','Hormigas','Trompa',3,1,'Michael'),
(12,'2023-10-15','2023-10-20','Hormigas','Trompa',3,1,'Michael'),
(8,'2023-10-15','2023-10-20','Cochinilla','Piretrinas',3,1,'Michael'),
(8,'2023-10-15','2023-10-20','Hormigas','Trompa',3,1,'Michael'),
(3,'2023-10-15','2023-10-20','Sapos','Dicomil',3,1,'Michael');

/*Insertar alimentaciones*/
INSERT INTO ALIMENTACIONES VALUES (4,'2023-11-29','Bebedero','Agua con azucar',4,10,'Falta de comida'),
(7,'2023-11-29','Bebedero','Agua con azucar',4,10,'Falta de comida'),
(3,'2023-11-29','Bebedero','Agua con azucar',4,10,'Falta de comida'),
(12,'2023-11-29','Bebedero','Agua con azucar',4,10,'Falta de comida'),
(1,'2023-11-29','Bebedero','Agua con azucar',4,10,'Falta de comida'),
(2,'2023-11-29','Bebedero','Agua con azucar',4,10,'Falta de comida'),
(5,'2023-11-29','Bebedero','Agua con azucar',4,10,'Falta de comida'),
(6,'2023-11-29','Bebedero','Agua con azucar',4,10,'Falta de comida');