create database prontuariobd;
use prontuariobd;
create table paciente(
	nome varchar(150),
    id int not null auto_increment,
	cpf int(11) not null,
	rg int(7) not null,
    idade int not null,
    telefone varchar(20),
    email varchar(100),
    endereco varchar(100),
    sexo  varchar(20),
    data_nascimento varchar(10),
    estado_civil varchar(20),
    cor varchar(12),
    profissao varchar(30),
    cep varchar(9),
    telefone_casa varchar(20),
    cidade varchar(20),
    telefone_trab varchar(20),
    responsavel varchar (50),
    telefone_responsavel varchar(20),
    email_responsavel varchar(100),
    primary key (id)
);
create table prontuariobd.paciente_informacoes(
	queixa varchar(500),
    doenca_atual varchar(300),
    medica_pre varchar (100),
    medicacao varchar(100),
    alcool varchar(100),
    fumo varchar(100),
    pressao_arterial varchar(100),
    exame_fisico varchar(100),
    intra_oral varchar(300),
    extra_oral varchar(300),
    id_paciente int not null auto_increment,
    primary key (id_paciente),
	foreign key (id_paciente) references prontuariobd.paciente(id)
);

select *from prontuariobd.paciente_informacoes;