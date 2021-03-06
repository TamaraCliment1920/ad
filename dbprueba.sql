create table categoria (
  id serial primary key,
  nombre varchar(50) not null unique
);

insert into categoria (nombre) values ('categoría 1');
insert into categoria (nombre) values ('categoría 2');
insert into categoria (nombre) values ('categoría 3');

create table articulo (
  id serial primary key,
  nombre varchar(50) not null unique,
  precio decimal(10,2),
  categoria bigint unsigned,
  foreign key (categoria) references categoria (id)
);

insert into articulo (nombre, precio, categoria) values ('artículo 1', 1.0, 1);
insert into articulo (nombre, precio, categoria) values ('artículo 2', 2.0, 2);
insert into articulo (nombre, precio, categoria) values ('artículo 3', 3.0, 3);

create table cliente (
  id serial primary key,
  nombre varchar(50) not null unique
);

insert into cliente (nombre) values ('cliente 1');
insert into cliente (nombre) values ('cliente 2');
insert into cliente (nombre) values ('cliente 3');

create table pedido (
  id serial primary key,
  fecha datetime not null unique,
  cliente bigint unsigned not null,
  importe numeric(10,2) not null,
  foreign key (cliente) references cliente (id)
);

create table pedidolinea (
  id serial primary key,
  pedido bigint unsigned not null,
  articulo bigint unsigned not null,
  precio numeric(10,2) not null,
  unidades numeric(10,2) not null,
  importe numeric(10,2) not null,
  foreign key (pedido) references pedido (id) on delete cascade,
  foreign key (articulo) references articulo (id)
);

