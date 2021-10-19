public class Pessoa{
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade" + idade;
    }

    @Override
    public boolean equals(Object obj) {
        Pessoa pessoa = (Pessoa) obj;
        
        if(this.nome.equals(pessoa.nome)) {
            return true;
        }
        
       return false;
    }
}