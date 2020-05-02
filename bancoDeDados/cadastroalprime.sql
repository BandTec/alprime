create database alprime;
use alprime;

create table usuario (id_usuario int primary key auto_increment, nome_usuario varchar(45),cpf_usuario varchar(45),email_usuario varchar(45),senha_usuario varchar(45),telefone varchar(45));
create table localizacao (id_localizacao int primary key auto_increment, nome_localizacao varchar(45), tipo_linha varchar(45),endereco varchar(70),total_maquina INT);
create table maquina (id_maquina int primary key auto_increment,senha_maquina varchar(45), tipo_processador varchar(45), capacidade_memoria double, sistema_operacional varchar(45),
					  status tinyint, hostname varchar(45), fabricante varchar(45), modelo varchar(45), ram_total varchar(45));
create table registro (id_registro int primary key auto_increment, data_hora datetime, porc_processador double, porc_disco double, porc_memoria double,temp_cpu double ,porc_ram double);

Alter table usuario add fk_localizacao int ;
alter table usuario add foreign key (fk_localizacao)references localizacao(id_localizacao) ;
Alter table maquina add fk_localizacao int ;
alter table maquina add foreign key (fk_localizacao)references localizacao(id_localizacao) ;
Alter table registro add fk_maquina int ;
alter table registro add foreign key (fk_maquina)references maquina(id_maquina) ;

select * from maquina;
select count(id_maquina) from maquina;

select * from localizacao;
select * from registro; 
delete from registro where id_registro > 0;
select * from usuario;
select registro.* from registro, maquina where id_maquina = 1 AND fk_maquina = id_maquina order by id_registro desc limit 10;
select * from maquina;
select usuario.* from maquina, localizacao, usuario where maquina.fk_localizacao = id_localizacao AND usuario.fk_localizacao = id_localizacao AND id_maquina = 1;
insert into localizacao values (null, "Giovanni Gronchi", "Lilás","Jardim Mirante, São Paulo - SP, 05801-110, ‎Av. João Dias, 3569",0);
insert into usuario values (null,"Gabriel","123.456.789-01","gabriel.oliveira@bandtec.com.br","123","(11)96452-2405",1);
insert into maquina values (null,"teste","teste",0,"teste",true,"teste","teste","teste","teste",1);
insert into registro values (null,'1000-01-01 00:00:00',0,0,0,0,0,1);

select * from maquina where id_maquina= 1;
select * from registro where fk_maquina =1;
select * from registro, maquina, localizacao where fk_maquina = 1 and fk_maquina = id_maquina and fk_localizacao = id_localizacao;

update maquina set fk_localizacao = 1 where id_maquina = 1;

delete from registro where id_registro >0;
delete from maquina where id_maquina > 5;
delete from localizacao where id_localizacao = 2;
select idUsuario, nomeUsuario, cpfUsuario, emailUsuario, senhaUsuario, tipoUsuario from usuarios order by idUsuario desc;

update maquina set tipo_processador = "aaa", capacidade_memoria = 0, sistema_operacional = "linux", status = false, hostname= "batata", fabricante = "aaaa", modelo = "asdw", ram_total = "aaa" where id_maquina = 5;

select count(idUsuario) from usuarios;
drop table usuario;
drop table maquina;
drop table localizacao;
drop table registro;