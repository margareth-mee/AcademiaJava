class Pessoa{
    nome;
    sobrenome;
    cpf;
}

class Cliente{
    id;
    desconto;
    company;
}

const p1 = new Pessoa();
p1.nome = 'Ines';
p1.sobrenome = 'Brasil';
p1.cpf = 1234567;

const c1 = new Cliente();
c1.id = 234;
c1.desconto = 0.15;
c1.company = 'cap';

console.log("Nome: " + p1.nome);
console.log("Sobrenome: " + p1.sobrenome);
console.log("CPF: " + p1.cpf);

console.log("Id: " + c1.id);
console.log("Desconto: " + c1.desconto);
console.log("Company: " + c1.company);