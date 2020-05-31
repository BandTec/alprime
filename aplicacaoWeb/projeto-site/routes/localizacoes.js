var express = require('express');
var router = express.Router();
var sequelize = require('../models').sequelize;
var Localizacao = require('../models').Localizacao;

let sessoes = [];
const selectQueryType = {
	type: sequelize.QueryTypes.SELECT
};

module.exports = router;

