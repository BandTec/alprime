'use strict';

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Usuario = sequelize.define('usuarios',{
		//Nome do campo
		idUsuario: {
			//Quando der erro colocar esse field
			field: "idUsuario",
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},		
		nomeUsuario: {
			field: "nomeUsuario",
			type: DataTypes.STRING,
			allowNull: false
		},
		cpfUsuario: {
			field: "cpfUsuario",
			type: DataTypes.STRING,
			allowNull: false
		},
		tipoUsuario: {
			field: "tipoUsuario",
			type: DataTypes.STRING,
			allowNull: false
		},
		emailUsuario: {
			field: "emailUsuario",
			type: DataTypes.STRING,
			allowNull: false
		},
		senhaUsuario: {
			field: "senhaUsuario",
			type: DataTypes.STRING,
			allowNull: false
		}
	}, 
	{
		//nome da tabela
		tableName: 'usuarios', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Usuario;
};
