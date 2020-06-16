var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Venda = require('../models').Venda;
const selectQueryType = {
	type: sequelize.QueryTypes.SELECT
};

/* Recuperar usuário por login e senha */
router.get('/usuarios-hora/:idMaquina', function(req, res, next) {
	
	// alterar  os nomes da tabela de acordo com o nome da tabela e do nome dos campo
	var idMaquina = req.params.idMaquina;
	const instrucaoSql = `select count(id_venda) as totalUsuario, hour(data_hora) as hora from venda, maquina where fk_maquina = id_maquina And id_maquina = ${idMaquina} group by hour(data_hora);`;


	sequelize.query(instrucaoSql,selectQueryType, {
		model: Venda,
		mapToModel: true 	
	  })
	  .then(resultado => {
			console.log(`Encontrados: ${resultado}`);
			res.json(resultado);
	  }).catch(erro => {
			console.error(erro);
			res.status(500).send(erro.message);
	  });
});

router.get('/usuarios-hora/:idMaquina', function(req, res, next) {
	
	// alterar  os nomes da tabela de acordo com o nome da tabela e do nome dos campo

	const instrucaoSql = `select count(id_venda) as totalUsuario, hour(data_hora) as hora from venda group by hour(data_hora);`;


	sequelize.query(instrucaoSql,selectQueryType, {
		model: Venda,
		mapToModel: true 	
	  })
	  .then(resultado => {
			console.log(`Encontrados: ${resultado}`);
			res.json(resultado);
	  }).catch(erro => {
			console.error(erro);
			res.status(500).send(erro.message);
	  });
});

router.get('/relatorio/:startDate/:endDate', function(req, res, next) {
	
	// alterar  os nomes da tabela de acordo com o nome da tabela e do nome dos campo
	var startDate = req.params.startDate ;
	var endDate = req.params.endDate;
	const instrucaoSql = `select sum(valor) as totalDinheiro, count(id_venda) as totalUsuarios from venda where convert(data_hora, date) between ${startDate} and ${endDate};`;
	

	sequelize.query(instrucaoSql,selectQueryType, {
		model: Venda,Model: true 	
	  })
	  .then(resultado => {
			console.log(`Encontrados: ${resultado}`);
			res.json(resultado);
	  }).catch(erro => {
			console.error(erro);
			res.status(500).send(erro.message);
	  });
});



module.exports = router;