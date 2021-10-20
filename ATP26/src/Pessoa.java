public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade" + idade;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Pessoa) {
            Pessoa pessoa = (Pessoa) obj;

            if (this.nome.equals(pessoa.nome) &&
                this.sobrenome.equals(pessoa.sobrenome) &&
                this.idade == pessoa.idade)
            {
                return true;
            }
        }
        return false;
    }
}