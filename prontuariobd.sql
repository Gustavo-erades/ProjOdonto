create database prontuariobd;
use prontuariobd;
create table paciente(
	nome varchar(150),
    id int not null auto_increment,
    primary key (id)
);
select *from prontuariobd.paciente;/*
insert into prontuariobd.paciente(nome) values("gustavo");
alter  table prontuariobd.paciente add column cpf int(11) not null;
alter table prontuariobd.paciente add column rg int(7) not null;
alter table prontuariobd.paciente add column idade int not null;
alter table prontuariobd.paciente add column telefone varchar(20);
alter table prontuariobd.paciente add column email varchar(100);
alter table prontuariobd.paciente add column endereco varchar(100);*/

