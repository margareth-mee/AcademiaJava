import {Produto} from './Produto.js';
import {Categoria} from './Categoria.js';

const p1 = new Produto();
p1.nome = "lavadora"
p1.preco = 1090.99

const c1 = new Categoria();
c1.descricao = "eletrodomesticos"

console.log(p1.nome);
console.log(p1.preco);
console.log(c1.descricao);