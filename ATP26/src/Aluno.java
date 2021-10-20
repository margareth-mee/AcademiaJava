public class Aluno extends Pessoa {
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\nTurma: " + turma + "\nCurso" + curso;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Aluno) {
            Aluno aluno = (Aluno) obj;

            if (this.matricula.equals(aluno.matricula) && 
                this.turma.equals(aluno.turma) &&
                this.curso.equals(aluno.curso) &&
                super.equals(aluno)){
                return true;
            }
        }
        return false;
    }
}
