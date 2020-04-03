let cpf_meuapp;
let login_usuario;
function entrar() {
    // aguardar();
    var formulario = new URLSearchParams(new FormData(form_login));
    fetch("/usuarios/autenticar", {
        method: "POST",
        body: formulario
    }).then(resposta => {
        
        if (resposta.ok) {

            resposta.json().then(json => {
                console.log("resposta", json.nomeUsuario);
                sessionStorage.cpf_meuapp = json.cpfUsuario;
                sessionStorage.login_usuario = json.idUsuario;
                mensagem.innerHTML = `Bem vindo ${json.nomeUsuario}`  
              
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

function logoff() {
    finalizar_sessao();
    sessionStorage.clear();
    redirecionar_login();
}
function redirecionar_login() {
    window.location.href = 'login.html';
}
function finalizar_sessao() {
    fetch(`/usuarios/sair/${login_usuario}`, {cache:'no-store'}); 
}