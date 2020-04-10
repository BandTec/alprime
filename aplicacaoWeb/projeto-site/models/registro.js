'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Registro = sequelize.define('registro',{
		//Nome do campo
		idRegistro: {
			//Quando der erro colocar esse field
			field: "idRegistro",
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},		
		dataHora: {
			field: "dataHora",
			type: DataTypes.STRING,
			allowNull: false
		},
		porcProcessador: {
			field: "porcProcessador",
			type: DataTypes.INTEGER,
			allowNull: false
		},
		porcDisco: {
			field: "porcDisco",
			type: DataTypes.INTEGER,
			allowNull: false
		},
		porcMemoria: {
			field: "porcMemoria",
			type: DataTypes.INTEGER,
			allowNull: false
		},
		momento_grafico: {
			type: DataTypes.VIRTUAL, // campo 'falso' (não existe na tabela). Deverá ser preenchido 'manualmente' no select
			allowNull: true
		}
	}, 
	{
		//nome da tabela
		tableName: 'registro', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Registro;
};
