-- Franco Alejandro Paiz González 2022134 PE4CV-IN4AV
drop database if exists db_proyecto_banco_online2;
create database db_proyecto_banco_online2;

show databases;
show databases;
use db_proyecto_banco_online2;

-- DDL--------------------------------------
-- TABLAS SIN FOREIGN KEY--------------------------------

create table if not exists tbl_tipo_cuenta(
		id_tipo_cuenta int not null auto_increment,
        primary key(id_tipo_cuenta),
        unique(id_tipo_cuenta),
        tipo_cuenta varchar(50)
);


create table if not exists tbl_moneda(
	id_moneda int not null auto_increment,
    moneda varchar(50),
    primary key(id_moneda),
    unique(id_moneda)
);

show tables;



create table if not exists tbl_municipio(
	id_municipio int not null auto_increment,
    primary key (id_municipio),
    unique (id_municipio),
    municipio varchar (50)
);
create table if not exists tbl_departamento(
	id_departamento int not null auto_increment,
    primary key(id_departamento),
    unique(id_departamento),
    departamento varchar(50)
);



create table if not exists tbl_proveedor (
	id_proveedor int not null auto_increment,
    primary key (id_proveedor),
    unique (id_proveedor),
    proveedor varchar(50)
);

create table if not exists tbl_servicio(
	id_servicio int not null auto_increment,
    primary key(id_servicio),
    unique (id_servicio),
    servicio varchar(50)
);

create table if not exists tbl_banco(
	id_banco int not null auto_increment,
    primary key (id_banco),
    unique(id_banco),
    nombre_banco varchar(50),
    telefono_banco int not null,
    direccion_banco varchar(50),
    pagina_web varchar(50),
    gmail_banco varchar(50)
);


create table if not exists tbl_usuario(
	id_usuario int not null auto_increment,
    primary key(id_usuario),
    unique(id_usuario),
    usuario varchar(50),
    contraseña varchar(50),
    estado boolean
    
);
show tables;


-- TABLAS QUE CON FOREIGN KEY--------------------------
create table if not exists tbl_cliente(
	id_cliente int not null auto_increment,
    primary key(id_cliente),
    unique(id_cliente),
    nombres_cliente varchar(50),
    apellidos_cliente varchar(50),
    sexo varchar(1),
    nacionalidad varchar(15),
    identificador varchar(50),
    numero_identificador varchar(100),
    id_municipio int not null,
    id_departamento int not null,
    id_usuario int not null,
    telefono_cliente varchar(50),
    compañia_cliente varchar(50),
    foreign key(id_usuario) references tbl_usuario(id_usuario),
    foreign key(id_municipio) references tbl_municipio(id_municipio),
    foreign key(id_departamento) references tbl_departamento(id_departamento)
);

create table if not exists tbl_cuenta(
	id_cuenta int not null auto_increment,
    primary key(id_cuenta),
    unique(id_cuenta),
    numero_cuenta int not null,
    id_cliente int not null,
    id_banco int not null,
    id_tipo_cuenta int not null,
    id_moneda int not null,
    saldo float not null,
    foreign key(id_tipo_cuenta) references tbl_tipo_cuenta(id_tipo_cuenta),
    foreign key(id_moneda) references tbl_moneda(id_moneda),
    foreign key(id_cliente) references tbl_cliente(id_cliente),
    foreign key(id_banco) references tbl_banco(id_banco)
);

create table if not exists tbl_transaccion(
	id_transaccion int not null auto_increment,
    primary key(id_transaccion),
    unique(id_transaccion),
    id_proveedor int not null,
    id_servicio int not null,
    cantidad	float not null,
    cliente varchar(50),
    fecha date,
    foreign key(id_proveedor) references tbl_proveedor(id_proveedor),
    foreign key(id_servicio) references tbl_servicio(id_servicio)
);

/*alter table tbl_transaccion
add column cliente varchar(50);

alter table tbl_transaccion
add column fecha date;*/




