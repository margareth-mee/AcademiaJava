window.onload = function () {
    console.log('Carregando JS');
    let viagem = [];
    localStorage.setItem("viagem", JSON.stringify(viagem));
}

function salvar(event) {
    event.preventDefault();
    console.log('Salvando dados');

    let id = document.getElementById('id');
    let partida = document.getElementById('partida');
    let destino = document.getElementById('destino');
    let horario = document.getElementById('horario');
    let data = document.getElementById('data');

    //dicionário
    viagem = { "id": id.value, "partida": partida.value, "destino": destino.value, "horario": horario.value, "data": data.value };
    let viagens = JSON.parse(localStorage.getItem("viagem"));
    viagens.push(viagem);
    localStorage.setItem("viagem", JSON.stringify(viagens));
    
    carregaTabela();
}

function carregaTabela() {
    let tbody = document.getElementById("corpo-tabela");
    let viagens = JSON.parse(localStorage.getItem("viagem"));
    tbody.innerHTML = "";
    viagens.forEach(p => {
        tbody.innerHTML += "<tr>"
            + "<td>" + p["id"] + "</td>"
            + "<td>" + p["partida"] + "</td>"
            + "<td>" + p["destino"] + "</td>"
            + "<td>" + p["horario"] + "</td>"
            + "<td>" + p["data"] + "</td>"
            + "</tr>";
    });

}