

/* 
lista e explicação dos Datatypes:
https://codewithhugo.com/sequelize-data-types-a-practical-guide/
*/

module.exports = (sequelize, DataTypes) => {
    let Maquina = sequelize.define('maquina',{
		//Nome do campo
		id_maquina: {
			//Quando der erro colocar esse field
			field: "id_maquina",
			type: DataTypes.INTEGER,
			primaryKey: true,
			autoIncrement: true
		},
		cod_maquina: {
			field: "cod_maquina",
			type: DataTypes.STRING,
			allowNull: false
		},
		tipo_processador: {
			field: "tipo_processador",
			type: DataTypes.STRING,
			allowNull: false
		},
		capacidade_memoria: {
			field: "capacidade_memoria",
			type: DataTypes.DOUBLE,
			allowNull: false
		},
		sistema_operacional: {
			field: "sistema_operacional",
			type: DataTypes.STRING,
			allowNull: false
		},
		status: {
			field: "status",
			type: DataTypes.BOOLEAN,
			allowNull: false
		},
		hostname: {
			field: "hostname",
			type: DataTypes.STRING,
			allowNull: false
		},
		fabricante: {
			field: "fabricante",
			type: DataTypes.STRING,
			allowNull: false
		},
		modelo: {
			field: "modelo",
			type: DataTypes.STRING,
			allowNull: false
		},
		ram_total: {
			field: "ram_total",
			type: DataTypes.STRING,
			allowNull: false
		},
		fk_localizacao: {
			field: "fk_localizacao",
			type: DataTypes.INTEGER,
			allowNull: false
		}
	}, 
	{
		//nome da tabela
		tableName: 'maquina', 
		freezeTableName: true, 
		underscored: true,
		timestamps: false,
	});

    return Maquina;
};