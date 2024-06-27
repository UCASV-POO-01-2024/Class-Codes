create database dbDiccionario;

use dbDiccionario;

create table tbTipoPalabra(
id int primary key,
tipo varchar(15)
);

create table tbPalabra(
id int primary key auto_increment,
id_tipo int,
palabra varchar(50),
definicion text,
index(id_tipo),
foreign key (id_tipo) 
references tbTipoPalabra(id) on delete cascade
);