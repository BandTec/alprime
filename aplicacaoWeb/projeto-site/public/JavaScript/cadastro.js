
let nomeCadastro;
let emailCadastro;
let telefoneCadastro;
let cpfCadastro;
let senhaCadastro;
onload = function () 
{
  document.body.style.visibility = "visible"
}

function guardarDados(){
  sessionStorage.nomeCadastro = nome.value;
  sessionStorage.emailCadastro = email.value;
  sessionStorage.telefoneCadastro = telefone.value;
  sessionStorage.cpfCadastro = cpf.value;
  sessionStorage.senhaCadastro = senha.value;
  console.log("deveria ter mudado de tela");
  window.location.assign("./Cadastro2.html");
}

function cadastrar() {
  var formulario= new URLSearchParams(new FormData(form_localizacao));
  formulario.append('nome', sessionStorage.getItem('nomeCadastro'));
  formulario.append('telefone', sessionStorage.getItem('telefoneCadastro'));
  formulario.append('cpf', sessionStorage.getItem('cpfCadastro'));
  formulario.append('email', sessionStorage.getItem('emailCadastro'));
  formulario.append('senha', sessionStorage.getItem('senhaCadastro'));
  var form = new URLSearchParams(formulario);
  fetch("/usuarios/cadastrarUsuario", {
    method: "POST",
    body: form
  }).then(function(response) {
    if (response.ok) {
      alert("Usuario cadastrado com sucesso");
  window.location.assign("./Cadastro2.html");

    } else {
      alert("Erro de cadastro!");
      response.text().then(function(resposta) {});
      console.log("Erro ao cadastrar usuario");
    }
  });

}
function verificarNome() {
  if (nome.value.length >= 6) {
console.log("TA CERTO");
  }
  else if (nome.value.length == 0) {
    console.log("NEUTRO");
  }
  else {
    console.log("Deve conter no mínimo 6 caracteres");
  }
  }

function verificarSenha() {
  if (nome.value.length == 0) {
    console.log("NEUTRO");
  }
  else if (senha.value.length >= 8) {
    console.log("TA CERTO");
  }
  else {
    console.log("Deve conter no mínimo 8 caracteres");
  }
}

function verificarSenhaRep() {
  if (senha_repetida.value == senha.value) {
    console.log("TA CERTO");
  }
  else if (senha_repetida.value.length == 0) {
    console.log("NEUTRO");
  }
  else {
    console.log("Deve ser igual a senha acima");
  }
}

function verificarEmail() {
  if (email.value.indexOf('@') >= 0) {
      if (email.value.indexOf('@') >= 1) {
          if (email.value.length >= 11) {
              if (email.value.endsWith('.com') || email.value.endsWith('.br')) {
                console.log("TA CERTO");
              } else {
                  // deve terminar em .com ou .br
                  console.log("Deve terminar em '.com' ou '.br'");
              }
          } else {
              //   deve conter no minimo 11 caracteres
              console.log("Deve conter no mínimo 11 caracteres");
          }
      } else {
          //    insira algo antes do @
          console.log("Insira algo antes do '@'");
      }
  } else {
      // o email precisa conter "@"
      console.log("O email precisa conter '@'");
  }
}

function arrancar_mascara() {
    var tamanho = cpf.value.length;
    if (tamanho == 14) {
        var parte1 = cpf.value.slice(0, 3);
        var parte2 = cpf.value.slice(4, 7);
        var parte3 = cpf.value.slice(8, 11);
        var parte4 = cpf.value.slice(12, 14);
        cpf.value = `${parte1}${parte2}${parte3}${parte4}`
    }
}

function colocar_mascara() {
  var tamanho = cpf.value.length;
  if (cpf.value == "") {
    console.log("Digite seu cpf completo");
  }else if (tamanho == 11) {
      var parte1 = cpf.value.slice(0, 3);
      var parte2 = cpf.value.slice(3, 6);
      var parte3 = cpf.value.slice(6, 9);
      var parte4 = cpf.value.slice(9, 12);

      cpf.value = `${parte1}.${parte2}.${parte3}-${parte4}`;
    console.log("Ta certo");
  }else {
    console.log("Ta errado , Digite seu cpf sem pontos");
  }
}