create table if not exists detalle_cuenta_transaccion(
	id_detalle_cuenta_transaccion int not null auto_increment,
    primary key(id_detalle_cuenta_transaccion),
    unique(id_detalle_cuenta_transaccion),
    id_cuenta int not null,
    id_transaccion int not null,
    foreign key(id_cuenta) references tbl_cuenta(id_cuenta),
    foreign key(id_transaccion) references tbl_transaccion(id_transaccion)
);

-- DML------------------------------------
insert into tbl_departamento(id_departamento, departamento)
values(1, 'Alta Verapaz');

insert into tbl_departamento(departamento)
values('Baja Verapaz'),
	('Chimaltenango'),
    ('Chiquimula'),
    ('El Progreso'),
    ('Escuintla'),
	('Guatemala'),
    ('Huehuetenango'),
    ('Izabal'),
    ('Jalapa'),
    ('Jutiapa'),
    ('Peten'),
    ('Quetzaltenango'),
    ('Quiche'),
    ('Retalhuleu'),
    ('Sacatepequez'),
    ('San Marcos'),
    ('Santa Rosa'),
	('Solola'),
    ('Suchitepequez'),
    ('Totonicapan'),
    ('Zacapa');

insert into tbl_municipio(id_municipio, municipio)
values(1, 'Coban');

