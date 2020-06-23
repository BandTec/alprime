let nomeCadastro;
let emailCadastro;
let telefoneCadastro;
let senhaCadastro;
let CPFCadastro;
var Estacao, Endereco, linha;
var emailOK, SenhaOK, ConfSenhaOK, NomeOK, CPFOK, TelefoneOK;
var linhaOK, estacaoOk, enderecoOK;
onload = function () {
  document.body.style.visibility = "visible"
  Cadastro2.style.marginLeft = "30%"
  Estacao = document.getElementById("estacao");
  Endereco = document.getElementById("endereco");
  linha = document.getElementById("linha");
}

function guardarDados() {
  verificarNome();
  verificarSenha();
  verificarSenhaRep();
  verificarEmail();
  VerificarCPF();
  VerificarTelefone();
  if (emailOK == true && SenhaOK == true && ConfSenhaOK == true && NomeOK == true && CPFOK == true && TelefoneOK == true) {
    sessionStorage.nomeCadastro = nome.value;
    sessionStorage.emailCadastro = email.value;
    sessionStorage.telefoneCadastro = telefone.value;
    sessionStorage.CPFCadastro = cpf.value;
    sessionStorage.senhaCadastro = senha.value;
    window.location.assign("./Cadastro2.html");
    console.log("deveria ter mudado de tela");
  } else {
    console.log("Dados Incorretos");
  }
}

function cadastrar() {
  VerificarEstacao();
  VerificarEndereco();
  VerificarLinha();
  if (estacaoOk == true && enderecoOK == true && linhaOK == true){
    var formulario_localizacao = new URLSearchParams(
      new FormData(form_localizacao)
    );
    var formulario = new URLSearchParams(new FormData());
    formulario.append("nome", sessionStorage.getItem("nomeCadastro"));
    formulario.append("telefone", sessionStorage.getItem("telefoneCadastro"));
    formulario.append("CPF", sessionStorage.getItem("CPFCadastro"));
    formulario.append("email", sessionStorage.getItem("emailCadastro"));
    formulario.append("senha", sessionStorage.getItem("senhaCadastro"));
    var form_usuario = new URLSearchParams(formulario);
  
    // Cadastrando localizacao
    fetch("/localizacoes/cadastrarLocalizacao", {
      method: "POST",
      body: formulario_localizacao,
    }).then(function (response) {
      if (response.ok) {
        alert("Localizacao cadastrado com sucesso");
      } else {
        alert("Erro de cadastro!");
        response.text().then(function (resposta) { });
        console.log("Erro ao cadastrar Localizacao");
      }
    });
    // Cadastrando usuario
    fetch("/usuarios/cadastrarUsuario", {
      method: "POST",
      body: form_usuario,
    }).then(function (response) {
      if (response.ok) {
        alert("Usuario cadastrado com sucesso");
        window.location.assign("./login.html");
      } else {
        alert("Erro de cadastro!");
        response.text().then(function (resposta) { });
        console.log("Erro ao cadastrar usuario");
      }
    });
  } else{
    console.log('Dados Incorretos');
  }
}
function verificarNome() {
  NomeOK = false;
  if (nome.value.length >= 6) {
    console.log("Nome esta certo");
    NomeOK = true;
    AlertaNome.style.color = "white";
  } else {
    NomeOK = false;
    AlertaNome.innerHTML = "Deve conter no mínimo 6 caracteres";
    AlertaNome.style.color = "red";
  }
}

function verificarSenha() {
  SenhaOK = false;
  if (senha.value.length == 0) {
    AlertaSenha.innerHTML = "Insira uma senha";
    AlertaSenha.style.color = "red";
    SenhaOK = false;
  } else if (senha.value.length >= 8) {
    console.log("Senha Aceitavel");
    SenhaOK = true;
    AlertaSenha.style.color = "white";
  } else {
    SenhaOK = false;
    AlertaSenha.innerHTML = "Deve conter no mínimo 8 caracteres";
    AlertaSenha.style.color = "red";
  }
}

function verificarSenhaRep() {
  ConfSenhaOK = false;
  if (senha_repetida.value == senha.value) {
    console.log("Confirmaçao da senha correta");
    AlertaConfSenha.style.color = "white";
    ConfSenhaOK = true;
  } else if (senha_repetida.value.length == 0) {
    ConfSenhaOK = false;
    AlertaConfSenha.innerHTML = "deve reescrever a senha digitada";
    AlertaConfSenha.style.color = "red";
  } else {
    ConfSenhaOK = false;
    AlertaConfSenha.innerHTML = "Deve ser igual a senha acima";
    AlertaConfSenha.style.color = "red";
  }
}

