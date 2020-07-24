
console.log("Script carregado...");


function mensagem() {
    // console.log('A soma é: ' + soma(10, 5));
    // console.log(calcula(2,3,'+'));
/*     console.log(
        (
            (a) => { return a; }
        )(10)); */


        document.getElementById("cxText").value = "PI";
        
        document.getElementById("tabela").innerHTML = "<table> <tr><th>id</th></tr><tr><td>1</td></tr><td>2</td></tr> </table>";

}


function soma(x1, x2) {
    let resp = x1 + x2;
    return resp;
}


function calcula(x1, x2, oper) {
    let resp = eval(`${x1} ${oper} ${x2}`);
    return resp;
}