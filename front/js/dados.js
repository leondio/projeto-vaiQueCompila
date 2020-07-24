function validaLogin() {
    let userTxt = localStorage.getItem("userLogged");

    if (!userTxt) {
        window.location = "index.html";
    }

    let user = JSON.parse(userTxt);

    document.getElementById("nomeUser").innerHTML = user.nome;

    //document.getElementById("racfUser").innerHTML = user.racf;

    document.getElementById("imagem").innerHTML = `<img src="${user.linkFoto}">`;
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}

function chamaRelPeriodo() {
    window.location = "relPeriodo.html";
}

function chamaRelAlarme() {
    window.location = "relAlarme.html";
}