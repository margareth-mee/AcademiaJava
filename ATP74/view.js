import Cliente from './model/Cliente.js'
import ClienteRepository from './repository/ClienteRepository.js'

console.log("============ Banco ===============")
const c1 = new Cliente();
c1.nome = "Jojo2";
c1.sobrenome = "Calypson";

const rep = new ClienteRepository();

console.log(await rep.create(c1));

c1.id = 20;
c1.nome = "Teste5";
c1.sobrenome = "Update5";

console.log(await rep.update(c1));
console.log(await rep.delete(20));
console.log(await rep.findAll());