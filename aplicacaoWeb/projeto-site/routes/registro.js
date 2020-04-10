var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Registro = require('../models').Registro;
const selectQueryType = {
	type: sequelize.QueryTypes.SELECT
};
/* Recuperar as últimas N leituras */
router.get('/ultimos', function(req, res, next) {
	
	// quantas são as últimas leituras que quer? 8 está bom?
	const limite_linhas = 7;

	console.log(`Recuperando os últimos ${limite_linhas} registros`);
	
	// alterar  os nomes da tabela de acordo com o nome da tabela e do nome dos campo

	const instrucaoSql = `select ${limite_linhas} idRegistro, dataHora, porcProcessador, porcDisco, porcMemoria
	 from registro order by idRegistro desc;`;
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

// router.get('/eventos2', function(req, res, next) {
    
//     // Como fazer o "@QueryParam" do java só que no node.
    

// 	// quantas são as últimas leituras que quer? 8 está bom?
// 	const limite_linhas = 7;

// 	console.log(`Recuperando as últimas ${limite_linhas} leituras`);
	
// 	// alterar  os nomes da tabela de acordo com o nome da tabela e do nome dos campo

// 	const instrucaoSql = `select top ${limite_linhas} 
// 							luminosidade,
// 							dateHora,
// 							PotenciaLampada                  
// 							from Eventos where fk_Eventos_Sensor = 2 order by idEventos desc;`;
// 	sequelize.query(instrucaoSql, {
// 		model: Leitura,
// 		mapToModel: true 
// 	  })
// 	  .then(resultado => {
// 			console.log(`Encontrados: ${resultado.length}`);
// 			res.json(resultado);
// 	  }).catch(erro => {
// 			console.error(erro);
// 			res.status(500).send(erro.message);
// 	  });
// });


// tempo real (último valor de cada leitura)
router.get('/tempo-real', function (req, res, next) {
	
	console.log(`Recuperando os últimos registros`);

	const instrucaoSql = `select top 1 from registro order by idRegistro desc`;

	sequelize.query(instrucaoSql, { type: sequelize.QueryTypes.SELECT })
		.then(resultado => {
			res.json(resultado[0]);
		}).catch(erro => {
			console.error(erro);
			res.status(500).send(erro.message);
		});
  
});


module.exports = router;
