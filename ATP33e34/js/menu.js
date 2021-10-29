/* _  Utilize como base o HTML e o CSS criados durante as atividades ATP32 e ATP33.
_  Crie um arquivo JS para cada arquivo HTML de formulário e de tabela.
_  Crie uma função que capture as informações do formulário e salve em localstorage. O dado deve ser um dicionário dentro de uma lista e convertido para JSON.
_  Crie uma função para ler os dados do localStorage e carregar dentro de uma tabela no HTML. Converta o dado de JSON para uma lista de dicionários. */

window.onload = function(){
    console.log('Loading JS...'); //carregando a página
    let pessoa = [];
    localStorage.setItem("pessoa", JSON.stringify(pessoa));
}