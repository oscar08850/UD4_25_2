DROP table IF EXISTS departamentos;
DROP table IF EXISTS empleados;

create table departamentos(
	id int auto_increment PRIMARY KEY,
	nombre varchar(100),
	presupuesto int
	);

create table empleados(
	dni varchar(9) PRIMARY KEY,
	nombre varchar(100),
	apellidos varchar (100),
	departamento_id int,
    FOREIGN KEY (departamento_id) REFERENCES departamentos(id) ON DELETE CASCADE ON UPDATE CASCADE 
    );
    


insert into fabricantes (nombre,presupuesto) values('Departamento 1' , 10000);
insert into fabricantes (nombre,presupuesto) values('Departamento 2' , 20000);
insert into fabricantes (nombre,presupuesto) values('Departamento 3' , 30000);
insert into fabricantes (nombre,presupuesto) values('Departamento 4' , 40000);
insert into fabricantes (nombre,presupuesto) values('Departamento 5' , 50000);



insert into articulos (dni, nombre, apellidos, departamento_id) values('11111111A','Pedro', 'Sanchez', '1');
insert into articulos (dni, nombre, apellidos, departamento_id) values('22222222B','Mariano', 'Rajoy', '2');
insert into articulos (dni, nombre, apellidos, departamento_id) values('33333333C','Pablo', 'Iglesias', '3');
insert into articulos (dni, nombre, apellidos, departamento_id) values('44444444D','Juan', 'Ca', '2');
