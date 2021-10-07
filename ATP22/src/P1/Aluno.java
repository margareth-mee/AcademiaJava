public class Aluno{
    private String nome_completo;
    private int idade;
    private String matricula;

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
    public String getNome_completo() {
        return this.nome_completo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return this.matricula;
    }
}