insert into tbl_municipio(municipio)
values('Santa Cruz Verapaz'),
('San Cristobal Verapaz'),
('Tactic'),
('Tamahu'),
('Tucuru'),
('Panzos'),
('Senahu'),
('San Pedro Carcha'),
('San Juan Chamelco'),
('Lanquin'),
('Cahabon'),
('Chisec'),
('Chahal'),
('Fray Bartolome De Las Casas'),
('Santa Catalina La Tinta'),
('Raxruha'),
('Salama'),
('San Miguel Chicaj'),
('Rabinal '),
('Cubulco'),
('Granados'),
('El Chol'),
('San Jeronimo '),
('Purulha'),
('Chimaltenango'),
('San Jose Poaquil'),
('San Martin Jilotepeque'),
('Comalapa'),
('Santa Apolonia'),
('Tecpan Guatemala'),
('Patzun'),
('Pochuta'),
('Patzicia'),
('Santa Cruz Balanya'),
('Acatenango'),
('Yepocapa'),
('San Andres Itzapa'),
('Parramos'),
('Zaragoza'),
('El Tejar'),
('Chiquimula'),
('San Jose La Arada'),
('San Juan Ermita'),
('Jocotan'),
('Camotan'),
('Olopa'),
('Esquipulas'),
('Concepcion Las Minas'),
('Quezaltepeque'),
('San Jacinto'),
('Ipala'),
('Guastatoya'),
('Morazan'),
('San Agustin Acasaguastlan'),
('San Cristobal Acasaguastlan'),
('El Jicaro'),
('Sansare'),
('Sanarate'),
('San Antonio La Paz'),
('Escuintla'),
('Santa Lucia Cotzumalguapa'),
('La Democracia'),
('Siquinala'),
('Masagua'),
('Tiquisate'),
('La Gomera'),
('Guanagazapa'),
('San Jose'),
('Iztapa'),
('Palin'),
('San Vicente Pacaya'),
('Nueva Concepcion'),
('Guatemala'),
('Santa Catarina Pinula'),
('San Jose Pinula'),
('San Jose Del Golfo'),
('Palencia'),
('Chinautla'),
('San Pedro Ayampuc'),
('Mixco'),
('San Pedro Sacatepequez'),
('San Juan Sacatepequez'),
('San Raymundo'),
('Chuarrancho'),
('Fraijanes'),
('Amatitlan'),
('Villa Nueva'),
('Villa Canales'),
('San Miguel Petapa'),
('Huehuetenango'),
('Chiantla'),
('Malacatancito'),
('Cuilco'),
('Nenton'),
('San Pedro Necta'),
('Jacaltenango'),
('Soloma'),
('San Idelfonso Ixtahuacan'),
('Santa Barbara'),
('La Libertad'),
('La Democracia'),
('San Miguel Acatan'),
('San Rafael La Independencia'),
('Todos Santos Cuchumatan'),
('San Juan Atitan'),
('Santa Eulalia'),
('San Mateo Ixtatan'),
('Colotenango'),
('San Sebastian Huehuetenango'),
('Tectitan'),
('Concepcion Huista'),
('San Juan Ixcoy'),
('San Antonio Huista'),
('San Sebastian Coatan'),
('Barillas'),
('Aguacatan'),
('San Rafael Petzal'),
('San Gaspar Ixchil'),
('Santiago Chimaltenango'),
('Santa Ana Huista'),
('Union Cantinil'),
('Puerto Barrios'),
('Livingston'),
('El Estor'),
('Morales'),
('Los Amates'),
('Jalapa'),
('San Pedro Pinula'),
('San Luis Jilotepeque'),
('San Manuel Chaparron'),
('San Carlos Alzatate'),
('Monjas'),
('Mataquescuintla'),
('Jutiapa'),
('El Progreso'),
('Santa Catarina Mita'),
('Agua Blanca'),
('Asuncion Mita'),
('Yupiltepeque'),
('Atescatempa'),
('Jerez'),
('El Adelanto'),
('Zapotitlan'),
('Comapa'),
('Jalpatagua'),
('Conguaco'),
('Moyuta'),
('Pasaco'),
('San Jose Acatempa'),
('Quesada'),
('Flores '),
('San Jose'),
('San Benito'),
('San Andres'),
('La Libertad'),
('San Francisco'),
('Santa Ana'),
('Dolores'),
('San Luis'),
('Sayaxche'),
('Melchor De Mencos '),
('Poptun'),
('Las Cruces'),
('Quetzaltenango'),
('Salcaja'),
('Olintepeque'),
('San Carlos Sija'),
('Sibilia'),
('Cabrican'),
('Cajola'),
('San Miguel Siguila'),
('San Juan Ostuncalco'),
('San Mateo'),
('Concepcion Chiquirichapa'),
('San Martin Sacatepequez'),
('Alomolonga'),
('Cantel'),
('Huitan '),
('Zunil'),
('Colomba'),
('San Francisco La Union'),
('El Palmar'),
('Coatepeque'),
('Genova'),
('Flores Costa Cuca'),
('La Esperanza'),
('Palestina De Los Altos'),
('Santa Cruz Del Quiche'),
('Chiche'),
('Chinique'),
('Zacualpa'),
('Chajul'),
('Chichicastenango'),
('Patzite'),
('San Antonio Ilotenango'),
('San Pedro Jocopilas'),
('Cunen'),
('San Juan Cotzal'),
('Joyabaj'),
('Nebaj'),
('San Andres Sajcabaja'),
('Uspantan'),
('Sacapulas'),
('San Bartolome Jocotenango'),
('Canilla'),
('Chicaman'),
('Playa Grande Ixcan'),
('Pachalum'),
('Retalhuleu'),
('San Sebastian'),
('Santa Cruz Mulua'),
('San Martin Zapotitlan'),
('San Felipe Retalhuleu'),
('San Andres Villa Seca'),
('Champerico'),
('Nuevo San Carlos'),
('El Asintal'),
('Antigua Guatemala'),
('Jocotenango'),
('Pastores'),
('Sumpango'),
('Santo Domingo Xenacoj'),
('Santiago Sacatepequez'),
('San Bartolome Milpas Altas'),
('San Lucas Sacatepequez'),
('Santa Lucia Milpas Altas'),
('Magdalena Milpas Altas'),
('Santa Maria De Jesus'),
('Ciudad Vieja'),
('San Miguel Dueñas'),
('Alotenango'),
('San Antonio Aguas Calientes'),
('Santa Catarina Barahona'),
('San Marcos'),
('San Pedro Sacatepequez'),
('San Antonio Sacatepequez'),
('Comitancillo'),
('San Miguel Ixtahuacan'),
('Concepcion Tutuapa'),
('Tacana'),
('Sibinal'),
('Tajumulco'),
('Tejutla'),
('San Rafael Pie De La Cuesta'),
('Nuevo Progreso'),
('El Tumbador'),
('El Rodeo'),
('Malacatan'),
('Catarina'),
('Ayutla'),
('Ocos'),
('San Pablo'),
('El Quetzal'),
('La Reforma'),
('Pajapita'),
('Ixchiguan'),
('San Jose Ojetenam'),
('San Cristobal Cucho'),
('Sipacapa'),
('Esquipulas Palo Gordo'),
('Rio Blanco'),
('San Lorenzo'),
('Cuilapa'),
('Barberena'),
('Santa Rosa De Lima'),
('Casillas'),
('San Rafael Las Flores'),
('Oratorio'),
('San Juan Tecuaco'),
('Chiquimulilla'),
('Taxisco'),
('Santa Maria Ixhuatan'),
('Guazacapan'),
('Santa Cruz Naranjo'),
('Pueblo Nuevo Viñas'),
('Nueva Santa Rosa'),
('Solola'),
('San Jose Chacaya'),
('Santa Maria Visitacion'),
('Santa Lucia Utatlan'),
('Nahuala'),
('Santa Catarina Ixtahuacan'),
('Santa Clara La Laguna'),
('Concepcion'),
('San Andres Semetabaj'),
('Panajachel'),
('Santa Catarina Palopo'),
('San Antonio Palopo'),
('San Lucas Toliman'),
('Santa Cruz La Laguna'),
('San Pablo La Laguna'),
('San Marcos La Laguna'),
('San Juan La Laguna'),
('San Pedro La Laguna'),
('Santiago Atitlan'),
('Mazatenango'),
('Cuyotenango'),
('San Francisco Zapotitlan'),
('San Bernardino'),
('San Jose El Idolo'),
('Santo Domingo Suchitepequez'),
('San Lorenzo'),
('Samayac'),
('San Pablo Jocopilas'),
('San Antonio Suchitepequez'),
('San Miguel Panan'),
('San Gabriel'),
('Chicacao'),
('Patulul'),
('Santa Barbara'),
('San Juan Bautista'),
('Santo Tomas La Union'),
('Zunilito'),
('Pueblo Nuevo'),
('Rio Bravo'),
('Totonicapan'),
('San Cristobal Totonicapan'),
('San Francisco El Alto'),
('San Andres Xecul'),
('Momostenango'),
('Santa Maria Chiquimula'),
('Santa Lucia La Reforma'),
('San Bartolo Aguas Calientes'),
('Zacapa'),
('Estanzuela'),
('Rio Hondo'),
('Gualan'),
('Teculutan'),
('Usumatlan'),
('Cabañas'),
('San Diego'),
('La Union'),
('Huite');


