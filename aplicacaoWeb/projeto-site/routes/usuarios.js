var express = require("express");
var router = express.Router();
var sequelize = require("../models").sequelize;
var Usuario = require("../models").Usuario;
var Localizacao = require("../models").Localizacao;

let sessoes = [];
const selectQueryType = {
  type: sequelize.QueryTypes.SELECT,
};

/* Recuperar usuário por login e senha */
router.post("/login", function (req, res, next) {
  console.log("Recuperando usuário por login e senha");

  var login = req.body.email; // depois de .body, use o nome (name) do campo em seu formulário de login
  var senha = req.body.senha; // depois de .body, use o nome (name) do campo em seu formulário de login

  let instrucaoSql = `select * from usuario where email_usuario='${login}' and senha_usuario='${senha}'`;
  console.log(instrucaoSql);

  sequelize
    .query(instrucaoSql, selectQueryType, {
      model: Usuario,
    })
    .then((resultado) => {
      console.log(`Encontrados: ${resultado.length}`);
      console.log(resultado);

      //Joga os valores para o json
      if (resultado.length == 1) {
        sessoes.push(resultado[0].nomeUsuario);
        console.log("Resultado:", resultado[0].nomeUsuario);
        res.json(resultado[0]);
      } else if (resultado.length == 0) {
        res.status(403).send("Login e/ou senha inválido(s)");
      } else {
        res.status(403).send("Mais de um usuário com o mesmo login e senha!");
      }
    })
    .catch((erro) => {
      console.error(erro);
      res.status(500).send(erro.message);
    });
});

router.post("/cadastrarUsuario", function (req, res, next) {
  console.log("Criando um usuário");
  var nome = req.body.nome;
  var cpf = req.body.cpf;
  var email = req.body.email;
  var senha = req.body.senha;
  var telefone = req.body.telefone;
  var estacao = req.body.estacao;
  var linha = req.body.linha;
  var endereco = req.body.endereco;
  const instrucaoSql1 = `
  insert into usuario values(null,'${nome}','${cpf}','${email}','${senha}','${telefone}',null,null);`
  const instrucaoSql2 = ` insert into localizacao values(null,'${estacao}','${linha}','${endereco}',0);`;
  sequelize.query(instrucaoSql1, {
      model: Usuario,
      Localizacao,
      mapToModel: true,
    })
    .then((resultado) => {
      console.log(`Encontrados: ${resultado.length}`);
    //   res.json(resultado);
    })
    .catch((erro) => {
      console.error(erro);
      res.status(500).send(erro.message);
	});
	
	sequelize.query(instrucaoSql2, {
		model: Localizacao,
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


router.get("/todos1234", function (req, res, next) {
  // alterar  os nomes da tabela de acordo com o nome da tabela e do nome dos campo

  const instrucaoSql = `select * from usuarios;`;

  // sequelize.query('select * from usuarios;').then(([results,metadata])=>{
  // 	console.log("results:",results);
  // 	console.log("metadata:",metadata);

  // })

  // sequelize.query("select * from usuarios;", { type: sequelize.QueryTypes.SELECT }).then(results => {
  // 	// SELECT query - use then
  // 			console.log("results:",results);

  //   })

  sequelize
    .query(instrucaoSql, selectQueryType, {
      model: Usuario,
      mapToModel: true,
    })
    .then((resultado) => {
      console.log(`Encontrados: ${resultado}`);
      res.json(resultado);
    })
    .catch((erro) => {
      console.error(erro);
      res.status(500).send(erro.message);
    });
});

/* Verificação de usuário */
router.get("/sessao/:login", function (req, res, next) {
  let login = req.params.NomeUsuario;
  console.log(`Verificando se o usuário ${login} tem sessão`);

  let tem_sessao = false;
  for (let u = 0; u < sessoes.length; u++) {
    if (sessoes[u] == login) {
      tem_sessao = true;
      break;
    }
  }

  if (tem_sessao) {
    let mensagem = `Usuário ${login} possui sessão ativa!`;
    console.log(mensagem);
    res.send(mensagem);
  } else {
    res.sendStatus(403);
  }
});

/* Logoff de usuário */
router.get("/sair/:login", function (req, res, next) {
  let login = req.params.login;
  console.log(`Finalizando a sessão do usuário ${login}`);
  let nova_sessoes = [];
  for (let u = 0; u < sessoes.length; u++) {
    if (sessoes[u] != login) {
      nova_sessoes.push(sessoes[u]);
    }
  }
  sessoes = nova_sessoes;
  res.send(`Sessão do usuário ${login} finalizada com sucesso!`);
});

module.exports = router;
