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


function carregarEventosPeriodo(){

    let dataIniTxt = document.getElementById("dateInicio").value;
    let dataFimTxt = document.getElementById("dateFim").value;
    let url = "http://localhost:8080/relEventos";

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
        .then(res => exibirRelPeriodo(res));
}


function exibirRelPeriodo(res) {
    let tabelaTxt = "<table class='table table-sm'> <tr> <th>Data do Evento</th> <th>Alarme</th> <th>Equipamento</th> </tr>"

    res.forEach(evento => {
        tabelaTxt = tabelaTxt + `<tr> <td> ${evento.dataevt} </td> 
                                      <td> ${evento.alarme.nome} </td>
                                      <td> ${evento.equipamento.hostname} </td></tr>`
    });

    tabelaTxt = tabelaTxt + "</table>";

    document.getElementById("tabela").innerHTML = tabelaTxt;
}