-- STORED PROCEDURES---------------------------------------------
-- ---------------------PROCEDIMIENTOS PARA EL PROGRAMA--------------


-- TIPO DE CUENTA  ----------------------------
-- INSERTAR
insert into tbl_tipo_cuenta(id_tipo_cuenta, tipo_cuenta) values (1, 'Monetaria');


DELIMITER //
create procedure sp_insertar_tipo_cuenta(in id int,
 in _tipo_cuenta varchar(50))
begin
insert into tbl_tipo_cuenta(id_tipo_cuenta, tipo_cuenta)
values(id, _tipo_cuenta);
end//
DELIMITER ;


call sp_insertar_tipo_cuenta(2, 'Ahorros');

-- ELIMINAR
DELIMITER //
create procedure sp_eliminar_tipo_cuenta( in id int)
begin
delete from tbl_tipo_cuenta
where id_tipo_cuenta= id;
end//
DELIMITER ;

call sp_eliminar_tipo_cuenta(2);

-- ACTUALIZAR
DELIMITER //
create procedure sp_actualizar_tipo_cuenta( in id int, in _tipo_cuenta varchar(50))
begin
update tbl_tipo_cuenta
set tipo_cuenta = _tipo_cuenta
where id_tipo_cuenta = id;
end//
DELIMITER ;