function verificarEmail() {
  emailOK = false;
  if (email.value.indexOf("@") >= 0) {
    if (email.value.indexOf("@") >= 1) {
      if (email.value.length >= 11) {
        if (email.value.endsWith(".com") || email.value.endsWith(".br")) {
          emailOK = true;
          AlertaEmail.style.color = "white";
          console.log("Email Correto");
        } else {
          // deve terminar em .com ou .br
          emailOK = false;
          AlertaEmail.innerHTML = "Deve terminar em '.com' ou '.br'";
          AlertaEmail.style.color = "red";
        }
      } else {
        //   deve conter no minimo 11 caracteres
        emailOK = false;
        AlertaEmail.innerHTML = "Deve conter no mínimo 11 caracteres";
        AlertaEmail.style.color = "red";
      }
    } else {
      //    insira algo antes do @
      emailOK = false;
      AlertaEmail.innerHTML = "Insira algo antes do '@'";
      AlertaEmail.style.color = "red";
    }
  } else {
    // o email precisa conter "@"
    emailOK = false;
    AlertaEmail.innerHTML = "O email precisa conter '@'";
    AlertaEmail.style.color = "red";
  }
}

// function arrancar_mascara() {
//   var tamanho = CPF.value.length;
//   if (tamanho == 14) {
//     var parte1 = CPF.value.slice(0, 3);
//     var parte2 = CPF.value.slice(4, 7);
//     var parte3 = CPF.value.slice(8, 11);
//     var parte4 = CPF.value.slice(12, 14);
//     CPF.value = `${parte1}${parte2}${parte3}${parte4}`;
//   }
// }

// function colocar_mascara() {
//   var tamanho = CPF.value.length;
//   if (CPF.value == "") {
//     console.log("Digite seu cpf completo");
//   } else if (tamanho == 11) {
//     var parte1 = CPF.value.slice(0, 3);
//     var parte2 = CPF.value.slice(3, 6);
//     var parte3 = CPF.value.slice(6, 9);
//     var parte4 = CPF.value.slice(9, 12);

//     CPF.value = `${parte1}.${parte2}.${parte3}-${parte4}`;
//     console.log("CPF está correto");
//     AlertaCPF.style.color = "white"
//   } else {
//     AlertaCPF.innerHTML = "Ta errado , Digite seu cpf sem pontos"
//     AlertaCPF.style.color = "red"
//   }
// }

function VerificarCPF() {
  if (cpf.value.length != 11) {
    AlertaCPF.innerHTML = "CPF Inválido";
    AlertaCPF.style.color = "red";
    CPFOK = false;
  }
  else {
    console.log("CPF está correto");
    AlertaCPF.style.color = "white";
    CPFOK = true;
  }
}

function VerificarTelefone() {
  if (telefone.value.length == 8 || telefone.value.length == 9) {
    TelefoneOK = false;;
    AlertaTelefone.innerHTML = "Informe o DD";
    AlertaTelefone.style.color = "red";
  } else if (telefone.value.length > 11 || telefone.value.length < 8) {
    TelefoneOK = false;;
    AlertaTelefone.innerHTML = "número de telefone inválido";
    AlertaTelefone.style.color = "red";
  } else {
    TelefoneOK = true;;
    console.log("Telefone Válido");
    AlertaTelefone.style.color = "white";
  }
}

function VerificarEstacao(){
  if (Estacao.value.length == 0){
    estacaoOk = false;
    AlertaEstacao.style.color = "red";
    AlertaEstacao.innerHTML = "informe sua estação"
  } else{
    estacaoOk = true;
    AlertaEstacao.style.color = "white";
    console.log("estaçao válida");
  }
}

function VerificarEndereco(){
  if (Endereco.value.length == 0){
    enderecoOK = false;
    AlertaEndereco.style.color = "red";
    AlertaEndereco.innerHTML = "informe seu endereço"
  } else{
    enderecoOK = true;
    AlertaEndereco.style.color = "white";
    console.log("endereço válido");
  }
}

function VerificarLinha(){
  if (linha.value.length == 0){
    linhaOK = false;
    AlertaLinha.style.color = "red";
    AlertaLinha.innerHTML = "informe sua linha"
  } else{
    linhaOK = true;
    AlertaLinha.style.color = "white";
    console.log("Linha válida");
  }
}