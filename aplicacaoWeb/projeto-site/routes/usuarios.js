var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Usuario = require('../models').Usuario;
let sessoes = [];

/* Recuperar usuário por login e senha */
router.post('/autenticar', function(req, res, next) {
	console.log('Recuperando usuário por login e senha');

	var login = req.body.cpf; // depois de .body, use o nome (name) do campo em seu formulário de login
	var senha = req.body.senha; // depois de .body, use o nome (name) do campo em seu formulário de login	
	
	let instrucaoSql = `select * from usuarios where cpfUsuario='${login}' and senhaUsuario='${senha}'`;
	console.log(instrucaoSql);

	sequelize.query(instrucaoSql, {
		model: 	Usuario
	}).then(resultado => {
		console.log(`Encontrados: ${resultado.length}`);
//Joga os valores para o json
		console.log(resultado[0].dataValues.nomeUsuario);
		if (resultado.length == 1) {
			//  sessoes.push(resultado[0].dataValues.nomeUsuario);
			console.log('sessoes: ',sessoes);
			res.json(resultado[0]);
		} else if (resultado.length == 0) {
			res.status(403).send('Login e/ou senha inválido(s)');
		} else {
			res.status(403).send('Mais de um usuário com o mesmo login e senha!');
		}

	}).catch(erro => {
		console.error(erro);
		res.status(500).send(erro.message);
  	});
});

router.post('/cadastrar', function(req, res, next) {
	console.log('Criando um usuário');
		var nomeUsuario = req.body.usuario;
		var emailUsuario = req.body.email;
		var senhaUsuario = req.body.senha;
		var cpf = req.body.cpf;
		var tipoUsuario = req.body.tipo;
	const instrucaoSql = `insert into usuarios values(null,'${nomeUsuario}','${cpf}','${emailUsuario}','${senhaUsuario}','${tipoUsuario}');
	`;
	sequelize.query(instrucaoSql, {
		model: Usuario,
		mapToModel: true 
	  })
	  .then(resultado => {
			console.log(`Encontrados: ${resultado.length}`);
			res.json(resultado);
	  }).catch(erro => {
			console.error(erro);
			res.status(500).send(erro.message);
	  });
});


router.get('/todos', function(req, res, next) {
	
	// alterar  os nomes da tabela de acordo com o nome da tabela e do nome dos campo

	const instrucaoSql = `select idUsuario, nomeUsuario, cpfUsuario, emailUsuario, senhaUsuario, tipoUsuario from usuarios order by idUsuario desc;`;
	sequelize.query(instrucaoSql, {
		model: Usuario,
		mapToModel: true 
	  })
	  .then(resultado => {
			console.log(`Encontrados: ${resultado.length}`);
			res.json(resultado[0]);
	  }).catch(erro => {
			console.error(erro);
			res.status(500).send(erro.message);
	  });
});
module.exports = router;