select*from tbl_tipo_cuenta;
call sp_actualizar_tipo_cuenta(1, 'Ahorros');

-- MONEDA---------------------------------------------------
-- INSERTAR -----------------------
insert into tbl_moneda(id_moneda, moneda) values (1, 'Dolar');

DELIMITER //
create procedure sp_insertar_moneda(in id int, in _moneda varchar(50))
begin
insert into tbl_moneda(id_moneda, moneda)
values(id, _moneda);
end//
DELIMITER ;

call sp_insertar_moneda(2, 'Dolar');

select*from tbl_moneda;

select*from tbl_banco;

-- ELIMINAR --------------------------------

DELIMITER //
create procedure sp_eliminar_moneda( in id int)
begin
delete from tbl_moneda
where id_moneda = id;
end//
DELIMITER ;

call sp_eliminar_moneda(2);

-- ACTUALIZAR --------------------------

DELIMITER //
create procedure sp_actualizar_moneda( in id int, in _moneda varchar(50))
begin
update tbl_moneda
set moneda = _moneda
where id_moneda = id;
end//
DELIMITER ;

call sp_actualizar_moneda(1, 'EURO');

-- PROVEEDOR--------------------------------------------------------------
-- INSERTAR
insert into tbl_proveedor(id_proveedor, proveedor) values(1, 'Tigo');

DELIMITER //
create procedure sp_insertar_proveedor( in id int, in _proveedor varchar(50))
begin
insert into tbl_proveedor(id_proveedor, proveedor)
values(id, _proveedor);
end//
DELIMITER ;

call sp_insertar_proveedor(2, 'EGGSA');

-- ELIMINAR--------------------
DELIMITER //
create procedure sp_eliminar_proveedor( in id int)
begin
delete from tbl_proveedor
where id_proveedor = id;
end//
DELIMITER ;

call sp_eliminar_proveedor(2);
select*from tbl_proveedor;

-- ACTUALIZAR ------------
DELIMITER //
create procedure sp_actualizar_proveedor( in id int, in _proveedor varchar(50))
begin
update tbl_proveedor
set proveedor = _proveedor
where id_proveedor = id;
end//
DELIMITER ;

call sp_actualizar_proveedor(1, 'EGGSA');

-- SERVICIO-------------------------------
-- INSERTAR-----------

DELIMITER //
create procedure sp_insertar_servicio(in id int, in _servicio varchar(50))
begin
insert into tbl_servicio(id_servicio, servicio)
values(id, _servicio);
end//
DELIMITER ;

call sp_insertar_servicio(1, 'Agua');

select*from tbl_servicio;


-- ELIMINAR -----------------
DELIMITER //
create procedure sp_eliminar_servicio(in id int)
begin
delete from tbl_servicio
where id_servicio = id;
end//
DELIMITER ;

/*call sp_eliminar_servicio(1);*/

-- ACTUALIZAR ---------------------------

DELIMITER //
create procedure sp_actualizar_servicio(in id int, in _servicio varchar(50))
begin
update tbl_servicio
set servicio = _servicio
where id_servicio = id;
end//
DELIMITER ;

call sp_actualizar_servicio(1, 'Luz');

-- BANCO -------------------

-- INSERTAR
select*from tbl_banco;

DELIMITER //
create procedure sp_insertar_banco(in id int, in _nombre_banco varchar(50), in _telefono_banco int, 
in _direccion_banco varchar(50), in _pagina_web varchar(50), in _gmail_banco varchar(50))
begin
insert into tbl_banco(id_banco, nombre_banco, telefono_banco, direccion_banco, pagina_web, gmail_banco)
values(id,_nombre_banco, _telefono_banco, _direccion_banco, _pagina_web, _gmail_banco);
end//
DELIMITER ;

