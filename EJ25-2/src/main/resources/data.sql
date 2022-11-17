DROP table IF EXISTS departamentos;
DROP table IF EXISTS empleados;

create table departamentos(
	id int auto_increment PRIMARY KEY,
	nombre varchar(100),
	presupuesto int
	);

create table empleados(
	dni varchar(8) PRIMARY KEY,
	nombre varchar(100),
	apellidos varchar (100),
	departamento_id int,
    FOREIGN KEY (departamento_id) REFERENCES departamentos(id) ON DELETE CASCADE ON UPDATE CASCADE 
    );
    


insert into departamentos (nombre,presupuesto) values('Departamento 1' , 10000);
insert into departamentos (nombre,presupuesto) values('Departamento 2' , 20000);
insert into departamentos (nombre,presupuesto) values('Departamento 3' , 30000);
insert into departamentos (nombre,presupuesto) values('Departamento 4' , 40000);
insert into departamentos (nombre,presupuesto) values('Departamento 5' , 50000);



insert into empleados (dni, nombre, apellidos, departamento_id) values('1111111A','Pedro', 'Sanchez', '1');
insert into empleados (dni, nombre, apellidos, departamento_id) values('2222222B','Mariano', 'Rajoy', '2');
insert into empleados (dni, nombre, apellidos, departamento_id) values('3333333C','Pablo', 'Iglesias', '3');
insert into empleados (dni, nombre, apellidos, departamento_id) values('4444444D','Juan', 'Ca', '2');
