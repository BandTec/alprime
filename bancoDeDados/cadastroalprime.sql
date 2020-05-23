create database alprime;
use alprime;

create table usuario (id_usuario int primary key auto_increment, nome_usuario varchar(45),cpf_usuario varchar(45),email_usuario varchar(45),senha_usuario varchar(45),telefone varchar(45));
create table localizacao (id_localizacao int primary key auto_increment, nome_localizacao varchar(45), tipo_linha varchar(45),endereco varchar(70),total_maquina INT);
create table maquina (id_maquina int primary key auto_increment,senha_maquina varchar(45), tipo_processador varchar(45), capacidade_memoria double, sistema_operacional varchar(45),
					  status tinyint, hostname varchar(45), fabricante varchar(45), modelo varchar(45), ram_total varchar(45));
create table registro (id_registro int primary key auto_increment, data_hora datetime, porc_processador double, porc_disco double, porc_memoria double,temp_cpu double ,porc_ram double);
create table venda (id_venda int primary key auto_increment, valor double, data_hora datetime);

Alter table venda add fk_maquina int ;
alter table venda add foreign key (fk_maquina) references maquina(id_maquina) ;
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
select * from venda;
delete from registro where id_registro > 0;
select * from usuario;
select registro.* from registro, maquina where id_maquina = 1 AND fk_maquina = id_maquina order by id_registro desc limit 10;
select * from maquina;
select usuario.* from maquina, localizacao, usuario where maquina.fk_localizacao = id_localizacao AND usuario.fk_localizacao = id_localizacao AND id_maquina = 1;
insert into localizacao values (null, "Giovanni Gronchi", "Lilás","Jardim Mirante, São Paulo - SP, 05801-110, ‎Av. João Dias, 3569",0);
insert into usuario values (null,"Gabriel","123.456.789-01","gabriel.oliveira@bandtec.com.br","123","(11)96452-2405",1);
insert into maquina values (null,"teste","teste",0,"teste",true,"teste","teste","teste","teste",1);
insert into registro values (null,'1000-01-01 00:00:00',0,0,0,0,0,1);
insert into venda values (null,10,'1000-01-01 04:00:00',1);
insert into venda values (null,10,'1000-01-01 02:02:00',2);
insert into venda values (null,10,'1000-01-01 01:03:00',3);
insert into venda values (null,10,'1000-01-01 00:01:00',1);
insert into venda values (null,10,'1000-01-01 01:02:00',2);
insert into venda values (null,10,'1000-01-01 02:02:00',3);
insert into venda values (null,10,'1000-01-01 03:03:00',1);
insert into venda values (null,10,'2020-03-01 14:54:00',2);

select * from venda;
select * from registro where fk_maquina =1;
select * from registro, maquina, localizacao where fk_maquina = 1 and fk_maquina = id_maquina and fk_localizacao = id_localizacao;

update maquina set fk_localizacao = 1 where id_maquina = 1;

delete from registro where id_registro >0;
delete from maquina where id_maquina > 5;
delete from localizacao where id_localizacao = 2;
select idUsuario, nomeUsuario, cpfUsuario, emailUsuario, senhaUsuario, tipoUsuario from usuarios order by idUsuario desc;

update maquina set tipo_processador = "aaa", capacidade_memoria = 0, sistema_operacional = "linux", status = false, hostname= "batata", fabricante = "aaaa", modelo = "asdw", ram_total = "aaa" where id_maquina = 5;

drop table usuario;
drop table maquina;
drop table localizacao;
drop table registro;
select * from venda;
select * from venda where convert(data_hora, date) between '1000-01-01' and '2020-01-01';
select count(id_venda), hour(data_hora) from venda, maquina where fk_maquina = id_maquina And id_maquina = 1 group by hour(data_hora);
select sum(valor) as totalDinheiro, count(id_venda) as totalUsuarios from venda where convert(data_hora, date) between '1000-01-01' and '2020-01-01';
select * from venda, maquina where fk_maquina = id_maquina and id_maquina = 1;