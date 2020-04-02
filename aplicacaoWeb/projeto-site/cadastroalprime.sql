create database alprime;
use alprime;
create table usuarios (idUsuario int primary key, nomeUsuario varchar(45),cpfUsuario varchar(45),emailUsuario varchar(45),senhaUsuario varchar(45),tipoUsuario varchar(45));
insert into usuarios values(2,'diovana','123','diovana@bandtec.com.br','123','comum');
select idUsuario, nomeUsuario, cpfUsuario, emailUsuario, senhaUsuario, tipoUsuario from usuarios;
select idUsuario, nomeUsuario, cpfUsuario, emailUsuario, senhaUsuario, tipoUsuario from usuarios order by idUsuario desc;
insert into usuarios values(smax(count(idUsuario)) ,'teste_count','123','diovana@bandtec.com.br','123','comum');

select count(idUsuario) from usuarios;