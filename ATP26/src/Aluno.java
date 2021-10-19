public class Aluno extends Pessoa{
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\nTurma: " + turma + "\nCurso" + curso;
    }
    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        
        if(this.matricula.equals(aluno.matricula)) {
            return true;
        }
        
       return false;
    }
}