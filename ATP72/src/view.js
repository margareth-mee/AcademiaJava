import { PessoaJuridica } from "./PessoaJuridica.js";
import { PessoaFisica } from "./PessoaFisica.js";

const pf = new PessoaFisica(12345678);
pf.nome = "Margareth";

const pj = new PessoaJuridica(987654321)
pj.nome = "Superdevs Company";

console.log(pf.nome);
console.log(pf.cpf);


console.log(pj.nome);
console.log(pj.cnpj);