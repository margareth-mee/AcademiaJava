public class Universidade {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Aluno aluno = new Aluno();
        Coordenador coordenador = new Coordenador();

        funcionario.setNome("Bruna");
        funcionario.setSobrenome("Bittencourt");
        funcionario.setMatricula(777);
        funcionario.setDepartamento("Engenharia");
        funcionario.setSalario(10000);

        coordenador.setNome("Maykon");
        coordenador.setSobrenome("Granneman");
        coordenador.setMatricula(778);
        coordenador.setCurso_coordenado("Ciencias da Computação");
        coordenador.setBonus(5000);

        aluno.setNome("Meg");
        aluno.setSobrenome("Lima");
        aluno.setMatricula(114110571);
        aluno.setCurso("Engenharia Elétrica");
        aluno.setTurma("2014.1");

        System.out.println("------------ Funcionário ----------------");
        System.out.println("Nome: " + funcionario.getNome() + " " + funcionario.getSobrenome());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Departamento: " + funcionario.getDepartamento());
        System.out.println("Salário: " + funcionario.getSalario());

        System.out.println("------------ Coordenador ----------------");
        System.out.println("Nome: " + coordenador.getNome() + " " + coordenador.getSobrenome());
        System.out.println("Matrícula: " + coordenador.getMatricula());
        System.out.println("Curso Coordenado: " + coordenador.getCurso_coordenado());
        System.out.println("Bonus: " + coordenador.getBonus());

        System.out.println("------------ Aluno ----------------");
        System.out.println("Nome: " + aluno.getNome() + " " + aluno.getSobrenome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Turma: " + aluno.getTurma());

    }
}
