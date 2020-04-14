create database alprime;
use alprime;

create table usuarios (idUsuario int primary key, nomeUsuario varchar(45),cpfUsuario varchar(45),emailUsuario varchar(45),senhaUsuario varchar(45),tipoUsuario varchar(45));
create table maquina (id_maquina int primary key, tipo_processador varchar(45), capacidade_memoria int, sistema_operacional varchar(45));
Alter table maquina add fk_localizacao int ;
alter table maquina add foreign key (fk_localizacao)references localizacao(id_localizacao) ;
create table localizacao (id_localizacao int primary key, nome_localizacao varchar(45), tipo_linha varchar(45),endereco varchar(45));

insert into usuarios values(2,'diovana','123','diovana@bandtec.com.br','123','comum');
insert into localizacao values (1,'consolação','verde','haddllock lobo');
insert into maquina values (1, "aa", 2,"Windows","1");
select * from maquina;
select * from localizacao;
select idUsuario, nomeUsuario, cpfUsuario, emailUsuario, senhaUsuario, tipoUsuario from usuarios order by idUsuario desc;
insert into usuarios values(smax(count(idUsuario)) ,'teste_count','123','diovana@bandtec.com.br','123','comum');

select count(idUsuario) from usuarios;

drop table maquina;
drop table localizacao;