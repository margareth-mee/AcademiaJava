import Cliente from './model/Cliente.js'
import ClienteTable from './db/ClienteTable.js'

console.log("============ Banco ===============")
const c1 = new Cliente();
c1.nome = "Ines";
c1.sobrenome = "Brasil";

const result = await ClienteTable.create(c1);
console.log(result);

const lista = await ClienteTable.findAll({raw:true});
console.log(lista);