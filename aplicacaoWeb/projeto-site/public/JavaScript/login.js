let cpf_meuapp;
let login_usuario;

onload = function () {
    document.body.style.visibility = "visible"
}

function entrar() {
    // aguardar();
    var formulario = new URLSearchParams(new FormData(form_login));
    fetch("/usuarios/login", {
        method: "POST",
        body: formulario
    }).then(resposta => {
        
        if (resposta.ok) {

            resposta.json().then(json => {
                console.log("resposta", json.emailUsuario);
                sessionStorage.email_alprime = json.emailUsuario;
                sessionStorage.login_usuario = json.idUsuario;
                alert("Login aceito");
                
            });

        } else {

            alert("Username/senha inválido(a).");
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

function entra(){
    window.location.href = 'UserADM.html';
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