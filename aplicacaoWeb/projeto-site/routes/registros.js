var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Registro = require('../models').Registro;
const selectQueryType = {
	type: sequelize.QueryTypes.SELECT
};
/* Recuperar as últimas N leituras */
router.get('/ultimas/:id_maquina', function(req, res, next) {
	
	// quantas são as últimas leituras que quer? 8 está bom?
	const limite_linhas = 7;

	console.log(`Recuperando os últimos ${limite_linhas} registros`);
	
	// alterar  os nomes da tabela de acordo com o nome da tabela e do nome dos campo

	const instrucaoSql = `select registro.* from registro, maquina where id_maquina = ${req.params.id_maquina} AND fk_maquina = id_maquina order by id_registro desc limit 10;`;
	sequelize.query(instrucaoSql, selectQueryType, {
		model: Registro,
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


router.get('/Linha', function(req, res, next) {

	const instrucaoSql = `SELECT DISTINCT(tipo_linha) FROM localizacao;`;
	sequelize.query(instrucaoSql, selectQueryType, {
		model: Registro,
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

router.get('/estacoes/:linha', function(req, res, next) {
	
	const instrucaoSql = `select nome_localizacao from localizacao where tipo_linha = "${req.params.linha}";`;
	sequelize.query(instrucaoSql, selectQueryType, {
		model: Registro,
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

router.get('/buscar/:Estacoes', function(req, res, next) {
	
	const instrucaoSql = `select tipo_linha,nome_localizacao,status from maquina, localizacao where fk_localizacao = id_localizacao and nome_localizacao = "${req.params.Estacoes}";`;
	sequelize.query(instrucaoSql, selectQueryType, {
		model: Registro,
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

module.exports = router;
