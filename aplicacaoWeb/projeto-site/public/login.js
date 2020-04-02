let cpf_meuapp;
let senha_meuapp;
function entrar() {
    // aguardar();
    var formulario = new URLSearchParams(new FormData(form_login));
    fetch("/usuarios/autenticar", {
        method: "POST",
        body: formulario
    }).then(resposta => {
        
        if (resposta.ok) {

            resposta.json().then(json => {

                sessionStorage.cpf_meuapp = json.nomeUsuario;
                sessionStorage.senha_meuapp = json.senhaUsuario;
                mensagem.innerHTML = `Bem vindo ${resposta.senhaUsuario}`  
              
            });

        } else {

            mensagem.innerHTML = "Username/senha inválido(a).";
            console.log('Erro de login!');
            // console.log(resposta);
            resposta.text().then(texto => {
                console.error(texto);
                // finalizar_aguardar(texto);
            });
        }
    });

    return false;
}