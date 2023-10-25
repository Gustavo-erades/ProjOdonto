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
alter table prontuariobd.paciente add column endereco varchar(100);
alter table prontuariobd.paciente add column sexo  varchar(20);
alter table prontuariobd.paciente add column data_nascimento varchar(10);
alter table prontuariobd.paciente add column estado_civil varchar(20);
alter table prontuariobd.paciente add column cor varchar(12);
alter table prontuariobd.paciente add column proficao varchar(30);
alter table prontuariobd.paciente add column cep varchar(9);
alter table prontuariobd.paciente add column telefone_casa varchar(20);
alter table prontuariobd.paciente add column cidade varchar(20);
alter table prontuariobd.paciente add column telefone_trab varchar(20);
alter table prontuariobd.paciente add column responsavel varchar (50);
alter table prontuariobd.paciente add column telefone_responsavel varchar(20);
alter table prontuariobd.paciente add column email_responsavel varchar(100);*/