call sp_insertar_banco(1, 'G Y T', 23234455, 'Zona 5 Guatemala', 'gyt.com','gyt@gmail.com' );
-- ACTUALIZAR
DELIMITER //
create procedure sp_actualizar_banco(in id int, in _nombre_banco varchar(50), in _telefono_banco int, 
in _direccion_banco varchar(50), in _pagina_web varchar(50), in _gmail_banco varchar(50))
begin
update tbl_banco
set nombre_banco = _nombre_banco, telefono_banco = _telefono_banco, direccion_banco = _direccion_banco, pagina_web = _pagina_web, gmail_banco =_gmail_banco
where id_banco = id;
end//
DELIMITER ;

select*from tbl_banco;

select*from tbl_tipo_cuenta;

select*from tbl_servicio;


-- ELIMINAR 
DELIMITER //
create procedure sp_eliminar_banco(in id int)
begin
delete from tbl_banco
where id_banco = id;
end//
DELIMITER ;

select*from tbl_tipo_cuenta;


-- USUARIO--------------------------
-- INSERTAR USUARIO--------------

select*from tbl_usuario;


insert into tbl_usuario(id_usuario, usuario, contraseña, estado) values(1, 'Ejemplo1', '2345', true);

DELIMITER //
create procedure sp_insertar_usuario(in _usuario varchar(50), in _contraseña varchar(50))
begin
insert into tbl_usuario(usuario, contraseña, estado)
values(_usuario, _contraseña, true);
end//
DELIMITER ;

call sp_insertar_usuario('Franco', '0909');

-- VER USUARIOS ------------------
DELIMITER //
create procedure sp_ver_usuarios(in _usuario varchar(50), in _contraseña varchar(50))
begin
select*from tbl_usuario where usuario = _usuario and contraseña = _contraseña;
end//
DELIMITER ;

-- VER ID USUARIO 

DELIMITER //
create procedure sp_ver_usuarios_id(in _usuario varchar(50), in _contraseña varchar(50))
begin
select id_usuario from tbl_usuario where usuario = _usuario and contraseña = _contraseña;
end//
DELIMITER 



-- CLIENTE ---------------------
-- INSERTAR ------------------



DELIMITER //
create procedure sp_insertar_cliente(in _nombres_cliente varchar(50), in _apellidos_cliente varchar(50), in _sexo varchar(1), in _nacionalidad varchar(15), 
in _identificador varchar(50), in _numero_identificador varchar(50), in _id_municipio varchar(50), in _id_departamento varchar(50), in _id_usuario varchar(50), in _telefono_cliente varchar(50), in _compañia_cliente varchar(50))
begin
insert into tbl_cliente(nombres_cliente, apellidos_cliente, sexo, nacionalidad, identificador, numero_identificador, id_municipio, id_departamento, id_usuario, telefono_cliente, compañia_cliente)
values(_nombres_cliente, _apellidos_cliente, _sexo, _nacionalidad, _identificador, _numero_identificador, _id_municipio, _id_departamento, _id_usuario, _telefono_cliente, _compañia_cliente);
end//
DELIMITER ;


Insert into tbl_cliente(id_cliente, nombres_cliente, apellidos_cliente, sexo, nacionalidad, identificador, numero_identificador, id_municipio, id_departamento, id_usuario, telefono_cliente, compañia_cliente)
values(1, 'Juan', 'Gomez', 'M', 'Guate', 'DPI', '1345646798', 2, 12, 1, '23435566', 'Tigo' );
select*from tbl_cliente;




-- LISTAR
-- ACTUALIZAR-------------------------------------


