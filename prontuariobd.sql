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
create table prontuariobd.paciente_saude_geral(
	questoes binary(36),
    doenca_contagiosa varchar(200),
    alergia varchar(200),
    bebida varchar(200),
    drogas varchar(200),
    medicamento varchar(200),
    fumo varchar(200),
    id int not null auto_increment,
    primary key(id),
    foreign key (id) references prontuariobd.paciente(id)
);
create table prontuariobd.sequencia_tratamento(
	data_tratamento varchar(10),
    dente varchar(20),
    procedimento varchar(100),
    id int not null,
    primary key(id),
    foreign key(id) references prontuariobd.paciente(id)
);

select *from prontuariobd.sequencia_tratamento;
