var express = require('express');
const venda = require('../models/venda');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Maquina = require('../models').Maquina;
const selectQueryType = {
	type: sequelize.QueryTypes.SELECT
};

  router.get("/getMaquina/:idmaquina", function (req, res, next) {
	console.log("Recuperando uma maquina");
	var id_maquina = req.params.idmaquina;
	const instrucaoSql1 = ` select * from maquina where id_maquina = '${id_maquina}'`;
	sequelize.query(instrucaoSql1,selectQueryType, {
		model: Maquina,
		mapToModel: true,
	  })
	  .then((resultado) => {
		console.log(`Encontrados: ${resultado.length}`);
	    res.json(resultado);
	  })
	  .catch((erro) => {
		console.error(erro);
		res.status(500).send(erro.message);
	  });
  });

  router.get("/getMaquina/:status", function (req, res, next) {
	console.log("Recuperando uma maquina");
	var status = req.params.status;
	const instrucaoSql1 = ` select * from maquina where status = '${status}'`;
	sequelize.query(instrucaoSql1,selectQueryType, {
		model: Maquina,
		mapToModel: true,
	  })
	  .then((resultado) => {
		console.log(`Encontrados: ${resultado.length}`);
	    res.json(resultado);
	  })
	  .catch((erro) => {
		console.error(erro);
		res.status(500).send(erro.message);
	  });
  });

  router.get("/getMaquina/:capacidade", function (req, res, next) {
	console.log("Recuperando uma maquina");
	var capacidade = req.params.capacidade;
	const instrucaoSql1 = ` select * from maquina where capacidade = '${capacidade}'`;
	sequelize.query(instrucaoSql1,selectQueryType, {
		model: Maquina,
		mapToModel: true,
	  })
	  .then((resultado) => {
		console.log(`Encontrados: ${resultado.length}`);
	    res.json(resultado);
	  })
	  .catch((erro) => {
		console.error(erro);
		res.status(500).send(erro.message);
	  });
  });

  router.get("/getVenda/:id_maquina", function (req, res, next) {
	console.log("Recuperando uma venda");
	var id_maquina = req.params.id_maquina;
	const instrucaoSql1 = ` select sum(valor) as transacoes from venda where fk_maquina = '${id_maquina}'`;
	sequelize.query(instrucaoSql1,selectQueryType, {
		model: Venda,
		mapToModel: true,
	  })
	  .then((resultado) => {
		console.log(`Encontrados: ${resultado.length}`);
	    res.json(resultado);
	  })
	  .catch((erro) => {
		console.error(erro);
		res.status(500).send(erro.message);
	  });
  });

  router.get("/getAviso/:ocorrencia", function (req, res, next) {
	console.log("Recuperando uma maquina");
	var id_maquina = req.params.id_maquina;
	const instrucaoSql1 = ` select * from maquina where id_maquina = '${id_maquina}'`;
	sequelize.query(instrucaoSql1,selectQueryType, {
		model: Maquina,
		mapToModel: true,
	  })
	  .then((resultado) => {
		console.log(`Encontrados: ${resultado.length}`);
	    res.json(resultado);
	  })
	  .catch((erro) => {
		console.error(erro);
		res.status(500).send(erro.message);
	  });
  });

module.exports = router;