DELIMITER //
create procedure sp_actualizar_cliente(in id int, in _nombres_cliente varchar(50), in _apellidos_cliente varchar(50), in _sexo varchar(1), in _nacionalidad varchar(50), 
in _identificador varchar(50), in _numero_identificador varchar(50), in _id_municipio varchar(50), in _id_departamento varchar(50), in _id_usuario varchar(50), in _telefono_cliente varchar(50), in _compañia_cliente varchar(50))
begin
update tbl_cliente
set nombres_cliente = _nombres_cliente,  apellidos_cliente = _apellidos_cliente, sexo = _sexo, nacionalidad = _nacionalidad, identificador = _identificador, numero_identificador = _numero_identificador, 
id_municipio = _id_municipio, id_departamento = _id_departamento, id_usuario = _id_usuario, telefono_cliente = _telefono_cliente, compañia_cliente = _compañia_cliente
where id_cliente = id;
end//
DELIMITER ;



select*from tbl_cliente;


-- CUENTAAAAA---------------------
-- INSERTAR------------------
insert into tbl_cuenta(id_cuenta, numero_cuenta, id_cliente, id_banco, id_tipo_cuenta, id_moneda, saldo) values (1, 123, 1, 1, 1, 1, 1000);
insert into 
DELIMITER //
create procedure sp_insertar_cuenta(in _numero_cuenta int, in _id_cliente int, in _id_banco int,in _id_tipo_cuenta int, in _id_moneda int, in _saldo float)
begin
insert into tbl_cuenta(numero_cuenta, id_cliente, id_banco, id_tipo_cuenta, id_moneda, saldo)
values(_numero_cuenta, _id_cliente, _id_banco, _id_tipo_cuenta, _id_moneda, _saldo);
end//
DELIMITER ;

select*from tbl_cuenta;
-- ACTUALIZARRR------------------

DELIMITER //
create procedure sp_actualizar_cuenta(in id int, in _numero_cuenta int, in _id_cliente int, in _id_banco int,in _id_tipo_cuenta int, in _id_moneda int, in _saldo float)
begin
update tbl_cuenta
set numero_cuenta = _numero_cuenta, id_cliente = _id_cliente, id_banco = _id_banco, id_tipo_cuenta = _id_tipo_cuenta, id_moneda = _id_moneda, saldo = _saldo
where id_cuenta = id;
end//
DELIMITER ;



-- TRANSACCION --------------------------------
-- INSERTAR----
insert into tbl_transaccion(id_transaccion, id_proveedor, id_servicio, cantidad) values (1, 1, 1, 100);
select*from tbl_transaccion;

DELIMITER //
create procedure sp_insertar_transaccion(in _id_proveedor int, in _id_servicio int, in _cantidad float, in _cliente varchar(50),  in _fecha date)
begin
insert into tbl_transaccion(id_proveedor, id_servicio, cantidad, cliente, fecha) 
values (_id_proveedor, _id_servicio, _cantidad, _cliente, _fecha);
end//
DELIMITER ;
select*from tbl_transaccion;


-- ELIMINAR

DELIMITER //
create procedure sp_eliminar_transaccion(in id int)
begin
delete from tbl_transaccion
where id_transaccion = id;
end//
DELIMITER ;

-- ACTUALIZAR
DELIMITER //
create procedure sp_actualizar_transaccion(in id int, in _id_proveedor int, in _id_servicio int, in _cantidad float)
begin
update tbl_transaccion
set id_proveedor = _id_proveedor, id_servicio =_id_servicio, cantidad = _cantidad
where id_transaccion = id;
end//
DELIMITER ;

select*from tbl_usuario;

select id_usuario from tbl_usuario where usuario= 'denys' and contraseña= '123';
select id_usuario, usuario, contraseña from tbl_usuario where usuario = 'pepetrueno' and contraseña = 'eltrueno';
select*from tbl_cliente where id_usuario= 7;

delete from tbl_usuario where id_usuario = 12;
select*from tbl_cliente;
select*from tbl_usuario;

SET GLOBAL time_zone ='-5:00';SET GLOBAL time_zone ='-5:00';