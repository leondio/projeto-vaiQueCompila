function validaLogin() {
    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let user = JSON.parse(userTxt);

    document.getElementById("nomeUser").innerHTML = user.nome;

    document.getElementById("racfUser").innerHTML = user.racf;

    document.getElementById("imagem").innerHTML = `<img src="${user.linkFoto}">`;
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}

function carregarEventosAlarme(){
    let dataIniTxt = document.getElementById("dateInicio").value;
    let dataFimTxt = document.getElementById("dateFim").value;
    let url = "http://localhost:8080/relAlarmes";

    let msgData ={
        dataInicio: dataIniTxt,
        dataFim: dataFimTxt,
    }

    let cabecalho = {       
        method: 'POST',
        body: JSON.stringify(msgData),
        headers:{
            'Content-type': "application/json"
        }
    }

    fetch(url,cabecalho)
        .then(res => res.json())
        .then(res => exibirRelAlarme(res));
}


function exibirRelAlarme(res) {
    let tabelaTxt = "<table class='table table-sm'> <tr> <th>Alarme</th> <th>Quantidade</th></tr>"

    res.forEach(alarme => {
        tabelaTxt = tabelaTxt + `<tr> <td> ${alarme[0]} </td> 
                                      <td> ${alarme[1]} </td> </tr>`
    });

    tabelaTxt = tabelaTxt + "</table>";

    document.getElementById("tabela").innerHTML = tabelaTxt;
}