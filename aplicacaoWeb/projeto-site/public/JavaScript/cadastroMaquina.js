onload = function () 
{
    document.body.style.visibility = "visible"
    estacaoMaquina.innerHTML = sessionStorage.localizacao_usuario;

}

function enviarCadastro()
{

  var formulario = new URLSearchParams(new FormData(form_maquina));
  fetch("/usuarios/maquina", 
  {
    method: "POST",
    body: formulario,
  }).then((resposta) => 
  {
    if (resposta.ok) 
    {
      resposta.json().then((json) => 
      {
        console.log("resposta", json.email_usuario);
        sessionStorage.email_alprime = json.email_usuario;
        sessionStorage.login_usuario = json.id_usuario;
        sessionStorage.localizacao_usuario = json.nome_localizacao;
        sessionStorage.fk_localizacao = json.fk_localizacao;
        window.location.href = "UserADM.html";
      });
    } 
    else 
    {
      alert("Username/senha inválido(a).");
      console.log("Erro de login!");
      // console.log(resposta);
      resposta.text().then((texto) => {
        console.error(texto);
        // finalizar_aguardar(texto);
      });
    }
  });
}