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
