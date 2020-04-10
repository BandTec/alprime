function cadastrar() {
  var formulario = new URLSearchParams(new FormData(form_cadastro));
  fetch("/usuarios/cadastrar", {
    method: "POST",
    body: formulario
  }).then(function(response) {
    if (response.ok) {
      resultado.innerHTML = "Usuario cadastrado com sucesso";
    } else {
      console.log("Erro de cadastro!");
      response.text().then(function(resposta) {});
      resultado.innerHTML = "Erro ao cadastrar usuario";
    }
  });

  return false;
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