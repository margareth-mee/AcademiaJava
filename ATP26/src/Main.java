public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa clone = new Pessoa();
        Aluno aluno = new Aluno();
        Dados lista = new Dados();
        
        pessoa.nome = "Maykon";
        pessoa.sobrenome = "Granemann";
        pessoa.idade = 35;

        aluno.nome = "Meg";
        aluno.sobrenome = "Mee";
        aluno.idade = 25;
        aluno.matricula = "114110571";
        aluno.curso = "engenharia elétrica";
        aluno.turma = "2014.1";

        System.out.println(lista.add(pessoa));
        System.out.println(lista.add(aluno));
        System.out.println(lista.add(pessoa));
        System.out.println(lista.add(aluno));
        System.out.println(lista.add(pessoa));
        System.out.println("O tamanho da lista é: " + lista.size());
        System.out.println(lista.add(aluno));
        System.out.println("O tamanho da lista é: " + lista.size());

        clone.nome = "Maykon";
        clone.sobrenome = "Granemann";
        clone.idade = 35;

        if(lista.contains(clone)){
            System.out.println("O objeto já está contido na lista.");
        }else{
            System.out.println("O objeto não está contido na lista.");
        }

        System.out.println("O tamanho da lista é: " + lista.size());
        System.out.println(lista.remove(aluno));
    }
}
