class Cliente {
    id;
    nome;
    sobrenome;
    
    constructor(nome, sobrenome, id=null){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}
export default Cliente;